package Vieww;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import Vieww.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaPerfil {

    private JPanel tela = new JPanel();
    private JFrame frame = new JFrame("Tela de Perfil");
    JLabel titulo = new JLabel("Escolha as opcoes abaixo");

    JButton cadastro = new JButton("Realizar Cadastro");
    JButton editar = new JButton("Editar Cadastro");
    JButton excluir = new JButton("Excluir Cadastro");


    public static void main(String args[]){
        new TelaPerfil();
    }

    public TelaPerfil(){
        initialize();
    }

    private void initialize(){

        frame = new JFrame();
        frame.setBounds(300,300,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        tela.setBorder(new EmptyBorder(8,8,8,8));
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);

        titulo.setBounds(90, 30, 600, 50);
        titulo.setFont(new java.awt.Font("Times New Roman", 1, 28));
        titulo.setForeground(new java.awt.Color(102, 0, 102));
        frame.getContentPane().add(titulo);

        cadastro.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e ){
                Object obj = e.getSource();
                if(obj == cadastro){
                    frame.dispose();
                    CadastroUsuaria.main(null);
                }
            }
        });
    

        cadastro.setBackground(new Color(147, 112, 219));
        cadastro.setFont(new java.awt.Font("Luthier", Font.PLAIN, 14));
        cadastro.setBounds(100, 150, 250, 40);
        frame.getContentPane().add(cadastro);

        editar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Object obj = e.getSource();
                if(obj == editar){
                    frame.dispose();
                    TelaEditarCadastro.main(null);
                }
            }

        });

        editar.setBackground(new Color(147, 112, 219));
        editar.setFont(new java.awt.Font("Luthier", Font.PLAIN, 14));
        editar.setBounds(100, 210, 250, 40);
        frame.getContentPane().add(editar);


        excluir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Object obj = e.getSource();
                if(obj == excluir){
                    frame.dispose();
                    TelaExcluirUsuaria.main(null);
                }
            }
        });

        excluir.setBackground(new Color(147, 112, 219));
        excluir.setFont(new java.awt.Font("Luthier", Font.PLAIN, 14));
        excluir.setBounds(100,270,250,40);
        frame.getContentPane().add(excluir);

    
    
}
}