package br.com.uniderp.poo2.atacado.Entities;

import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_subclasse")
public class Subclasse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private Long codigoClasse;

    private String nome;

    @Column(name = "dataDeInclusao")
    @DateTimeFormat(pattern="yyyy-MM-dd-HH.mm.ss")
    private LocalDate dataDeInclusao;

    public Long getCodigo() {
        return codigo;
    }
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    public Long getCodigoClasse() {
        return codigoClasse;
    }
    public void setCodigoClasse(Long codigoClasse) {
        this.codigoClasse = codigoClasse;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataDeInclusao() {
        return dataDeInclusao;
    }
    public void setDataDeInclusao(LocalDate dataDeInclusao) {
        this.dataDeInclusao = dataDeInclusao;
    }
    public Subclasse() {
    }
    public Subclasse(Long codigo, Long codigoClasse, String nome, LocalDate dataDeInclusao) {
        this.codigo = codigo;
        this.codigoClasse = codigoClasse;
        this.nome = nome;
        this.dataDeInclusao = dataDeInclusao;
    }
}
