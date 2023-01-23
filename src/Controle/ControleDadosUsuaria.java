package Controle;

public class ControleDadosUsuaria {
    
    public static boolean checkCPF(String valor) {
        if(valor.matches("[0-9]+"))
            return true;
        else
            return false;
}

    public static boolean checkNome(String valor){
        if(valor.matches("[A-Z]+"))
        return true;
        else
        return false;
    }

    public static boolean checkAnticoncepcional(String valor){
        if(valor.matches("[Sim]"))
        return true;

        else 
            if(valor.matches("[Não]"))
            return true;
        
        else 
            return false; 
        
            
            
    }
}
