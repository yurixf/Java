public class notas{
  static void notas() {
      float n1=2.5f, n2=2.4f, n3=2.7f, n4=2.3f;
      float total = n1+n2+n3+n4;
      float media = (total/4);
      System.out.println("Média: "+media);
      if (media>=7) {
          System.out.println("Resultado: "+"Aprovado");
      } else if (media<=5){
          System.out.println("Resultado: "+"Reprovado");
        } else{
            System.out.println("Resultado: "+"Em Recuperação");
        }
    }
     public static void main (String[] args){
        notas();
    }
}