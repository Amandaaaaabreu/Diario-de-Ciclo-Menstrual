package Vieww;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controle.Usuaria;
import Modelo.Dados;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaExcluirUsuaria {

    private JPanel tela = new JPanel();
    private JFrame frame = new JFrame();
    public JLabel titulo = new JLabel("Aperte no botão abaixo para excluir seu cadastro:");
    public JButton excluir = new JButton("Excluir Cadastro");


public static void main(String args[]) {
    new TelaExcluirUsuaria();
}



public TelaExcluirUsuaria(){
    initialize();
}

public void initialize(){

        frame = new JFrame();
        frame.setBounds(300,300,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        tela.setBorder(new EmptyBorder(8, 8, 8, 8));
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);


        titulo.setFont(new java.awt.Font("Times New Roman", 1, 20));
        titulo.setBounds(25, 70, 600, 50);
        titulo.setForeground(new java.awt.Color(102, 0, 102));
        frame.getContentPane().add(titulo);


        excluir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e ){
                Object obj = e.getSource();
                if(obj == excluir){
                    frame.dispose();
                    TelaMenu.main(null);
                }
            }
        });

        excluir.setBackground(new Color(147, 112, 219));
        excluir.setFont(new java.awt.Font("Luthier", Font.PLAIN, 14));
        excluir.setBounds(100, 210, 250, 40);
        frame.getContentPane().add(excluir);



}


   
}
