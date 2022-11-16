import java.security.SecureRandom; // numeros aleatorios
public class matrizes {
    public static void main(String[] args){
        final int linhas=3;
        final int colunas=5;

        int[][] numeros=new int[linhas][colunas];

       // [0,1,2,3,4,5],[0,1,2,3,4,5], [0,1,2,3,4,5] // =matriz

       for(int l=0;l<linhas;l++){
        for(int c=0;c<colunas;c++){
           numeros[l][c]=new SecureRandom().nextInt(100);
        }
       }

      
       for(int l=0;l<linhas;l++){
        for(int c=0;c<colunas;c++){
          System.out.printf("%2d | ",numeros[l][c]);
        }
          System.out.printf("%n");
           
       }  
     
      
     for(int[] n:numeros){     // FOR proprio para arrays
        for(int v:n){
            System.out.printf("%2d | ",v);  
        }
            System.out.printf("%n");  // quebra de linha
     }
}
 
}