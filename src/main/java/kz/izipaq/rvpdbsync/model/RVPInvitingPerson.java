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
@Table(name = "\"RVPInvitingPerson\"")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class RVPInvitingPerson {

    @Id
    @Column(name = "\"Id\"")
    private UUID id;

    @Column(name = "\"CaseId\"")
    private UUID caseId;

    @Column(name = "\"TypeId\"")
    private String typeId;

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

    @Column(name = "\"BirthDate\"")
    private Timestamp birthDate;

    @Column(name = "\"SexId\"")
    private String sexId;

    @Column(name = "\"PhoneNumber\"")
    private String phoneNumber;

    @Column(name = "\"Email\"")
    private String email;

    @Column(name = "\"HostCitizenshipId\"")
    private String hostCitizenshipId;

    @Column(name = "\"HostDocumentTypeId\"")
    private String hostDocumentTypeId;

    @Column(name = "\"HostDocumentNumber\"")
    private String hostDocumentNumber;

    @Column(name = "\"HostDocumentDateIssue\"")
    private Timestamp hostDocumentDateIssue;

    @Column(name = "\"HostDocumentValidity\"")
    private Timestamp hostDocumentValidity;

    @Column(name = "\"HostDocumentCountryId\"")
    private String hostDocumentCountryId;

    @Column(name = "\"HostDocumentIssuingAuthority\"")
    private String hostDocumentIssuingAuthority;

    @Column(name = "\"HostRcaCode\"")
    private String hostRcaCode;

    @Column(name = "\"HostCountryId\"")
    private String hostCountryId;

    @Column(name = "\"HostRegionId\"")
    private String hostRegionId;

    @Column(name = "\"HostDistrictId\"")
    private String hostDistrictId;

    @Column(name = "\"HostLocality\"")
    private String hostLocality;

    @Column(name = "\"HostStreet\"")
    private String hostStreet;

    @Column(name = "\"HostHouse\"")
    private String hostHouse;

    @Column(name = "\"HostHousing\"")
    private String hostHousing;

    @Column(name = "\"HostFlat\"")
    private String hostFlat;

    @Column(name = "\"OrgBin\"")
    private String orgBin;

    @Column(name = "\"OrgName\"")
    private String orgName;

    @Column(name = "\"OrgRegCertNum\"")
    private String orgRegCertNum;

    @Column(name = "\"OrgCertIssueDate\"")
    private Timestamp orgCertIssueDate;

    @Column(name = "\"OrgPhoneNum\"")
    private String orgPhoneNum;

    @Column(name = "\"OrgEmail\"")
    private String orgEmail;

    @Column(name = "\"OrgRegionId\"")
    private String orgRegionId;

    @Column(name = "\"OrgDistrictId\"")
    private String orgDistrictId;

    @Column(name = "\"OrgLocality\"")
    private String orgLocality;

    @Column(name = "\"OrgStreet\"")
    private String orgStreet;

    @Column(name = "\"OrgHouse\"")
    private String orgHouse;

    @Column(name = "\"OrgHousing\"")
    private String orgHousing;

    @Column(name = "\"OrgFlat\"")
    private String orgFlat;

    @Column(name = "\"OrgRcaCode\"")
    private String orgRcaCode;

    @Column(name = "\"IsReplicated\"")
    private Boolean isReplicated;

}
