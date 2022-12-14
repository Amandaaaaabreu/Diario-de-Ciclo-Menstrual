/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package main;

// import java.util.Date;
import java.util.Scanner;

//nome da classe
public class Suporte extends Usuaria { 
    
    // atributos 
    private Boolean consulta;

   // definindo os construtores
public Suporte ( String nome, int cpf, Double peso, String nascimento, Boolean anticoncepcional,Boolean consulta){
    super(nome, cpf, peso, nascimento, anticoncepcional);
    this.consulta = consulta;
}

public String toString(){
    return " Confirmação da consulta: ";
}


   // definindo gets e sets / metodos
public Boolean getConsulta(){
    return consulta;
}
public void setConsulta(Boolean consulta){
    this.consulta =  consulta;
}

// meotodo
public static Boolean confirmar_consulta(){
    // String saida = " -------- Confirmar consulta? -------- "; 
    Boolean resposta = false; 
    int resultado;
    System.out.println("Confirmar Consulta?\n Sim - Digite 0\n Não - Digite 1");
    Scanner scan = new Scanner (System.in);
    resultado = scan.nextInt();
    if(resultado==0){
        resposta = true;
    }
    
    else if(resultado==1){
        resposta = false;
    }

    else{
        System.out.println("Valor inválido");
    }

    return resposta;
    
    

    }
}
