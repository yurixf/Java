

public class desconto
{
    static void desconto(){
        int cliente = (int)(Math.random() *3);
        float preco = 100;
        switch(cliente){
            case 0:
                System.out.println("Cliente comum, sem desconto");
                System.out.println(String.format("Preço total a pagar: R$%.2f",preco));
                break;
            case 1:
                float func = preco*0.8f;
                System.out.println("O cliente é um funcionário e possui um desconto de 20%");
                System.out.println(String.format("Valor original do produto: R$%.2f. Valor final: R$%.2f",preco,func));
                break;
            case 2:
                float vip = preco*0.9f;
                System.out.println("O cliente é VIP e possui um desconto de 10%");
                System.out.println(String.format("Valor original do produto: R$%.2f. Valor final: R$%.2f",preco,vip));
                break;
        }
        
    }
    public static void main (String[] arg){
        desconto();
    }

}
