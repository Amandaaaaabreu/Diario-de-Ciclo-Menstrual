package Modelo;



public class Usuaria {
    //atributos
    private String nome;
    private String cpf;
    private String peso;
    private String data_nascimento;
    private String toma_anticoncepcional;
   

    //construtores
public Usuaria(String nome, String cpf, String peso, String data_nascimento,String toma_anticoncepcional ){
        this.nome = nome;
        this.cpf = cpf;
        this.peso = peso;
        this.data_nascimento = data_nascimento;
        this.toma_anticoncepcional = toma_anticoncepcional;
       
    }
public Usuaria() {
}
// gets e sets
public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome = nome;
}
public String getCpf(){
    return cpf;
}
public void setCpf(String cpf){
    this.cpf = cpf;
}
public String getPeso(){
    return peso;
}
public void setPeso(String peso){
    this.peso = peso;
}
public String getData_Nascimento(){
    return data_nascimento;
}
public void setData_Nascimento(String data_nascimento){
    this.data_nascimento = data_nascimento;
}
public String getToma_Anticoncepcional(){
    return toma_anticoncepcional;
}
public void setToma_anticoncepcional(String toma_anticoncepcional){
    this.toma_anticoncepcional = toma_anticoncepcional;
}

public void editarDadosUsuaria(String nome, String cpf, String peso, String data_nascimento,String toma_anticoncepcional){
    this.setNome(nome);
    this.setCpf(cpf);
    this.setPeso(peso);
    this.setData_Nascimento(data_nascimento);
    this.setToma_anticoncepcional(toma_anticoncepcional);
    
}

}
