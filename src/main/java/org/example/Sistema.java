package org.example;

import java.util.ArrayList;

public class Sistema {

  private ArrayList<FuncPJ> funcPJS = new ArrayList<>();
  private ArrayList<FuncCLT> funcCLTS = new ArrayList<>();


  public void addFuncCLT(FuncCLT funcCLT) {
    funcCLTS.add(funcCLT);
  }

  public void addFuncPJ(FuncPJ funcPJ) {
    funcPJS.add(funcPJ);
  }

  public void removeFuncPJ(String nome) {
    boolean found = false;
    for (int i = 0; i < funcPJS.size(); i++) {
      if (funcPJS.get(i).getNome().equals(nome)) {
        funcPJS.remove(i);
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("Funcionário não encontrado");
    }
  }

  public void removeFuncCLT(String nome) {
    boolean found = false;
    for (int i = 0; i < funcCLTS.size(); i++) {
      if (funcCLTS.get(i).getNome().equals(nome)) {
        funcCLTS.remove(i);
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("Funcionário não encontrado");
    }
  }

  public void listarFuncCLT() {
    for (FuncCLT funcCLT : funcCLTS) {
      System.out.println(
          "Nome: " + funcCLT.getNome() +
              " CPF: " + funcCLT.getCpf() +
              " Salario: " + funcCLT.getSalario() +
              " " + funcCLT.getCargo().toString() +
              " " + funcCLT.getBeneficios().toString()
      );
    }
  }

  public void listarFuncPJS() {
    for (FuncPJ funcPJ : funcPJS) {
      System.out.println(
          " Nome: " + funcPJ.getNome() +
              " CPF: " + funcPJ.getCpf() +
              " Valor Nota: " + funcPJ.getValorNota() +
              " " + funcPJ.getCargo().toString() + "\n"
      );
    }
  }

  public void folhaTotal() {

    float acumuladorPJ = 0;
    float acumuladorCLT = 0;

    for (FuncPJ funcPJ : funcPJS) {
      acumuladorPJ += funcPJ.getValorNota();
    }

    for (FuncCLT funcCLT : funcCLTS) {
      acumuladorCLT += funcCLT.getSalario();
    }

    System.out.println("Valor da folha PJ: " + acumuladorPJ);
    System.out.println("Valor da folha CLT: " + acumuladorCLT);

  }

  public void listarTodosFuncionarios() {
    listarFuncCLT();
    listarFuncPJS();
  }


}

