package br.com.senai.view;

import br.com.senai.enumered.CategoriaProduto;
import br.com.senai.model.Cliente;
import br.com.senai.model.Colaborador;
import br.com.senai.model.Produto;
import br.com.senai.model.Loja;

import javax.swing.*;
import java.awt.*;

public class Principal {

    public static void main(String[] args) {


        int opcao = -1;
        int opcao2 = -1;
        int opcao3 = 0;
        int opcao4 = 0;
        int opcao5 = 0;
        int opcao6 = 0;
        int opcao7 = 0;
        int opcao8 = 0;
        int opcao9 = 0;
        int opcao10 = 0;

        String prod;

        Loja loja01 = new Loja(1, "Shopping");

        Produto p01 = new Produto("TV LED 55", CategoriaProduto.TV, 2000.0, 4000.0,100);
        Produto p02 = new Produto("Liquidificador Arno", CategoriaProduto.ELETROPORTATEIS, 50.0, 100.0, 100);
        Produto p03 = new Produto("Geladeira Eletrolux", CategoriaProduto.ELETRODOMESTICOS, 1000.0, 2000.0, 100);
        Produto p04 = new Produto("Samsung Galaxy S20",CategoriaProduto.CELULARES,2500.0,5000.0,100);
        Produto p05 = new Produto("Notebook Multilaser", CategoriaProduto.INFORMATICA, 100.0, 200.0,100);

        Cliente cl01 = new Cliente("Joey", "555-3234","joey@gmail.com");
        Cliente cl02 = new Cliente("Johnny","555-1234","johnny@hotmail.com");
        Cliente cl03 = new Cliente("Tommy","555-5050","tommy@bol.com.br");

        Colaborador c01 = new Colaborador("Jailson", "31 de maio de 1970","321.321.321.21", "555-9238", "jailson@terra.com", 1500.00);
        Colaborador c02 = new Colaborador("Guina","31 de fevereiro 1888", "123.123.123-23","555-9999","guina@guina.com", 3000.00);

        loja01.adicionarColaboradores(c01);
        loja01.adicionarColaboradores(c02);

        loja01.adicionarProdutos(p01);
        loja01.adicionarProdutos(p02);
        loja01.adicionarProdutos(p03);
        loja01.adicionarProdutos(p04);
        loja01.adicionarProdutos(p05);

        loja01.adicionarClientes(cl01);
        loja01.adicionarClientes(cl02);
        loja01.adicionarClientes(cl03);



        StringBuffer menu = new StringBuffer();
        menu.append("Loja 01 - Shopping");
        menu.append("\n");
        menu.append("=========================");
        menu.append("\n");
        menu.append("1 - Listar Colaboradores");
        menu.append("\n");
        menu.append("2 - Listar Produtos");
        menu.append("\n");
        menu.append("3 - Listar Clientes");
        menu.append("\n");
        menu.append("4 - Gerenciamento de Estoque");
        menu.append("\n");
        menu.append("5 - Vender Produto");
        menu.append("\n");
        menu.append("6 - Listar Clientes");
        menu.append("\n");
        menu.append("7 - Adicionar Serviço");
        menu.append("\n");
        menu.append("8 - Alterar dados do Serviço");
        menu.append("\n");
        menu.append("9 - Listar Serviços");
        menu.append("\n");
        menu.append("10 - Efetuar vendas para o cliente");
        menu.append("\n");
        menu.append("11 - Listar Vendas");
        menu.append("\n");
        menu.append("0 - Sair");


        while (opcao != 0) {

            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));


