/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package main;

import java.util.Scanner;

//nome da classe
public class Sintomas {

    // atributos
    private char colicas_menstruais;
    private char sintomas_TPM;
    private char mudancas_humor;
    private String outros;
    private Boolean nada_incomoda;


    // construtores
public Sintomas(char colicas_menstruais, char sintomas_TPM, char mudancas_humor, Boolean nada_incomoda, String outros){
    this.colicas_menstruais = colicas_menstruais;
    this.sintomas_TPM = sintomas_TPM;
    this.mudancas_humor = mudancas_humor;
    this.outros = outros;
    this.nada_incomoda = nada_incomoda;
}

// implementando gets e sets

public char getColicas_menstruais(){
    return colicas_menstruais;
}
public void setColicas_menstruais(char colicas_menstruais){
    this.colicas_menstruais = colicas_menstruais;
}


public char getSintomas_TPM(){
    return sintomas_TPM;
}
public void setSintomas_TPM(char sintomas_TPM){
    this.sintomas_TPM = sintomas_TPM;
}


public char getMudancas_humor(){
    return mudancas_humor;
}
public void setMudancas_humor(char mudancas_humor){
    this.mudancas_humor = mudancas_humor;
}


public String getOutros(){
    return outros;
}
public void setOutros(String outros){
    this.outros = outros;
}


public Boolean getNada_incomoda(){
    return nada_incomoda;
}
public void setNada_incomoda(Boolean nada_incomoda){
    this.nada_incomoda = nada_incomoda;
}

public static Sintomas retornar_sintomas(){

    Scanner scan = new Scanner (System.in);
    int resultado = 0;
    boolean nada_incomoda=false;

    System.out.println("Informe seus sintomas:\n");

    System.out.println("Cólicas Menstruais:\n" + "B - Baixa\n"+"M - Média\n"+"I - Intensa\n");
    char colicas_menstruais = scan.next().charAt(0); // para a pessoa responder
    System.out.println("Sintomas da TPM:\n"+"B - Baixo\n"+"M -Médio\n"+"I -Intenso\n");
    char sintomas_TPM = scan.next().charAt(0);
    System.out.println("Mudanças de Humor:\n"+"B - Baixa\n"+"M -Média\n"+"I -Intensa\n");
    char mudancas_humor = scan.next().charAt(0);
    System.out.println("Nada incomoda?\n Sim -Digite 0\n Não - Digite 1\n");
    resultado = scan.nextInt();
    if(resultado==0){
        nada_incomoda = true;
    }
    else if(resultado==1){
        nada_incomoda = false;
    }
    else{
        System.out.println("Valor Inválido");
    }

    System.out.println("Outros:\n");
    String outros = scan.nextLine();

    Sintomas retornar_sintomas = new Sintomas(colicas_menstruais, sintomas_TPM, mudancas_humor, nada_incomoda, outros);
    
    return retornar_sintomas;


}

}
