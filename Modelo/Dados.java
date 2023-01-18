package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Dados {
    private static final ArrayList<Usuaria> usuaria = new ArrayList<>();
    private static final ArrayList<Ciclo> ciclo = new ArrayList<>();
    private static final ArrayList<Sintomas> sintomas = new ArrayList<>();
    private static final ArrayList<Atendimento> atendimento = new ArrayList<>();


    private Dados(){

    }

    public static List<Usuaria> getUsuaria(){
        return usuaria;
    }
    
    public static List<Ciclo> getCiclo(){
        return ciclo;
    }
    
    public static List<Sintomas> getSintomas(){
        return sintomas;
    }
    
    public static List<Atendimento> getAtendimentos(){
        return atendimento;
    }














}

