package Modelo;

public class Atendimento {
    //atributos
    private Boolean fluxo_vaginal;
    private Boolean toma_remedio;
    private String medicam_receitado;
    private String doencas;

    // construtores
    public Atendimento(Boolean fluxo_vaginal, Boolean toma_remedio, String medicam_receitado, String doencas){
        this.fluxo_vaginal = fluxo_vaginal;
        this.toma_remedio = toma_remedio;
        this.medicam_receitado = medicam_receitado;
        this.doencas = doencas;
    }
    //gets e sets
    public Boolean getFluxo_Vaginal(){
        return fluxo_vaginal;
    }
    public void setFluxo_Vaginal(Boolean fluxo_vaginal){
        this.fluxo_vaginal = fluxo_vaginal;
    }
    public Boolean getToma_Remedio(){
        return toma_remedio;
    }
    public void setToma_Remedio(Boolean toma_remedio){
        this.toma_remedio =toma_remedio;
    }
    public String getMedicam_Receitado(){
        return medicam_receitado;
    }
    public void setMedic_Receitado(String medicam_receitado){
        this.medicam_receitado = medicam_receitado;
    }
    public String getDoencas(){
        return doencas;
    }
    public void setDoencas(String doencas){
        this.doencas = doencas;
    }




















}
