// nome da classe
public class Consulta {

    // atributos
    private float peso;
    private String fluxo_vaginal;
    private String medicam_receitado;
    private String doencas;
    
 // definindo os construtores
public Consulta(float peso, String fluxo_vaginal, String medicam_receitado, String doencas){
    this.peso = peso;
    this.fluxo_vaginal = fluxo_vaginal;
    this.medicam_receitado = medicam_receitado;
    this.doencas = doencas;
    }
    
// definindo gets e sets / metodo
public float getPeso(){
    return peso;
}
public void setPeso(float peso){
    this.peso = peso;
}


public String getFluxo_vaginal(){
    return fluxo_vaginal;
}
public void setFluxo_vaginal(String fluxo_vaginal){
    this.fluxo_vaginal = fluxo_vaginal;
}


public String getMedicam_receitado(){
    return medicam_receitado;
}
public void setMedicam_receitado(String medicam_receitado){
    this.medicam_receitado = medicam_receitado;
}


public String getDoencas(){
    return doencas;
}
public void setDoencas(String doencas){
    this.doencas = doencas;
}

// metodos implementados
public void obter_prontuario(){
    
}







}
