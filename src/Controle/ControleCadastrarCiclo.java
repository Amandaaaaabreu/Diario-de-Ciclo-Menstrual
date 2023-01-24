package Controle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

import Modelo.Dados;
import Modelo.*;
import Modelo.Usuaria;
import Vieww.CadastroCiclo;
import Vieww.CadastroUsuaria;
import Vieww.TelaEditarCiclo;
import Vieww.TelaMenu;

public class ControleCadastrarCiclo {
    public Ciclo obterModelo(){

        String txtnome= CadastroCiclo.gettxtnome().getText();
        String txtcpf= CadastroCiclo.gettxtcpf().getText();
        String txtdata_nascimento= CadastroCiclo.gettxtdata_nascimento().getText();
        String txttoma_anticoncepcional= CadastroCiclo.gettxttoma_anticoncepcional().getText();
        String txtinicio_menstruacao = CadastroCiclo.gettxtinicio_menstruacao().getText();
        String txtfim_menstruacao = CadastroCiclo.gettxtfim_menstruacao().getText();
        String txtmedia_ciclo = CadastroCiclo.gettxtmedia_ciclo().getText();
        String txtnumero = CadastroCiclo.gettxtnumero().getText();


        
        if(txtnome.isEmpty()){
            CadastroCiclo.gettxtnome().setText("");
            return null;
        }
        if(txtcpf.isEmpty()){
            CadastroCiclo.gettxtcpf().setText("");
            return null;
        }
        if(txtdata_nascimento.isEmpty()){
            CadastroCiclo.gettxtdata_nascimento().setText("");
            return null;
        }
        if(txttoma_anticoncepcional.isEmpty()){
            CadastroCiclo.gettxttoma_anticoncepcional().setText("");
            return null;
        }
        if(txtinicio_menstruacao.isEmpty()){
            CadastroCiclo.gettxtinicio_menstruacao().setText("");
            return null;
        }
        if(txtfim_menstruacao.isEmpty()){
            CadastroCiclo.gettxtfim_menstruacao().setText("");
            return null;
        }
        if(txtmedia_ciclo.isEmpty()){
            CadastroCiclo.gettxtmedia_ciclo().setText("");
            return null;
        }
        if(txtnumero.isEmpty()){
            CadastroCiclo.gettxtnumero().setText("");
            return null;
        }
        return new Ciclo(txtnome,txtcpf,txtdata_nascimento,txttoma_anticoncepcional,txtinicio_menstruacao, txtfim_menstruacao,txtmedia_ciclo,txtnumero);

    }

    public String confereCadastro(String txtnome,String txtcpf,String txtdata_nascimento,String txttoma_anticoncepcional,String txtinicio_menstruacao, String txtfim_menstruacao,String txtmedia_ciclo,String txtnumero){
        String avisoErro = "";

        if(txtnome.isEmpty()){
            CadastroCiclo.gettxtnome().setText("");
            return null;
        }
        if(txtcpf.isEmpty()){
            CadastroCiclo.gettxtcpf().setText("");
            return null;
        }
        if(txtdata_nascimento.isEmpty()){
            CadastroCiclo.gettxtdata_nascimento().setText("");
            return null;
        }
        if(txttoma_anticoncepcional.isEmpty()){
            CadastroCiclo.gettxttoma_anticoncepcional().setText("");
            return null;
        }
        if(txtinicio_menstruacao.isEmpty()){
            CadastroCiclo.gettxtinicio_menstruacao().setText("");
            return null;
        }
        if(txtnumero.isEmpty()){
            CadastroCiclo.gettxtfim_menstruacao().setText("");
            return null;
        }
        if(txtfim_menstruacao.isEmpty()){
            CadastroCiclo.gettxtfim_menstruacao().setText("");
            return null;
        }
        if(txtmedia_ciclo.isEmpty()){
            CadastroCiclo.gettxtmedia_ciclo().setText("");
            return null;
        }
        if(!validarTxtNome(txtnome)){
            avisoErro += "Nome Inválida!\n";
        }
        if(!validarTxtTomaAnticoncepcional(txttoma_anticoncepcional)){
            avisoErro += "Resposta Inválida!\n";
        }
        
            return avisoErro;
        
    }

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
    

    //private Usuaria usuariaSelecionada;

public Usuaria salvarUsuariaEscolhida(String nome){

    for(Usuaria usuariaAtual : Dados.getUsuaria()){
        if(usuariaAtual.getNome().equals(nome)){
            return usuariaAtual;
        }
    }

    return null;
}

}
