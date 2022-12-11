// pacote para usar o Date
// import java.sql.Date;
// import java.text.SimpleDateFormat;
// import java.util.Scanner;

// nome da classe 
public class Usuaria {  
 
    // atributos
     private String nome;   
     private int cpf;
     private Double peso;
     private String data_nascimento;
     private Boolean toma_anticoncepcional; 


// definindo os construtores
public Usuaria( String nome, int cpf, Double peso, String nascimento, Boolean anticoncepcional ){ 
    this.nome =  nome;
    this.cpf = cpf;
    this.peso = peso;
    this.data_nascimento =  nascimento;
    this.toma_anticoncepcional =  anticoncepcional;
}


// implementando gets e sets 
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


public String getData_nascimento(){
    return data_nascimento;
}
public void setData_nascimento( String data_nascimento){
    this.data_nascimento = data_nascimento;
}


public Boolean getToma_anticoncepcional(){
    return toma_anticoncepcional;
}
public void setToma_anticoncepcional(){
    this.toma_anticoncepcional = true;
    
}

/* 
// metodos
public Usuaria realizar_cadastro(){
    
    Scanner scan = new Scanner (System.in); 

    int toma=0;

    System.out.println("Informe seus dados:\n");

    System.out.println("Nome:\n");
    nome = scan.nextLine(); // para a pessoa responder
    System.out.println("CPF:\n");
    cpf = scan.nextInt();
    System.out.println("Peso:\n");
    peso = scan.nextDouble();
    System.out.println("Data de Nascimento:\n");
    data_nascimento = scan.nextLine();
    // SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    // Date data_nascimento = formatter.parse(data); // tirar duvida com larissa como converter de String para Date
    System.out.println("Toma anticoncepcional?\n Sim - Digite 0\n Não - Digite 1\n");
    if(toma==0){
        toma_anticoncepcional = true;
    }
    
    else if(toma==1){
        toma_anticoncepcional = false;
    }

    else{
        System.out.println("Valor inválido");
    }

    Usuaria usuaria = new Usuaria(nome,cpf,peso,data_nascimento,toma_anticoncepcional);
    
    return usuaria;
        
    
}
*/


}

