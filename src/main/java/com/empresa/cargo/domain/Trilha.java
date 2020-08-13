package com.empresa.cargo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "trilha")
public class Trilha implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name="trilha_nome")
    private String trilhaNome;

    private String diretoria;

    @Column(name="missao_formal")
    private String missaoFormal;

    @Column(name="missao_alternativa")
    private String missaoAlternativa;

    @Column(name="data_atualizacao")
    private Date dataAtualizacao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTrilhaNome() {
        return trilhaNome;
    }

    public void setTrilhaNome(String trilhaNome) {
        this.trilhaNome = trilhaNome;
    }

    public String getDiretoria() {
        return diretoria;
    }

    public void setDiretoria(String diretoria) {
        this.diretoria = diretoria;
    }

    public String getMissaoFormal() {
        return missaoFormal;
    }

    public void setMissaoFormal(String missaoFormal) {
        this.missaoFormal = missaoFormal;
    }

    public String getMissaoAlternativa() {
        return missaoAlternativa;
    }

    public void setMissaoAlternativa(String missaoAlternativa) {
        this.missaoAlternativa = missaoAlternativa;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
}
