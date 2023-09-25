import java.util.Scanner;

public class MetodosMatematicos {
  public static void main(String[] args) {
    // double x = 3.0;
    // double y = 4.0;
    // double z = -5.0;
    // double A,B,C;

    // A = Math.sqrt(x);
    // B = Math.sqrt(y);
    // C = Math.sqrt(25.0);

    // System.out.println("Raiz quadrada de " + x + " = " + A);
    // System.out.println("Raiz quadrada de " + y + " = " + B);
    // System.out.println("Raiz quadrada de 25 = " + C);

    // A = Math.pow(x, y);
    // B = Math.pow(x, 2.0);
    // C = Math.pow(5.0, 2.0);

    // System.out.println(x + " elevado a " + y + " = " + A);
    // System.out.println(x + " elevado ao quadrado = " + B);
    // System.out.println("5 elevado ao quadrado = " + C);

    // A = Math.abs(y);
    // B = Math.abs(z);

    // System.out.println("Valor absoluto de " + y + " = " + A);
    // System.out.println("Valor absoluto de " + z + " = " + B);
    
    // Bhaskara

    Scanner sc = new Scanner(System.in);

    int a, b, c;
    System.out.println("Digite o valor de A: ");
    a = sc.nextInt();

    System.out.println("Digite o valor de B: ");
    b = sc.nextInt();

    System.out.println("Digite o valor de C: ");
    c = sc.nextInt();

    double delta = Math.pow(b, 2.0) - 4*a*c;

    if(delta > 0){
      double x1 = (-b + Math.sqrt(delta)) / (2.0*a);
      double x2 = (-b - Math.sqrt(delta)) / (2.0*a);
      System.out.printf("Raiz 1: %.2f%n", x1);
      System.out.printf("Raiz 2: %.2f%n", x2);
    }else if(delta == 0){
      double raiz = -b / (2 * a);
      System.out.printf("Raiz única: %.2f%n", raiz);
    }else{
      System.out.println("Não há raizes reais.");
    }

    sc.close();
  }
}
