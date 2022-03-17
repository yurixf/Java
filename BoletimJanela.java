import javax.swing.JOptionPane; //importa biblioteca para fazer os inputs por janelas



public class BoletimJanela {
        public static void main(String[] args) {
            
        // declaração das variáveis
        String nome, resultado;
        float nota1, nota2, nota3;
        float media;
        

        resultado ="";
       
        nome = JOptionPane.showInputDialog("Nome do Aluno:"); //Nome do Aluno
           
        String[] possibleValues = { "Português", "Matemática", "História", "Geografia"}; // Valores possiveis
        String materia = (String) JOptionPane.showInputDialog(null,"Matéria", "Entrada",JOptionPane.INFORMATION_MESSAGE, null,possibleValues, possibleValues[0]);

        //NOTAS
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("1ª nota:"));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("2ª nota:"));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("3ª nota:"));
           
        // calcula a média
        media = (nota1 + nota2 + nota3) / 3;
                   
        // mostra a nota do aluno
            if( (media <4) ){
                resultado = "E";
            } else if(media < 5){
                resultado = "D";
            } else if(media < 7){
                resultado = "C";
            } else if(media < 8){
                resultado = "B";
            } else if(media <= 10){
                resultado = "A";
            }
            
        JOptionPane.showMessageDialog(null,(String.format("O aluno %s, na matéria de %s ficou com média %.2f e sua nota final foi %s",nome,materia, media, resultado)));
    }
}
