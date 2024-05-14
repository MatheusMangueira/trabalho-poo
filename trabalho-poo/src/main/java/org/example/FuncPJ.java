package org.example;

public class FuncPJ {
    private float valorNota;
    private float auxImposto;
    private Funcionario funcionario;

    public FuncPJ() {}

    public FuncPJ(float valorNota, float auxImposto, Funcionario funcionario) {
        this.valorNota = valorNota;
        this.auxImposto = auxImposto;
        this.funcionario = funcionario;
    }

    public float getValorNota() {
        return valorNota;
    }
    public void setValorNota(float valorNota) {
        valorNota = valorNota;
    }

    public float getAuxImposto() {
        return auxImposto;
    }
    public void setAuxImposto(float auxImposto) {
        auxImposto = auxImposto;
    }
}