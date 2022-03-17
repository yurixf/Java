
public class sorteio
{
    static void sorteio(){
        int num = (int)(Math.random() * 11);
        System.out.println(num);
        switch (num){
            case 0:
                System.out.println("Você não ganhou nenhum prêmio");
            case 1:
                System.out.println("Prêmio 1");
                break;
            case 2:
                System.out.println("Prêmio 2");
                break;
            case 3:
                System.out.println("Prêmio 3");
                break;
            case 4:
                System.out.println("Prêmio 4");
                break;
            case 5:
                System.out.println("Prêmio 5");
                break;
            case 6:
                System.out.println("Prêmio 6");
                break;
            case 7:
                System.out.println("Prêmio 7");
                break;
            case 8:
                System.out.println("Prêmio 8");
                break;
            case 9:
                System.out.println("Prêmio 9");
                break;
            case 10:
                System.out.println("Prêmio 10");
                break;
        }
        
    }
    public static void main (String[] args){
        sorteio();
    }
}
