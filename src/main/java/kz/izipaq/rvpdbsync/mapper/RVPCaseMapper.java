package kz.izipaq.rvpdbsync.mapper;

import kz.izipaq.rvpdbsync.model.RVPCase;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.connect.data.Struct;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RVPCaseMapper {

    private final MapHandler mapHandler;

    public RVPCase getObject(Struct struct) {
        RVPCase rvpCase = new RVPCase();
        rvpCase.setId(mapHandler.getAsUUID(struct, "Id"));
        rvpCase.setInvitingPerson(mapHandler.getAsUUID(struct, "InvitingPerson"));
        rvpCase.setImmigrantId(mapHandler.getAsUUID(struct, "ImmigrantId"));
        rvpCase.setCaseNumber(mapHandler.getAsString(struct, "CaseNumber"));
        rvpCase.setSerialNumber(mapHandler.getAsLong(struct, "SerialNumber"));
        rvpCase.setCaseStatusId(mapHandler.getAsString(struct, "CaseStatusId"));
        rvpCase.setDepartmentId(mapHandler.getAsBigDecimal(struct, "DepartmentId"));
        rvpCase.setSender(mapHandler.getAsString(struct, "Sender"));
        rvpCase.setApplicationNumber(mapHandler.getAsString(struct, "ApplicationNumber"));
        rvpCase.setOraclePersonId(mapHandler.getAsLong(struct, "OraclePersonId"));
        rvpCase.setCreatorFullName(mapHandler.getAsString(struct, "CreatorFullName"));
        rvpCase.setOfficialName(mapHandler.getAsString(struct, "OfficialName"));
        rvpCase.setDateOfService(mapHandler.getAsTimestamp(struct, "DateOfService"));
        rvpCase.setRegion(mapHandler.getAsString(struct, "Region"));
        rvpCase.setDistrict(mapHandler.getAsString(struct, "District"));
        rvpCase.setServiceTypeId(mapHandler.getAsString(struct, "ServiceTypeId"));
        rvpCase.setReasonForShorteningId(mapHandler.getAsString(struct, "ReasonForShorteningId"));
        rvpCase.setCreatedDate(mapHandler.getAsTimestamp(struct, "CreatedDate"));
        rvpCase.setModifiedDate(mapHandler.getAsTimestamp(struct, "ModifiedDate"));
        rvpCase.setIsDeleted(mapHandler.getAsBoolean(struct, "IsDeleted"));
        rvpCase.setCreatedBy(mapHandler.getAsString(struct, "CreatedBy"));
        rvpCase.setModifiedBy(mapHandler.getAsString(struct, "ModifiedBy"));
        rvpCase.setGeneratedCaseNumber(mapHandler.getAsString(struct, "GeneratedCaseNumber"));
        rvpCase.setIsMTSZNSend(mapHandler.getAsBoolean(struct, "IsMTSZNSend"));
        rvpCase.setIsRead(mapHandler.getAsBoolean(struct, "IsRead"));
        rvpCase.setMessage(mapHandler.getAsString(struct, "Message"));
        rvpCase.setRVPBerkutId(mapHandler.getAsUUID(struct, "RVPBerkutId"));
        rvpCase.setIsProcessing(mapHandler.getAsBoolean(struct, "IsProcessing"));
        rvpCase.setParentId(mapHandler.getAsUUID(struct, "ParentId"));
        rvpCase.setIsReplicated(true);
        return rvpCase;
    }

}
