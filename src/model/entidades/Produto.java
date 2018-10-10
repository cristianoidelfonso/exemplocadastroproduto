package model.entidades;

import java.time.LocalDate;

public class Produto {
    
    private int idproduto;
    private String nome;
    private double preco;
    private String codigo;
    private double quantidade;
    private LocalDate validade;

    public Produto() {
    }

    public Produto(int idproduto, String nome, double preco, String codigo, double quantidade, LocalDate validade) {
        this.idproduto = idproduto;
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.validade = validade;
    }
    

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }
    
}
