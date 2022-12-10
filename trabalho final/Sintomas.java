//nome da classe
public class Sintomas {

    // atributos
    private char colicas_menstruais;
    private char sintomas_TPM;
    private char mudancas_humor;
    private String outros;
    private Boolean nada_incomoda;


    // construtores
public Sintomas(char colicas_menstruais, char sintomas_TPM, char mudancas_humor, String outros, Boolean nada_incomoda){
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
}





















}
