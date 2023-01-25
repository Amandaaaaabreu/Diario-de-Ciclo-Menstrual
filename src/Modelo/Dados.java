
package Modelo;

import java.util.ArrayList;
import java.util.List;

// armazenando as informacoes que o usuario reponder por aqui, através da ArraysList

/** Classe Dados que armazena as informações que o usuário responder no software. Atua como um banco de dados.
 * @author Amanda Abreu
 * @since 2022
 */

public class Dados {

    

    private static final ArrayList<Usuaria> usuarias = new ArrayList<>();
    private static final ArrayList<Ciclo> ciclos = new ArrayList<>();
    private static final ArrayList<Atendimento> atendimento = new ArrayList<>();


    private Dados(){

    }

    public static List<Usuaria> getUsuaria(){
        return usuarias;
    }
    
    public static List<Ciclo> getCiclo(){
        return ciclos;
    }
    
    
    public static List<Atendimento> getAtendimentos(){
        return atendimento;
    }


    



}

