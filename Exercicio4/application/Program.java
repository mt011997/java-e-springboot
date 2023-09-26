package Exercicio4.application;

import java.util.Locale;
import java.util.Scanner;

import Exercicio4.entities.Employee;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Employee employee = new Employee();

    System.out.println("Nome: ");
    employee.name = sc.nextLine();

    System.out.println("Salário Bruto: ");
    employee.grossSalary = sc.nextDouble();

    System.out.println("Imposto: ");
    employee.tax = sc.nextDouble();

    System.out.println(employee);

    System.out.println("Qual a porcentagem para aumentar o salário? ");
    double percentage = sc.nextDouble();

    employee.increaseSalary(percentage);    

    System.out.println("Dados atualizados: " + employee);

    sc.close();
  }
}
