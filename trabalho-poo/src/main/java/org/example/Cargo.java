package org.example;

public class Cargo {
private float salarioBase;
private String CBO;
private String Nome;
private String tipoContratacao;

public Cargo(){}

public Cargo(float salarioBase,String CBO,String Nome,String tipoContratacao){
    this.salarioBase = salarioBase;
    this.CBO = CBO;
    this.Nome = Nome;
    this.tipoContratacao = tipoContratacao;

 } 
 /* Novo construtor sem o tipo de contratação */
 /* Aplicando conceito de sobrecarga */
 public Cargo(float salarioBase, String CBO, String Nome){
    this.salarioBase = salarioBase;
    this.CBO = CBO;
    this.Nome = Nome;
 }

 public float getSalarioBase(){
    return salarioBase;
 }
 public String getCBO(){
    return CBO;
 }
 public String getNome(){
    return Nome;
 }
 public String getTipoContratacao(){
    return tipoContratacao;
 }

 public void setSalarioBase(float salarioBase){
    this.salarioBase = salarioBase;
 }
 
 public void setCBO(String CBO){
    this.CBO = CBO;
 }

 public void setNome(String Nome){
    this.Nome = Nome;
 }

 public void setTipoContratacao(String tipoContratacao){
    this.tipoContratacao = tipoContratacao;
 }
}





