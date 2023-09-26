package Exercicio3.application;

import java.util.Locale;
import java.util.Scanner;

import Exercicio3.entities.Rectangle;

public class Program {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Rectangle rectangle = new Rectangle();

    System.out.println("Entre com a largura e altura do retângulo: ");
    System.out.println("Digite a largura: ");
    rectangle.width = sc.nextDouble();

    System.out.println("Digite a altura: ");
    rectangle.height = sc.nextDouble();
    System.out.println();

    System.out.println(rectangle);

    sc.close();
  }
}
