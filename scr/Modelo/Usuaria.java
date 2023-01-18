package Modelo;

import java.sql.Date;

public class Usuaria {
    //atributos
    private String nome;
    private int cpf;
    private int peso;
    private Date data_nascimento;
    private Boolean toma_anticoncepcional;
    private Boolean lembrete;

    //construtores
public Usuaria(String nome, int cpf, int peso, Date data_nascimento, Boolean toma_anticoncepcional, Boolean lembrete){
        this.nome = nome;
        this.cpf = cpf;
        this.peso = peso;
        this.data_nascimento = data_nascimento;
        this.toma_anticoncepcional = toma_anticoncepcional;
        this.lembrete = lembrete;
    }
public Usuaria(String text, String text2, String text3, String text4) {
}
// gets e sets
public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome = nome;
}
public int getCpf(){
    return cpf;
}
public void setCpf(int cpf){
    this.cpf = cpf;
}
public int getPeso(){
    return peso;
}
public void setPeso(int peso){
    this.peso = peso;
}
public Date getData_Nascimento(){
    return data_nascimento;
}
public void setData_Nascimento(Date data_nascimento){
    this.data_nascimento = data_nascimento;
}
public Boolean getToma_Anticoncepcional(){
    return toma_anticoncepcional;
}
public void setToma_anticoncepcional(Boolean toma_anticoncepcional){
    this.toma_anticoncepcional = toma_anticoncepcional;
}
public Boolean getLembrete(){
    return lembrete;
}
public void setLembrete(Boolean lembrete){
    this.lembrete = lembrete;
}
    





















}
