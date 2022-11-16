import java.security.SecureRandom;
public class matrizes2 {
    public static void main(String[] args) {

        final int linhas=4;
        final int colunas=4;
        int[][] numeros=new int [linhas][colunas];
        int[][] num={{5,8,7,9},{7,22,44,3},{9,1,3,4},{7,5,99,41}};

        for(int l=0;l<linhas;l++){
            for(int c=0;c<colunas;c++){
                numeros[l][c]=new SecureRandom().nextInt(100);
            }
        }

        for(int[] n:num){
            for(int v:n){
                System.out.printf("3%d | ",v);
            }
               System.out.printf("%n");
        }
               
    }
}
