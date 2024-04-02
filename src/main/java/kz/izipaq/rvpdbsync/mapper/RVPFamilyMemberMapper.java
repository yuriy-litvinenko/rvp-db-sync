package kz.izipaq.rvpdbsync.mapper;

import kz.izipaq.rvpdbsync.model.RVPFamilyMember;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.connect.data.Struct;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RVPFamilyMemberMapper {

    private final MapHandler mapHandler;

    public RVPFamilyMember getObject(Struct struct) {
        RVPFamilyMember rvpFamilyMember = new RVPFamilyMember();
        rvpFamilyMember.setId(mapHandler.getAsUUID(struct, "Id"));
        rvpFamilyMember.setCaseId(mapHandler.getAsUUID(struct, "CaseId"));
        rvpFamilyMember.setIin(mapHandler.getAsString(struct, "Iin"));
        rvpFamilyMember.setSurnameC(mapHandler.getAsString(struct, "SurnameC"));
        rvpFamilyMember.setNameC(mapHandler.getAsString(struct, "NameC"));
        rvpFamilyMember.setPatronymicC(mapHandler.getAsString(struct, "PatronymicC"));
        rvpFamilyMember.setSurnameL(mapHandler.getAsString(struct, "SurnameL"));
        rvpFamilyMember.setNameL(mapHandler.getAsString(struct, "NameL"));
        rvpFamilyMember.setPatronymicL(mapHandler.getAsString(struct, "PatronymicL"));
        rvpFamilyMember.setSexId(mapHandler.getAsString(struct, "SexId"));
        rvpFamilyMember.setBirthDate(mapHandler.getAsTimestamp(struct, "BirthDate"));
        rvpFamilyMember.setBirthCountryId(mapHandler.getAsString(struct, "BirthCountryId"));
        rvpFamilyMember.setRelationDegreeId(mapHandler.getAsString(struct, "RelationDegreeId"));
        rvpFamilyMember.setNationalityId(mapHandler.getAsString(struct, "NationalityId"));
        rvpFamilyMember.setCitizenshipId(mapHandler.getAsString(struct, "CitizenshipId"));
        rvpFamilyMember.setDocumentTypeId(mapHandler.getAsString(struct, "DocumentTypeId"));
        rvpFamilyMember.setDocumentNumber(mapHandler.getAsString(struct, "DocumentNumber"));
        rvpFamilyMember.setDocumentDateIssue(mapHandler.getAsTimestamp(struct, "DocumentDateIssue"));
        rvpFamilyMember.setDocumentValidity(mapHandler.getAsTimestamp(struct, "DocumentValidity"));
        rvpFamilyMember.setDocumentIssueCountryId(mapHandler.getAsString(struct, "DocumentIssueCountryId"));
        rvpFamilyMember.setDocumentIssuedBy(mapHandler.getAsString(struct, "DocumentIssuedBy"));
        rvpFamilyMember.setResCountryId(mapHandler.getAsString(struct, "ResCountryId"));
        rvpFamilyMember.setResAddress(mapHandler.getAsString(struct, "ResAddress"));
        rvpFamilyMember.setCreatedDate(mapHandler.getAsTimestamp(struct, "CreatedDate"));
        rvpFamilyMember.setModifedDate(mapHandler.getAsTimestamp(struct, "ModifedDate"));
        rvpFamilyMember.setIsDeleted(mapHandler.getAsBoolean(struct, "IsDeleted"));
        rvpFamilyMember.setCreatedBy(mapHandler.getAsString(struct, "CreatedBy"));
        rvpFamilyMember.setModifiedBy(mapHandler.getAsString(struct, "ModifiedBy"));
        rvpFamilyMember.setIsReplicated(true);
        return rvpFamilyMember;
    }

}
