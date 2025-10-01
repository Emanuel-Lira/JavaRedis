package com.produtos.produtoscache.produto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class Produto implements Serializable {
    @Id @GeneratedValue
    private Long id;

    @Column(name = "preco")
    private BigDecimal preco;

    @Column(length = 50, nullable = false)
    private String name;


    public Produto(Long id, BigDecimal preco, String name) {
        this.id = id;
        this.preco = preco;
        this.name = name;
    }
    public Produto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
