package Modelo;

public class Tpm {
    // atributos
    private char sono;
    private char humor;
    private char secrecao;
    private char calma;
    private char estressada;
    private char insonia;

    // construtores
public Tpm(char sono, char humor, char secrecao, char calma, char estressada, char insonia){
    this.sono = sono;
    this.humor = humor;
    this. secrecao = secrecao;
    this.calma = calma;
    this.estressada = estressada;
    this.insonia = insonia;
}

// gets e sets 
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
public void setsecrecao(char secrecao){
    this.secrecao = secrecao;
}
public char getCalma(){
    return calma;
}
public void setCalma(char calma){
    this.calma = calma;
}
public char getEstressada(){
    return estressada;
}
public void setEstressada(char estressada){
    this.estressada = estressada;
}
public char getInsonia(){
    return insonia;
}
public void setInsonia(char insonia){
    this.insonia = insonia;
}





}
