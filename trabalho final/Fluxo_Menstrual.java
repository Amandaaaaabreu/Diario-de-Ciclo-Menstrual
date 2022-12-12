/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

//nome da classe
public class Fluxo_Menstrual {
    
    //atributos
    private  char nivel;
    private char sono;
    private char humor;
    private char secrecao;
    private String outros;

// definindo os construtores
public Fluxo_Menstrual(char nivel, char sono, char humor, char secrecao, String outros ){ 
    this.nivel =  nivel;
    this.sono = sono;
    this.humor = humor;
    this.secrecao =  secrecao;
    this.outros = outros;

}
// definindo get e set / metodos
public char getNivel(){
    return nivel;    
}
public void setNivel( char nivel){
    this.nivel = nivel;
}


public char getSono(){
    return sono;
}
public void setSono(char sono){
    this.sono = sono;
}


public char getHumor(){
    return humor;
}
public void setHumor(char humor){
    this.humor = humor;
}


public char getSecrecao(){
    return secrecao;
}
public void setSecrecao(char secrecao){
    this.secrecao = secrecao;
}


public String getOutros(){
    return outros;
}
public void setOutros(String outros){
    this.outros = outros;
}

public static Fluxo_Menstrual Criar_Fluxo_Menstrual(){

    Scanner scan = new Scanner (System.in);


    System.out.println("Informe seus dados:\n");

    System.out.println("Humor:\n" + "T - Triste\n"+"F - Feliz\n"+"C - Cansada\n");
    char humor = scan.next().charAt(0); // para a pessoa responder
    System.out.println("Nível:\n"+"B - Baixo\n"+"M -Médio\n"+"I -Intenso\n");
    char nivel = scan.next().charAt(0);
    System.out.println("Sono:\n"+"B - Baixo\n"+"M -Médio\n"+"I -Intenso\n");
    char sono = scan.next().charAt(0);
    System.out.println("Secreção:\n"+"B - Baixo\n"+"M -Médio\n"+"I -Intenso\n");
    char secrecao = scan.next().charAt(0);
    System.out.println("Outros:\n");
    String outros = scan.nextLine();

    Fluxo_Menstrual fluxo_menstrual = new Fluxo_Menstrual(humor,nivel,sono,secrecao,outros);
    
    return fluxo_menstrual;



    
    
}
}
