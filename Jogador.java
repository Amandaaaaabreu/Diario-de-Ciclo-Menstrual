// construtor é um metodo
// construtor não tem retorno, portanto não precisando especificar o seu tipo 
// construtor precisa obrigatoriamente ter o mesmo nome da classe
// no geral utilizamos ATRIBUTOS PRIVATE.

    public class Jogador {

     private final int maxVidas=5;
     private int num=0;
     private int vidas=0;
     static boolean alerta=false;
     static int qtdJogadores=0;
     static int pontosJogadores=0;
 
    public Jogador(int num){
      this.num=num; // quando uso o this. estou me referindo ao num da classe
      this.vidas=1;
      System.out.printf("%nJogador número %d criado%n",num);
      vidas++;
      pontosJogadores+=10;
      

     }
     // abaixo est[a um exemplo de metodo do tipo get

    public int getVidas(){ // não é obrigatorio o nome get
          return this.vidas;
     }

    public void setVidas(int vidas){  // não é necessario colocar o nome set
         if(vidas>maxVidas){
          this.vidas=maxVidas;
         }
         else if(vidas<0){
          this.vidas=0;
         }
         else{
          this.vidas=vidas;
         }   
        
     }

     static void pontos(){
        pontosJogadores+=10;
     }

     public void info(){
        System.out.printf("%nJogador:%d",this.num);
        System.out.printf("%nVidas:%d",this.vidas);
        System.out.printf("%nAlerta:%s",alerta ? "Sim" : "Não");
        System.out.printf("%nPontos dos Jogadores:%d",pontosJogadores);
        System.out.printf("%n-------------------------");
     }


 }
