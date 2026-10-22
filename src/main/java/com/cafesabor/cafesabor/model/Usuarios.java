package com.cafesabor.cafesabor.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table(name = "Usuarios")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @Column(length = 80)
    private Integer registro;
    private String nome;
    @Column(length = 40)
    private String email;
    @Column(length = 10)
    private String senha;
    @DateTimeFormat(style = "yyyy-mm-dd")
    private LocalDate dataAdmissao;
    private Boolean ativo;

    //Constructor
    public Usuarios() {
    }

    public Usuarios(String senha, Boolean ativo, LocalDate dataAdmissao, String email, Integer registro, long id, String nome) {
        this.senha = senha;
        this.ativo = ativo;
        this.dataAdmissao = dataAdmissao;
        this.email = email;
        this.registro = registro;
        this.id = id;
        this.nome = nome;
    }
    //Setters


    public void setId(long id) {
        this.id = id;
    }

    public void setRegistro(Integer registro) {
        this.registro = registro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
    //Getters

    public long getId() {
        return id;
    }

    public Integer getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public Boolean getAtivo() {
        return ativo;
    }
}
