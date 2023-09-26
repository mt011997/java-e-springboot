package Exercicio5.entities;

public class Students {
  public String name;
  public double grade1;
  public double grade2;
  public double grade3;

  public double sumOfGrades() {
    return grade1 + grade2 + grade3;
  }

  public String passOrFailed() {
    double diff = sumOfGrades() - 60;
    if (sumOfGrades() > 60.00) {
      return "PASS";
    } else {
      return "FAILED \nFALTARAM " + Math.abs(diff) + " PONTOS";
    }
  }
}
