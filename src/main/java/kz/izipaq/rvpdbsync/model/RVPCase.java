package kz.izipaq.rvpdbsync.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "\"RVPCase\"")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class RVPCase {

    @Id
    @Column(name = "\"Id\"")
    private UUID id;

    @Column(name = "\"InvitingPerson\"")
    private UUID invitingPerson;

    @Column(name = "\"ImmigrantId\"")
    private UUID immigrantId;

    @Column(name = "\"CaseNumber\"")
    private String caseNumber;

    @Column(name = "\"SerialNumber\"")
    private Long serialNumber;

    @Column(name = "\"CaseStatusId\"")
    private String caseStatusId;

    @Column(name = "\"DepartmentId\"")
    private BigDecimal departmentId;

    @Column(name = "\"Sender\"")
    private String sender;

    @Column(name = "\"ApplicationNumber\"")
    private String applicationNumber;

    @Column(name = "\"OraclePersonId\"")
    private Long oraclePersonId;

    @Column(name = "\"CreatorFullName\"")
    private String creatorFullName;

    @Column(name = "\"OfficialName\"")
    private String officialName;

    @Column(name = "\"DateOfService\"")
    private Timestamp dateOfService;

    @Column(name = "\"Region\"")
    private String region;

    @Column(name = "\"District\"")
    private String district;

    @Column(name = "\"ServiceTypeId\"")
    private String serviceTypeId;

    @Column(name = "\"ReasonForShorteningId\"")
    private String reasonForShorteningId;

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

    @Column(name = "\"GeneratedCaseNumber\"")
    private String generatedCaseNumber;

    @Column(name = "\"IsMTSZNSend\"")
    private Boolean isMTSZNSend;

    @Column(name = "\"IsRead\"")
    private Boolean isRead;

    @Column(name = "\"Message\"")
    private String message;

    @Column(name = "\"RVPBerkutId\"")
    private UUID rVPBerkutId;

    @Column(name = "\"IsProcessing\"")
    private Boolean isProcessing;

    @Column(name = "\"ParentId\"")
    private UUID parentId;

    @Column(name = "\"IsReplicated\"")
    private Boolean isReplicated;

}
