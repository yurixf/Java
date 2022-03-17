
public class imc2
{
    static void imc2(){
        String sexo="Masculino";
        float peso=85, altura=1.76f;
        float imc = peso/(altura*altura);
        System.out.println("Você é do sexo: "+sexo);
        System.out.println(String.format("Seu imc é %.2f",imc));
        switch(sexo){
            case "Masculino":
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
            case "Feminino":
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
                    System.out.println("O sexo informado é inválido");
        }
    }
    public static void main (String[] arg) {
        imc2();
    }
}
