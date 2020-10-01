package br.com.senai.model;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    private Integer codigo;
    private String loja;
    private List<Produto> produtoDisponiveis;
    public Double valorVendido;
    public Double valorDeLucro;
    private List<Colaborador> relatorioColaboradores;

    //Construtores

    public Loja(Integer codigo, String loja) {
        super();
        this.codigo = codigo;
        this.loja = loja;
        this.produtoDisponiveis = new ArrayList<Produto>();
        this.valorVendido = 0.0;
        this.valorDeLucro = 0.0;
        this.relatorioColaboradores = new ArrayList<Colaborador>();
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

    public List<Produto> getProdutoDisponiveis() {
        return produtoDisponiveis;
    }

    public Double getValorVendido() {
        return valorVendido;
    }

    public Double getValorDeLucro() {
        return valorDeLucro;
    }

    public List<Colaborador> getRelatorioColaboradores() {
        return relatorioColaboradores;
    }

    //toString

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Loja nº: "+this.codigo+"\n");
        sb.append("Localidade: "+this.loja+"\n");
        sb.append("Quantidade de Produtos"+this.produtoDisponiveis.size()+"\n");
        sb.append("Total de Venda: "+this.valorVendido+"\n");
        sb.append("Total de Lucro: "+this.valorDeLucro+"\n");

        return sb.toString();
    }

    //Metodos

    public void adicionarProdutos(Produto p) {
        this.produtoDisponiveis.add(p);
        System.out.println("Produto Adicionado:\n"+p);
    }

    public void removerProdutos(Produto p) {
        this.produtoDisponiveis.remove(p);
        System.out.println("Produto Removido:\n"+p);
    }

    public void listarProdutos() {
        StringBuffer sb = new StringBuffer();
        sb.append("Produtos Disponiveis:\n");
        //foreach
        for (Produto p : produtoDisponiveis) {
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
        for (Colaborador c : relatorioColaboradores) {
            sb.append("==========================\n");
            sb.append(c+"\n");
        }
        System.out.println(sb.toString());}

    public void adicionarColaboradores(Colaborador c) {
        this.relatorioColaboradores.add(c);
        System.out.println("Colaborador Adicionado:\n"+c);
    }

}




