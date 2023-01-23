package Vieww;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import Controle.*;
import Modelo.*;
import Vieww.*;
import Modelo.Usuaria;
import Modelo.Dados;


public class TelaEditarCadastro {

    private JFrame frame = new JFrame();

    public JTextField txtnome;
    public JTextField txtcpf;
    public JTextField txtpeso;
    public JTextField txtdata_nascimento;
    public JTextField txttoma_anticoncepcional;
    public JTextField txtlembrete;

    public JLabel editar = new JLabel("Edite seu  Cadastro abaixo");

    public JButton atualizar = new JButton("Atualizar");
    public JButton voltar = new JButton("Voltar a tela inicial");

    public JLabel nome = new JLabel("Digite seu Nome");
    public JLabel cpf = new JLabel("Digite seu CPF:");
    public JLabel peso = new JLabel("Digite seu Peso:");
    public JLabel data_nascimento = new JLabel("Data de Nascimento:");
    public JLabel toma_anticoncepcional = new JLabel("Você toma anticoncepcional? ");
    public JLabel lembrete = new JLabel("Deseja receber um lembrete? ");

    public static void main(String[] args){
        new TelaEditarCadastro();
    }
    

    public TelaEditarCadastro(){
        initialize();
    }
    private void initialize(){

        ControleUsuaria ligando = new ControleUsuaria();

        frame.setBounds(300,300,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);

        editar.setBounds(90, 30, 600, 50);
        editar.setFont(new java.awt.Font("Times New Roman", 1, 28));
        editar.setForeground(new java.awt.Color(102, 0, 102));
        frame.getContentPane().add(editar);

        nome.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        nome.setBounds(20, 120, 600, 50);
        nome.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(nome);

        cpf.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        cpf.setBounds(20, 150, 600, 50);
        cpf.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(cpf);

        peso.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        peso.setBounds(20, 180, 600, 50);
        peso.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(peso);

        data_nascimento.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        data_nascimento.setBounds(20, 210, 600, 50);
        data_nascimento.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(data_nascimento);

        toma_anticoncepcional.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        toma_anticoncepcional.setBounds(20, 240, 600, 50);
        toma_anticoncepcional.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(toma_anticoncepcional);

        lembrete.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        lembrete.setBounds(20, 270, 600, 50);
        lembrete.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(lembrete);

        MaskFormatter tipocpf = null;
        try {
            tipocpf = new MaskFormatter("###.###.### -##");
        } catch (ParseException ignore) {
            //////
        }
        if (tipocpf != null) {
            tipocpf.setPlaceholderCharacter('/');
        }


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
        txtdata_nascimento = new JTextField();
        txtdata_nascimento.setBounds(150, 228, 270, 23);
        frame.getContentPane().add(txtdata_nascimento);

        // txtanticoncepcional
        txttoma_anticoncepcional = new JTextField();
        txttoma_anticoncepcional.setBounds(188, 256, 240, 23);
        frame.getContentPane().add(txttoma_anticoncepcional);

        // txtlembrete
        txtlembrete = new JTextField();
        txtlembrete.setBounds(190, 284, 240, 23);
        frame.getContentPane().add(txtlembrete);


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
        voltar.setBounds(120, 370, 250, 40);
        frame.getContentPane().add(voltar);



        atualizar.setForeground(new java.awt.Color(49, 79, 79));
        atualizar.setBackground(new Color(216, 191, 216));
        atualizar.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        atualizar.setBorder(BorderFactory.createLineBorder(new Color(147, 112, 219), 8));
        atualizar.setBounds(120, 330, 250, 40);
        frame.getContentPane().add(atualizar);


        atualizar.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e ){

                String avisoErro = ligando.confereCadastro(txtnome.getText(), txtcpf.getText(), txtpeso.getText(), txtdata_nascimento.getText(), txttoma_anticoncepcional.getText());

            if(avisoErro == null){
                    JOptionPane.showMessageDialog(null,"Preencha todos os dados","ERRO",JOptionPane.ERROR_MESSAGE);
                    return;
                }

            if(avisoErro.length()>0){
                JOptionPane.showMessageDialog(null, avisoErro, "ERRO", JOptionPane.ERROR_MESSAGE);

                 }
            else{
                JOptionPane.showConfirmDialog(null,"Deseja Finalizar Cadastro","Finalizar Cadastro",JOptionPane.YES_NO_CANCEL_OPTION);

                Dados.getUsuaria().get(Dados.getUsuaria().editarDadosUsuaria(txtnome.getText(),txtcpf.getText(),txtpeso.getText(),txtdata_nascimento.getText(),txttoma_anticoncepcional.getText()));

            }

            }

        });

            }
        



        

        }
       





























/*    atualizar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String erro = controller.confereCadastro(txtnome.getText(), txtcpf.getText(), txtpeso.getText(),
                txtdata_nascimento.getText(), txttoma_anticoncepcional.getText(), txtlembrete.getText());

                if (erro == null) {
                    JOptionPane.showMessageDialog(null, "Preencha corretamente todos os dados.", "Informações Erradas.",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (erro.length() > 0) {
                    JOptionPane.showMessageDialog(null, erro, "Erro", JOptionPane.ERROR_MESSAGE);
                }

                else {
                    JOptionPane.showMessageDialog(null, "Confirmar seu Cadastro?", "Sucesso",
                            JOptionPane.DEFAULT_OPTION);

                    Dados.getUsuaria().get(Dados.getUsuaria().indexOf(CadastroUsuaria.usuariaCadastrada)).editarDados(nome.getText(), cpf.getText(), peso.getText(), data_nascimento.getText());

                    
                
            }
        }
    });
       
}
 */