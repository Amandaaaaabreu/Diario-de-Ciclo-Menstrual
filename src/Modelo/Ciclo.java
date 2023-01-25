
package Modelo;

/** Classe Ciclo herda de Usuária e armazena as informações que serão perguntadas para a usuária.
 * @author Amanda Abreu
 * @since 2022
 */
public class Ciclo extends Usuaria {

    private String inicio_menstruacao;
    private String fim_menstruacao;
    private String duracao_ciclo;
    private String numero;
    private Sintomas sintomas;
    private Atendimento atendimento;

    // gets e sets

    /** 
     * @param inicio_menstruacao       primeiro dia da memstruacao
     * @param fim_menstruacao          ultimo dia da menstruacao
     * @param duracao_ciclo            duracao do ciclo
     * @param numero                    numero do cadastro
       
     */

    public Ciclo (String nome, String cpf, String data_nascimento, String toma_anticoncepcional, String  inicio_menstruacao , String fim_menstruacao, String duracao_ciclo, String numero ) {
        super(nome, cpf, data_nascimento, toma_anticoncepcional);
        this.inicio_menstruacao = inicio_menstruacao;
        this.fim_menstruacao = fim_menstruacao;
        this.duracao_ciclo = duracao_ciclo;
        this.numero = numero;
        this.sintomas = null;
        this.atendimento = null;
    }

    

    public String toString(){
        return this.getNome();
    }

    public String getInicio_Menstruacao() {
        return inicio_menstruacao;
    }

    public void setInicio_Menstruacao(String inicio) {
        this.inicio_menstruacao = inicio;
    }

    public String getFim_Menstruacao() {
        return fim_menstruacao;
    }

    public void setFim_Menstruacao(String fim) {
        this.fim_menstruacao = fim;
    }

    public String getDuracao_Ciclo() {
        return duracao_ciclo;
    }

    public void setDuracao_Ciclo(String duracao) {
        this.duracao_ciclo = duracao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Sintomas getSintomas() {
        return sintomas;
    }

    public void setSintomas(Sintomas sintomas) {
        this.sintomas = sintomas;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    

}
