package Vieww;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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


import Controle.ControleCadastrarCiclo;
import Modelo.Ciclo;
import Modelo.Dados;

public class CadastroCiclo {

    static Ciclo cicloCadastrado;

    ControleCadastrarCiclo ligando = new ControleCadastrarCiclo();

    private JPanel tela = new JPanel();
    private JFrame frame = new JFrame("Tela de Cadastro Ciclo");

    JLabel titulo = new JLabel("Cadastro do Ciclo");
    JLabel inserir = new JLabel("Realize seu Cadastro abaixo:");

    JLabel nome = new JLabel("Digite seu nome:");
    JLabel cpf = new JLabel("Digite seu CPF:");
    
    JLabel data_nascimento = new JLabel("Data de Nascimento:");
    JLabel toma_anticoncepcional = new JLabel("Você toma anticoncepcional? ");
    JLabel inicio_menstruacao = new JLabel("Data de inicio da sua menstruação:");
    JLabel fim_menstruacao = new JLabel("Data do fim da sua menstruação:");
    JLabel media_ciclo = new JLabel("Em média, seu ciclo dura quantos dias? ");
    JLabel numero = new JLabel("Digite um id de verificação:");

    JButton fim = new JButton("Cadastrar Ciclo");
    static JButton cancelar = new JButton("Tela Inicial");

    public static JTextField txtnome;
    public static JTextField txtcpf;
    public static JTextField txtdata_nascimento;
    public static JTextField txttoma_anticoncepcional;
    public static JTextField txtinicio_menstruacao;
    public static JTextField txtfim_menstruacao;
    public static JTextField txtmedia_ciclo;
    public static JTextField txtnumero;
    


    public static void main(String args[]) {
        new CadastroCiclo();
    }

    public CadastroCiclo() {
        initialize();
    }

