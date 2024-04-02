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
@Table(name = "\"RVPFamilyMember\"")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class RVPFamilyMember {

    @Id
    @Column(name = "\"Id\"")
    private UUID id;

    @Column(name = "\"CaseId\"")
    private UUID caseId;

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

    @Column(name = "\"RelationDegreeId\"")
    private String relationDegreeId;

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

    @Column(name = "\"DocumentValidity\"")
    private Timestamp documentValidity;

    @Column(name = "\"DocumentIssueCountryId\"")
    private String documentIssueCountryId;

    @Column(name = "\"DocumentIssuedBy\"")
    private String documentIssuedBy;

    @Column(name = "\"ResCountryId\"")
    private String resCountryId;

    @Column(name = "\"ResAddress\"")
    private String resAddress;

    @Column(name = "\"CreatedDate\"")
    private Timestamp createdDate;

    @Column(name = "\"ModifedDate\"")
    private Timestamp modifedDate;

    @Column(name = "\"IsDeleted\"")
    private Boolean isDeleted;

    @Column(name = "\"CreatedBy\"")
    private String createdBy;

    @Column(name = "\"ModifiedBy\"")
    private String modifiedBy;

    @Column(name = "\"IsReplicated\"")
    private Boolean isReplicated;

}
