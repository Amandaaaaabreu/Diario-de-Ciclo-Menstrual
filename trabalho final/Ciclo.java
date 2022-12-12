/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
// importando biblioteca
// import java.sql.Date;
import java.util.Scanner;

//nome da classe                                     
public class Ciclo {

    private int inicio_ciclo;
    private int fim_ciclo;
    

// definindo os construtores
public Ciclo( int inicio_ciclo, int fim_ciclo) { 
    this.inicio_ciclo =  inicio_ciclo;
    this.fim_ciclo = fim_ciclo;

   
 } 


 // implementrando gets e sets / metodos
public int geInicio_ciclo(){
    return inicio_ciclo ;
}
public void setInicio_ciclo( int inicio_ciclo){
    this.inicio_ciclo = inicio_ciclo;
}



public int getFim_ciclo(){
    return fim_ciclo;
}
public void setFim_CicloDate( int fim_ciclo){
    this.fim_ciclo = fim_ciclo;
}


// metodos
public static int estim_dias_restantes(){

    Scanner scan = new Scanner (System.in);
    int hoje;
    int resultado = 0;

    System.out.println("Responda as informações do seu ciclo:\n");

    System.out.println("Quantos dias dura sua menstruação:\n");
    resultado = scan.nextInt(); // para a pessoa responder
    System.out.println("Dia do início do seu ciclo:\n");
    int inicio_ciclo = scan.nextInt();
    System.out.println("Que dia é hoje?\n");
    hoje = scan.nextInt();

    
    int resposta = inicio_ciclo + resultado;
    int dias_restantes = resposta - hoje;

    return dias_restantes;
    
}
  

}
