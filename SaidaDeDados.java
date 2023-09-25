import java.util.Locale;

public class SaidaDeDados {
  public static void main(String[] args){
    System.out.println("Olá Mundo!");
    System.out.println("Bom dia!");
    int y = 32;
    System.out.println(y);

    // Locale.setDefault(Locale.US); // Determina localizacao para US usando acentos e escritas
    double x = 10.35784; 
    System.out.println(x);
    System.out.printf("%.2f%n", x); // "%.2f" determina quantidade de decimais, nesse caso são 2 casas || "%n" quebra linha no final.
    System.out.printf("%.4f%n", x);

    System.out.println("RESULTADO = " + x + " METROS");

    System.out.printf("RESULTADO = %.2f metros%n", x); // %f determina variavel que vai ser lida

    String nome = "Maria";
    int idade = 31;
    double renda = 4000.0;

    // %f = ponto flutuante | decimal;
    // %d = inteiro;
    // %s = texto;
    // %n = quebra de linha;

    System.out.printf("%s tem %d anos e ganha R$%.2f reais%n", nome, idade, renda);
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");

    //Exercicio

    String product1 = "Computer";
    String product2 = "Office desk";

    int age = 30;
    int code = 5290;
    char gender = 'F';

    double price1 = 2100.0;
    double price2 = 650.50;
    double measure = 53.234567;
    

    System.out.println("Products:");
    System.out.printf(product1 + ", which price is $%.2f%n", price1);
    System.out.printf(product2 + ", which price is $%.2f%n", price2);
    System.out.println(" ");
    System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);
    System.out.println(" ");
    System.out.printf("Measue with eight decimal places: %.8f%n", measure);
    System.out.printf("Rouded (three decimal places): %.3f%n", measure);
    Locale.setDefault(Locale.US);
    System.out.printf("US decimal point: %.3f%n", measure);


  }
}
