package Vieww;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Modelo.Atendimento;
import Modelo.Dados;


public class BuscarAtendimento {

    private JPanel tela = new JPanel();
    private JFrame frame = new JFrame("Atendimento");

    JLabel titulo =  new JLabel("Verifique os Resultados do seu Atendimento:");
    

    JLabel fluxo_vaginal = new JLabel("Fluxo Vaginal: ");
    JLabel sensibilidade = new JLabel("Sensibilidade: ");
    JLabel toma_remedio = new JLabel("Toma Remédio: ");
    JLabel medicamento_receitado = new JLabel("Remédios: ");
    JLabel doencas = new JLabel("Doenças: ");

    //JButton finalizar = new JButton("Finalizar Atendimento");

    public static void main(String args[], int index){
        new BuscarAtendimento(index);
    }
    
    public BuscarAtendimento(int index){
        initialize(index);
    }
    
    private void initialize(int index){
        Atendimento atendimento = Dados.getCiclo().get(index).getAtendimento();
        frame = new JFrame();
        frame.setBounds(300,300,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        tela.setBorder(new EmptyBorder(8, 8, 8, 8));
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);

        titulo.setFont(new java.awt.Font("Times New Roman", 1, 28));
        titulo.setBounds(53, 30, 600, 50);
        titulo.setForeground(new java.awt.Color(102, 0, 102));
        frame.getContentPane().add(titulo);

        fluxo_vaginal.setText(fluxo_vaginal.getText() + atendimento.getFluxo_Vaginal());
        fluxo_vaginal.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        fluxo_vaginal.setBounds(20, 120, 600, 50);
        fluxo_vaginal.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(fluxo_vaginal);

        sensibilidade.setText(sensibilidade.getText() + atendimento.getSensibilidade());
        sensibilidade.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        sensibilidade.setBounds(20, 148, 600, 50);
        sensibilidade.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(sensibilidade);

        toma_remedio.setText(toma_remedio.getText() + atendimento.getToma_Remedio());
        toma_remedio.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        toma_remedio.setBounds(20, 180, 600, 50);
        toma_remedio.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(toma_remedio);

        medicamento_receitado.setText(medicamento_receitado.getText() + atendimento.getMedicam_Receitado());
        medicamento_receitado.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        medicamento_receitado.setBounds(20, 210, 600, 50);
        medicamento_receitado.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(medicamento_receitado);

        doencas.setText(doencas.getText() + atendimento.getDoencas());
        doencas.setFont(new java.awt.Font("Luthier", Font.PLAIN, 13));
        doencas.setBounds(20, 240, 600, 50);
        doencas.setForeground(new java.awt.Color(49, 79, 79));
        frame.getContentPane().add(doencas);

        
    }
}
