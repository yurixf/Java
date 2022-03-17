import java.util.Scanner;

public class descontoDados
{
    static void descontoDados(){
        Scanner ent = new Scanner(System.in);
        
        // Declaração de variaveis
        int cliente;
        float preco, desconto, vf;
        desconto = 0;
        //Entrada de dados
        //System.out.println("Informe o tipo de cliente:\n 0 - Cliente Comum\n 1 - Funcionário\n 2 - Cliente VIP");
        while (true){
            System.out.println("Informe o tipo de cliente:\n 0 - Cliente Comum\n 1 - Funcionário\n 2 - Cliente VIP");
            cliente = ent.nextInt();
            if (cliente<=2){
                break;}
            else{
                System.out.println("Opção inválida");
            }
        }
        System.out.println("Valor do produto:R$");
        preco = ent.nextFloat();
        if (cliente == 1 || cliente==2){
        System.out.println("Informe o % do desconto");
        desconto = ent.nextFloat();
        }
        
        if(cliente == 1 && desconto>20){
            System.out.println("Valor de desconto acima do permitido, o mesmo foi ajustado para 20%");
            desconto = 20;
        }
        if(cliente == 2 && desconto>10){
            System.out.println("Valor de desconto acima do permitido, o mesmo foi ajustado para 10%");
            desconto = 10;
        }
        vf=preco-(preco*(desconto/100));
        switch(cliente){
            case 0:
                System.out.println("Cliente comum, sem desconto");
                System.out.println(String.format("Preço total a pagar: R$%.2f",preco));
                break;
            case 1:
                System.out.println(String.format("O cliente é um funcionário e possui um desconto de %.1f",desconto)+"%");
                System.out.println(String.format("Valor original do produto: R$%.2f. Valor final: R$%.2f",preco,vf));
                break;
            case 2:
                System.out.println(String.format("O cliente é VIP e possui um desconto de %.1f",desconto)+"%");
                System.out.println(String.format("Valor original do produto: R$%.2f. Valor final: R$%.2f",preco,vf));
                break;
        }
        
    }
    public static void main (String[] arg){
        descontoDados();
    }

}
