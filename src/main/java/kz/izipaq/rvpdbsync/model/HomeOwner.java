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
@Table(name = "\"HomeOwner\"")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class HomeOwner {

    @Id
    @Column(name = "\"Id\"")
    private UUID id;

    @Column(name = "\"CaseId\"")
    private UUID caseId;

    @Column(name = "\"RefId\"")
    private UUID refId;

    @Column(name = "\"IinOrBin\"")
    private String iinOrBin;

    @Column(name = "\"RequestTypeId\"")
    private String requestTypeId;

    @Column(name = "\"RequestNumber\"")
    private String requestNumber;

    @Column(name = "\"OwnerConsent\"")
    private Boolean ownerConsent;

    @Column(name = "\"IsDeleted\"")
    private Boolean isDeleted;

    @Column(name = "\"CreatedDate\"")
    private Timestamp createdDate;

    @Column(name = "\"CreatedBy\"")
    private String createdBy;

    @Column(name = "\"ModifiedDate\"")
    private Timestamp modifiedDate;

    @Column(name = "\"ModifiedBy\"")
    private String modifiedBy;

    @Column(name = "\"IsReplicated\"")
    private Boolean isReplicated;

}
