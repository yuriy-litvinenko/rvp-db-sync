package kz.izipaq.rvpdbsync.service;

import io.debezium.config.Configuration;
import io.debezium.embedded.Connect;
import io.debezium.engine.DebeziumEngine;
import io.debezium.engine.RecordChangeEvent;
import io.debezium.engine.format.ChangeEventFormat;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.SneakyThrows;
import org.apache.kafka.connect.source.SourceRecord;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Service
public class DebeziumSourceEventListener {

    private final Executor executor;

    private final DebeziumEngine<RecordChangeEvent<SourceRecord>> debeziumEngine;

    private final DBStoreHandler dbStoreHandler;

    public DebeziumSourceEventListener(
            DBStoreHandler dbStoreHandler, Configuration debeziumConfiguration) {
        this.dbStoreHandler = dbStoreHandler;

        this.executor = Executors.newSingleThreadExecutor();

        this.debeziumEngine =
                DebeziumEngine.create(ChangeEventFormat.of(Connect.class))
                        .using(debeziumConfiguration.asProperties())
                        .notifying(this::handleChangeEvent)
                        .build();
    }

    @SneakyThrows
    private void handleChangeEvent(RecordChangeEvent<SourceRecord> sourceRecordChangeEvent) {

        SourceRecord sourceRecord = sourceRecordChangeEvent.record();
        dbStoreHandler.handleData(sourceRecord);

    }

    @PostConstruct
    private void start() {
        this.executor.execute(debeziumEngine);
    }

    @PreDestroy
    private void stop() throws IOException {
        if (this.debeziumEngine != null) {
            this.debeziumEngine.close();
        }
    }
}
