
public class classe_Jogador{
    // public é o modificador de acesso
    // class indicando que é uma classe
    // nome da classe se começa com  letra maiuscula 
    
    public static void main(String[] args){

        int num=0; // operação para o pré ou pós imcremento

        Jogador etr0 = new Jogador(++num); // cada um desses objetos é individual ao outro
        Jogador etr1 = new Jogador(++num); // new é responsável pela instaciação, é ele  que aloca memoria dinamica (heap) necessaria pro objeto
        Jogador etr2 = new Jogador(++num); // cont++ é uma operação de pré imcremento para ficar na ordem correta o numero dos jogadores.

        // pós imcremento: ++num
        // pré começa do 1
        // pós começa do zero
      
    
   }
    
} 

