package br.com.senai.model;

import java.util.ArrayList;
import java.util.List;

import br.com.senai.model.Produtos;

public class Loja {

    private Integer codigo;
    private String loja;
    private List<Produtos> produtosDisponiveis;
    public Double valorVendido;
    public Double valorDeLucro;
    private List<Colaboradores> relatorioColaboradores;

    //Construtores

    public Loja(Integer codigo, String loja) {
        super();
        this.codigo = codigo;
        this.loja = loja;
        this.produtosDisponiveis = new ArrayList<Produtos>();
        this.valorVendido = 0.0;
        this.valorDeLucro = 0.0;
        this.relatorioColaboradores = new ArrayList<Colaboradores>();
    }



    public Loja() {
        super();
    }



    //Gets and Sets

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public List<Produtos> getProdutosDisponiveis() {
        return produtosDisponiveis;
    }

    public Double getValorVendido() {
        return valorVendido;
    }

    public Double getValorDeLucro() {
        return valorDeLucro;
    }

    public List<Colaboradores> getRelatorioColaboradores() {
        return relatorioColaboradores;
    }

    //toString

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Loja nº: "+this.codigo+"\n");
        sb.append("Localidade: "+this.loja+"\n");
        sb.append("Quantidade de Produtos"+this.produtosDisponiveis.size()+"\n");
        sb.append("Total de Venda: "+this.valorVendido+"\n");
        sb.append("Total de Lucro: "+this.valorDeLucro+"\n");

        return sb.toString();
    }

    //Metodos

    public void adicionarProdutos(Produtos p) {
        this.produtosDisponiveis.add(p);
        System.out.println("Produto Adicionado:\n"+p);
    }

    public void removerProdutos(Produtos p) {
        this.produtosDisponiveis.remove(p);
        System.out.println("Produto Removido:\n"+p);
    }

    public void listarProdutos() {
        StringBuffer sb = new StringBuffer();
        sb.append("Produtos Disponiveis:\n");
        //foreach
        for (Produtos p : produtosDisponiveis) {
            sb.append("==========================\n");
            sb.append(p+"\n");
        }
        System.out.println(sb.toString());
    }

    /*public void venderProduto(Produtos p) {
        this.valorVendido += p.getValorVenda();
        this.valorDeLucro += p.calcularLucro();
        p.removerEstoque(1);
        StringBuffer sb = new StringBuffer();
        sb.append("Venda Efetuada:\n");
        sb.append(p);
        System.out.println(sb.toString());
    }*/

    public void resultadosFinanceiros( ) {
        StringBuffer sb = new StringBuffer();
        sb.append("Resultado Financeiro:\n");
        sb.append("Loja: "+this.codigo+"\n");
        sb.append("Localidade: "+this.loja+"\n");
        sb.append("Total Vendido: "+this.valorVendido+"\n");
        sb.append("Total de Lucro: "+this.valorDeLucro+"\n");
        System.out.println(sb.toString());
    }

    public void listarColaboradores() {
        StringBuffer sb = new StringBuffer();
        sb.append("Lista de Funcionários:\n");
        //foreach
        for (Colaboradores c : relatorioColaboradores) {
            sb.append("==========================\n");
            sb.append(c+"\n");
        }
        System.out.println(sb.toString());}

    public void adicionarColaboradores(Colaboradores c) {
        this.relatorioColaboradores.add(c);
        System.out.println("Colaborador Adicionado:\n"+c);
    }

}




