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

@Entity
@Table(name = "\"D_Simple_Ref_Val\"")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class DSimpleRefVal {

    @Id
    @Column(name = "\"Id\"")
    private String id;

    @Column(name = "\"Ref_Id\"")
    private String refId;

    @Column(name = "\"Descr_ru\"")
    private String descrRu;

    @Column(name = "\"Descr_kk\"")
    private String descrKk;

    @Column(name = "\"Descr_full_ru\"")
    private String descrFullRu;

    @Column(name = "\"Descr_full_kz\"")
    private String descrFullKz;

    @Column(name = "\"Status\"")
    private BigDecimal status;

    @Column(name = "\"Pid\"")
    private String pid;

    @Column(name = "\"Ins_Date\"")
    private Timestamp insDate;

    @Column(name = "\"Del_User_Id\"")
    private BigDecimal delUserId;

    @Column(name = "\"Del_Date\"")
    private Timestamp delDate;

    @Column(name = "\"Ins_User_Id\"")
    private BigDecimal insUserId;

    @Column(name = "\"Code\"")
    private String code;

    @Column(name = "\"Item_Order\"")
    private BigDecimal itemOrder;

    @Column(name = "\"Parent_Id\"")
    private String parentId;

    @Column(name = "\"Descr_en\"")
    private String descrEn;

    @Column(name = "\"IsReplicated\"")
    private Boolean isReplicated;

}
