package Vieww;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Ciclo;
import Modelo.Dados;

/**
 * TelaPerfilCiclo
 * Abre quando a usuaria deseja realizar o cadastro, ou alterar, excluir e busca-lo.
 * @version 1.0
 * @author Amanda 
 * @since 2022
 */

public class TelaPerfilCiclo {

    private JPanel tela = new JPanel();
    private JFrame frame = new JFrame("Tela de Perfil Ciclo");
    JLabel titulo = new JLabel("Escolha as opcoes abaixo");

    JButton cadastro = new JButton("Realizar Cadastro");
    JButton editar = new JButton("Editar Ciclo");
    JButton excluir = new JButton("Excluir Ciclo");
    JButton buscar = new JButton("Buscar Ciclo");

    public static void main(String args[]) {
        new TelaPerfilCiclo();
    }

    /**
     * Criando o software.
    */

    public TelaPerfilCiclo() {
        initialize();
    }

     /**
     * Inicia e implementa os componentes no conteiner.
    */


    private void initialize() {

        frame = new JFrame();
        frame.setBounds(300, 300, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        tela.setBorder(new EmptyBorder(8, 8, 8, 8));
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);

        titulo.setBounds(90, 30, 600, 50);
        titulo.setFont(new java.awt.Font("Times New Roman", 1, 28));
        titulo.setForeground(new java.awt.Color(102, 0, 102));
        frame.getContentPane().add(titulo);

        cadastro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object obj = e.getSource();
                if (obj == cadastro) {
                    frame.dispose();
                    CadastroCiclo.main(null);
                }
            }
        });

        cadastro.setBackground(new Color(147, 112, 219));
        cadastro.setFont(new java.awt.Font("Luthier", Font.PLAIN, 14));
        cadastro.setBounds(100, 150, 250, 40);
        frame.getContentPane().add(cadastro);

        /**
         * Caso a usuaria queira editar seu cadastro a propria so precisara informar seu nome. 
         * Se a usuaria não estiver cadastrada, retornará 0 e uma mensagem de erro.
         * Se estiver cadastrada conseguira fazer as edicoes que desejar. 
         
         */

        editar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomeEscolhido = TelaEditarCiclo.SelecionarUsuaria();
                int VerificadorExistencia = 0;
                for(Ciclo c : Dados.getCiclo()){
                    if(c.getNome().equals(nomeEscolhido)){
                        VerificadorExistencia = 1;
                        int index = Dados.getCiclo().indexOf(c);
                        TelaEditarCiclo.main(null, index);
                    }
                }

         /**
         * Caso a usuaria tente editar seu cadastro mesmo sem te lo feito aparecera uma mensagem de erro.
         */

                if(VerificadorExistencia == 0){
                    JOptionPane.showMessageDialog(null, "Este Usuário não está cadastrado em nosso sistema", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }

        });
            

        editar.setBackground(new Color(147, 112, 219));
        editar.setFont(new java.awt.Font("Luthier", Font.PLAIN, 14));
        editar.setBounds(100, 210, 250, 40);
        frame.getContentPane().add(editar);


        /**
         * Caso a usuaria queira excluir seu cadastro, a propria terá que informar o nome que colocou no seu cadastro.
        */

        excluir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object obj = e.getSource();
                if (obj == excluir) {
                    String nomeEscolhido = TelaEditarCiclo.SelecionarUsuaria();
                    int VerificadorExistencia = 0;
                for(Ciclo c : Dados.getCiclo()){
                    if(c.getNome().equals(nomeEscolhido)){
                        VerificadorExistencia = 1;
                        Dados.getCiclo().remove(c);
                    }
                }

                if(VerificadorExistencia == 0){
                    JOptionPane.showMessageDialog(null, "Este Usuário não está cadastrado em nosso sistema", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
                }
            }
        });

        excluir.setBackground(new Color(147, 112, 219));
        excluir.setFont(new java.awt.Font("Luthier", Font.PLAIN, 14));
        excluir.setBounds(100, 270, 250, 40);
        frame.getContentPane().add(excluir);

        buscar.setBackground(new Color(147, 112, 219));
        buscar.setFont(new java.awt.Font("Luthier", Font.PLAIN, 14));
        buscar.setBorder(BorderFactory.createLineBorder(new Color(147, 112, 219), 8));
        buscar.setBounds(100, 335, 250, 40);
        frame.getContentPane().add(buscar);

        /**
         * Quando já cadastrada, a usuaria poderá ver seu cadastro tanto pessoal quanto do ciclo através do botão buscar.
         *  Apos digitado seu nome que foi informado no cadastro  ela conseguirá buscar e ver todas as informacoes.
         */

        buscar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Object obj = e.getSource();
                if (obj == buscar) {
                    String nomeEscolhido = TelaEditarCiclo.SelecionarUsuaria();
                    int VerificadorExistencia = 0;
                for(Ciclo c : Dados.getCiclo()){
                    if(c.getNome().equals(nomeEscolhido)){
                        VerificadorExistencia = 1;
                        int index = Dados.getCiclo().indexOf(c);
                        BuscarCiclo.main(null, index);
                    }
                }

                if(VerificadorExistencia == 0){
                    JOptionPane.showMessageDialog(null, "Este Usuário não está cadastrado em nosso sistema", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
                }
            }
        });

    }

}
