// importando biblioteca
import java.sql.Date;

//nome da classe                                     
public class Ciclo {

    private Date inicio_ciclo;
    private Date fim_ciclo;
    private  int probabilid_engravidar;


// definindo os construtores
public Ciclo( Date inicio_ciclo, Date fim_ciclo, int probabilid_engravidar ){ 
    this.inicio_ciclo =  inicio_ciclo;
    this.fim_ciclo = fim_ciclo;
    this.probabilid_engravidar = probabilid_engravidar;
   
 } 


 // implementrando gets e sets / metodos
public Date geInicio_ciclo(){
    return inicio_ciclo ;
}
public void setInicio_ciclo( Date inicio_ciclo){
    this.inicio_ciclo = inicio_ciclo;
}



public Date getFim_ciclo(){
    return fim_ciclo;
}
public void setFim_CicloDate( Date fim_ciclo){
    this.fim_ciclo = fim_ciclo;
}



public int getProbabilid_engravidar(){
    return probabilid_engravidar;
}
public void setProbabilid_engravidar( int probabilid_engravidar){
    this.probabilid_engravidar =  probabilid_engravidar;
}



}
