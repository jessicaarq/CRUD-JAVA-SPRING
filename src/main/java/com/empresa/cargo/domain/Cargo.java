package com.empresa.cargo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "cargo")
public class Cargo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name="cargo_nome")
    private String cargoNome;

    @Column(name="trilha_id")
    private int trilhaId;

    @Column(name="cargo_missao")
    private String cargoMissao;

    @Column(name="data_atualizacao")
    private Date dataAtualizacao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getCargoNome() {
        return cargoNome;
    }

    public void setCargoNome(String cargoNome) {
        this.cargoNome = cargoNome;
    }

    public int getTrilhaId() {
        return trilhaId;
    }

    public void setTrilhaId(int trilhaId) {
        this.trilhaId = trilhaId;
    }

    public String getCargoMissao() {
        return cargoMissao;
    }

    public void setCargoMissao(String cargoMissao) {
        this.cargoMissao = cargoMissao;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

}
