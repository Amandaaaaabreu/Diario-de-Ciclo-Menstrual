package src.Vieww;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.*;

    public class TelaMenu implements ActionListener {
      private static JFrame janela;
      private static JButton usuaria;
      private static JButton ciclo;
      private static JButton atendimento;
      private static JButton tpm;



   public TelaMenu(){
        // estilo do frame
        
        janela.setLayout(null);  // editar as medidas a mão
        janela.setSize(600, 500);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fechar a jabela no x */
        janela.setResizable(false);  // não ter controle do tamanho do frame pelo mouse
        janela.setFont(new Font("Arial", Font.BOLD, 15) ); 
        janela.setForeground(new Color(237,241,238));
        janela.setBackground(new Color(24,24,24)); 

        //Cria os rotulos
        JButton usuaria = new JButton("Editar Usuaria "); 
        JButton ciclo = new JButton("Cadastrar Ciclo");
        JButton atendimento = new JButton("Realizar Atendimento");
        JButton tpm = new JButton("Realizar Teste TPM");
        
        // Definindo o local e tamanho de cada botão
        usuaria.setBounds(150,10,330,30);
        ciclo.setBounds(150,40,330,30);
        atendimento.setBounds(150,70,125,30);
        tpm.setBounds(150,100,125,30);

        // adicionando os componentes no conteiner/frame
        janela.add(usuaria);
        janela.add(ciclo);
        janela.add(atendimento);
        janela.add(tpm);

        // Monstrando o frame construido
        janela.setVisible(true);

    }

    public static void main (String args[]){
        TelaMenu testando = new TelaMenu();
        usuaria.addActionListener(testando);
    }

    public void actionPerformed(ActionEvent e){
        System.out.println("Realizar Cadastro");
    }

   
}
































        
        /*
        janela.setFont(new Font("Arial", Font.BOLD, 15) ); 
        janela.setForeground(new Color(237,241,238));
        janela.setBackground(new Color(24,24,24)); 
        janela.setLayout(null);  // editar as medidas a mão
        janela.setResizable(false);  // não ter controle do tamanho do frame pelo mouse
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fechar a jabela no x 
        janela.add(titulo);
        janela.add(usuaria);
        janela.add(ciclo);
        janela.add(atendimento);
        janela.add(tpm);
        usuaria.setVisible(true);
 
public class TelaMenu implements ActionListener {

    private JFrame tela;

    JLabel titulo = new JLabel ("Diário de Ciclo Menstrual");
    JButton usuaria = new JButton("Editar Usuaria "); 
    JButton ciclo = new JButton("Cadastrar Ciclo");
    JButton atendimento = new JButton("Realizar Atendimento");
    JButton tpm = new JButton("Realizar Teste TPM");
    //public static ControleDados dados = new ControleDados();
    tela = new JFrame();
    tela.setBounds(300,300,600,600);
    tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fechar a jabela no x 
    tela.setLayout(null);  // editar as medidas a mão
    tela.getContentPane();
    tela.setFont(new Font("Arial", Font.BOLD, 15) ); 
    tela.setForeground(new Color(237,241,238));
    tela.setBackground(new Color(24,24,24));
    tela.setSize(600, 500);
    tela.setResizable(false);  // não ter controle do tamanho do frame pelo mouse
}


      






*/








/* public TelaMenu (){

    tela = new JFrame();
    tela.setBounds(300,300,600,600);
    tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fechar a jabela no x 
    tela.setLayout(null);  // editar as medidas a mão
    tela.getContentPane();
    tela.setFont(new Font("Arial", Font.BOLD, 15) ); 
    tela.setForeground(new Color(237,241,238));
    tela.setBackground(new Color(24,24,24));
    tela.setSize(600, 500);
    tela.setResizable(false);  // não ter controle do tamanho do frame pelo mouse
 */

   
        



        

        
    

