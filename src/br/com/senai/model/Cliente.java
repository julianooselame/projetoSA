package br.com.senai.model;

import br.com.senai.model.Loja;

import java.util.ArrayList;

public class Cliente {

    private String nome;
    private String telefone;
    private String email;
    public Double totalCompras = 0.0;
    private ArrayList listaDeCompras = new ArrayList();

    // Construtores
    public Cliente(String nome, String telefone, String email) {
        super();
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    //Gets and Sets

    public ArrayList getListaDeCompras() {
        return listaDeCompras;
    }

    public void setListaDeCompras(ArrayList listaDeCompras) {
        this.listaDeCompras = listaDeCompras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Double getTotalCompras() {
        return totalCompras;
    }

    public void setTotalCompras(Double totalCompras) {
        this.totalCompras = totalCompras;
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
        Cliente other = (Cliente) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    //TO STRING
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Nome: "+this.nome+"\n");
        sb.append("Telefone: "+this.telefone+"\n");
        sb.append("Email: "+this.email+"\n");
        sb.append("Valor total em compras: "+this.totalCompras+"\n");
        return sb.toString();
    }

    //Métodos



}