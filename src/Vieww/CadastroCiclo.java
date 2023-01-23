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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import Controle.ControleCadastrarCiclo;
import Modelo.Ciclo;
import Modelo.Dados;

public class CadastroCiclo implements ActionListener {

    static Ciclo cicloCadastrado;

    ControleCadastrarCiclo ligando = new ControleCadastrarCiclo();

    private JPanel tela = new JPanel();
    private JFrame frame = new JFrame("Tela de Cadastro Ciclo");

    JLabel titulo = new JLabel("Cadastro do Ciclo");
    JLabel inserir = new JLabel("Realize seu Cadastro Abaixo");
    JLabel inicio_menstruacao = new JLabel("Data de inicio da sua menstruação:");
    JLabel fim_menstruacao = new JLabel("Data do fim da sua menstruação:");
    JLabel media_ciclo = new JLabel("Em média, seu ciclo dura quantos dias? ");
    JLabel numero = new JLabel("Digite um numero:");

    JButton fim = new JButton("Finalizar Cadastro");
    JButton buscar = new JButton("Buscar Ciclo");

    static JButton cancelar = new JButton("Cancelar");

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

        inserir.setFont(new java.awt.Font("Luthier", Font.ITALIC, 14));
        inserir.setBounds(20, 80, 600, 50);
        inserir.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(inserir);

        inicio_menstruacao.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        inicio_menstruacao.setBounds(20, 120, 600, 50);
        inicio_menstruacao.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(inicio_menstruacao);

        fim_menstruacao.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        fim_menstruacao.setBounds(20, 150, 600, 50);
        fim_menstruacao.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(fim_menstruacao);

        media_ciclo.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        media_ciclo.setBounds(20, 180, 600, 50);
        media_ciclo.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(media_ciclo);

        numero.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        numero.setBounds(20, 210, 600, 50);
        numero.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(numero);


        MaskFormatter tipoespecifico = null;
        try {
            tipoespecifico = new MaskFormatter("##.##.####");
        } catch (ParseException ignore) {
            //////
        }
        if (tipoespecifico != null) {
            tipoespecifico.setPlaceholderCharacter('/');
        }

        txtinicio_menstruacao = new JFormattedTextField(tipoespecifico);
        inicio_menstruacao.setLabelFor(inicio_menstruacao);
        txtinicio_menstruacao.setBounds(225, 136, 235, 23);
        frame.getContentPane().add(txtinicio_menstruacao);

        txtfim_menstruacao = new JFormattedTextField(tipoespecifico);
        fim_menstruacao.setLabelFor(fim_menstruacao);
        txtfim_menstruacao.setBounds(225, 166, 235, 23);
        frame.getContentPane().add(txtfim_menstruacao);

        txtmedia_ciclo = new JTextField();
        txtmedia_ciclo.setBounds(246, 196, 215, 23);
        frame.getContentPane().add(txtmedia_ciclo);

        txtnumero = new JTextField();
        txtnumero.setBounds(125, 227, 336, 23);
        frame.getContentPane().add(txtnumero);

        /*cancelar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Object one = e.getSource();
                if (one == cancelar){
                    frame.dispose();
                   TelaMenu.main(null);
                }
            }
        }); */

        cancelar.setForeground(new java.awt.Color(49, 79, 79));
        cancelar.setBackground(new Color(216, 191, 216));
        cancelar.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        cancelar.setBorder(BorderFactory.createLineBorder(new Color(147, 112, 219), 8));
        cancelar.setBounds(120, 380, 250, 40);
        frame.getContentPane().add(cancelar);

        buscar.setForeground(new java.awt.Color(49, 79, 79));
        buscar.setBackground(new Color(216, 191, 216));
        buscar.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        buscar.setBorder(BorderFactory.createLineBorder(new Color(147, 112, 219), 8));
        buscar.setBounds(120, 330, 250, 40);
        frame.getContentPane().add(buscar);

        fim.setForeground(new java.awt.Color(49, 79, 79));
        fim.setBackground(new Color(216, 196, 216));
        fim.addActionListener(this);
        fim.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        fim.setBorder(BorderFactory.createLineBorder(new Color(147, 112, 219), 8));
        fim.setBounds(120, 280, 250, 40);
        frame.getContentPane().add(fim);

    }

    public static JTextField gettxtmedia_ciclo() {
        return txtmedia_ciclo;
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

    public JButton getFim() {
        return fim;
    }

    public static JButton getCancelar() {
        return cancelar;
    }

    // buscar.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
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
    }

    public static  Ciclo validarBusca(String txtnumero){
        for(Ciclo a : Dados.getCiclo()){
            if(a.getNumero().equals(txtnumero)){
                return a ;
            }
        }
        return null;
    }
}
