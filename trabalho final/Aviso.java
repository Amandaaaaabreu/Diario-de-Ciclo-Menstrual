//package main;

import java.util.Scanner;

// nome da classe
public class Aviso {

    // atributos
    private String lembrete;
    

// construtores
public Aviso(String lembrete){
    this.lembrete = lembrete;
}

// gets e sets 
public String getLembrete(){
    return lembrete;
}
public void setLembrete(String lembrete){
    this.lembrete = lembrete;
}

// metodos
public static void tomar_anticoncepcional(){
    
    Scanner scan = new Scanner (System.in);
    
    Boolean armazenar; // ta recebendo o valor?

    System.out.println("Lembrete\n");

    System.out.println("Toma anticoncepcional?\n Sim - Digite 0\n Não - Digite 1\n");
    int tomar_anticoncepcional = scan.nextInt();

    if(tomar_anticoncepcional==0){
        armazenar = true;
        System.out.println("Deseja receber um lembrete?\n Sim - Digite 0\n Não - Digite 1\n");
        int receber_lembrete = scan.nextInt(); // perguntar se as variaveis estao recebendo valores
    }
    
    else if(tomar_anticoncepcional==1){
         armazenar= false;
    }

    else{
        System.out.println("Valor inválido");
    }



}
}
