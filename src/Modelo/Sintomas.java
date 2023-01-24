package Modelo;

public class Sintomas {
    // atributos
    private String colicas_menstruais;
    private String sintomas_tpm;
    private String mudancas_humor;
    private String outros;
    private String nada_incomoda;

    // construtores
    public Sintomas(String colicas_menstruais, String sintomas_tpm, String mudancas_humor, String outros,
            String nada_incomoda) {
        this.colicas_menstruais = colicas_menstruais;
        this.sintomas_tpm = sintomas_tpm;
        this.mudancas_humor = mudancas_humor;
        this.outros = outros;
        this.nada_incomoda = nada_incomoda;
    }

    // gets e sets
    public String getColicas_Menstruais() {
        return colicas_menstruais;
    }

    public void setColicas_Menstruais(String colicas_menstruais) {
        this.colicas_menstruais = colicas_menstruais;
    }

    public String getSintomas_Tpm() {
        return sintomas_tpm;
    }

    public void setSintomas_Tpm(String sintomas_tpm) {
        this.sintomas_tpm = sintomas_tpm;
    }

    public String getMudancas_Humor() {
        return mudancas_humor;
    }

    public void setMudancas_Humor(String mudancas_humor) {
        this.mudancas_humor = mudancas_humor;
    }

    public String getOutros() {
        return outros;
    }

    public void setOutros(String outros) {
        this.outros = outros;
    }

    public String getNada_Incomoda() {
        return nada_incomoda;
    }

    public void setNada_Incomoda(String nada_incomoda) {
        this.nada_incomoda = nada_incomoda;
    }

}
