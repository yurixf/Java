import java.util.Scanner;

public class gasolina
{
    static void gasolina(){
       Scanner ent= new Scanner (System.in);
       
       // Declaração de variaveis
       float preco, distancia, media, custo, litros;
       
       //Entrada de dados
       System.out.println("Distância a ser percorrida(km):");
       distancia= ent.nextFloat();
       
       System.out.println("Média feita pelo veiculo(km/l):");
       media = ent.nextFloat();
       
       System.out.println("Valor do combustivel: R$");
       preco= ent.nextFloat();
       
       //Calculos
       litros=distancia/media;
       custo=litros*preco;
       System.out.println(String.format("Vão ser necessários %.2f litros de combustível e seu custo vai ser de R$%.2f",litros,custo));
    }
    public static void main (String[] args){
        gasolina();
    }
}        