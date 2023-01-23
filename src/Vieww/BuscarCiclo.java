package Vieww;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Vieww.CadastroCiclo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BuscarCiclo {

    private JFrame frame;
    private JTextField txtnumero;

    JLabel titulo = new JLabel("Ciclos");
    JLabel titulo1 = new JLabel("Digite o número do ciclo que deseja buscar:");
    JButton buscar = new JButton("Buscar");

public static void main(String args[]){
    new BuscarCiclo();
}

public BuscarCiclo(){
    initialize();
}

private void initialize(){

        frame = new JFrame();
        frame.setBounds(300,300,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);

        titulo.setForeground(new Color(240,92,138));
		titulo.setFont(new Font("Didot", Font.PLAIN, 45));
		titulo.setBounds(200, 40, 600, 50);
		frame.getContentPane().add(titulo);

        titulo1.setForeground(Color.BLACK);
		titulo1.setFont(new Font("Roboto", Font.PLAIN, 20));
		titulo1.setBounds(180, 95, 300, 30);
		frame.getContentPane().add(titulo1);

        txtnumero = new JTextField();
        txtnumero.setColumns(10);
		txtnumero.setBounds(55,190,495,25);
		frame.getContentPane().add(txtnumero);

        buscar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                CadastroCiclo.cicloCadastrado = CadastroCiclo.validarBusca(txtnumero.getText());
                if(CadastroCiclo.txtnumero == null){
                    JOptionPane.showMessageDialog(buscar, "Ciclo não encontrado");
                }
                else{
                    frame.dispose();
                    JOptionPane.showMessageDialog(buscar,"Número :" + CadastrarCiclo.cicloCadastrado.gettxtnumero());
                }
                frame.dispose();
                TelaMenu.main(null);
            }
        });

        buscar.setFont(new Font("Cambria", Font.PLAIN, 11));
		buscar.setBackground(SystemColor.desktop);
		buscar.setBounds(171, 148, 89, 23);
		frame.getContentPane().add(buscar);







}








}