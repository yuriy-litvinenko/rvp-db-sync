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
@Table(name = "\"RVPCaseHistory\"")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class RVPCaseHistory {

    @Id
    @Column(name = "\"Id\"")
    private UUID id;

    @Column(name = "\"CaseId\"")
    private UUID caseId;

    @Column(name = "\"CaseStatusId\"")
    private String caseStatusId;

    @Column(name = "\"ModifiedBy\"")
    private String modifiedBy;

    @Column(name = "\"ModifedDate\"")
    private Timestamp modifedDate;

    @Column(name = "\"DepartmentId\"")
    private BigDecimal departmentId;

    @Column(name = "\"StatusChangeReasonId\"")
    private String statusChangeReasonId;

    @Column(name = "\"Comment\"")
    private String comment;

    @Column(name = "\"IsReplicated\"")
    private Boolean isReplicated;

}
