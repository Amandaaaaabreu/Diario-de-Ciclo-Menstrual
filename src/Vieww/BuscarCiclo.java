package Vieww;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Vieww.CadastroCiclo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Modelo.Ciclo;
import Modelo.Dados;

/**
 * BuscarCiclo
 * Busca o ciclo quando a usuaria solicita e escreve seu nome.
 * @author Amanda 
 * @version 1.0
 * @since 2022
 */

public class BuscarCiclo {

    private JPanel tela = new JPanel();
    private JFrame frame = new JFrame("Informações");

    JLabel nome = new JLabel("Nome: ");
    JLabel cpf = new JLabel("CPF: ");

    JLabel inserir = new JLabel("Informações do seu Ciclo ");
    
    JLabel data_nascimento = new JLabel("Data de Nascimento: ");
    JLabel toma_anticoncepcional = new JLabel("Toma anticoncepcional: ");
    JLabel inicio_menstruacao = new JLabel("Data de inicio da sua menstruação: ");
    JLabel fim_menstruacao = new JLabel("Data do fim da sua menstruação: ");
    JLabel media_ciclo = new JLabel("Duração do Ciclo: ");
    //JLabel numero = new JLabel("Digite um id de verificação:");

    JButton verificarAtendimento = new JButton("Verificar Atendimento");
    JButton verificarSintomas = new JButton("Verificar Sintomas");
    JButton voltar = new JButton("Voltar pra tela de Menu");

    public static JTextField txtnome;
    public static JTextField txtcpf;
    public static JTextField txtdata_nascimento;
    public static JTextField txttoma_anticoncepcional;
    public static JTextField txtinicio_menstruacao;
    public static JTextField txtfim_menstruacao;
    public static JTextField txtmedia_ciclo;
    public static JTextField txtnumero;


    /*JLabel titulo = new JLabel("Ciclos");
    JLabel titulo1 = new JLabel("Digite o número do ciclo que deseja buscar:");
    JButton buscar = new JButton("Buscar");
    JButton editar = new JButton("Editar Ciclo");*/

public static void main(String args[], int index){
    new BuscarCiclo(index);
}

    /**
     * Criando o software.
    */

public BuscarCiclo(int index){
    initialize(index);
}

    /**
     * Inicia e implementa os componentes no conteiner.
    */

private void initialize(int index){
        Ciclo ciclo = Dados.getCiclo().get(index);
        frame = new JFrame();
        frame.setBounds(300, 300, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        tela.setBorder(new EmptyBorder(8, 8, 8, 8));
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);

        inserir.setFont(new java.awt.Font("Times New Roman", 1, 28));
        inserir.setBounds(83, 60, 600, 50);
        inserir.setForeground(new java.awt.Color(102, 0, 102));;
        frame.getContentPane().add(inserir);

        
        // edicao nome
        nome.setText(nome.getText() + ciclo.getNome());
        nome.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        nome.setBounds(20, 131, 600, 50);
        nome.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(nome);

        // edicao cpf
        cpf.setText(cpf.getText() + ciclo.getCpf());
        cpf.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        cpf.setBounds(20, 159, 600, 50);
        cpf.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(cpf);


        // edicao data de nascimento
        data_nascimento.setText(data_nascimento.getText() + ciclo.getData_Nascimento());
        data_nascimento.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        data_nascimento.setBounds(20, 185, 600, 50);
        data_nascimento.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(data_nascimento);

        // edicao toma anticoncepcional
        toma_anticoncepcional.setText(toma_anticoncepcional.getText() + ciclo.getToma_Anticoncepcional());
        toma_anticoncepcional.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        toma_anticoncepcional.setBounds(20, 212, 600, 50);
        toma_anticoncepcional.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(toma_anticoncepcional);

        inicio_menstruacao.setText(inicio_menstruacao.getText() + ciclo.getInicio_Menstruacao());
        inicio_menstruacao.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        inicio_menstruacao.setBounds(20, 240, 600, 50);
        inicio_menstruacao.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(inicio_menstruacao);

        fim_menstruacao.setText(fim_menstruacao.getText() + ciclo.getFim_Menstruacao());
        fim_menstruacao.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        fim_menstruacao.setBounds(20, 270, 600, 50);
        fim_menstruacao.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(fim_menstruacao);

        media_ciclo.setText(media_ciclo.getText() + ciclo.getDuracao_Ciclo());
        media_ciclo.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        media_ciclo.setBounds(20, 300, 600, 50);
        media_ciclo.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(media_ciclo);

        verificarAtendimento.setFont(new java.awt.Font("Luthier", Font.PLAIN, 14));
        verificarAtendimento.setBackground(new Color(147, 112, 219));
        verificarAtendimento.setBounds(50, 360, 180, 40);
        frame.getContentPane().add(verificarAtendimento);

        verificarSintomas.setBackground(new Color(147, 112, 219));
        verificarSintomas.setFont(new java.awt.Font("Luthier", Font.PLAIN, 14));
        verificarSintomas.setBounds(245,360,180,40);
        frame.getContentPane().add(verificarSintomas);

        verificarAtendimento.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Object obj = e.getSource();
                if (obj == verificarAtendimento) {
                    BuscarAtendimento.main(null, index);
                }
            }
        });

        verificarSintomas.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Object obj = e.getSource();
                if (obj == verificarSintomas) {
                    BuscarSintomas.main(null, index);
                }
            }
        });

        voltar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Object obj = e.getSource();
                if (obj == voltar) {
                    TelaMenu.main(null);
                }

            }

        });

        voltar.setBackground(new Color(147, 112, 219));
        voltar.setFont(new java.awt.Font("Luthier", Font.PLAIN, 14));
        voltar.setBounds(156,410,195,40);
        frame.getContentPane().add(voltar);



        //////////////////////////////////////////////////////////////////////////////////////////////

        

}






}