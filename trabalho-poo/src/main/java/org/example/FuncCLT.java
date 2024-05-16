package org.example;

public class FuncCLT {
    private float salario;
    private boolean valeTransporte;
    private boolean ferias;
    // private Beneficios beneficios;

    public FuncCLT () {}

    public FuncCLT(float salario, boolean valeTransporte, boolean ferias) {
        this.salario = salario;
        this.valeTransporte = valeTransporte;
        this.ferias = ferias;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public boolean isValeTransporte() {
        return valeTransporte;
    }
    public void setValeTransporte(boolean valeTransporte) {
        this.valeTransporte = valeTransporte;
    }

    public boolean isFerias() {
        return ferias;
    }
    public void setFerias(boolean ferias) {
        this.ferias = ferias;
    }
}