    private void initialize() {

        frame = new JFrame();
        frame.setBounds(300, 300, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        tela.setBorder(new EmptyBorder(8, 8, 8, 8));
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);

        titulo.setFont(new java.awt.Font("Times New Roman", 1, 28));
        titulo.setBounds(120, 30, 600, 50);
        titulo.setForeground(new java.awt.Color(102, 0, 102));
        frame.getContentPane().add(titulo);

        inserir.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 14));
        inserir.setBounds(20, 80, 600, 50);
        inserir.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(inserir);


        // edicao nome
        nome.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        nome.setBounds(20, 130, 600, 50);
        nome.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(nome);

        // edicao cpf
        cpf.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        cpf.setBounds(20, 160, 600, 50);
        cpf.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(cpf);


        // edicao data de nascimento
        data_nascimento.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        data_nascimento.setBounds(20, 190, 600, 50);
        data_nascimento.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(data_nascimento);

        // edicao toma anticoncepcional
        toma_anticoncepcional.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        toma_anticoncepcional.setBounds(20, 215, 600, 50);
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


        inicio_menstruacao.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        inicio_menstruacao.setBounds(20, 240, 600, 50);
        inicio_menstruacao.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(inicio_menstruacao);

        fim_menstruacao.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        fim_menstruacao.setBounds(20, 270, 600, 50);
        fim_menstruacao.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(fim_menstruacao);

        media_ciclo.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        media_ciclo.setBounds(20, 300, 600, 50);
        media_ciclo.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(media_ciclo);

        numero.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        numero.setBounds(20, 330, 600, 50);
        numero.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(numero);


        
        // txtcpf
        txtcpf = new JFormattedTextField(tipocpf);
        cpf.setLabelFor(cpf);
        txtcpf.setBounds(120, 175, 345, 23);
        frame.getContentPane().add(txtcpf);

        // txtnome
        txtnome = new JTextField();
        txtnome.setBounds(120, 145, 345, 23);
        frame.getContentPane().add(txtnome);

        
        // txtnascimento
        txtdata_nascimento = new JFormattedTextField(tipodata);
        data_nascimento.setLabelFor(data_nascimento);
        txtdata_nascimento.setBounds(140, 205, 170, 23);
        frame.getContentPane().add(txtdata_nascimento);

        // txtanticoncepcional
        txttoma_anticoncepcional = new JTextField();
        txttoma_anticoncepcional.setBounds(188, 230, 276, 21);
        frame.getContentPane().add(txttoma_anticoncepcional);

        //txtinicio_menstruacao
        txtinicio_menstruacao = new JFormattedTextField(tipodata);
        inicio_menstruacao.setLabelFor(inicio_menstruacao);
        txtinicio_menstruacao.setBounds(220, 255, 150, 23);
        frame.getContentPane().add(txtinicio_menstruacao);

        txtfim_menstruacao = new JFormattedTextField(tipodata);
        fim_menstruacao.setLabelFor(fim_menstruacao);
        txtfim_menstruacao.setBounds(212, 285, 160, 23);
        frame.getContentPane().add(txtfim_menstruacao);

        txtmedia_ciclo = new JTextField();
        txtmedia_ciclo.setBounds(247, 315, 215, 23);
        frame.getContentPane().add(txtmedia_ciclo);

        txtnumero = new JTextField();
        txtnumero.setBounds(180, 345, 283, 23);
        frame.getContentPane().add(txtnumero);


        cancelar.setForeground(new java.awt.Color(49, 79, 79));
        cancelar.setBackground(new Color(216, 191, 216));
        cancelar.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        cancelar.setBorder(BorderFactory.createLineBorder(new Color(147, 112, 219), 8));
        cancelar.setBounds(320, 400, 130, 50);
        frame.getContentPane().add(cancelar);

        cancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object one = e.getSource();
                if (one == cancelar) {
                    frame.dispose();
                    TelaMenu.main(null);
                }
            }

        });

       

        fim.setForeground(new java.awt.Color(49, 79, 79));
        fim.setBackground(new Color(216, 196, 216));
        fim.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        fim.setBorder(BorderFactory.createLineBorder(new Color(147, 112, 219), 8));
        fim.setBounds(50, 400, 130, 50);
        frame.getContentPane().add(fim);

        fim.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String avisoErro = ligando.confereCadastro(txtnome.getText(), txtcpf.getText(), txtdata_nascimento.getText(),txttoma_anticoncepcional.getText(), txtinicio_menstruacao.getText(),txtfim_menstruacao.getText(),txtmedia_ciclo.getText(), txtnumero.getText());

                if (avisoErro == null) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os dados corretamente!", "ERRO",
                            JOptionPane.ERROR_MESSAGE);
                    return; 
                }
                if (avisoErro.length() < 0) {
                    JOptionPane.showMessageDialog(null, avisoErro, "ERRO", JOptionPane.ERROR_MESSAGE);
                } else {
                    int ConfirmarCadastro = JOptionPane.showConfirmDialog(null, "Deseja Finalizar Cadastro?", "Finalizar Cadastro",
                            JOptionPane.YES_NO_OPTION);
                    
                    if(ConfirmarCadastro == 0){
                        Dados.getCiclo().add(new Ciclo(txtnome.getText(), txtcpf.getText(), txtdata_nascimento.getText(),txttoma_anticoncepcional.getText(), txtinicio_menstruacao.getText(),txtfim_menstruacao.getText(),txtmedia_ciclo.getText(), txtnumero.getText()));

                        frame.dispose();
                        TelaMenu.main(null);

                    }

                    else{
                        frame.dispose();
                        TelaMenu.main(null);
                    }

                }

            }

        });

    }

    public static JTextField gettxtnome() {
        return txtnome;
    }

    public static JTextField gettxtcpf() {
        return txtcpf;
    }

    public static JTextField gettxtdata_nascimento() {
        return txtdata_nascimento;
    }

    public static JTextField gettxttoma_anticoncepcional() {
        return txttoma_anticoncepcional;
    }

    public static JTextField gettxtnumero() {
        return txtnumero;
    }

    public static JTextField gettxtinicio_menstruacao() {
        return txtinicio_menstruacao;
    }

    public static JTextField gettxtfim_menstruacao() {
        return txtfim_menstruacao;
    }

    public static JTextField gettxtmedia_ciclo() {
        return txtmedia_ciclo;
    }

    public JButton getFim() {
        return fim;
    }

    public static JButton getCancelar() {
        return cancelar;
    }










    // buscar.addActionListener(new ActionListener() {
    /*public void actionPerformed(ActionEvent e) {
        ligando.executarBotao(e.getSource());
        Object src = e.getSource();
        if (src == buscar){
            frame.dispose();
        BuscarCiclo.main(null);
    }

    cicloCadastrado = ControleCadastrarCiclo.validarCadastro(txtnumero.getText());
    
    if(CadastroCiclo.cicloCadastrado==null){

    }

    else
    {
        frame.dispose();
        TelaMenu.main(null);
    }
    }*/

    public static  Ciclo validarBusca(String numero){
        for(Ciclo a : Dados.getCiclo()){
            if(a.getNumero().equals(txtnumero)){
                return a ;
            }
        }
        return null;
    }
}
