import javax.swing.JOptionPane;

public class CalculoIMCJProfessor
{
   public static void main(String[] args)
   {
      String nome;
      float peso, altura;
      float imc;
      String classifica;
 
      nome = JOptionPane.showInputDialog("Digite seu nome:");
      peso = Float.parseFloat(JOptionPane.showInputDialog("Digite seu Peso (kg):"));
      altura = Float.parseFloat(JOptionPane.showInputDialog("Digite sua Altura 1.7 (m):") );
     
 
      imc = (float) (peso/Math.pow(altura, 2));

 
      if (imc <= 19)
         classifica = "Abaixo do Peso";
      else
         if (imc <= 25)
            classifica = "Peso ideal";
         else
            if (imc <= 30)
               classifica = "Acima do Peso";
            else
               if (imc <= 35)
                  classifica = "Obesidade Leve";
               else
                  classifica = "Obesidade";
 
 
      JOptionPane.showMessageDialog(null, nome + " seu IMC é = "+imc+" e você está "+classifica);
 
   }
}