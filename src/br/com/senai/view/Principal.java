package br.com.senai.view;

import br.com.senai.enumered.CategoriaProduto;
import br.com.senai.model.Cliente;
import br.com.senai.model.Colaborador;
import br.com.senai.model.Produto;
import br.com.senai.model.Loja;

public class Principal {

    public static void main(String[] args) {

        String msg = "";

        Loja loja01 = new Loja(1, "Shopping");
        Loja loja02 = new Loja(2, "Centro");

        Produto p01 = new Produto("Tv", CategoriaProduto.TV, 2000.0, 2500.0,100);
        Produto p02 = new Produto("Liquidificador", CategoriaProduto.ELETROPORTATEIS, 5.0, 100.0, 100);
        Produto p03 = new Produto("Geladera", CategoriaProduto.ELETRODOMESTICOS, 2000.0, 2500.0, 100);
        Produto p04 = new Produto("Samisungui",CategoriaProduto.CELULARES,500.0,1000.0,100);
        Produto p05 = new Produto("Xiaomi", CategoriaProduto.CELULARES, 200.0, 500.0,1);

        Cliente cl01 = new Cliente("Kauan", "43234","kauan@gmail.com");
        Cliente cl02 = new Cliente("Jacó","334243","jaco@hotmail.com");
        Cliente cl03 = new Cliente("Pedroca","334243","jaco@hotmail.com");

        loja01.adicionarProdutos(p01);
        loja01.adicionarProdutos(p02);

        loja02.adicionarProdutos(p03);

        loja01.listarProdutos();


       /* loja01.venderProduto(p02);*/

       /* loja01.resultadosFinanceiros();*/

        Colaborador c01 = new Colaborador("Jailson", "31demaio","32423423423", "34289238", "jailson@.com", 10000.00);
        Colaborador c02 = new Colaborador("Guina","31de fevereiro", "32948039284092","12839","guina@guina.com", 400.00);

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
        c02.venderProduto(p01,cl01);
        c02.venderProduto(p04,cl02);
        c02.venderProduto(p04,cl03);
        c01.venderProduto(p04,cl01);
        c02.listaDeVendasDosFuncionarios();

        System.out.print(p04);
        System.out.print("_______________________________\n");

        System.out.print(c02);

        loja01.adicionarProdutos(p05);

        c01.venderProduto(p05,cl01);
        c01.venderProduto(p05,cl02);
        c01.venderProduto(p02,cl01);
        c01.venderProduto(p02,cl01);
        loja01.listarProdutos();
        loja01.listarColaboradores();
        loja01.resultadosFinanceiros();



    }
}
