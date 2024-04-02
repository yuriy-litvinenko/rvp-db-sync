package kz.izipaq.rvpdbsync.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "\"RVPImmigrant\"")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class RVPImmigrant {

    @Id
    @Column(name = "\"Id\"")
    private UUID id;

    @Column(name = "\"CaseId\"")
    private UUID caseId;

    @Column(name = "\"DateIssue\"")
    private Timestamp dateIssue;

    @Column(name = "\"DateValidity\"")
    private Timestamp dateValidity;

    @Column(name = "\"VisitPurpose\"")
    private String visitPurpose;

    @Column(name = "\"IsBusinessImmigrant\"")
    private Boolean isBusinessImmigrant;

    @Column(name = "\"IsIssuedByMtszn\"")
    private Boolean isIssuedByMtszn;

    @Column(name = "\"Iin\"")
    private String iin;

    @Column(name = "\"SurnameC\"")
    private String surnameC;

    @Column(name = "\"NameC\"")
    private String nameC;

    @Column(name = "\"PatronymicC\"")
    private String patronymicC;

    @Column(name = "\"SurnameL\"")
    private String surnameL;

    @Column(name = "\"NameL\"")
    private String nameL;

    @Column(name = "\"PatronymicL\"")
    private String patronymicL;

    @Column(name = "\"SexId\"")
    private String sexId;

    @Column(name = "\"BirthDate\"")
    private Timestamp birthDate;

    @Column(name = "\"BirthCountryId\"")
    private String birthCountryId;

    @Column(name = "\"NationalityId\"")
    private String nationalityId;

    @Column(name = "\"CitizenshipId\"")
    private String citizenshipId;

    @Column(name = "\"DocumentTypeId\"")
    private String documentTypeId;

    @Column(name = "\"DocumentNumber\"")
    private String documentNumber;

    @Column(name = "\"DocumentDateIssue\"")
    private Timestamp documentDateIssue;

    @Column(name = "\"DocumentDateValidity\"")
    private Timestamp documentDateValidity;

    @Column(name = "\"DocumentCountryIssueId\"")
    private String documentCountryIssueId;

    @Column(name = "\"DocumentIssuedBy\"")
    private String documentIssuedBy;

    @Column(name = "\"InvCountryId\"")
    private String invCountryId;

    @Column(name = "\"InvAddress\"")
    private String invAddress;

    @Column(name = "\"RegionRKId\"")
    private String regionRKId;

    @Column(name = "\"DistrictRKId\"")
    private String districtRKId;

    @Column(name = "\"LocalityRK\"")
    private String localityRK;

    @Column(name = "\"StreetRK\"")
    private String streetRK;

    @Column(name = "\"HousingRK\"")
    private String housingRK;

    @Column(name = "\"HouseRK\"")
    private String houseRK;

    @Column(name = "\"FlatRK\"")
    private String flatRK;

    @Column(name = "\"IsOwnerConsent\"")
    private Boolean isOwnerConsent;

    @Column(name = "\"PKACode\"")
    private String pkaCode;

    @Column(name = "\"WorkPermissionNo\"")
    private String workPermissionNo;

    @Column(name = "\"WorkPermitImmigrantIin\"")
    private String workPermitImmigrantIin;

    @Column(name = "\"WorkPermissionDateIssue\"")
    private Timestamp workPermissionDateIssue;

    @Column(name = "\"WorkPermissionDateValidity\"")
    private Timestamp workPermissionDateValidity;

    @Column(name = "\"ResidentNotificationDate\"")
    private Timestamp residentNotificationDate;

    @Column(name = "\"ResidentArrivalDate\"")
    private Timestamp residentArrivalDate;

    @Column(name = "\"InRkEntryDate\"")
    private Timestamp inRkEntryDate;

    @Column(name = "\"KPPCode\"")
    private String kppCode;

    @Column(name = "\"ArrivalMethodDescription\"")
    private String arrivalMethodDescription;

    @Column(name = "\"ArrivalPlaceCode\"")
    private String arrivalPlaceCode;

    @Column(name = "\"RelativeIIN\"")
    private String relativeIIN;

    @Column(name = "\"RelativeRVPNo\"")
    private String relativeRVPNo;

    @Column(name = "\"RelativeRVPVisitPurpose\"")
    private String relativeRVPVisitPurpose;

    @Column(name = "\"RelativeRVPDateIssue\"")
    private Timestamp relativeRVPDateIssue;

    @Column(name = "\"RelativeRVPDateValidity\"")
    private Timestamp relativeRVPDateValidity;

    @Column(name = "\"RelativeRVPSurnameC\"")
    private String relativeRVPSurnameC;

    @Column(name = "\"RelativeRVPNameC\"")
    private String relativeRVPNameC;

    @Column(name = "\"RelativeRVPPatronymicC\"")
    private String relativeRVPPatronymicC;

    @Column(name = "\"RelativeRVPSurnameL\"")
    private String relativeRVPSurnameL;

    @Column(name = "\"RelativeRVPNameL\"")
    private String relativeRVPNameL;

    @Column(name = "\"RelativeRVPPatronymicL\"")
    private String relativeRVPPatronymicL;

    @Column(name = "\"RelativeRVPBirth\"")
    private Timestamp relativeRVPBirth;

    @Column(name = "\"RelativeRVPSexId\"")
    private String relativeRVPSexId;

    @Column(name = "\"ResidentHostIinBin\"")
    private String residentHostIinBin;

    @Column(name = "\"EDStatusCode\"")
    private Integer edStatusCode;

    @Column(name = "\"EDStatus\"")
    private String edStatus;

    @Column(name = "\"EDOrganizationBin\"")
    private String edOrganizationBin;

    @Column(name = "\"EDOrganizationNameRu\"")
    private String edOrganizationNameRu;

    @Column(name = "\"EDOrganizationNameKz\"")
    private String edOrganizationNameKz;

    @Column(name = "\"EDContractNumber\"")
    private String edContractNumber;

    @Column(name = "\"EDBeginDate\"")
    private Timestamp edBeginDate;

    @Column(name = "\"EDEndDate\"")
    private Timestamp edEndDate;

    @Column(name = "\"EDEstablishedPost\"")
    private String edEstablishedPost;

    @Column(name = "\"EDPositionRu\"")
    private String edPositionRu;

    @Column(name = "\"EDPositionKz\"")
    private String edPositionKz;

    @Column(name = "\"EDContractPeriodRu\"")
    private String edContractPeriodRu;

    @Column(name = "\"EDContractPeriodKz\"")
    private String edContractPeriodKz;

    @Column(name = "\"SurNameIRS\"")
    private String surNameIRS;

    @Column(name = "\"NameIRS\"")
    private String nameIRS;

    @Column(name = "\"MiddleNameIRS\"")
    private String middleNameIRS;

    @Column(name = "\"PermitNumIRS\"")
    private String permitNumIRS;

    @Column(name = "\"DocNumIRS\"")
    private String docNumIRS;

    @Column(name = "\"CitizenshipIRS\"")
    private String citizenshipIRS;

    @Column(name = "\"PermitBeginDateIRS\"")
    private Timestamp permitBeginDateIRS;

    @Column(name = "\"PermitEndDateIRS\"")
    private Timestamp permitEndDateIRS;

    @Column(name = "\"RegUserFioIRS\"")
    private String regUserFioIRS;

    @Column(name = "\"SystemDateIRS\"")
    private Timestamp systemDateIRS;

    @Column(name = "\"IsReplicated\"")
    private Boolean isReplicated;

}
