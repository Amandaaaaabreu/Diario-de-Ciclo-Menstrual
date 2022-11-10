package Java;
import java.util.Scanner;

public class loop {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        // FOR: irei usar o FOR quando eu saber quantas vezes irei usar aquele comando

        /*for(int cont=0; cont < 5 ; cont++){
            System.out.println(cont + "- Amanda Abreu");  */
            
        int max=scan.nextInt();

        // WHILE: usamos while quando não sabemos quantas vezes iremos executar determinado comando

          int cont=0; // controle
          while(cont < max ){  // condição
            System.out.println(cont + " - Amanda Abreu");
            cont++;  //incremento ou decremento do controle, faço por isso pra não entrar em um loop infinito.
          }

            System.out.println("Fim do Programa");
    }

}

