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
 * Tela que abre quando a usuária solicita quando finaliza o atendimento e faz algumas perguntas sobre quais sintomas a propria tem ou sente.
 * @version 1.0
 * @author Amanda Abreu
 * @since 2022
 */

public class TelaSintomas { 
    private JPanel tela = new JPanel();
    private JFrame frame = new JFrame("Sintomas");

    JLabel titulo =  new JLabel("Responda os sintomas abaixo");

    JLabel colicas_mentruais = new JLabel("Sente colicas menstruais? ");
    JLabel sintomas_tpm  = new JLabel("Sente sintomas da TPM? ");
    JLabel mudancas_humor  = new JLabel("Está com mudanças de humor repentinas? ");
    JLabel outros  = new JLabel("Sente algo a mais? ");
    JLabel nada_incomoda  = new JLabel("Nada te incomoda: ");

    JButton finalizar = new JButton("Finalizar Questionário");


    public static JTextField txtcolicas_menstruais;
    public static JTextField txtsintomas_tpm;
    public static JTextField txtmudancas_humor;
    public static JTextField txtoutros;
    public static JTextField txtnada_incomoda;

public static void main(String args[], int index){
    new TelaSintomas(index);
}
public TelaSintomas(int index){
    initialize(index);  
}

private void initialize(int index){

        frame = new JFrame();
        frame.setBounds(300,300,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        tela.setBorder(new EmptyBorder(8, 8, 8, 8));
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);

        titulo.setFont(new java.awt.Font("Times New Roman", 1, 24));
        titulo.setBounds(94, 30, 600, 50);
        titulo.setForeground(new java.awt.Color(102, 0, 102));
        frame.getContentPane().add(titulo);

        colicas_mentruais.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        colicas_mentruais.setBounds(20, 120, 600, 50);
        colicas_mentruais.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(colicas_mentruais);

        sintomas_tpm.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        sintomas_tpm.setBounds(20, 148, 600, 50);
        sintomas_tpm.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(sintomas_tpm);

        mudancas_humor.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        mudancas_humor.setBounds(20, 180, 600, 50);
        mudancas_humor.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(mudancas_humor);

        outros.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        outros.setBounds(20, 210, 600, 50);
        outros.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(outros);

        nada_incomoda.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        nada_incomoda.setBounds(20, 240, 600, 50);
        nada_incomoda.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(nada_incomoda);

        txtcolicas_menstruais = new JTextField();
        txtcolicas_menstruais.setBounds(170, 136, 299, 23);
        frame.getContentPane().add(txtcolicas_menstruais);

        txtsintomas_tpm = new JTextField();
        txtsintomas_tpm.setBounds(170, 166, 299, 23);
        frame.getContentPane().add(txtsintomas_tpm);


        txtmudancas_humor = new JTextField();
        txtmudancas_humor.setBounds(260, 194, 210, 23);
        frame.getContentPane().add(txtmudancas_humor);

        txtoutros = new JTextField();
        txtoutros.setBounds(138, 227, 330, 23);
        frame.getContentPane().add(txtoutros);

        txtnada_incomoda = new JTextField();
        txtnada_incomoda.setBounds(136, 256, 330, 23);
        frame.getContentPane().add(txtnada_incomoda);

        finalizar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Dados.getCiclo().get(index).setSintomas(new Sintomas(txtcolicas_menstruais.getText(),txtsintomas_tpm.getText(), txtmudancas_humor.getText(),txtoutros.getText(), txtnada_incomoda.getText()));
                Object one = e.getSource();
                if (one == finalizar){
                    frame.dispose();
                    TelaMenu.main(null);
            }
        }

});

      finalizar.setBackground(new Color(147, 112, 219));
      finalizar.setFont(new java.awt.Font("Luthier", Font.PLAIN, 14));
      finalizar.setBounds(100,330,250,40);
      frame.getContentPane().add(finalizar);












}















}

