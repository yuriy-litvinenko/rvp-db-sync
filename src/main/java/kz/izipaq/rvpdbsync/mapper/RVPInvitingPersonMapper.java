package kz.izipaq.rvpdbsync.mapper;

import kz.izipaq.rvpdbsync.model.RVPInvitingPerson;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.connect.data.Struct;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RVPInvitingPersonMapper {

    private final MapHandler mapHandler;

    public RVPInvitingPerson getObject(Struct struct) {
        RVPInvitingPerson rvpInvitingPerson = new RVPInvitingPerson();
        rvpInvitingPerson.setId(mapHandler.getAsUUID(struct, "Id"));
        rvpInvitingPerson.setCaseId(mapHandler.getAsUUID(struct, "CaseId"));
        rvpInvitingPerson.setTypeId(mapHandler.getAsString(struct, "TypeId"));
        rvpInvitingPerson.setIin(mapHandler.getAsString(struct, "Iin"));
        rvpInvitingPerson.setSurnameC(mapHandler.getAsString(struct, "SurnameC"));
        rvpInvitingPerson.setNameC(mapHandler.getAsString(struct, "NameC"));
        rvpInvitingPerson.setPatronymicC(mapHandler.getAsString(struct, "PatronymicC"));
        rvpInvitingPerson.setSurnameL(mapHandler.getAsString(struct, "SurnameL"));
        rvpInvitingPerson.setNameL(mapHandler.getAsString(struct, "NameL"));
        rvpInvitingPerson.setPatronymicL(mapHandler.getAsString(struct, "PatronymicL"));
        rvpInvitingPerson.setBirthDate(mapHandler.getAsTimestamp(struct, "BirthDate"));
        rvpInvitingPerson.setSexId(mapHandler.getAsString(struct, "SexId"));
        rvpInvitingPerson.setPhoneNumber(mapHandler.getAsString(struct, "PhoneNumber"));
        rvpInvitingPerson.setEmail(mapHandler.getAsString(struct, "Email"));
        rvpInvitingPerson.setHostCitizenshipId(mapHandler.getAsString(struct, "HostCitizenshipId"));
        rvpInvitingPerson.setHostDocumentTypeId(mapHandler.getAsString(struct, "HostDocumentTypeId"));
        rvpInvitingPerson.setHostDocumentNumber(mapHandler.getAsString(struct, "HostDocumentNumber"));
        rvpInvitingPerson.setHostDocumentDateIssue(mapHandler.getAsTimestamp(struct, "HostDocumentDateIssue"));
        rvpInvitingPerson.setHostDocumentValidity(mapHandler.getAsTimestamp(struct, "HostDocumentValidity"));
        rvpInvitingPerson.setHostDocumentCountryId(mapHandler.getAsString(struct, "HostDocumentCountryId"));
        rvpInvitingPerson.setHostDocumentIssuingAuthority(mapHandler.getAsString(struct, "HostDocumentIssuingAuthority"));
        rvpInvitingPerson.setHostRcaCode(mapHandler.getAsString(struct, "HostRcaCode"));
        rvpInvitingPerson.setHostCountryId(mapHandler.getAsString(struct, "HostCountryId"));
        rvpInvitingPerson.setHostRegionId(mapHandler.getAsString(struct, "HostRegionId"));
        rvpInvitingPerson.setHostDistrictId(mapHandler.getAsString(struct, "HostDistrictId"));
        rvpInvitingPerson.setHostLocality(mapHandler.getAsString(struct, "HostLocality"));
        rvpInvitingPerson.setHostStreet(mapHandler.getAsString(struct, "HostStreet"));
        rvpInvitingPerson.setHostHouse(mapHandler.getAsString(struct, "HostHouse"));
        rvpInvitingPerson.setHostHousing(mapHandler.getAsString(struct, "HostHousing"));
        rvpInvitingPerson.setHostFlat(mapHandler.getAsString(struct, "HostFlat"));
        rvpInvitingPerson.setOrgBin(mapHandler.getAsString(struct, "OrgBin"));
        rvpInvitingPerson.setOrgName(mapHandler.getAsString(struct, "OrgName"));
        rvpInvitingPerson.setOrgRegCertNum(mapHandler.getAsString(struct, "OrgRegCertNum"));
        rvpInvitingPerson.setOrgCertIssueDate(mapHandler.getAsTimestamp(struct, "OrgCertIssueDate"));
        rvpInvitingPerson.setOrgPhoneNum(mapHandler.getAsString(struct, "OrgPhoneNum"));
        rvpInvitingPerson.setOrgEmail(mapHandler.getAsString(struct, "OrgEmail"));
        rvpInvitingPerson.setOrgRegionId(mapHandler.getAsString(struct, "OrgRegionId"));
        rvpInvitingPerson.setOrgDistrictId(mapHandler.getAsString(struct, "OrgDistrictId"));
        rvpInvitingPerson.setOrgLocality(mapHandler.getAsString(struct, "OrgLocality"));
        rvpInvitingPerson.setOrgStreet(mapHandler.getAsString(struct, "OrgStreet"));
        rvpInvitingPerson.setOrgHouse(mapHandler.getAsString(struct, "OrgHouse"));
        rvpInvitingPerson.setOrgHousing(mapHandler.getAsString(struct, "OrgHousing"));
        rvpInvitingPerson.setOrgFlat(mapHandler.getAsString(struct, "OrgFlat"));
        rvpInvitingPerson.setOrgRcaCode(mapHandler.getAsString(struct, "OrgRcaCode"));
        rvpInvitingPerson.setIsReplicated(true);
        return rvpInvitingPerson;
    }

}
