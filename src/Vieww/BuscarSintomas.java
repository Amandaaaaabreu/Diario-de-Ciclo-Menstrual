package Vieww;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Modelo.Dados;
import Modelo.Sintomas;

/**
 * BuscarSintoma
 * Faz a busca pelo teste Sintomas, respondido pela usuaria.
 * @author Amanda A
 * @since 2022
 * @version 1.0
 */

public class BuscarSintomas {
    private JPanel tela = new JPanel();
    private JFrame frame = new JFrame("Sintomas");

    JLabel titulo =  new JLabel("Verifique os seus Sintomas abaixo");

    JLabel colicas_mentruais = new JLabel("Sente Cólicas Menstruais: ");
    JLabel sintomas_tpm  = new JLabel("Sente sintomas da TPM: ");
    JLabel mudancas_humor  = new JLabel("Está com mudanças de humor repentinas: ");
    JLabel outros  = new JLabel("Sente algo a mais: ");
    JLabel nada_incomoda  = new JLabel("Nada te incomoda: ");

    JButton voltar = new JButton("Voltar pra tela de Menu");

    


    public static JTextField txtcolicas_menstruais;
    public static JTextField txtsintomas_tpm;
    public static JTextField txtmudancas_humor;
    public static JTextField txtoutros;
    public static JTextField txtnada_incomoda;

    public static void main(String args[], int index){
        new BuscarSintomas(index);
    }

    /**
     * Criando o software.
    */
    
    public BuscarSintomas(int index){
        initialize(index);
    }
    
    /**
     * Inicia e implementa os componentes no conteiner.
    */
    private void initialize(int index){
        
        Sintomas sintomas = Dados.getCiclo().get(index).getSintomas();
        frame = new JFrame();
        frame.setBounds(300,300,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        tela.setBorder(new EmptyBorder(8, 8, 8, 8));
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);

        titulo.setFont(new java.awt.Font("Times New Roman", 1, 20));
        titulo.setBounds(85, 30, 600, 50);
        titulo.setForeground(new java.awt.Color(102, 0, 102));
        frame.getContentPane().add(titulo);

        colicas_mentruais.setText(colicas_mentruais.getText() + sintomas.getColicas_Menstruais());
        colicas_mentruais.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        colicas_mentruais.setBounds(20, 120, 600, 50);
        colicas_mentruais.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(colicas_mentruais);

        sintomas_tpm.setText(sintomas_tpm.getText() + sintomas.getSintomas_Tpm());
        sintomas_tpm.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        sintomas_tpm.setBounds(20, 148, 600, 50);
        sintomas_tpm.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(sintomas_tpm);

        mudancas_humor.setText(mudancas_humor.getText() + sintomas.getMudancas_Humor());
        mudancas_humor.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        mudancas_humor.setBounds(20, 180, 600, 50);
        mudancas_humor.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(mudancas_humor);

        outros.setText(outros.getText() + sintomas.getOutros());
        outros.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        outros.setBounds(20, 210, 600, 50);
        outros.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(outros);

        nada_incomoda.setText(nada_incomoda.getText() + sintomas.getNada_Incomoda());
        nada_incomoda.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        nada_incomoda.setBounds(20, 240, 600, 50);
        nada_incomoda.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(nada_incomoda);

        voltar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Object obj = e.getSource();
                if (obj == voltar) {
                    TelaMenu.main(null);
                }

            }

        });

        voltar.setBackground(new Color(147, 112, 219));
        voltar.setFont(new java.awt.Font("Luthier", Font.PLAIN, 14));
        voltar.setBounds(156,380,195,40);
        frame.getContentPane().add(voltar);
    }
}
