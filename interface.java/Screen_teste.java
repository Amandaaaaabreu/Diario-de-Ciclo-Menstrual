
//import javax.swing.DefaultBoundedRangeModel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Screen_teste {
    public static void main(String[] args){

        JFrame principal = new JFrame("Testando"); // novo conteiner
        
        JButton botao = new JButton(); // criando um botão

        botao.setText(" clique "); // add um texto no meu botão

        botao.setFont(new Font("Arial", Font.BOLD, 15) ); // conf do texto que está no botão

        botao.setForeground(new Color(237,241,238));

        botao.setBackground(new Color(24,24,24));

        principal.setSize(600, 500); // tamanho da jframe

        principal.add(botao); // add o botao no frame/conteiner

        botao.setBounds(230, 180, 100, 60);

        principal.setLayout(null);  // editar as medidas a mão 

        principal.setVisible(true);   // deixando visivel

        principal.setResizable(false); // não ter controle do jframe pelo mouse

        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fechar a janela no x 

        

        
        

    

    }

}
    


