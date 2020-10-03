package br.com.senai.model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Loja {

    private Integer codigo;
    private String loja;
    private List<Produto> produtoDisponiveis;
    public Double valorVendido;
    public Double valorDeLucro;
    private List<Colaborador> relatorioColaboradores;
    private List<Cliente> relatorioClientes;
    private String product;

    //Construtores

    public Loja(Integer codigo, String loja) {
        super();
        this.codigo = codigo;
        this.loja = loja;
        this.produtoDisponiveis = new ArrayList<Produto>();
        this.valorVendido = 0.0;
        this.valorDeLucro = 0.0;
        this.relatorioColaboradores = new ArrayList<Colaborador>();
        this.relatorioClientes = new ArrayList<Cliente>();
        this.product = product;
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

    public List<Cliente> getRelatorioClientes() {
        return relatorioClientes;
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

    public  String listarProdutos() {
        StringBuffer sb = new StringBuffer();
        sb.append("Produtos Disponiveis:\n");
        //foreach
        for (Produto p : produtoDisponiveis) {
            sb.append("==========================\n");
            sb.append(p+"\n");
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public void resultadosFinanceiros( ) {
        StringBuffer sb = new StringBuffer();
        sb.append("Resultado Financeiro:\n");
        sb.append("Loja: "+this.codigo+"\n");
        sb.append("Localidade: "+this.loja+"\n");
        sb.append("Total Vendido: "+this.valorVendido+"\n");
        sb.append("Total de Lucro: "+this.valorDeLucro+"\n");
        System.out.println(sb.toString());
    }

    public String listarColaboradores() {
        StringBuffer sb = new StringBuffer();
        sb.append("Lista de Funcionários:\n");
        //foreach
        for (Colaborador c : relatorioColaboradores) {
            sb.append("==========================\n");
            sb.append(c+"\n");
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public void adicionarColaboradores(Colaborador c) {
        this.relatorioColaboradores.add(c);
        System.out.println("Colaborador Adicionado:\n"+c);
    }

    public static void jop(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);

}

    public String listarClientes() {
        StringBuffer sb = new StringBuffer();
        sb.append("Lista de Clientes:\n");
        //foreach
        for (Cliente cl : relatorioClientes) {
            sb.append("==========================\n");
            sb.append(cl+"\n");
        }
        System.out.println(sb.toString());
        return sb.toString();

    }
    public void adicionarClientes(Cliente cl) {
        this.relatorioClientes.add(cl);
        System.out.println("Cliente Adicionado:\n"+cl);
}

        public String relatorioEstoque() {
            StringBuffer lista = new StringBuffer();
            lista.append("Lista de Produtos em Estoque");
            lista.append("\n");
            lista.append("========================");
            lista.append("\n");
            for (int i = 0; i < produtoDisponiveis.size(); i++) {
                lista.append(produtoDisponiveis.get(i).getNome()+"\n");
                lista.append("Qtde em Estoque: "+produtoDisponiveis.get(i).getQuantidadeEstoque()+"\n");
                lista.append("========================");
                lista.append("\n");
            }
            return lista.toString();
        }

    public String listaEstoque() {
        StringBuffer lista = new StringBuffer();
        lista.append("Lista de Produtos em Estoque");
        lista.append("\n");
        lista.append("========================");
        lista.append("\n");
        for (int i = 0; i < produtoDisponiveis.size(); i++) {
            lista.append("Opção - "+i+"\n"+produtoDisponiveis.get(i).getNome()+"\n");
            lista.append("Qtde em Estoque: "+produtoDisponiveis.get(i).getQuantidadeEstoque()+"\n");
            lista.append("========================");
            lista.append("\n");
        }
        return lista.toString();
    }

    public String listaVendedores() {
        StringBuffer lista = new StringBuffer();
        lista.append("Lista de Colaboradores");
        lista.append("\n");
        lista.append("========================");
        lista.append("\n");
        for (int i = 0; i < relatorioColaboradores.size(); i++) {
            lista.append("Opção - "+i+"\n"+relatorioColaboradores.get(i).getNome()+"\n");
            lista.append("========================");
            lista.append("\n");
        }
        return lista.toString();
    }

    public String listaClietela() {
        StringBuffer lista = new StringBuffer();
        lista.append("Lista de Clientes");
        lista.append("\n");
        lista.append("========================");
        lista.append("\n");
        for (int i = 0; i < relatorioClientes.size(); i++) {
            lista.append("Opção - "+i+"\n"+relatorioClientes.get(i).getNome()+"\n");
            lista.append("========================");
            lista.append("\n");
        }
        return lista.toString();
    }

    public String listaTotalVendas() {
        StringBuffer lista = new StringBuffer();
        lista.append("Relatório de Vendas");
        lista.append("\n");
        lista.append("========================");
        lista.append("\n");
        for (int i = 0; i < produtoDisponiveis.size(); i++) {
            lista.append("Produto: "+produtoDisponiveis.get(i).getNome()+"\n");
            lista.append("Unidades Vendidas: "+produtoDisponiveis.get(i).getTotalUnidadesVendidas()+"\n");
            lista.append("Valor Total de Vendas: "+produtoDisponiveis.get(i).getTotalVendas()+"\n");
            lista.append("Valor total de Lucro: "+produtoDisponiveis.get(i).getTotalLucro()+"\n");
            lista.append("========================");
            lista.append("\n");
        }
        return lista.toString();
    }

    public Double totaldeVendas2(){

        Double test = 0.0;

        for (int i = 0; i < produtoDisponiveis.size(); i++) {
            test += produtoDisponiveis.get(i).getTotalVendas();}

            return test;
        }

    }













