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
import Vieww.TelaMenu;

public class ControleCadastrarCiclo {

    private Usuaria usuariaSelecionada;

public Usuaria salvarUsuariaEscolhida(String nome){

    for(Usuaria usuariaAtual : Dados.getUsuaria()){
        if(usuariaAtual.getNome().equals(nome)){
            return usuariaAtual;
        }
    }

    return null;
}
public Object[] gerarArrayUsuaria(){
    List<String> exemplo = new ArrayList<>();
    for(Usuaria usuaria : Dados.getUsuaria()){
        exemplo.add(usuaria.getNome());
    }

    return exemplo.toArray();
}

public Ciclo obterExemplo (){
    
    String txtNumero = CadastroCiclo.gettxtnumero().getText();
    String tipoDuracaoMedia = CadastroCiclo.gettxtfim_menstruacao().getText();
    String tipoInicioCiclo = CadastroCiclo.gettxtinicio_menstruacao().getText();
    String tipoFimCiclo = CadastroCiclo.gettxtmedia_ciclo().getText();

    String dataInicio = tipoInicioCiclo;
    String dataFinal = tipoFimCiclo;
    int duracao;

    if(txtNumero.isEmpty()){
        CadastroCiclo.gettxtnumero().setText("");
        return null;
    }

   // SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

     
    try{
        duracao = Integer.parseInt(tipoDuracaoMedia);
    }
    catch (NumberFormatException e){
        CadastroCiclo.gettxtmedia_ciclo().setText("");
        return null;
    }

     return new Ciclo(dataInicio, dataFinal, duracao, txtNumero);
     
}

public void receberExemplo(Ciclo exemplo){
    Dados.getCiclo().add(exemplo);
}


// limpa os campos de texto 

public void zeraCampo(){
    CadastroCiclo.gettxtnumero().getText();
    CadastroCiclo.gettxtinicio_menstruacao().setText("");
    CadastroCiclo.gettxtfim_menstruacao().setText("");
    CadastroCiclo.gettxtmedia_ciclo().setText("");
}

public void executarBotao(Object botaoFonte){
    if(botaoFonte == CadastroCiclo.getCancelar()){
          zeraCampo();


          TelaMenu.main(null);
    }
    else{
        usuariaSelecionada = salvarUsuariaEscolhida((CadastroUsuaria.getTxtNome().getSelectedText().toString()));
        Ciclo exemplo = obterExemplo();

        if(exemplo != null){
            receberExemplo(exemplo);
            zeraCampo();
        }
    }
}

public static Ciclo validarBusca(String txtnumero){
    for(Ciclo a : Dados.getCiclo()){
        if(a.getNumero().equals(txtnumero)){
            return a ;
        }
    }

    return null;
}


public static Ciclo validarCadastro(String txtnumero){
    for(Ciclo a : Dados.getCiclo()){
        if(a.getNumero().equals(txtnumero)){
            return a ;
        }
    }
    return null;
}

public DefaultComboBoxModel<Object> atualizarExemplo(){
    return new DefaultComboBoxModel<>((gerarArrayUsuaria()));
}

public Usuaria UsuariaEscolhida(){
    return usuariaSelecionada;
}

}
