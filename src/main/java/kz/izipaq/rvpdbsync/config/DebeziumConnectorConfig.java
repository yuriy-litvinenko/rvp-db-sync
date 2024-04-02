package kz.izipaq.rvpdbsync.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DebeziumConnectorConfig {

    @Value("${DEBEZIUM_SLOT_NAME}")
    private String debeziumSlotName;

    @Value("${DB_SOURCE_HOST}")
    private String dbSourceHost;

    @Value("${DB_SOURCE_PORT}")
    private int dbSourcePort;

    @Value("${DB_SOURCE_NAME}")
    private String dbSourceName;

    @Value("${DB_SOURCE_USER}")
    private String dbSourceUser;

    @Value("${DB_SOURCE_PASS}")
    private String dbSourcePass;

    @Bean
    io.debezium.config.Configuration debeziumConfiguration() {

        return io.debezium.config.Configuration.create()
                .with("name", "cdc-postgres")
                .with("connector.class", "io.debezium.connector.postgresql.PostgresConnector")
//                .with("offset.storage", "org.apache.kafka.connect.storage.MemoryOffsetBackingStore")
                .with("offset.storage", "org.apache.kafka.connect.storage.FileOffsetBackingStore")
                .with("offset.storage.file.filename", "offset.dat")
                .with("topic.prefix", "postgres-connector")
                .with("plugin.name", "pgoutput")
                .with("decimal.handling.mode", "double")
                .with("snapshot.mode", "never")
                .with("tombstones.on.delete", "false")
                .with("database.hostname", dbSourceHost)
                .with("database.port", dbSourcePort)
                .with("database.user", dbSourceUser)
                .with("database.password", dbSourcePass)
                .with("database.dbname", dbSourceName)
                .with("slot.name", debeziumSlotName)
                .with("schema.include.list", "public")
                .with("table.include.list", "public.RVPRequest, public.RVPCase, public.RVPCaseHistory, " +
                        "public.RVPImmigrant, public.RVPInvitingPerson, public.RVPFamilyMember, " +
                        "public.D_Simple_Ref_Val, public.HomeOwner, public.S_Simple_Ref")
                .build();
    }

}
