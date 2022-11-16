import java.util.Arrays;

public class array3 {
    public static void main(String[] args){
 
        //final int tam=10;
        int[] prog={5,10,15,20,25,30,35,40,45,50};
        //int[] numeros=new int [tam];
        int pesq=40;
        int pos;

    // Arrays.sort(prog); // organiza os elementos do array

    //Arrays.fill(numeros,10); // preenche o array com o valor indicado

    //System.arraycopy(prog, 0, numeros, 0, tam);

    //Arrays.equals(prog, numeros); // comparando dois arrays
    //System.out.printf("\nArrays são iguais? %s \n \n",Arrays.equals(prog, numeros) ? "Sim" : "Não");

    Arrays.sort(prog);
    pos=Arrays.binarySearch(prog, pesq);

    System.out.printf("\nO elemento %d está no Array? %s na posição %d\n\n",pesq,pos > 0 ? "SIM," : "NÃO,",pos);
        

       // for(int n:numeros){  // for especial para ler elemtnos de uma array.
         //   System.out.printf("%d \n",n);
      //  }
    }
}
