package Modelo;

import java.sql.Date;

// atributos
public class Ciclo {
    private Date inicio_menstruacao;
    private Date fim_menstruacao;
    private int duracao_ciclo;
    private int estim_dias_restantes;



    // gets e sets 

public Ciclo(Date inicio, Date fim, int duracao, int dias_restantes){

    this.inicio_menstruacao = inicio;
    this.fim_menstruacao = fim;
    this.duracao_ciclo = duracao;
    this.estim_dias_restantes = dias_restantes;
}


public Date getInicio_Menstruacao(){
    return inicio_menstruacao;
}
public void setInicio_Menstruacao(Date inicio){
    this.inicio_menstruacao = inicio;
}

public Date getFim_Menstruacao(){
    return fim_menstruacao;
}
public void setFim_Menstruacao(Date fim){
    this.fim_menstruacao = fim;
}
public int getDuracao_Ciclo(){
    return duracao_ciclo;
}
public void setDuracao_Ciclo(int duracao){
    this.duracao_ciclo = duracao;
}
public int getEstim_Dias_Restantes(){
    return estim_dias_restantes;
}
public void setEstim_Dias_Restantes(int dias_restantes){
    this.estim_dias_restantes = dias_restantes;
}

}
