/** 
 
 */

package Vieww;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Controle.*;
import Modelo.Ciclo;
//import Vieww.*;
import Modelo.Dados;
//import Modelo.*;


public class TelaMenu {
    private JFrame frame;
    JLabel inicial = new JLabel("Diário  de Ciclo Menstrual");
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

        //Dados.getCiclo().add(new Ciclo("Pedro", "058.440.181-76", "25/05/2001","20/20/2020", "20/21/2121","25/26/2020","5", "10"));

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
        atendimento.setBounds(100,250,250,40);
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
        testetpm.setBounds(100,320,250,40);
        frame.getContentPane().add(testetpm);
        
        

    }
}
        



        

        
    

