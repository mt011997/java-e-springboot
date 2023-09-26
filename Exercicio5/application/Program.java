package Exercicio5.application;

import java.util.Locale;
import java.util.Scanner;

import Exercicio5.entities.Students;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Students students = new Students();

    System.out.println("Digite seu nome: ");
    students.name = sc.nextLine();

    System.out.println("Nota 1:");
    students.grade1 = sc.nextDouble();

    System.out.println("Nota 2:");
    students.grade2 = sc.nextDouble();

    System.out.println("Nota 3:");
    students.grade3 = sc.nextDouble();

    System.out.println();

    System.out.println("NOTA FINAL: " + students.sumOfGrades());
    System.out.println(students.passOrFailed());

    sc.close();
  }
}
