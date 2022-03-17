// importa a class util
import java.util.Scanner;

public class BoletimRecebendoDados {
   
    public static void main(String[] args) {
        // chamada da classe no modo Scanner
        Scanner ent = new Scanner(System.in);
       
        // declaração das variáveis
        String nome;
        float nota1, nota2, nota3;
        float media;
       
            // texto da primeira solicitação de entrada
            System.out.println("Digite o nome do aluno: ");
           
            // variável que irá receber o valor "string" digitado
            nome = ent.nextLine();

            // recebe a 1º nota
            System.out.println("Digite a 1ª nota do aluno " + nome + ": ");
            // variável que irá receber o valor "Int" digitado
            nota1 = ent.nextFloat();
           
            // recebe a 2º nota
            System.out.println("Digite a 2ª nota do aluno " + nome + ": ");
            nota2 = ent.nextFloat();
           
            // recebe a 3º nota
            System.out.println("Digite a 3ª nota do aluno " + nome + ": ");
            nota3 = ent.nextFloat();
           
            // calcula a média
            media = (nota1 + nota2 + nota3) / 3;
            System.out.println(String.format("A média do aluno %s é %.2f",nome, media)); //String formatada= %s para Strings e %.f para float
           
            // mostra a nota do aluno
            if( (media <4) ){
                System.out.println("Nota E");
            } else if(media < 5){
                System.out.println("Nota D");
            } else if(media < 7){
                System.out.println("Nota C");
            } else if(media < 8){
                System.out.println("Nota B");
            } else if(media <= 10){
                System.out.println("Nota A");
            }      
    }
}