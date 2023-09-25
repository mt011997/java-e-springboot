import java.util.Scanner;

public class EntradaDeDadosJava {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //Objeto que lida com entrada de dados
    
    String x;
    int y;
    double z;

    x = sc.next();
    y = sc.nextInt();
    z = sc.nextDouble();
    System.out.printf("String: %s, Inteiro: %d, double: %.2f%n", x, y, z);
    
    String s1, s2, s3;
    int i1;
    char c1;
    
    i1 = sc.nextInt();
    sc.nextLine();
    c1 = sc.next().charAt(0);
    sc.nextLine();
    s1 = sc.nextLine();
    s2 = sc.nextLine();
    s3 = sc.nextLine();

    System.out.println("DADOS DIGITADOS:");
    System.out.println(i1);
    System.out.println(c1);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    sc.close();
  }
}