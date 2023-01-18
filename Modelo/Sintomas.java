package Modelo;

public class Sintomas {
    //atributos
    private char colicas_menstruais;
    private char sintomas_tpm;
    private char mudancas_humor;
    private String outros;
    private Boolean nada_incomoda;

    //construtores
public Sintomas(char colicas_menstruais, char sintomas_tpm, char mudancas_humor, String outros, Boolean nada_incomoda){
    this.colicas_menstruais = colicas_menstruais;
    this.sintomas_tpm = sintomas_tpm;
    this.mudancas_humor = mudancas_humor;
    this.outros = outros;
    this.nada_incomoda = nada_incomoda;
}

//gets e sets
public char getColicas_Menstruais(){
    return colicas_menstruais;
}
public void setColicas_Menstruais(char colicas_menstruais){
    this.colicas_menstruais = colicas_menstruais;
}
public char getSintomas_Tpm(){
    return sintomas_tpm;
}
public void setSintomas_Tpm(char sintomas_tpm){
    this.sintomas_tpm = sintomas_tpm;
}
public char getMudancas_Humor(){
    return mudancas_humor;
}
public void setMudancas_Humor(char mudancas_humor){
    this.mudancas_humor = mudancas_humor;
}
public String getOutros(){
    return outros;
}
public void setOutros(String outros){
    this.outros = outros;
}
public Boolean getNada_Incomoda(){
    return nada_incomoda;
}
public void setNada_Incomoda(Boolean nada_incomoda){
    this.nada_incomoda = nada_incomoda;
}








}
