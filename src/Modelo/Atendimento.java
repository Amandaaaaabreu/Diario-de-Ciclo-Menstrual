
package Modelo;

/** Classe Atendimento ultilizada para verificar os sintomas do usuário.
 * @author Amanda Abreu
 * @since 2022
 * @version 1.0
 */

public class Atendimento {
    //atributos
    private String fluxo_vaginal;
    private String toma_remedio;
    private String medicam_receitado;
    private String doencas;
    private String sensibilidade;

    // construtores
    public Atendimento(String fluxo_vaginal, String toma_remedio, String medicam_receitado, String doencas, String sensibilidade){
        this.fluxo_vaginal = fluxo_vaginal;
        this.toma_remedio = toma_remedio;
        this.medicam_receitado = medicam_receitado;
        this.doencas = doencas;
        this.sensibilidade = sensibilidade;
    }
    //gets e sets
    public String getFluxo_Vaginal(){
        return fluxo_vaginal;
    }
    public void setFluxo_Vaginal(String fluxo_vaginal){
        this.fluxo_vaginal = fluxo_vaginal;
    }
    public String getToma_Remedio(){
        return toma_remedio;
    }
    public void setToma_Remedio(String toma_remedio){
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
    public String getSensibilidade(){
        return sensibilidade;
    }
    public void setSensibilidade(String sensibilidade){
        this.sensibilidade = sensibilidade;
    }




















}
