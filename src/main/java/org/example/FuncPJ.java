package org.example;

public class FuncPJ extends Funcionario {
    private float valorNota;
    private float auxImposto;


    public FuncPJ() {}

    public FuncPJ(float valorNota, float auxImposto) {
        this.valorNota = valorNota;
        this.auxImposto = auxImposto;
    }

    public FuncPJ(String rg, String nome, String cpf, String endereco, Cargo cargo, float valorNota, float auxImposto) {
        super(rg, nome, cpf, endereco, cargo);
        this.valorNota = valorNota;
        this.auxImposto = auxImposto;
    }


    public float getValorNota() {
        return valorNota;
    }
    public void setValorNota(float valorNota) {
        this.valorNota = valorNota;
    }

    public float getAuxImposto() {
        return auxImposto;
    }
    public void setAuxImposto(float auxImposto) {
        this.auxImposto = auxImposto;
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

    public void setCpf(String cpf) {
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

}