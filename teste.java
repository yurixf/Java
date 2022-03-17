import java.util.Scanner;

public class teste{
  static void teste() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Informe seu nome:");
    String nome = scan.next();
    System.out.println("Informe sua idade");
    int idade = scan.nextInt();
    float saldo = 500.35f; //é preciso adicionar o 'f' ao final dos numeros FLOAT
    System.out.println("Olá Mundo");
    System.out.println("Nome:" + nome);
    System.out.println("Idade:"+idade+" anos");
    System.out.println("Saldo: R$"+saldo);
  }
  public static void main(String[] args) {
    teste();  
     }
}