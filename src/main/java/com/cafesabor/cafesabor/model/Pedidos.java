package com.cafesabor.cafesabor.model;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "produtos")
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull

    private String desc;
    private String tipo;

    @DateTimeFormat(style = "yyyy-MM-dd")
    private LocalDate data_fabricacao;
    private BigDecimal preco;
    //Constructor

    public Pedidos(int id, String desc, String tipo, LocalDate data_fabricacao, BigDecimal preco) {
        this.id = id;
        this.desc = desc;
        this.tipo = tipo;
        this.data_fabricacao = data_fabricacao;
        this.preco = preco;
    }


    //Gets Sets

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getData_fabricacao() {
        return data_fabricacao;
    }

    public void setData_fabricacao(LocalDate data_fabricacao) {
        this.data_fabricacao = data_fabricacao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}