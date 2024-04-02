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

@Entity
@Table(name = "\"S_Simple_Ref\"")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class SSimpleRef {

    @Id
    @Column(name = "\"Id\"")
    private String id;

    @Column(name = "\"Descr_ru\"")
    private String descrRu;

    @Column(name = "\"Descr_kz\"")
    private String descrKz;

    @Column(name = "\"Is_Sys\"")
    private BigDecimal isSys;

    @Column(name = "\"IsReplicated\"")
    private Boolean isReplicated;

}
