package Vieww;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Modelo.Atendimento;
import Modelo.Dados;

/**
 * Tela que abre o atendimento quando a usuaria solicita.
 * @version 1.0
 * @author Amanda Abreu
 * @since 2022
 */

public class TelaAtendimento {

    private JPanel tela = new JPanel();
    private JFrame frame = new JFrame("Atendimento");

    JLabel titulo =  new JLabel("Realize seu atendimento abaixo:");

    JLabel fluxo_vaginal = new JLabel("Como é o seu fluxo menstrual? ");
    JLabel sensibilidade = new JLabel("Sente sensibilidade em alguma parte do corpo? ");
    JLabel toma_remedio = new JLabel("Toma algum remédio? ");
    JLabel medicamento_receitado = new JLabel("Possui algum medicamento receitado?");
    JLabel doencas = new JLabel("Possui algum tipo de doença?");

    JButton finalizar = new JButton("Finalizar Atendimento");
    


    public static JTextField txtfluxo_vaginal;
    public static JTextField txtsensibilidade;
    public static JTextField txttoma_remedio;
    public static JTextField txtmedicamento_receitado;
    public static JTextField txtdoencas;
   

public static void main(String args[], int index) {
        new TelaAtendimento(index);
   
}


    /**
     *Criando o software
     */

public TelaAtendimento(int index){
    initialize(index);
}

/**
     * inicia e implementa os componentes no conteiner
     */

private void initialize(int index){

        frame = new JFrame();
        frame.setBounds(300,300,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        tela.setBorder(new EmptyBorder(8, 8, 8, 8));
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);

        titulo.setFont(new java.awt.Font("Times New Roman", 1, 28));
        titulo.setBounds(53, 30, 600, 50);
        titulo.setForeground(new java.awt.Color(102, 0, 102));
        frame.getContentPane().add(titulo);

        fluxo_vaginal.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        fluxo_vaginal.setBounds(20, 120, 600, 50);
        fluxo_vaginal.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(fluxo_vaginal);

        sensibilidade.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        sensibilidade.setBounds(20, 148, 600, 50);
        sensibilidade.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(sensibilidade);


        toma_remedio.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        toma_remedio.setBounds(20, 180, 600, 50);
        toma_remedio.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(toma_remedio);

        medicamento_receitado.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        medicamento_receitado.setBounds(20, 210, 600, 50);
        medicamento_receitado.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(medicamento_receitado);

        doencas.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        doencas.setBounds(20, 240, 600, 50);
        doencas.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(doencas);

        txtfluxo_vaginal = new JTextField();
        txtfluxo_vaginal.setBounds(195, 136, 283, 23);
        frame.getContentPane().add(txtfluxo_vaginal);

        txtsensibilidade = new JTextField();
        txtsensibilidade.setBounds(290, 166, 190, 23);
        frame.getContentPane().add(txtsensibilidade);


        txttoma_remedio = new JTextField();
        txttoma_remedio.setBounds(157, 194, 324, 23);
        frame.getContentPane().add(txttoma_remedio);

        txtmedicamento_receitado = new JTextField();
        txtmedicamento_receitado.setBounds(249, 227, 231, 23);
        frame.getContentPane().add(txtmedicamento_receitado);

        txtdoencas = new JTextField();
        txtdoencas.setBounds(198, 256, 283, 23);
        frame.getContentPane().add(txtdoencas);

        finalizar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Dados.getCiclo().get(index).setAtendimento(new Atendimento(txtfluxo_vaginal.getText(), txttoma_remedio.getText(), txtmedicamento_receitado.getText(), txtdoencas.getText(), txtsensibilidade.getText()));
                Object one = e.getSource();
                if (one == finalizar){
                    frame.dispose();
                    TelaSintomas.main(null, index);
            }
        }

});

      finalizar.setBackground(new Color(147, 112, 219));
      finalizar.setFont(new java.awt.Font("Luthier", Font.PLAIN, 14));
      finalizar.setBounds(110,360,250,40);
      frame.getContentPane().add(finalizar);


     




      
}
}