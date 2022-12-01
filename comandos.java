
public class comandos{

    public static void main(String[] args){

        int nota=80;
        int faltas=9;
        int maxFaltas=5;


        if(nota>=50 && faltas<=maxFaltas){
            System.out.println("\nAluno Aprovado! \n");
        }
        else if(nota>=40 && faltas<=maxFaltas){
            System.out.println("\nAluno em Recuperação! \n");
        }
        
        else{
            System.out.println("\nAluno Reprovado! \n");
        }
    }
 }
/*Operadores logicos: >, <, >=, <=, !=, ! */

/* Operação ternaria seria:
 * String res;
 * res=(nota>= media ? "Aprovado" : "Reprovado");
 * System.out.println("Resultado: " + res);
 */

 /*int pos=4;
  Switch (pos){
  * Case 1:
  System.out.println("Primeiro Lugar");
  break;
  Case2:
  System.out.println("Segundo Lugar");
  break;
  Case3:
  System.out.println("Terceiro Lugar");
  Case 4: Case 5: Case 6:
  System.out.println("Premio de participação");
  break;
  default:
  System.out.println("Não subiu no pódio");
  break;


 */
    
