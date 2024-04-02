package kz.izipaq.rvpdbsync.mapper;

import kz.izipaq.rvpdbsync.model.RVPRequest;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.connect.data.Struct;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RVPRequestMapper {

    private final MapHandler mapHandler;

    public RVPRequest getObject(Struct struct) {
        RVPRequest rvpRequest = new RVPRequest();
        rvpRequest.setId(mapHandler.getAsUUID(struct, "Id"));
        rvpRequest.setCaseId(mapHandler.getAsUUID(struct, "CaseId"));
        rvpRequest.setSender(mapHandler.getAsString(struct, "Sender"));
        rvpRequest.setRequestNumber(mapHandler.getAsString(struct, "RequestNumber"));
        rvpRequest.setRequestStatusId(mapHandler.getAsString(struct, "RequestStatusId"));
        rvpRequest.setServiceTypeId(mapHandler.getAsString(struct, "ServiceTypeId"));
        rvpRequest.setRegion(mapHandler.getAsString(struct, "Region"));
        rvpRequest.setSurnameC(mapHandler.getAsString(struct, "SurnameC"));
        rvpRequest.setNameC(mapHandler.getAsString(struct, "NameC"));
        rvpRequest.setPatronymicC(mapHandler.getAsString(struct, "PatronymicC"));
        rvpRequest.setSurnameL(mapHandler.getAsString(struct, "SurnameL"));
        rvpRequest.setNameL(mapHandler.getAsString(struct, "NameL"));
        rvpRequest.setPatronymicL(mapHandler.getAsString(struct, "PatronymicL"));
        rvpRequest.setDateOfBirth(mapHandler.getAsTimestamp(struct, "DateOfBirth"));
        rvpRequest.setIin(mapHandler.getAsString(struct, "IIN"));
        rvpRequest.setCitizenshipId(mapHandler.getAsString(struct, "CitizenshipId"));
        rvpRequest.setNationalityId(mapHandler.getAsString(struct, "NationalityId"));
        rvpRequest.setCaseNumber(mapHandler.getAsString(struct, "CaseNumber"));
        rvpRequest.setDocumentNumber(mapHandler.getAsString(struct, "DocumentNumber"));
        rvpRequest.setIniciatorDepartment(mapHandler.getAsString(struct, "IniciatorDepartment"));
        rvpRequest.setCreatedDate(mapHandler.getAsTimestamp(struct, "CreatedDate"));
        rvpRequest.setModifiedDate(mapHandler.getAsTimestamp(struct, "ModifiedDate"));
        rvpRequest.setIsDeleted(mapHandler.getAsBoolean(struct, "IsDeleted"));
        rvpRequest.setCreatedBy(mapHandler.getAsString(struct, "CreatedBy"));
        rvpRequest.setModifiedBy(mapHandler.getAsString(struct, "ModifiedBy"));
        rvpRequest.setXmlBody(mapHandler.getAsString(struct, "XmlBody"));
        rvpRequest.setIsStarted(mapHandler.getAsShort(struct, "IsStarted"));
        rvpRequest.setIsFinished(mapHandler.getAsShort(struct, "IsFinished"));
        rvpRequest.setDistrict(mapHandler.getAsString(struct, "District"));
        rvpRequest.setVisitPurposeId(mapHandler.getAsString(struct, "VisitPurposeId"));
        rvpRequest.setHostTypeId(mapHandler.getAsString(struct, "HostTypeId"));
        rvpRequest.setResidentHostIinBin(mapHandler.getAsString(struct, "ResidentHostIinBin"));
        rvpRequest.setAutoFailure(mapHandler.getAsString(struct, "AutoFailure"));
        rvpRequest.setAutoFailureDetailId(mapHandler.getAsString(struct, "AutoFailureDetailId"));
        rvpRequest.setIsReplicated(true);
        return rvpRequest;
    }

}
