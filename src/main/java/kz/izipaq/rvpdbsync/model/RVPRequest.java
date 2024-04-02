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
@Table(name = "\"RVPRequest\"")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class RVPRequest {

    @Id
    @Column(name = "\"Id\"")
    private UUID id;

    @Column(name = "\"CaseId\"")
    private UUID caseId;

    @Column(name = "\"Sender\"")
    private String sender;

    @Column(name = "\"RequestNumber\"")
    private String requestNumber;

    @Column(name = "\"RequestStatusId\"")
    private String requestStatusId;

    @Column(name = "\"ServiceTypeId\"")
    private String serviceTypeId;

    @Column(name = "\"Region\"")
    private String region;

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

    @Column(name = "\"DateOfBirth\"")
    private Timestamp dateOfBirth;

    @Column(name = "\"IIN\"")
    private String iin;

    @Column(name = "\"CitizenshipId\"")
    private String citizenshipId;

    @Column(name = "\"NationalityId\"")
    private String nationalityId;

    @Column(name = "\"CaseNumber\"")
    private String caseNumber;

    @Column(name = "\"DocumentNumber\"")
    private String documentNumber;

    @Column(name = "\"IniciatorDepartment\"")
    private String iniciatorDepartment;

    @Column(name = "\"CreatedDate\"")
    private Timestamp createdDate;

    @Column(name = "\"ModifiedDate\"")
    private Timestamp modifiedDate;

    @Column(name = "\"IsDeleted\"")
    private Boolean isDeleted;

    @Column(name = "\"CreatedBy\"")
    private String createdBy;

    @Column(name = "\"ModifiedBy\"")
    private String modifiedBy;

    @Column(name = "\"XmlBody\"")
    private String xmlBody;

    @Column(name = "\"IsStarted\"")
    private Short isStarted;

    @Column(name = "\"IsFinished\"")
    private Short isFinished;

    @Column(name = "\"District\"")
    private String district;

    @Column(name = "\"VisitPurposeId\"")
    private String visitPurposeId;

    @Column(name = "\"HostTypeId\"")
    private String hostTypeId;

    @Column(name = "\"ResidentHostIinBin\"")
    private String residentHostIinBin;

    @Column(name = "\"AutoFailure\"")
    private String autoFailure;

    @Column(name = "\"AutoFailureDetailId\"")
    private String autoFailureDetailId;

    @Column(name = "\"IsReplicated\"")
    private Boolean isReplicated;

}
