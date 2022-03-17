
public class imc
{
    static void imc(){
        float peso=40, altura=1.76f*1.76f;
        float imc = peso/altura;
        System.out.println("Seu imc é "+imc);
        if (imc>=40) {
            System.out.println("Você está com Obesidade de Grau 3");
        } else if (imc>=35){
            System.out.println("Você está com Obesidade de Grau 2");
        } else if (imc>=30){
            System.out.println("Você está com Obesidade de Grau 1");
        } else if (imc>=25){
            System.out.println("Você está com Pré-Obeso");
        } else if (imc>=18.5){
            System.out.println("Seu peso está adequado");
        } else if (imc>=17){
            System.out.println("Você está com magreza de Grau 1");
        }else if(imc>=16){
            System.out.println("Você está com magreza de Grau 2");
        }else{
            System.out.println("Você está com magreza de Grau 3");
        }
        
    }
    public static void main (String[]args){
        imc();
    }
}
