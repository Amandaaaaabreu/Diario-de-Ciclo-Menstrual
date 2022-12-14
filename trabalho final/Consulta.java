/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package main;

import java.util.Scanner;

// nome da classe
public class Consulta {

    // atributos
    private Double peso;
    private String fluxo_vaginal;
    private String medicam_receitado;
    private String doencas;
    
 // definindo os construtores
public Consulta(Double peso, String fluxo_vaginal, String medicam_receitado, String doencas){
    this.peso = peso;
    this.fluxo_vaginal = fluxo_vaginal;
    this.medicam_receitado = medicam_receitado;
    this.doencas = doencas;
    }
    
// definindo gets e sets / metodo
public Double getPeso(){
    return peso;
}
public void setPeso(Double peso){
    this.peso = peso;
}


public String getFluxo_vaginal(){
    return fluxo_vaginal;
}
public void setFluxo_vaginal(String fluxo_vaginal){
    this.fluxo_vaginal = fluxo_vaginal;
}


public String getMedicam_receitado(){
    return medicam_receitado;
}
public void setMedicam_receitado(String medicam_receitado){
    this.medicam_receitado = medicam_receitado;
}

// construtores
public String getDoencas(){
    return doencas;
}
public void setDoencas(String doencas){
    this.doencas = doencas;
}

public static String obter_prontuario(){

    String prontuario;

    Scanner scan = new Scanner (System.in);

    System.out.println("Peso:\n");
    double peso = scan.nextDouble();
    System.out.println("Fluxo Vaginal:");
    String fluxo_vaginal = scan.next();
    System.out.println("Medicamento Receitado:");
    String medicam_receitado = scan.next();
    System.out.println("Doenças:");
    String doencas = scan.next();

    
    prontuario = "--- Prontuário ---" + "\n" + "Peso: " + peso + "\n" + "Fluxo Vaginal: " + fluxo_vaginal + "\n" + "Medicamento Receitado: " + medicam_receitado + "\n" + "Doenças: " + doencas + "\n";

    return prontuario;
}

}
