package kz.izipaq.rvpdbsync.mapper;

import kz.izipaq.rvpdbsync.model.RVPImmigrant;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.connect.data.Struct;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RVPImmigrantMapper {

    private final MapHandler mapHandler;

    public RVPImmigrant getObject(Struct struct) {
        RVPImmigrant rvpImmigrant = new RVPImmigrant();
        rvpImmigrant.setId(mapHandler.getAsUUID(struct, "Id"));
        rvpImmigrant.setCaseId(mapHandler.getAsUUID(struct, "CaseId"));
        rvpImmigrant.setDateIssue(mapHandler.getAsTimestamp(struct, "DateIssue"));
        rvpImmigrant.setDateValidity(mapHandler.getAsTimestamp(struct, "DateValidity"));
        rvpImmigrant.setVisitPurpose(mapHandler.getAsString(struct, "VisitPurpose"));
        rvpImmigrant.setIsBusinessImmigrant(mapHandler.getAsBoolean(struct, "IsBusinessImmigrant"));
        rvpImmigrant.setIsIssuedByMtszn(mapHandler.getAsBoolean(struct, "IsIssuedByMtszn"));
        rvpImmigrant.setIin(mapHandler.getAsString(struct, "Iin"));
        rvpImmigrant.setSurnameC(mapHandler.getAsString(struct, "SurnameC"));
        rvpImmigrant.setNameC(mapHandler.getAsString(struct, "NameC"));
        rvpImmigrant.setPatronymicC(mapHandler.getAsString(struct, "PatronymicC"));
        rvpImmigrant.setSurnameL(mapHandler.getAsString(struct, "SurnameL"));
        rvpImmigrant.setNameL(mapHandler.getAsString(struct, "NameL"));
        rvpImmigrant.setPatronymicL(mapHandler.getAsString(struct, "PatronymicL"));
        rvpImmigrant.setSexId(mapHandler.getAsString(struct, "SexId"));
        rvpImmigrant.setBirthDate(mapHandler.getAsTimestamp(struct, "BirthDate"));
        rvpImmigrant.setBirthCountryId(mapHandler.getAsString(struct, "BirthCountryId"));
        rvpImmigrant.setNationalityId(mapHandler.getAsString(struct, "NationalityId"));
        rvpImmigrant.setCitizenshipId(mapHandler.getAsString(struct, "CitizenshipId"));
        rvpImmigrant.setDocumentTypeId(mapHandler.getAsString(struct, "DocumentTypeId"));
        rvpImmigrant.setDocumentNumber(mapHandler.getAsString(struct, "DocumentNumber"));
        rvpImmigrant.setDocumentDateIssue(mapHandler.getAsTimestamp(struct, "DocumentDateIssue"));
        rvpImmigrant.setDocumentDateValidity(mapHandler.getAsTimestamp(struct, "DocumentDateValidity"));
        rvpImmigrant.setDocumentCountryIssueId(mapHandler.getAsString(struct, "DocumentCountryIssueId"));
        rvpImmigrant.setDocumentIssuedBy(mapHandler.getAsString(struct, "DocumentIssuedBy"));
        rvpImmigrant.setInvCountryId(mapHandler.getAsString(struct, "InvCountryId"));
        rvpImmigrant.setInvAddress(mapHandler.getAsString(struct, "InvAddress"));
        rvpImmigrant.setRegionRKId(mapHandler.getAsString(struct, "RegionRKId"));
        rvpImmigrant.setDistrictRKId(mapHandler.getAsString(struct, "DistrictRKId"));
        rvpImmigrant.setLocalityRK(mapHandler.getAsString(struct, "LocalityRK"));
        rvpImmigrant.setStreetRK(mapHandler.getAsString(struct, "StreetRK"));
        rvpImmigrant.setHousingRK(mapHandler.getAsString(struct, "HousingRK"));
        rvpImmigrant.setHouseRK(mapHandler.getAsString(struct, "HouseRK"));
        rvpImmigrant.setFlatRK(mapHandler.getAsString(struct, "FlatRK"));
        rvpImmigrant.setIsOwnerConsent(mapHandler.getAsBoolean(struct, "IsOwnerConsent"));
        rvpImmigrant.setPkaCode(mapHandler.getAsString(struct, "PKACode"));
        rvpImmigrant.setWorkPermissionNo(mapHandler.getAsString(struct, "WorkPermissionNo"));
        rvpImmigrant.setWorkPermitImmigrantIin(mapHandler.getAsString(struct, "WorkPermitImmigrantIin"));
        rvpImmigrant.setWorkPermissionDateIssue(mapHandler.getAsTimestamp(struct, "WorkPermissionDateIssue"));
        rvpImmigrant.setWorkPermissionDateValidity(mapHandler.getAsTimestamp(struct, "WorkPermissionDateValidity"));
        rvpImmigrant.setResidentNotificationDate(mapHandler.getAsTimestamp(struct, "ResidentNotificationDate"));
        rvpImmigrant.setResidentArrivalDate(mapHandler.getAsTimestamp(struct, "ResidentArrivalDate"));
        rvpImmigrant.setInRkEntryDate(mapHandler.getAsTimestamp(struct, "InRkEntryDate"));
        rvpImmigrant.setKppCode(mapHandler.getAsString(struct, "KPPCode"));
        rvpImmigrant.setArrivalMethodDescription(mapHandler.getAsString(struct, "ArrivalMethodDescription"));
        rvpImmigrant.setArrivalPlaceCode(mapHandler.getAsString(struct, "ArrivalPlaceCode"));
        rvpImmigrant.setRelativeIIN(mapHandler.getAsString(struct, "RelativeIIN"));
        rvpImmigrant.setRelativeRVPNo(mapHandler.getAsString(struct, "RelativeRVPNo"));
        rvpImmigrant.setRelativeRVPVisitPurpose(mapHandler.getAsString(struct, "RelativeRVPVisitPurpose"));
        rvpImmigrant.setRelativeRVPDateIssue(mapHandler.getAsTimestamp(struct, "RelativeRVPDateIssue"));
        rvpImmigrant.setRelativeRVPDateValidity(mapHandler.getAsTimestamp(struct, "RelativeRVPDateValidity"));
        rvpImmigrant.setRelativeRVPSurnameC(mapHandler.getAsString(struct, "RelativeRVPSurnameC"));
        rvpImmigrant.setRelativeRVPNameC(mapHandler.getAsString(struct, "RelativeRVPNameC"));
        rvpImmigrant.setRelativeRVPPatronymicC(mapHandler.getAsString(struct, "RelativeRVPPatronymicC"));
        rvpImmigrant.setRelativeRVPSurnameL(mapHandler.getAsString(struct, "RelativeRVPSurnameL"));
        rvpImmigrant.setRelativeRVPNameL(mapHandler.getAsString(struct, "RelativeRVPNameL"));
        rvpImmigrant.setRelativeRVPPatronymicL(mapHandler.getAsString(struct, "RelativeRVPPatronymicL"));
        rvpImmigrant.setRelativeRVPBirth(mapHandler.getAsTimestamp(struct, "RelativeRVPBirth"));
        rvpImmigrant.setRelativeRVPSexId(mapHandler.getAsString(struct, "RelativeRVPSexId"));
        rvpImmigrant.setResidentHostIinBin(mapHandler.getAsString(struct, "ResidentHostIinBin"));
        rvpImmigrant.setEdStatusCode(mapHandler.getAsInteger(struct, "EDStatusCode"));
        rvpImmigrant.setEdStatus(mapHandler.getAsString(struct, "EDStatus"));
        rvpImmigrant.setEdOrganizationBin(mapHandler.getAsString(struct, "EDOrganizationBin"));
        rvpImmigrant.setEdOrganizationNameRu(mapHandler.getAsString(struct, "EDOrganizationNameRu"));
        rvpImmigrant.setEdOrganizationNameKz(mapHandler.getAsString(struct, "EDOrganizationNameKz"));
        rvpImmigrant.setEdContractNumber(mapHandler.getAsString(struct, "EDContractNumber"));
        rvpImmigrant.setEdBeginDate(mapHandler.getAsTimestamp(struct, "EDBeginDate"));
        rvpImmigrant.setEdEndDate(mapHandler.getAsTimestamp(struct, "EDEndDate"));
        rvpImmigrant.setEdEstablishedPost(mapHandler.getAsString(struct, "EDEstablishedPost"));
        rvpImmigrant.setEdPositionRu(mapHandler.getAsString(struct, "EDPositionRu"));
        rvpImmigrant.setEdPositionKz(mapHandler.getAsString(struct, "EDPositionKz"));
        rvpImmigrant.setEdContractPeriodRu(mapHandler.getAsString(struct, "EDContractPeriodRu"));
        rvpImmigrant.setEdContractPeriodKz(mapHandler.getAsString(struct, "EDContractPeriodKz"));
        rvpImmigrant.setSurNameIRS(mapHandler.getAsString(struct, "SurNameIRS"));
        rvpImmigrant.setNameIRS(mapHandler.getAsString(struct, "NameIRS"));
        rvpImmigrant.setMiddleNameIRS(mapHandler.getAsString(struct, "MiddleNameIRS"));
        rvpImmigrant.setPermitNumIRS(mapHandler.getAsString(struct, "PermitNumIRS"));
        rvpImmigrant.setDocNumIRS(mapHandler.getAsString(struct, "DocNumIRS"));
        rvpImmigrant.setCitizenshipIRS(mapHandler.getAsString(struct, "CitizenshipIRS"));
        rvpImmigrant.setPermitBeginDateIRS(mapHandler.getAsTimestamp(struct, "PermitBeginDateIRS"));
        rvpImmigrant.setPermitEndDateIRS(mapHandler.getAsTimestamp(struct, "PermitEndDateIRS"));
        rvpImmigrant.setRegUserFioIRS(mapHandler.getAsString(struct, "RegUserFioIRS"));
        rvpImmigrant.setSystemDateIRS(mapHandler.getAsTimestamp(struct, "SystemDateIRS"));
        rvpImmigrant.setIsReplicated(true);
        return rvpImmigrant;
    }

}
