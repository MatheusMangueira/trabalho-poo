package org.example;

public class Beneficios {

  private float valeRefeicao;
  private float valeTransporte;
  private float ferias;
  private boolean planoOdonto;
  private boolean planoSaude;

  public Beneficios(float valeRefeicao, float valeTransporte, float ferias, boolean planoOdonto, boolean planoSaude) {
    this.valeRefeicao = valeRefeicao;
    this.valeTransporte = valeTransporte;
    this.ferias = ferias;
    this.planoOdonto = planoOdonto;
    this.planoSaude = planoSaude;
  }

  public Beneficios(float ferias, boolean planoOdonto, boolean planoSaude) {
    this.ferias = ferias;
    this.planoOdonto = planoOdonto;
    this.planoSaude = planoSaude;
  }

  public void setvaleRefeicao(float valeRefeicao) {
    this.valeRefeicao = valeRefeicao;
  }

  public float getvaleRefeicao() {
    return valeRefeicao;
  }

  public float getvaleTransporte() {
    return valeTransporte;
  }

  public void setvaleTransporte(float valeTransporte) {
    this.valeTransporte = valeTransporte;
  }

  public void setferias(float ferias) {
    this.ferias = ferias;
  }

  public float getferias() {
    return ferias;
  }

  public void setplanoSaude(boolean planoSaude) {
    this.planoSaude = planoSaude;
  }

  public boolean getplanoSaude() {
    return planoSaude;
  }

  public void setplanoOdonto(boolean planoOdonto) {
    this.planoOdonto = planoOdonto;

  }

  public boolean getplano_odonto() {
    return planoOdonto;
  }

  @Override
  public String toString() {
    return "Beneficios {" +
        " Vale refeição: " + valeRefeicao +
        ", Vale transporte: " + valeTransporte +
        ", Ferias: " + ferias +
        ", Plano Odonto: " + (planoOdonto ? "sim" : "não") +
        ", planoSaude: " + (planoSaude ? "sim" : "não") +
        '}' + "\n";
  }
}