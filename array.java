
// irá armazenar na mémoria ram as posições relacionadas as posicoes do array.
// podemos usar loops para percorrer os elementos de uma array, usando tanto o loop WHILE quanto o FOR dará certo porém o mais indicado é o FOR.
public class array {
    public static void main (String[] args){

        int[] num=new int[10];
        int[] prin={10,20,30,40,50,60,70,80,90,55,13};

        num[0]=10;
        num[1]=5;
        num[2]=12;
        num[3]=11;
        num[4]=14;
        num[5]=10;
        num[6]=13;
        num[7]=15;
        num[8]=10;
        num[9]=20;

        for(int i=0; i<prin.length; i++){ // .lenght retorna a quantidade de elementos que tem na minha array 

            System.out.printf("%d \n", prin[i]);
        }

       /*System.out.printf("%d \n", num[5]);
        System.out.printf("%d", prin[8]); */ 
    }
    
}
