package Exercicio4.entities;

public class Employee {

  public String name;
  public double grossSalary;
  public double tax;

  public double netSalary(){
    return grossSalary - tax;
  }

  public void increaseSalary(double percentage){
    double perc = percentage / 100;
    double incr = perc * grossSalary;
    this.grossSalary += incr;
  }

  public String toString(){
    return "Funcionário: " + name + ", $ " + netSalary();
  }
}
