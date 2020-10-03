package br.com.senai.model;

import br.com.senai.enumered.CategoriaProduto;

public class Produto {

    private String nome;
    private CategoriaProduto categoria;
    private Double valorCompra;
    private Double valorVenda;
    public Double totalLucro = 0.0;
    private Integer quantidadeEstoque;
    public Double totalVendas = 0.0;
    public Integer totalUnidadesVendidas = 0;

    //Construtores

    public Produto(String nome, br.com.senai.enumered.CategoriaProduto categoria, Double valorCompra, Double valorVenda, Integer quantidadeEstoque) {
        super();
        this.nome = nome;
        this.categoria = categoria;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
        this.totalLucro = totalLucro;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    //public Produtos() {
      //  super();
    //}

    //Gets and Sets

    public Integer getTotalUnidadesVendidas() {
        return totalUnidadesVendidas;
    }

    public void setTotalUnidadesVendidas(Integer totalUnidadesVendidas) {
        this.totalUnidadesVendidas = totalUnidadesVendidas;
    }

    public Double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(Double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Double getTotalLucro() {
        return totalLucro;
    }

    public void setTotalLucro(Double totalLucro) {
        this.totalLucro = totalLucro;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    //Hashcode and Equals

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    //toString

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Produto: "+this.nome+"\n");
        sb.append("Categoria: "+this.categoria+"\n");
        sb.append("Valor de Compra: "+this.valorCompra+"\n");
        sb.append("Valor de Venda: "+this.valorVenda+"\n");
        sb.append("Quantidade em estoque: "+this.quantidadeEstoque+"\n");
        sb.append("Lucro na venda: "+calcularLucro()+"\n");
        sb.append("Total de lucro obtido pelo produto: "+this.totalLucro+"\n");
        sb.append("Valor total de Vendas de "+this.nome+": "+this.totalVendas+"\n");
        sb.append("Total de Unidades vendidas: "+this.totalUnidadesVendidas+"\n");
        return sb.toString();
    }


    //Metodos

    public Double calcularLucro() {
        return this.valorVenda-this.valorCompra;

    }

    public void adicionarEstoque(Integer q) {
        this.quantidadeEstoque+=q;

    }

    public void removerEstoque(Integer q) {
        this.quantidadeEstoque-=q;

    }

    public void adicionarUnidadeVendida(Integer q) {
        this.totalUnidadesVendidas+=q;

    }


}