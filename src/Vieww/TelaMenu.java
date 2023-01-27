
package Vieww;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.Buffer;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
//import javax.imageio.ImageIO;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//import Modelo.Atendimento;
//import Controle.*;
import Modelo.Ciclo;
//import Vieww.*;
import Modelo.Dados;
//import Modelo.*;

/**
 * Tela Menu. Tela principal que liga a todas as outras. 
 * @version 1.0
 * @author Amanda Abreu
 * @since 2022
 */


public class TelaMenu {

    JPanel tela = new JPanel();
    private JFrame frame;
    JLabel inicial = new JLabel("Diário  de Ciclo Menstrual");
	JButton ciclo = new JButton("Cadastrar Ciclo");
	JButton atendimento = new JButton("Atendimento"); 
    protected JButton one;
   

    public static void main(String args[]) {
        new TelaMenu();

        
         }
      
    /**
     * Criando o software
     */
    public TelaMenu(){
        initialize();
    }

    /**
     * inicia e implementa os componentes no conteiner
     */

    private void initialize() {

        

        //editando frame 
        frame = new JFrame();
        frame.setBounds(300,300,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);
        

        //editando titulo inicial
        inicial.setFont(new java.awt.Font("Times New Roman", 1, 28));
        inicial.setBounds(80, 50, 600, 50);
        inicial.setForeground(new java.awt.Color(102, 0, 102));
        frame.getContentPane().add(inicial);


       


        ciclo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Object one = e.getSource();
                if(one == ciclo){
                    frame.dispose();
                    TelaPerfilCiclo.main(null);
                }
            }
            
        });

        ciclo.setBackground(new Color(147, 112, 219));
        ciclo.setFont(new java.awt.Font("Luthier", Font.PLAIN, 14));
        ciclo.setBounds(100, 180, 250, 40);
        frame.getContentPane().add(ciclo);


        /**
         * Verifica se a usuaria está no sistema perguntando seu nome, para depois liberar pra propria fazer o atendimento.
         */

        atendimento.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                Object one = e.getSource();
                if(one == atendimento){
                    String nomeEscolhido = TelaEditarCiclo.SelecionarUsuaria();
                    int VerificadorExistencia = 0;
                for(Ciclo c : Dados.getCiclo()){
                    if(c.getNome().equals(nomeEscolhido)){
                        VerificadorExistencia = 1;
                        int index = Dados.getCiclo().indexOf(c);
                        new TelaAtendimento(index);
                    }
                }

                if(VerificadorExistencia == 0){
                    JOptionPane.showMessageDialog(null, "Este Usuário não está cadastrado em nosso sistema", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
                }
             }
        });

        atendimento.setBackground(new Color(147, 112, 219));
        atendimento.setFont(new java.awt.Font("Luthier", Font.PLAIN, 14));
        atendimento.setBounds(100,270,250,40);
        frame.getContentPane().add(atendimento);

       


}
        
}


        

        
    

