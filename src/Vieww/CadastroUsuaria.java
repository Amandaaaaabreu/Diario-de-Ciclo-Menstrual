package Vieww;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.text.ParseException;
import javax.swing.BorderFactory;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import Controle.ControleUsuaria;
import Vieww.*;
import Modelo.*;

public class CadastroUsuaria {

    ControleUsuaria ligando = new ControleUsuaria();


    private JPanel tela = new JPanel();
    private JFrame frame = new JFrame("Tela de Cadastro");

    static Usuaria usuariaCadastrada;

    JLabel tituloprincipal = new JLabel("Cadastro");
    JLabel inserir = new JLabel("Realize seu cadastro abaixo:");
    JLabel nome = new JLabel("Digite seu nome:");
    JLabel cpf = new JLabel("Digite seu CPF:");
    JLabel peso = new JLabel("Digite seu Peso:");
    JLabel data_nascimento = new JLabel("Data de Nascimento:");
    JLabel toma_anticoncepcional = new JLabel("Você toma anticoncepcional? ");
   
    JButton fim = new JButton("Finalizar Cadastro");
    JButton voltar = new JButton("Voltar a tela inicial");

    // campo de texto
    public static JTextField txtnome;
    public static JTextField txtcpf;
    public static JTextField txtpeso;
    public static JTextField txtdata_nascimento;
    public static JTextField txttoma_anticoncepcional;
    

    public static void main(String args[]) {
        new CadastroUsuaria();

    }

    public CadastroUsuaria() {
        initialize();
    }

    public void initialize() {

        // edicao frame tela
        frame = new JFrame();
        frame.setBounds(300,300,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        tela.setBorder(new EmptyBorder(8, 8, 8, 8));
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);

        // edicao tituloPrincipal
        tituloprincipal.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        tituloprincipal.setBounds(180, 30, 600, 50);
        tituloprincipal.setForeground(new java.awt.Color(102, 0, 102));
        frame.getContentPane().add(tituloprincipal);

        // edicao inserir
        inserir.setFont(new java.awt.Font("Luthier", Font.ITALIC, 14));
        inserir.setBounds(20, 80, 600, 50);
        inserir.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(inserir);

        // edicao nome
        nome.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        nome.setBounds(20, 120, 600, 50);
        nome.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(nome);

        // edicao cpf
        cpf.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        cpf.setBounds(20, 150, 600, 50);
        cpf.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(cpf);

        // edicao peso
        peso.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        peso.setBounds(20, 180, 600, 50);
        peso.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(peso);

        // edicao data de nascimento
        data_nascimento.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        data_nascimento.setBounds(20, 210, 600, 50);
        data_nascimento.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(data_nascimento);

        // edicao toma anticoncepcional
        toma_anticoncepcional.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        toma_anticoncepcional.setBounds(20, 240, 600, 50);
        toma_anticoncepcional.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(toma_anticoncepcional);

        // permite apenas numeros no campo cpf e a digitacao especifica

        MaskFormatter tipocpf = null;
        try {
            tipocpf = new MaskFormatter("###.###.### - ##");
        } catch (ParseException ignore) {
            //////
        }
        if (tipocpf != null) {
            tipocpf.setPlaceholderCharacter('.');
        }

        
        MaskFormatter tipodata = null;
		try {
			tipodata = new MaskFormatter("##/##/####");
		} catch (ParseException ignore) {
			//
		}
		if (tipodata != null) {
			tipodata.setPlaceholderCharacter('_');
		}

        // adicionando e editando os campos de texto na minha frame

        // txtcpf
        txtcpf = new JFormattedTextField(tipocpf);
        cpf.setLabelFor(cpf);
        txtcpf.setBounds(130, 170, 278, 23);
        frame.getContentPane().add(txtcpf);

        // txtnome
        txtnome = new JTextField();
        txtnome.setBounds(130, 136, 280, 23);
        frame.getContentPane().add(txtnome);

        // txtpeso
        txtpeso = new JTextField();
        txtpeso.setBounds(130, 198, 280, 23);
        frame.getContentPane().add(txtpeso);

        // txtnascimento
        txtdata_nascimento = new JFormattedTextField(tipodata);
        data_nascimento.setLabelFor(data_nascimento);
        txtdata_nascimento.setBounds(150, 228, 270, 23);
        frame.getContentPane().add(txtdata_nascimento);

        // txtanticoncepcional
        txttoma_anticoncepcional = new JTextField();
        txttoma_anticoncepcional.setBounds(188, 256, 240, 23);
        frame.getContentPane().add(txttoma_anticoncepcional);



        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Object one = e.getSource();
                if(one == voltar){
                    frame.dispose();
                    TelaMenu.main(null);
                }
            }
            
        });

        voltar.setForeground(new java.awt.Color(49, 79, 79));
        voltar.setBackground(new Color(216, 191, 216));
        voltar.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        voltar.setBorder(BorderFactory.createLineBorder(new Color(147, 112, 219), 8));
        voltar.setBounds(120, 385, 250, 40);
        frame.getContentPane().add(voltar);

       
         // editando botao de finaliar cadastro
         fim.setForeground(new java.awt.Color(49, 79, 79));
         fim.setBackground(new Color(216, 191, 216));
         fim.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
         fim.setBorder(BorderFactory.createLineBorder(new Color(147, 112, 219), 8));
         fim.setBounds(120, 330, 250, 40);
         frame.getContentPane().add(fim);


        fim.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

            String avisoErro = ligando.confereCadastro(txtnome.getText(), txtcpf.getText(), txtpeso.getText(), txtdata_nascimento.getText(), txttoma_anticoncepcional.getText());

           
            if (avisoErro == null){
                JOptionPane.showMessageDialog(null, "Preencha todos os dados corretamente!","ERRO",JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(avisoErro.length() > 0){
                JOptionPane.showMessageDialog(null, avisoErro, "ERRO",JOptionPane.ERROR_MESSAGE);
            }
            else { JOptionPane.showConfirmDialog(null,"Deseja Finalizar Cadastro","Finalizar Cadastro",JOptionPane.YES_NO_CANCEL_OPTION);

                Dados.getUsuaria().add(new Usuaria(nome.getText(),cpf.getText(), peso.getText(), data_nascimento.getText(), toma_anticoncepcional.getText()));


                frame.dispose();
                TelaMenu.main(null);
            }

        }

});

}

public static JTextField getTxtNome(){
    return txtnome;
}
public static JTextField getTxtcpf(){
    return txtcpf;
}
public static JTextField getTxtPeso(){
    return txtpeso;
}
public static JTextField getTxtDataNascimento(){
    return txtdata_nascimento;
}
public static JTextField getTxtTomaAnticoncepcional(){
    return txttoma_anticoncepcional;
}


}














