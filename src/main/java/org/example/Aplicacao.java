package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aplicacao {
  private Sistema sistema = new Sistema();
  private Scanner entrada = new Scanner(System.in);

  private static final String ADICIONAR_FUNCIONARIO_CLT = "1";
  private static final String ADICIONAR_FUNCIONARIO_PJ = "2";
  private static final String REMOVER_FUNCIONARIO_PJ = "3";
  private static final String REMOVER_FUNCIONARIO_CLT = "4";
  private static final String LISTAR_FUNCIONARIO_CLT = "5";
  private static final String LISTAR_FUNCIONARIO_PJ = "6";
  private static final String LISTAR_TODOS_FUNCIONARIOS = "7";
  private static final String GERAR_FOLHA_PAGAMENTO = "8";
  private static final String SAIR = "0";


  public void menu() {
    String opcao;

    do {
      exibirMenu();
      opcao = entrada.nextLine();

      switch (opcao) {
        case ADICIONAR_FUNCIONARIO_CLT:
          adicionarFuncionarioCLT();
          break;
        case ADICIONAR_FUNCIONARIO_PJ:
          adicionarFuncionarioPJ();
          break;
        case REMOVER_FUNCIONARIO_PJ:
          removerFuncionarioPJ();
          break;
        case REMOVER_FUNCIONARIO_CLT:
          removerFuncionarioCLT();
          break;
        case LISTAR_FUNCIONARIO_CLT:
          sistema.listarFuncCLT();
          break;
        case LISTAR_FUNCIONARIO_PJ:
          sistema.listarFuncPJS();
          break;
        case LISTAR_TODOS_FUNCIONARIOS:
          sistema.listarTodosFuncionarios();
          break;
        case GERAR_FOLHA_PAGAMENTO:
          sistema.folhaTotal();
          break;
        case SAIR:
          System.out.println("Saindo do programa...");
          fecharScanner();
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }
    } while (!opcao.equals(SAIR));
  }

  private void exibirMenu() {
    System.out.println("\tCadastro de clientes");
    System.out.println("1. Adicionar Funcionario CLT");
    System.out.println("2. Adicionar Funcionario PJ");
    System.out.println("3. Remover Funcionario PJ");
    System.out.println("4. Remover Funcionario CLT");
    System.out.println("5. Listar Funcionario CLT");
    System.out.println("6. Listar Funcionario PJ");
    System.out.println("7. Listar Todos Funcionarios");
    System.out.println("8. Gerar Folha Pagamento");
    System.out.println("0. Sair do programa");
  }

  private void adicionarFuncionarioCLT() {
    try {
      System.out.println("Digite o nome do funcionário: ");
      String nome = entrada.nextLine();
      System.out.println("Digite o CPF do funcionário: ");
      String cpf = entrada.nextLine();
      System.out.println("Digite o RG do funcionário: ");
      String rg = entrada.nextLine();
      System.out.println("Digite o endereço do funcionário: ");
      String endereco = entrada.nextLine();
      System.out.println("Digite o salário do funcionário: ");
      float salario = Float.parseFloat(entrada.nextLine());
      System.out.println("O funcionário tem direito a férias? (S/N): ");
      boolean ferias = entrada.nextLine().equalsIgnoreCase("S");

      System.out.println("Digite o salario Base do funcionário: ");
      float salarioBase = Float.parseFloat(entrada.nextLine());
      System.out.println("Digite o CBO do funcionário: ");
      String cbo = entrada.nextLine();
      System.out.println("Digite o nome do cargo do funcionário: ");
      String nomeCargo = entrada.nextLine();

      Cargo cargoCLT = new Cargo(
          salarioBase,
          cbo,
          nomeCargo.toUpperCase(),
          "CLT"
      );

      System.out.println("Digite o valor do vale Refeição: ");
      float valeRefeicao = Float.parseFloat(entrada.nextLine());
      System.out.println("Digite o valor do vale Transporte: ");
      float valeTransporte = Float.parseFloat(entrada.nextLine());
      System.out.println("Digite o valor das Ferias: ");
      float feriasValor = Float.parseFloat(entrada.nextLine());
      System.out.println("O funcionário tem direito a plano odontológico? (S/N): ");
      boolean planoOdonto = entrada.nextLine().equalsIgnoreCase("S");
      System.out.println("O funcionário tem direito a plano de saúde? (S/N): ");
      boolean planoSaude = entrada.nextLine().equalsIgnoreCase("S");

      Beneficios beneficios = new Beneficios(
          valeRefeicao,
          valeTransporte,
          feriasValor,
          planoOdonto,
          planoSaude
      );

      FuncCLT funcionarioCLT = new FuncCLT(
          beneficios,
          rg,
          nome.toLowerCase(),
          cpf,
          endereco.toLowerCase(),
          cargoCLT,
          salario,
          ferias
      );

      sistema.addFuncCLT(funcionarioCLT);

    } catch (InputMismatchException | NumberFormatException e) {
      System.out.println("Entrada inválida. Por favor, insira os dados corretos.");
    }
  }

  private void adicionarFuncionarioPJ() {
    try {
      System.out.println("Digite o nome do funcionário: ");
      String nomePJ = entrada.nextLine();
      System.out.println("Digite o CPF do funcionário: ");
      String cpfPJ = entrada.nextLine();
      System.out.println("Digite o RG do funcionário: ");
      String rgPJ = entrada.nextLine();
      System.out.println("Digite o endereço do funcionário: ");
      String enderecoPJ = entrada.nextLine();
      System.out.println("Digite o valor da nota do funcionário PJ: ");
      float valorNota = Float.parseFloat(entrada.nextLine());
      System.out.println("Digite o valor do imposto do funcionário PJ: ");
      float auxImposto = Float.parseFloat(entrada.nextLine());

      System.out.println("Digite o salario Base do funcionário: ");
      float salarioBase = Float.parseFloat(entrada.nextLine());
      System.out.println("Digite o CBO do funcionário: ");
      String cbo = entrada.nextLine();
      System.out.println("Digite o nome do cargo do funcionário: ");
      String nomeCargo = entrada.nextLine();

      Cargo cargoPJ = new Cargo(
          salarioBase,
          cbo,
          nomeCargo.toUpperCase(),
          "PJ");

      FuncPJ funcionarioPJ = new FuncPJ(
          rgPJ,
          nomePJ.toLowerCase(),
          cpfPJ,
          enderecoPJ.toLowerCase(),
          cargoPJ,
          valorNota,
          auxImposto
      );

      sistema.addFuncPJ(funcionarioPJ);

    } catch (InputMismatchException | NumberFormatException e) {
      System.out.println("Entrada inválida. Por favor, insira os dados corretos.");
    }
  }

  private void removerFuncionarioPJ() {
    System.out.println("Digite o nome do funcionário PJ a ser removido:");
    String nomeRemoverPJ = entrada.nextLine();
    sistema.removeFuncPJ(nomeRemoverPJ);
  }

  private void removerFuncionarioCLT() {
    System.out.println("Digite o nome do funcionário CLT a ser removido:");
    String nomeRemoverCLT = entrada.nextLine();
    sistema.removeFuncCLT(nomeRemoverCLT);
  }

  public void fecharScanner() {
    entrada.close();
  }

}
