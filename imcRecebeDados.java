import java.util.Scanner;

public class imcRecebeDados
{
    static void imcRecebeDados(){
        
        Scanner ent = new Scanner (System.in);
        
        // Declaração de variáveis
        String sexo, s;
        float peso, altura;

        
        
        System.out.println("Você é do sexo(M/F): ");
        sexo = ent.next().toUpperCase();
        
        System.out.println("Informe seu peso(kg):");
        peso = ent.nextFloat();
        
        System.out.println("Informe sua altura(m):");
        altura = ent.nextFloat();
        
        float imc = peso/(altura*altura);
        System.out.println(sexo);
        System.out.println(String.format("Seu imc é %.2f",imc));
        switch(sexo){
            case "M":
                if (imc>32.3) {
                    System.out.println("Você está com Obeso");
                } else if (imc>=27.3){
                    System.out.println("Você está acima do peso ideal");
                } else if (imc>=25.8){
                    System.out.println("Você está marginalmente acima do peso");
                } else if (imc>=19.1){
                    System.out.println("Você está no peso normal");
                }else{
                    System.out.println("Você está abaixo do peso");
                }
                break;
            case "F":
                if (imc>31.1) {
                    System.out.println("Você está com Obeso");
                } else if (imc>=27.8){
                    System.out.println("Você está acima do peso ideal");
                } else if (imc>=26.4){
                    System.out.println("Você está marginalmente acima do peso");
                } else if (imc>=20.7){
                    System.out.println("Você está no peso normal");
                }else{
                    System.out.println("Você está abaixo do peso");
                }
                break;
            default:
                    System.out.println("O sexo inválido, informe M ou F");
        }
    }
    public static void main (String[] arg) {
        imcRecebeDados();
    }
}