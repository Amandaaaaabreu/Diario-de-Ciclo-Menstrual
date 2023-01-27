package JUnit;


import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;



import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.function.BooleanSupplier;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


import Modelo.*;
import Vieww.*;

/**
 * Classe que irá receber as informacoes para os 3 testes unitários que foi solicitado. 
 * @author Amanda
 * @version 1.0
 * @since 2023
 */



public class Teste {
  
  
  /**
   * Criando as variaveis. 
  */
  
    private Ciclo ciclo;
    private String inicio_menstruacao = "01/01/2023";
    private String fim_menstruacao = "07/01/2023";
    private String duracao_ciclo = "30 dias";
    private String numero = "13";
    private String nome = "Amanda";
    private String cpf = "087.415.801-09";
    private String data_nascimento = "30/12/2002";
    private String toma_anticoncepcional = "Sim";
    
    
    private Atendimento atendimento;
    private String fluxo_vaginal = "Médio";
    private String toma_remedio = "Sim";
    private String medicam_receitado = "Repopil";
    private String doencas = "Nenhuma";
    private String sensibilidade = "Nao";
    
    
    private Sintomas sintomas;
    private String colicas_menstruais = "Sim";
    private String sintomas_tpm = "Me sinto mais emotiva";
    private String mudancas_humor = "Sim";
    private String outros = "Quando estou no periodo de TPM minha cabeça costum doer mais";
    private String nada_incomoda = "Nao";
    
    /**
     * Testando meus construtores e testando se as informações foram passadas corretamente.
    */
    
    @Test
    public void testConstrutorCiclo() {
      ciclo = new Ciclo(nome, cpf, data_nascimento, toma_anticoncepcional,  inicio_menstruacao, fim_menstruacao, duracao_ciclo, numero); 
      ciclo.setAtendimento(null);
      ciclo.setSintomas(null);
      Dados.getCiclo().add(ciclo);
      assertEquals("Amanda", ciclo.getNome());
    }
    
    @Test
    public void testAtendimento() {
      atendimento = new Atendimento(fluxo_vaginal,toma_remedio,medicam_receitado,doencas,sensibilidade);
      Dados.getAtendimentos().add(atendimento);
      assertEquals("Repopil", atendimento.getMedicam_Receitado());
    }
    
    @Test
    public void testSintomas() {
      sintomas = new Sintomas( colicas_menstruais,sintomas_tpm,mudancas_humor,outros,nada_incomoda);
      assertEquals("Nao", sintomas.getNada_Incomoda());
    }

}
