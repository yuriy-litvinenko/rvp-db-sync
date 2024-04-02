package kz.izipaq.rvpdbsync.service;

import io.debezium.data.Envelope;
import kz.izipaq.rvpdbsync.config.ClientNames;
import kz.izipaq.rvpdbsync.config.DBContextHolder;
import kz.izipaq.rvpdbsync.mapper.*;
import kz.izipaq.rvpdbsync.model.*;
import kz.izipaq.rvpdbsync.repository.*;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.connect.data.Struct;
import org.apache.kafka.connect.source.SourceRecord;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class DBStoreHandler {

    private final RVPRequestMapper rvpRequestMapper;
    private final RVPCaseMapper rvpCaseMapper;
    private final RVPCaseHistoryMapper rvpCaseHistoryMapper;
    private final RVPImmigrantMapper rvpImmigrantMapper;
    private final RVPInvitingPersonMapper rvpInvitingPersonMapper;
    private final RVPFamilyMemberMapper rvpFamilyMemberMapper;
    private final DSimpleRefValMapper dSimpleRefValMapper;
    private final HomeOwnerMapper homeOwnerMapper;
    private final SSimpleRefMapper sSimpleRefMapper;

    private final RVPRequestRepository rvpRequestRepository;
    private final RVPCaseRepository rvpCaseRepository;
    private final RVPCaseHistoryRepository rvpCaseHistoryRepository;
    private final RVPImmigrantRepository rvpImmigrantRepository;
    private final RVPInvitingPersonRepository rvpInvitingPersonRepository;
    private final RVPFamilyMemberRepository rvpFamilyMemberRepository;
    private final DSimpleRefValRepository dSimpleRefValRepository;
    private final HomeOwnerRepository homeOwnerRepository;
    private final SSimpleRefRepository sSimpleRefRepository;

    void handleData(SourceRecord sourceRecord) {

        System.out.println(sourceRecord);

        Optional<Object> opt = Optional.ofNullable(sourceRecord.sourceOffset().get("messageType"));

        if (opt.isPresent()) {

            String messageType = opt.get().toString();

            if (messageType.equals("INSERT") || messageType.equals("UPDATE")) {

                Struct sourceRecordValue = (Struct) sourceRecord.value();
                Struct valueStruct = sourceRecordValue.getStruct("after");

                if (valueStruct.getBoolean("IsReplicated").equals(false)) {

                    Struct sourceStruct = (Struct) sourceRecordValue.get(Envelope.FieldName.SOURCE);
                    String tableName = sourceStruct.get("table").toString();

                    switch (tableName) {

                        case "RVPRequest":
                            RVPRequest rvpRequest = rvpRequestMapper.getObject(valueStruct);
                            for (ClientNames dbName : ClientNames.values()) {
                                DBContextHolder.setCurrentDb(dbName);
                                rvpRequestRepository.save(rvpRequest);
                            }
                            break;

                        case "RVPCase":
                            RVPCase rvpCase = rvpCaseMapper.getObject(valueStruct);
                            for (ClientNames dbName : ClientNames.values()) {
                                DBContextHolder.setCurrentDb(dbName);
                                rvpCaseRepository.save(rvpCase);
                            }
                            break;

                        case "RVPCaseHistory":
                            RVPCaseHistory rvpCaseHistory = rvpCaseHistoryMapper.getObject(valueStruct);
                            for (ClientNames dbName : ClientNames.values()) {
                                DBContextHolder.setCurrentDb(dbName);
                                rvpCaseHistoryRepository.save(rvpCaseHistory);
                            }
                            break;

                        case "RVPImmigrant":
                            RVPImmigrant rvpImmigrant = rvpImmigrantMapper.getObject(valueStruct);
                            for (ClientNames dbName : ClientNames.values()) {
                                DBContextHolder.setCurrentDb(dbName);
                                rvpImmigrantRepository.save(rvpImmigrant);
                            }
                            break;

                        case "RVPInvitingPerson":
                            RVPInvitingPerson rvpInvitingPerson = rvpInvitingPersonMapper.getObject(valueStruct);
                            for (ClientNames dbName : ClientNames.values()) {
                                DBContextHolder.setCurrentDb(dbName);
                                rvpInvitingPersonRepository.save(rvpInvitingPerson);
                            }
                            break;

                        case "RVPFamilyMember":
                            RVPFamilyMember rvpFamilyMember = rvpFamilyMemberMapper.getObject(valueStruct);
                            for (ClientNames dbName : ClientNames.values()) {
                                DBContextHolder.setCurrentDb(dbName);
                                rvpFamilyMemberRepository.save(rvpFamilyMember);
                            }
                            break;

                        case "D_Simple_Ref_Val":
                            DSimpleRefVal dSimpleRefVal = dSimpleRefValMapper.getObject(valueStruct);
                            for (ClientNames dbName : ClientNames.values()) {
                                DBContextHolder.setCurrentDb(dbName);
                                dSimpleRefValRepository.save(dSimpleRefVal);
                            }
                            break;

                        case "HomeOwner":
                            HomeOwner homeOwner = homeOwnerMapper.getObject(valueStruct);
                            for (ClientNames dbName : ClientNames.values()) {
                                DBContextHolder.setCurrentDb(dbName);
                                homeOwnerRepository.save(homeOwner);
                            }
                            break;

                        case "S_Simple_Ref":
                            SSimpleRef sSimpleRef = sSimpleRefMapper.getObject(valueStruct);
                            for (ClientNames dbName : ClientNames.values()) {
                                DBContextHolder.setCurrentDb(dbName);
                                sSimpleRefRepository.save(sSimpleRef);
                            }
                            break;

                    }

                }

            }

            /*if (messageType.equals("DELETE")) {
                Struct sourceRecordValue = (Struct) sourceRecord.value();
                Struct valueStruct = sourceRecordValue.getStruct("before");
                UUID uuid = UUID.fromString(valueStruct.getString("Id"));
                RVPRequest rvpRequest = new RVPRequest();
                rvpRequest.setId(uuid);

                for (ClientNames dbName : ClientNames.values()) {
                    DBContextHolder.setCurrentDb(dbName);
                    rvpRequestRepository.delete(rvpRequest);
                }
            }*/

        }

    }

}
