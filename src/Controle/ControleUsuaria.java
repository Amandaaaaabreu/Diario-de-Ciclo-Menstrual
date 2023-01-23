package Controle;

import Modelo.Usuaria;
import Vieww.CadastroUsuaria;

public class ControleUsuaria {

    public Usuaria terResultado(){
        String txtnome = CadastroUsuaria.getTxtNome().getText();
        String txtcpf = CadastroUsuaria.getTxtcpf().getText();
        String txtpeso = CadastroUsuaria.getTxtPeso().getText();
        String txtdata_nascimento = CadastroUsuaria.getTxtDataNascimento().getText();
        String txttoma_anticoncepcional = CadastroUsuaria.getTxtTomaAnticoncepcional().getText();
        
        
        if(txtnome.isEmpty()){
            CadastroUsuaria.getTxtNome().setText("");
            return null;
        }
        if(txtcpf.isEmpty()){
            CadastroUsuaria.getTxtcpf().setText("");
            return null;
        }
        if(txtpeso.isEmpty()){
            CadastroUsuaria.getTxtPeso().setText("");
            return null;
        }
        if(txtdata_nascimento.isEmpty()){
            CadastroUsuaria.getTxtDataNascimento().setText("");
            return null;
        }
        if(txttoma_anticoncepcional.isEmpty()){
            CadastroUsuaria.getTxtTomaAnticoncepcional().setText("");
            return null;
        }
        
        

        return new Usuaria(txtnome,txtcpf,txtpeso,txtdata_nascimento,txttoma_anticoncepcional);

    }

    public String confereCadastro(String txtnome,String txtcpf,String txtpeso,String txtdata_nascimento,String txttoma_anticoncepcional){
        String avisoErro = "";

        if(txtnome.length() == 0){
            return null;
        }
        if(txtcpf.length() == 0){
            return null;
        }
        if(txtpeso.length() == 0){
            return null;
        }
        if(txtdata_nascimento.length() == 0){
            return null;
        }
        if(txttoma_anticoncepcional.length() == 0){
            return null;
        }
        

        /////////////////////////////////////////////////

        if(!validarTxtNome(txtnome)){
            avisoErro += "Nome Inválida!\n";
        }
        if(!validarTxtCpf(txtcpf)){
            avisoErro += "Cpf Inválido!\n";
        }
        if(!validarTxtPeso(txtpeso)){
            avisoErro += "Peso Inválida!\n";
        }
        if(!validarTxtDataNascimento(txtdata_nascimento)){
            avisoErro += "Data Inválida!\n";
        }
        if(!validarTxtTomaAnticoncepcional(txttoma_anticoncepcional)){
            avisoErro += "Resposta Inválida!\n";
        }
        
            return avisoErro;
        
    }


//Validando as respostas 

public boolean validarTxtNome(String txtnomeInput){
    boolean verificar = true;
    if(!txtnomeInput.substring(0).matches("[A-Z]*")){
        verificar = false;
    }
    return verificar;
}

public boolean validarTxtTomaAnticoncepcional(String txttoma_anticoncepcionalInput){
    boolean verificar = true;
    if(!txttoma_anticoncepcionalInput.substring(0).matches("[A-Z]*")){
        verificar = false;
    }
    return verificar;
}

public boolean validarTxtCpf(String txtcpfInput){
    boolean verificar = true;
    return verificar;
}

public boolean validarTxtPeso(String txtpesoInput){
    boolean verificar = true;
    return verificar;
}

public boolean validarTxtDataNascimento(String txtdata_nascimentoInput ){
    boolean verificar = true;
    return verificar;
}
 










}
