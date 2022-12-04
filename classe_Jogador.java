
public class classe_Jogador{
    // public é o modificador de acesso
    // class indicando que é uma classe
    // nome da classe se começa com  letra maiuscula 
    // todos os elementos static(tanto atributo e propriedade) tem o mesmo endereço de memoria, sendo comum para todos os objetos da classe, não precisando instanciar uma classe para chamar o metodo ou um atributo static.

    // pós imcremento: ++num
    // pré começa do 1
    // pós começa do zero
    
    public static void main(String[] args){

        int num=0; // operação para o pré ou pós imcremento
        
        Jogador.pontos();
        Jogador.pontos();
        
        
    

        Jogador jog1 = new Jogador(++num); // cada um desses objetos é individual ao outro
        Jogador jog2 = new Jogador(++num); // new é responsável pela instaciação, é ele  que aloca memoria dinamica (heap) necessaria pro objeto
        Jogador jog3 = new Jogador(++num); // cont++ é uma operação de pré imcremento para ficar na ordem correta o numero dos jogadores.

        Jogador.alerta=true;

        jog1.info();
        jog2.info();
        jog3.info();

        /* 
        jog1.setVidas(7); // o maximo de vidas é 5, independente do numero que adiciono. 
        System.out.printf("%nQuantidade de vidas do jogador 1= %d%n",jog1.getVidas());
        System.out.printf("%nQuantidade de vidas do jogador 2= %d%n",jog2.getVidas());
        System.out.printf("%nQuantidade de vidas do jogador 3= %d%n",jog3.getVidas());
        */
      
    
   }
    
} 

