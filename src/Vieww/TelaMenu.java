package Vieww;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Controle.*;
//import Vieww.*;


public class TelaMenu {
    private JFrame frame;
    JLabel inicial = new JLabel("Diário  de Ciclo Menstrual");
	JButton usuaria = new JButton("Perfil");
	JButton ciclo = new JButton("Cadastrar Ciclo");
	JButton atendimento = new JButton("Atendimento");
	JButton testetpm = new JButton("Teste TPM");
    JButton editar = new JButton("Editar");
    protected JButton one;
    public static ControleDados dados = new ControleDados();

    public static void main(String args[]) {
        new TelaMenu();
		
               
         }
               
    public TelaMenu(){
        initialize();
    }

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
        inicial.setBounds(90, 30, 600, 50);
        inicial.setForeground(new java.awt.Color(102, 0, 102));
        frame.getContentPane().add(inicial);


        usuaria.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Object one = e.getSource();
                if (one == usuaria){
                    frame.dispose();
                   TelaPerfil.main(null);
                }

                
            }
        });

        usuaria.setFont(new java.awt.Font("Luthier", Font.PLAIN, 14));
        usuaria.setBackground(new Color(147, 112, 219));
        usuaria.setBounds(100, 150, 250, 40);
        frame.getContentPane().add(usuaria);
        
        
        ciclo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Object one = e.getSource();
                if(one == ciclo){
                    frame.dispose();
                    new CadastroCiclo();
                }
            }
            
        });

        ciclo.setBackground(new Color(147, 112, 219));
        ciclo.setFont(new java.awt.Font("Luthier", Font.PLAIN, 14));
        ciclo.setBounds(100, 210, 250, 40);
        frame.getContentPane().add(ciclo);

        atendimento.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                Object one = e.getSource();
                if(one == atendimento){
                    new TelaAtendimento();
                }
             }
        });

        atendimento.setBackground(new Color(147, 112, 219));
        atendimento.setFont(new java.awt.Font("Luthier", Font.PLAIN, 14));
        atendimento.setBounds(100,270,250,40);
        frame.getContentPane().add(atendimento);

        testetpm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e ){
                if(one ==testetpm){
                    new TelaTesteTpm();
                }
            }
        });

        testetpm.setBackground(new Color(147, 112, 219));
        testetpm.setFont(new java.awt.Font("Luthier", Font.PLAIN, 14));
        testetpm.setBounds(100,330,250,40);
        frame.getContentPane().add(testetpm);
        
        

    }
}
        



        

        
    

