package org.example;

public class FuncCLT extends Funcionario {
  private float salario;
  private boolean ferias;
  private Beneficios beneficios;


  public FuncCLT(
      Beneficios beneficios,
      String rg,
      String nome,
      String cpf,
      String endereco,
      Cargo cargo,
      float salario,
      boolean ferias) {
    super(rg, nome, cpf, endereco, cargo);
    this.salario = salario;
    this.ferias = ferias;
    this.beneficios = beneficios;
  }

  public float getSalario() {
    return salario;
  }

  public void setSalario(float salario) {
    this.salario = salario;
  }

  public boolean isFerias() {
    return ferias;
  }

  public void setFerias(boolean ferias) {
    this.ferias = ferias;
  }

  public String getRg() {
    return super.getRg();
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  public String getNome() {
    return super.getNome();
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return super.getCpf();
  }

  public void ValesetCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getEndereco() {
    return super.getEndereco();
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public Cargo getCargo() {
    return super.getCargo();
  }

  public void setCargo(Cargo cargo) {
    this.cargo = cargo;
  }

  public Beneficios getBeneficios() {
    return beneficios;
  }

  public void setBeneficios(Beneficios beneficios) {
    this.beneficios = beneficios;
  }
}