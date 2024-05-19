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
@Table(name="tb_classe")
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String nome;

    @Column(name = "dataDeInclusao")
    @DateTimeFormat(pattern="yyy-MM-dd-HH.mm.ss")
    private LocalDate dataDeInclusao;

    public Long getCodigo() {
        return codigo;
    }
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
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
    public Classe() {
    }
    public Classe(Long codigo, String nome, LocalDate dataDeInclusao) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataDeInclusao = dataDeInclusao;
    }
}
