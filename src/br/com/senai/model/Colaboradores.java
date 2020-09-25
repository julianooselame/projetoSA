package br.com.senai.model;

import java.util.List;

public class Colaboradores {

    private String nome;
    private String nascimento;
    private String cpf;
    private String telefone;
    private String email;
    private Double salario;

    //CONSTRUTORES

    public Colaboradores(String nome, String nascimento, String cpf, String telefone, String email, Double salario) {
        super();
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.salario = salario;
    }




   // public Colaboradores() {
    //super();
    //}




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
        Colaboradores other = (Colaboradores) obj;
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
        return sb.toString();
    }

    //METODOS
    //public Boolean adicionarColaborador(Colaboradores funcionario) {
     //   this.colaboradores.add(funcionario);
     //   return true;
   // }

    //public String listarColaboradores() {
      //  StringBuffer sb = new StringBuffer();
      //  sb.append("Lista de Funcionarios\n");
     //   for (Colaboradores c : colaboradores) {
      //      sb.append(c+"\n");
     //   }
     //   return sb.toString();
  //  }

}
