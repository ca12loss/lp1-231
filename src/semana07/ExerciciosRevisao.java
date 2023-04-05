package semana07;

public class ExerciciosRevisao {

   public static double Somar(double n1, double n2, double n3) {
      return n1 + n2 + n3;
   }

   public static double Mediar(double n1, double n2, double n3) {
      return (n1 + n2 + n3) / 3;
   }

   public static int MaiorValor(int n1, int n2, int n3) {

      if (n1 > n2 && n1 > n3) {
         return n1;
      } 
      else if (n2 > n1 && n2 > n3) {
         return n2;
      }
         else {
            return n3;
      }
   }

   public static int MenorValor(int n1, int n2, int n3) {

      if (n1 < n2 && n1 < n3) {
         return n1;
      } else if (n2 < n1 && n2 < n3) {
         return n2;
      } else {
         return n3;
      }
   }

   public static double[] passarArray(double n1, double n2, double n3) {
      double vet[] = {n1,n2,n3};
      
      return vet;
   }

   public static double SomarArray(double[] valores) {
      double soma = 0.0;

      for (int i = 0; i < valores.length; i++) {
         soma += valores[i];
      }

      return soma;
   }

   public static double MediarArray(double[] valores) {
      double soma = 0.0;

      for (int i = 0; i < valores.length; i++) {
         soma += valores[i];
      }

      double media = soma / valores.length;
      return media;
   }

   public static double MaxArray(double[] valores) {
      double maiorvalor = valores[0];
      
      for (int i=0;i<valores.length;i++) {
         if(valores[i]>maiorvalor)
            maiorvalor=valores[i];
   }
   return maiorvalor;
   }

   public static double MinArray(double[] valores) {
      double menorvalor= valores[0];
      
      for (int i=0;i<valores.length;i++) {
        if(valores[i]<menorvalor)
        menorvalor=valores[i];
   }

   return menorvalor;
   }

   public static int[] DoisArrays(int[] vetA, int[] vetB){
      int vetC [] =new int [vetA.length + vetB.length];

      int i = 0;
      for (i=0;i<(vetA.length);i++){
         vetC[i] = vetA [i];
         i = i;
      }
      int z=0;
      for (int j = i + 1 ;i<(vetB.length);j++){
         vetC[j] = vetB [z];
         z++;
      }
      

      return vetC;
   }
}
