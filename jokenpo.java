import javax.swing.JOptionPane; //importa biblioteca para fazer os inputs por janelas


public class jokenpo
{
       public static void jokenpo(){
               
        // Declaração de variáveis
        int vpc, vjg, emp, partidas; // vpc = vitoria pc, vjg = vitoria jogador, emp = empate
        String nome, resultado, pc;
        
        vpc = vjg = emp = 0;
        pc="";
        
        //Chama as janelas
        nome = JOptionPane.showInputDialog("Digite seu nome:");   
        partidas = Integer.parseInt(JOptionPane.showInputDialog("Quantas partidas você quer jogar?"));
        
        for (int c = 0; c < partidas; c++){
          
            
        int sorteio = (int)(Math.random() * 3);  //Sorteia o que o PC vai colocar
        
        // Comando Select
        String[] possibleValues = { "Pedra", "Papel", "Tesoura"};
        String escolha = (String) JOptionPane.showInputDialog(null,"JokenPo", "Entrada",JOptionPane.INFORMATION_MESSAGE, null,possibleValues, possibleValues[0]);
        
        if (sorteio == 0){
            pc="Pedra";
            JOptionPane.showMessageDialog(null,"Eu joguei Pedra");
        }else if (sorteio == 1){
            pc ="Papel";
            JOptionPane.showMessageDialog(null,"Eu joguei Papel");
        }else if (sorteio == 2){
            pc = "Tesoura";
            JOptionPane.showMessageDialog(null,"Eu joguei Tesoura");
        }
        
         
        if (escolha == pc) {
                JOptionPane.showMessageDialog(null,"Empate");
                emp +=1;
            } else if (pc == "Pedra" && escolha=="Papel"){
                JOptionPane.showMessageDialog(null,"Você Ganhou");
                vjg +=1;
            } else if (pc == "Papel" && escolha=="Tesoura"){
                JOptionPane.showMessageDialog(null,"Você Ganhou");
                vjg +=1;
            } else if (pc == "Tesoura" && escolha=="Pedra"){
                JOptionPane.showMessageDialog(null,"Você Ganhou");
                vjg +=1;
            }else{
                JOptionPane.showMessageDialog(null,"Eu Ganhei");
                vpc +=1;
            }
        }
        
        JOptionPane.showMessageDialog(null,(String.format("%s, você ganhou %d partida(s), eu ganhei %d partida(s) e empatamos %d vez(es)",nome,vjg, vpc,emp)));
    }
    public static void main (String[] arg) {
        jokenpo();
    }
}
