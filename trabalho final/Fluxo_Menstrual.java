//nome da classe
public class Fluxo_Menstrual {
    
    //atributos
    private  char nivel;
    private char sono;
    private char humor;
    private char secrecao;
    private char outros;

// definindo os construtores
public Fluxo_Menstrual(char nivel, char sono, char humor, char secrecao, char outros ){ 
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


public char getOutros(){
    return outros;
}
public void setOutros(char outros){
    this.outros = outros;
}


// metodos
public void retornar_resultado(){

}

}
