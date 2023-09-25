package Exercicio1.entities;  //Pacote da classe

public class Triangle { // Nome da classe

  public double a; //
  public double b; // Atributos da Classe
  public double c; //
  
  public double area(){
    double p = (a + b + c) / 2.0;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
  }
}
