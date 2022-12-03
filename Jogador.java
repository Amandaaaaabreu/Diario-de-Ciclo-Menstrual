// construtor é um metodo
// construtor não tem retorno, portanto não precisando especificar o seu tipo 
// construtor precisa obrigatoriamente ter o mesmo nome da classe
// no geral utilizamos ATRIBUTOS PRIVATE.
  public class Jogador {

     private int num=0;
     private int vidas=0;
 
     public Jogador(int num){
      this.num=num; // quando uso o this. estou me referindo ao num da classe
      this.vidas=3;
      System.out.printf("%nJogador número %d foi criado%n%n",num);

     }
        




 }
