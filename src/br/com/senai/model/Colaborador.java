package br.com.senai.model;

import javax.swing.*;
import java.util.ArrayList;
import br.com.senai.model.Loja;

public class Colaborador {

    private String nome;
    private String nascimento;
    private String cpf;
    private String telefone;
    private String email;
    private Double salario;
    public ArrayList vendasDoFuncionario = new ArrayList();
    public Double comissao;
    public Double comissaoNaVenda;
    public Double totalEmVendas = 0.0;


    Loja loja0x = new Loja(1, "Shopping");

    Double valorVendido = loja0x.valorVendido;
    Double valorDeLucro = loja0x.valorDeLucro;


    //CONSTRUTORES

    public Colaborador(String nome, String nascimento, String cpf, String telefone, String email, Double salario) {
        super();
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.salario = salario;
        this.comissao = 0.0;
        this.comissaoNaVenda = 0.0;
    }


    //GETs and SETs

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getNascimento() {
        return nascimento;
    }


    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public Double getSalario() {
        return salario;
    }


    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getTotalEmVendas() {
        return totalEmVendas;
    }


    public void setTotalEmVendas(Double totalEmVendas) {
        this.totalEmVendas = totalEmVendas;
    }

    public Double getComissao() {
        return comissao;
    }


    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    //HASHCODE and EQUALS
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Colaborador other = (Colaborador) obj;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        return true;
    }

    //TO STRING
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Nome: "+this.nome+"\n");
        sb.append("Nascimento: "+this.nascimento+"\n");
        sb.append("CPF: "+this.cpf+"\n");
        sb.append("Telefone: "+this.telefone+"\n");
        sb.append("Email: "+this.email+"\n");
        sb.append("Salário: "+this.salario+"\n");
        sb.append("Total de Vendas: "+this.totalEmVendas+"\n");
        sb.append("Total de Comissões "+this.comissao+"\n");
        return sb.toString();
    }

    //METODOS

    public void venderProduto(Produto p, Cliente cl) {
        if (p.getQuantidadeEstoque() > 0) {
            this.valorVendido += p.getValorVenda();
            this.valorDeLucro += p.calcularLucro();
            this.comissaoNaVenda = (p.calcularLucro()/100)*5;
            this.comissao += this.comissaoNaVenda;
            this.totalEmVendas += p.getValorVenda();
            p.removerEstoque(1);
            p.adicionarUnidadeVendida(1);
            cl.totalCompras += p.getValorVenda();
            p.totalVendas += p.getValorVenda();
            p.totalLucro = p.totalUnidadesVendidas*p.calcularLucro();
            StringBuffer sb = new StringBuffer();
            sb.append("Venda Efetuada por: " + this.nome+"\n");
            sb.append("Vendeu para Cliente: " + cl.getNome()+"\n");
            sb.append("Comissão Total de "+this.nome+" é: "+this.comissao+"\n");
            sb.append("Comissão Nesta Venda de "+this.nome+" é: "+this.comissaoNaVenda+"\n");
            sb.append("Total de Vendas de "+this.nome+" "+this.totalEmVendas+"\n");
            sb.append(p);
            vendasDoFuncionario.add(p);
            cl.getListaDeCompras().add(p);
            System.out.println(sb.toString());}
        else {
            JOptionPane.showMessageDialog(null,"Venda não realizada!\nProduto sem estoque!");
            System.out.print("Produto em falta no estoque!!\n");
        }
    }

    public void listaDeVendasDosFuncionarios() {
        StringBuffer sb = new StringBuffer();
        sb.append("Lista de vendas efetuada pelo colaborador: "+this.nome+"\n");
        sb.append(vendasDoFuncionario+"\n");
        sb.append("-----------------------------------------------------------------------------------");
        System.out.println(sb.toString());
    }


}
