import javax.swing.JOptionPane; //importa biblioteca para fazer os inputs por janelas


public class ParOuImpar
{
       public static void ParOuImpar(){
               
        // Declaração de variáveis
        int vjg, teste, valor,soma; // vjg = vitoria jogador
        String resultado, nome;
        
        vjg= 0;
        
        
        //Chama as janelas
        nome = JOptionPane.showInputDialog("Digite seu nome:");   
        
        
        while(true){
          
            
            int sorteio = (int)(Math.random() * 10);  //Sorteia o que o PC vai colocar
        
            // Comando Select
            String[] possibleValues = { "Par", "Impar"};
            String escolha = (String) JOptionPane.showInputDialog(null,"Par ou Impar", "Entrada",JOptionPane.INFORMATION_MESSAGE, null,possibleValues, possibleValues[0]);
            
            valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
            soma = valor+sorteio;
            teste= (valor+sorteio)%2;
            
            JOptionPane.showMessageDialog(null,(String.format("%s voce colocou %d e eu coloquei %d. Total %d",nome,valor,sorteio, soma)));
                                           
            if (teste == 0){
                JOptionPane.showMessageDialog(null,"Deu PAR");
                if (escolha == "Par"){
                    JOptionPane.showMessageDialog(null,"Você Ganhou");
                    vjg +=1;
                }else{
                    break;
                }
            }else if (teste == 1){
                JOptionPane.showMessageDialog(null,"Deu IMPAR");
                if (escolha == "Impar"){
                   JOptionPane.showMessageDialog(null,"Você Ganhou");
                    vjg +=1; 
                } else {
                    break;
                }
            }
                        
        }
        JOptionPane.showMessageDialog(null,"GAME OVER");
        JOptionPane.showMessageDialog(null,(String.format("%s, você ganhou %d vez(es)",nome,vjg)));
    }
    public static void main (String[] arg) {
        ParOuImpar();
    }
}