            switch (opcao) {
                case 1: //Listar Colaboradores

                    loja01.jop(loja01.listarColaboradores());

                    break;
                case 2: //Listar Produtos

                    loja01.jop(loja01.listarProdutos());

                    break;

                case 3: //Listar Clientes

                    loja01.jop(loja01.listarClientes());

                    break;

                case 4: //Estoque

                    StringBuffer menu2 = new StringBuffer();
                    menu2.append("Opção 1 - Relatório de Estoque");
                    menu2.append("\n");
                    menu2.append("Opção 2 - Adicionar quantidade de Produto");
                    menu2.append("\n");
                    menu2.append("Opção 3 - Remover quantidade de Produto");
                    menu2.append("\n");

                        opcao2 = Integer.parseInt(JOptionPane.showInputDialog(menu2));


                        switch (opcao2) {
                            case 1: //Relatório Estoque

                                loja01.jop(loja01.relatorioEstoque());

                                break;

                            case 2: //Adicionar Estoque

                                StringBuffer menu3 = new StringBuffer();
                                menu3.append("Escolha um produto para adicionar quantidade no Estoque:");
                                menu3.append("\n");
                                menu3.append(loja01.listaEstoque());
                                menu3.append("\n");

                                opcao3 = Integer.parseInt(JOptionPane.showInputDialog(menu3));

                                opcao4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade que deseja adicionar do produto \n"+ loja01.getProdutoDisponiveis().get(opcao3).getNome()+"\nQuantidade atual em estoque: "+loja01.getProdutoDisponiveis().get(opcao3).getQuantidadeEstoque()));

                                        loja01.getProdutoDisponiveis().get(opcao3).adicionarEstoque(opcao4);
                                        JOptionPane.showMessageDialog(null, "Adicionado "+opcao4+" unidades com sucesso!\nNova quantidade do Produto: "+loja01.getProdutoDisponiveis().get(opcao3).getNome()+ " é de: \n"+loja01.getProdutoDisponiveis().get(opcao3).getQuantidadeEstoque()+" unidades");

                                 break;

                            case 3: //Remover Estoque

                                StringBuffer menu4 = new StringBuffer();
                                menu4.append("Escolha um produto para remover quantidade no Estoque:");
                                menu4.append("\n");
                                menu4.append(loja01.listaEstoque());
                                menu4.append("\n");

                                opcao5 = Integer.parseInt(JOptionPane.showInputDialog(menu4));

                                opcao6 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade que deseja adicionar do produto \n"+ loja01.getProdutoDisponiveis().get(opcao5).getNome()+"\nQuantidade atual em estoque: "+loja01.getProdutoDisponiveis().get(opcao5).getQuantidadeEstoque()));

                                loja01.getProdutoDisponiveis().get(opcao5).removerEstoque(opcao6);
                                JOptionPane.showMessageDialog(null, "Removido "+opcao6+" unidades com sucesso!\nNova quantidade do Produto: "+loja01.getProdutoDisponiveis().get(opcao5).getNome()+ " é de: \n"+loja01.getProdutoDisponiveis().get(opcao5).getQuantidadeEstoque()+" unidades");

                                break; }

                                break;

                case 5: //Vender Produto

                    StringBuffer menu5 = new StringBuffer();
                    menu5.append("Escolha o Colaborador que vai efetuar a venda:");
                    menu5.append("\n");
                    menu5.append(loja01.listaVendedores());
                    menu5.append("\n");

                    opcao7 = Integer.parseInt(JOptionPane.showInputDialog(menu5));

                    StringBuffer menu6 = new StringBuffer();
                    menu6.append("Escolha o Cliente:");
                    menu6.append("\n");
                    menu6.append(loja01.listaClietela());
                    menu6.append("\n");

                    opcao8 = Integer.parseInt(JOptionPane.showInputDialog(menu6));

                    StringBuffer menu7 = new StringBuffer();
                    menu7.append("Escolha o produto que será vendido:");
                    menu7.append("\n");
                    menu7.append(loja01.listaEstoque());
                    menu7.append("\n");

                    opcao9 = Integer.parseInt(JOptionPane.showInputDialog(menu7));

                    c01.venderProduto(p01,cl01);

                    break;








                    }} }}
