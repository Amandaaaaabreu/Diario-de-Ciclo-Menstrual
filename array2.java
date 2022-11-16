public class array2 {
    
    public static void main(String[] args){

        final int tam=5;
        char[] gabarito={'A','A','D','A','B'};
        char[] respostas=new char[tam];
        int resultado=0;


        respostas[0]='A';
        respostas[1]='C';
        respostas[2]='D';
        respostas[3]='B';
        respostas[4]='A';


        for(int i=0; 1<tam; i++){
            if(respostas[i]==gabarito[i]){
               resultado++; 
            }
            System.out.printf("Nota do Aluno:%d ",resultado);
        }

        
        
    }
      
    
}
