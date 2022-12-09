// pacote para usar o Date
import java.sql.Date;

// nome da classe 
public class Usuaria {  
 
    // atributos
     private String nome;   
     private int cpf;
     private Double peso;
     private Date data_nascimento;
     private Boolean toma_anticoncepcional; 


// definindo os construtores
public Usuaria( String nome, int cpf, Double peso, Date nascimento, Boolean anticoncepcional ){ 
    this.nome =  nome;
    this.cpf = cpf;
    this.peso = peso;
    this.data_nascimento =  nascimento;
    this.toma_anticoncepcional =  anticoncepcional;
}


// implementando gets e sets / metodos
public String getNome(){
    return nome;
}
public void setNome( String nome){
    this.nome = nome;
}


public int getCpf(){
    return cpf;
}
public void setCpf( int cpf){
    this.cpf = cpf;
}


public Double getPeso(){
    return peso;
}
public void setPeso( Double peso){
    this.peso =  peso;
}


public Date getData_nascimento(){
    return data_nascimento;
}
public void setData_nascimento( Date data_nascimento){
    this.data_nascimento = data_nascimento;
}


public Boolean getToma_anticoncepcional(){
    return toma_anticoncepcional;
}
public void setToma_anticoncepcional(){
    this.toma_anticoncepcional = true;
    
}

// metodos implementados
public void realizar_cadastro(){

}

public void alterar_cadastro(){
    
}

public void excluir_conta(){
    
}

public void enviar_opniao(){
    
}



}

