package Modelo;

import java.util.ArrayList;
import java.util.List;

// armazenando as informacoes que o usuario reponder por aqui, através da ArraysList

public class Dados {

    private static final ArrayList<Usuaria> usuarias = new ArrayList<>();
    private static final ArrayList<Ciclo> ciclos = new ArrayList<>();
    private static final ArrayList<Atendimento> atendimento = new ArrayList<>();
    private static final ArrayList<TesteTpm> testeTpm = new ArrayList<>();


    private Dados(){

    }

    public static List<Usuaria> getUsuaria(){
        return usuarias;
    }
    
    public static List<Ciclo> getCiclo(){
        return ciclos;
    }
    
    public static List<TesteTpm> getTesteTpm(){
        return testeTpm ;
    }
    
    public static List<Atendimento> getAtendimentos(){
        return atendimento;
    }


    



}

