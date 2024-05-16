package org.example;

public abstract class Funcionario {
  protected String nome;
  protected String cpf;
  protected String rg;
  protected String endereco;
  protected Cargo cargo;

  public Funcionario() {
  }

  public Funcionario(String rg, String nome, String cpf, String endereco, Cargo cargo) {
    this.nome = nome;
    this.cpf = cpf;
    this.endereco = endereco;
    this.cargo = cargo;
    this.rg = rg;
  }

  public String getRg() {
    return rg;
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public Cargo getCargo() {
    return cargo;
  }

  public void setCargo(Cargo cargo) {
    this.cargo = cargo;
  }
}
