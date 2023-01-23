package Modelo;

// atributos
public class Ciclo {

    private String inicio_menstruacao;
    private String fim_menstruacao;
    private int duracao_ciclo;
    private String numero;

    // gets e sets

    public Ciclo(String dataInicio, String dataFinal, int duracao, String numero) {

        this.inicio_menstruacao = dataInicio;
        this.fim_menstruacao = dataFinal;
        this.duracao_ciclo = duracao;
        this.numero = numero;
    }

    public Ciclo(){}

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

    public int getDuracao_Ciclo() {
        return duracao_ciclo;
    }

    public void setDuracao_Ciclo(int duracao) {
        this.duracao_ciclo = duracao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
