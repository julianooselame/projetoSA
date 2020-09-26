package br.com.senai.view;

import br.com.senai.enumered.CategoriaProduto;
import br.com.senai.model.Cliente;
import br.com.senai.model.Colaboradores;
import br.com.senai.model.Produtos;
import br.com.senai.model.Loja;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {

        String msg = "";

        Loja loja01 = new Loja(1, "Shopping");
        Loja loja02 = new Loja(2, "Centro");

        Produtos p01 = new Produtos("Tv", CategoriaProduto.TV, 2000.0, 2500.0, 500.0, 3);
        Produtos p02 = new Produtos("Liquidificador", CategoriaProduto.ELETROPORTATEIS, 5.0, 100.0, 50.0, 3);
        Produtos p03 = new Produtos("Geladera", CategoriaProduto.ELETRODOMESTICOS, 2000.0, 2500.0, 500.0, 3);
        Produtos p04 = new Produtos("Samisungui",CategoriaProduto.CELULARES,500.0,1000.0,500.0,100);

        Cliente cl01 = new Cliente("Kauan", "43234","kauan@gmail.com");
        Cliente cl02 = new Cliente("Jacó","334243","jaco@hotmail.com");
        Cliente cl03 = new Cliente("Pedroca","334243","jaco@hotmail.com");

        loja01.adicionarProdutos(p01);
        loja01.adicionarProdutos(p02);

        loja02.adicionarProdutos(p03);

        loja01.listarProdutos();


       /* loja01.venderProduto(p02);*/

       /* loja01.resultadosFinanceiros();*/

        Colaboradores c01 = new Colaboradores("Jailson", "31demaio","32423423423", "34289238", "jailson@.com", 10000.00);
        Colaboradores c02 = new Colaboradores("Guina","31de fevereiro", "32948039284092","12839","guina@guina.com", 400.00);

       loja01.adicionarColaboradores(c01);
       loja01.adicionarColaboradores(c02);

        loja01.listarColaboradores();

        p01.adicionarEstoque(5);

        loja01.listarProdutos();

        System.out.println(p01);

        System.out.println(p01);

        loja02.listarProdutos();
        loja01.listarColaboradores();
        loja01.listarProdutos();

        loja02.adicionarProdutos(p01);



        c02.listaDeVendasDosFuncionarios();
        loja02.listarColaboradores();

        c02.venderProduto(p04,cl01);
        c02.venderProduto(p04,cl02);
        c02.venderProduto(p04,cl03);
        c02.listaDeVendasDosFuncionarios();



    }
}
