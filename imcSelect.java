import javax.swing.JOptionPane; //importa biblioteca para fazer os inputs por janelas

public class imcSelect
{
    public static void imcSelect(){
               
        // Declaração de variáveis
        String classifica, nome;
        float peso, altura, imc;
        

        //Chama as janelas
        nome = JOptionPane.showInputDialog("Digite seu nome:");
              
        // Comando Select
        String[] possibleValues = { "Masculino", "Feminino"};
        String sexo = (String) JOptionPane.showInputDialog(null,"Sexo", "Entrada",JOptionPane.INFORMATION_MESSAGE, null,possibleValues, possibleValues[0]);
        
 
        peso = Float.parseFloat(JOptionPane.showInputDialog("Informe seu peso (60.5kg)"));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Informe sua altura(1.75m)"));
       
      
        imc = (float) (peso/Math.pow(altura,2));
        
        switch(sexo){
            case "Masculino":
                if (imc>32.3) {
                    classifica = "Você está com Obeso";
                } else if (imc>=27.3){
                    classifica = "Você está acima do peso ideal";
                } else if (imc>=25.8){
                    classifica = "Você está marginalmente acima do peso";
                } else if (imc>=19.1){
                    classifica = "Você está no peso normal";
                }else{
                    classifica = "Você está abaixo do peso";
                }
                break;
            case "Feminino":
                if (imc>31.1) {
                    classifica = "Você está com Obeso";
                } else if (imc>=27.8){
                    classifica = "Você está acima do peso ideal";
                } else if (imc>=26.4){
                    classifica = "Você está marginalmente acima do peso";
                } else if (imc>=20.7){
                    classifica = "Você está no peso normal";
                }else{
                    classifica = "Você está abaixo do peso";
                }
                break;
            default:
                    classifica = "Sexo não informado";
        }
        JOptionPane.showMessageDialog(null,(String.format("%s, você é do sexo %s, seu IMC é %.2f. %s",nome,sexo, imc,classifica)));
    }
    public static void main (String[] arg) {
        imcSelect();
    }
}
