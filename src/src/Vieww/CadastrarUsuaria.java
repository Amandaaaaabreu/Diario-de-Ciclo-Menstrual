package src.Vieww;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import Modelo.Dados;
import Modelo.Usuaria;
import View.ControleCadastrarUsuaria;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class CadastrarUsuaria implements ActionListener {

    ControleCadastrarUsuaria controller = new ControleCadastrarUsuaria ();
    private JPanel painel = new JPanel();
    private JFrame janela1 = new JFrame();
    private JFrame texto = new JFrame("Realizar Cadastro");
    JLabel complete = new JLabel("Complete seus dados abaixo");
      //Criando o botão ENVIAR
    JButton enviar = new JButton("Enviar");


    // rotulos
    nomLabel = new JLabel("Digite seu nome completo: ");
    cpfJLabel = new JLabel("Digite seu CPF: ");
    pesoLabel = new JLabel("Digite seu peso: ");
    data_nscimentoLabel= new JLabel("Digite sua data de nascimento: ");
    toma_anticoncepcionLabel = new JLabel("Faz uso de algum anticoncepcional? ");
    lembreteLabel = new JLabel("Caso faça uso de algum metodo contraceptivo, deseja receber um alerta para lembrar de tomá-lo? ");
    JButton check = new JButton("Cadastrar");


    // criando os campos de texto
    JTextField nome = new JTextField();
    JTextField cpf = new JTextField();
    JTextField peso = new JTextField();
    JTextField data_nascimento = new JTextField();
    JTextField toma_anticoncepcional = new JTextField();
    JTextField lembrete = new JTextField(); 

    public static JTextField nome1;
    public static JTextField cpf1;
    public static JTextField peso1;
	public static JFormattedTextField nascimento;
    public static JTextField anticoncepcional;
    public static JTextField lembrete1;

   
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try{
                    CadastrarUsuaria janela = new CadastrarUsuaria();
                    janela.janela1.setVisible(true);
                } 
                catch (Exception c){
                    c.printStackTrace();
                }
            }
      });
  
    } 

public CadastrarUsuaria(){

    //Definindo o local e tamanho de cada botao
   janela1.setBounds(150,150,600,600);
   janela1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   janela1.getContentPane();
   janela1.setLayout(null);
   janela1.setSize(700,300);
   painel.setBorder(new EmptyBorder(5, 5, 5, 5));
   janela1.setContentPane(painel);
   painel.setBorder(new EmptyBorder(7, 7, 5, 5));


   janela1.setLayout(null);
   janela1.setVisible(true);

   texto.setForeground(new Color(0,0,0)); // preto
   texto.setFont(new Font("Times",Font.PLAIN,50));
   texto.setBounds(200, 40, 600, 50);
   texto.setBackground(new Color(135, 206, 250)); // tom de azul chamado LightSkyBlue
   janela1.getContentPane().add(texto);

   complete.setForeground(Color.BLACK);
   complete.setFont(new Font("Times",Font.PLAIN, 22));
   complete.setBounds(180, 95, 300, 30);
   janela1.getContentPane().add(complete);

   nome.setFont(new Font("Times", Font.PLAIN, 18));
   nome.setBounds(150,10,330,30);
   janela1.getContentPane().add(nome);

   cpf.setFont(new Font("Times", Font.PLAIN,18));
   cpf.setBounds(150,40,330,30);
   janela1.getContentPane().add(cpf);

   peso.setFont(new Font("Times",Font.PLAIN,18));
   peso.setBounds(150,70,125,30);
   janela1.getContentPane().add(peso);

   data_nascimento.setFont(new Font("Times",Font.PLAIN,18));
   data_nascimento.setBounds(150,100,125,30);
   janela1.getContentPane().add(data_nascimento);

   toma_anticoncepcional.setFont(new Font("Times",Font.PLAIN,18));
   toma_anticoncepcional.setBounds(150,80,150,30);
   janela1.getContentPane().add(toma_anticoncepcional);

   lembrete.setFont(new Font("Times",Font.PLAIN,18));
   lembrete.setBounds(10,50,150,30);
   janela1.getContentPane().add(lembrete);

   enviar.setFont(new Font("Times",Font.PLAIN,30));
   enviar.setBounds(200,150,150,30);
   enviar.setBackground(new Color(70, 130, 180)); //SteelBlue
   janela1.getContentPane().add(enviar);
   

   //Captura evento ao clicar no botão ENVIAR
   enviar.addActionListener(this);

   MaskFormatter mascaraData = null;
		try {
			mascaraData = new MaskFormatter("##/##/####");
		} catch (ParseException ignore) {
			//
		}
		if (mascaraData != null) {
			mascaraData.setPlaceholderCharacter('_');
		}

       nome1 = new JTextField();
       nome1.setBounds(10,10,150,30);
       janela1.getContentPane().add(nome1);

       cpf1 = new JTextField();
       cpf1.setBounds(10,40,150,30);
       janela1.getContentPane().add(cpf1);

       peso1 = new JTextField();
       peso1.setBounds(10,40,150,30);
       janela1.getContentPane().add(peso1);

       nascimento = new JFormattedTextField();
       data_nascimento.setLabelFor(data_nascimento);
       janela1.add(nascimento);

       anticoncepcional = new JTextField();
       anticoncepcional.setBounds(10,60,150,30);
       janela1.getContentPane().add(anticoncepcional);

       lembrete1 = new JTextField();
       lembrete1.setBounds(10,80,150,30);
       janela1.getContentPane().add(lembrete1);

      // verificando os dados que o usuario irá responder
       enviar.addActionListener(new ActionListener() {

        @SuppressWarnings("deprecation")
        public void actionPerformed(ActionEvent c) {
     
	   String msgErro = controller.verificandoCadastro(nome.getText(),cpf.getText(),peso.getText(),data_nascimento.getText(), toma_anticoncepcional.getText(),lembrete.getText());
       

		if (msgErro == null) {
				JOptionPane.showMessageDialog(null, "Preencha todos os campos!",
						"Falta de dados",
						JOptionPane.ERROR_MESSAGE);
					      return;
				}

		if (msgErro.length() > 0) {
				JOptionPane.showMessageDialog(null, msgErro, "ERRO", JOptionPane.ERROR_MESSAGE);

		} 
        
        else {
				JOptionPane.showMessageDialog(null, "Confirmar Cadastro", "Finalizar Cadastro ",
						JOptionPane.DEFAULT_OPTION);

					Dados.getUsuaria().add(new Usuaria(nome.getText(),cpf.getText(), peso.getText(), data_nascimento.getText(),toma_anticoncepcional.getText(),lembrete.getText()));

				
				janela1.dispose();
			    TelaLogando.main(null);
				}
				
			}
			
		});

		
				
	}

	public static JTextField getNome() {
		return nome1;
	}

	public static JTextField getCpf() {
		return cpf1 ;
	}

	public static JTextField getPeso() {
		return peso1;
	}

	public static JFormattedTextField getData_Nascimento() {
		return nascimento;
	}

    public static JTextField getToma_Anticoncepcional(){
        return anticoncepcional;
    }

    public static JTextField getLembrete(){
        return lembrete1;
    }



}
    


}

@Override
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    
}

}
























/* 
public class CadastrarUsuaria implements ActionListener {
    JLabel nomLabel, cpfJLabel, pesoLabel, data_nscimentoLabel, toma_anticoncepcionLabel, lembreteLabel;
    JTextField nome, cpf, peso, data_nascimento, toma_anticoncepcional, lembrete;
    JButton enviar;

    CadastrarUsuaria(){
        JFrame janela = new JFrame("Realizar Cadastro");
        janela.setLayout(null);
        janela.setSize(700,300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // criando os rotulos
        nomLabel = new JLabel("Digite seu nome completo: ");
        cpfJLabel = new JLabel("Digite seu CPF: ");
        pesoLabel = new JLabel("Digite seu peso: ");
        data_nscimentoLabel= new JLabel("Digite sua data de nascimento: ");
        toma_anticoncepcionLabel = new JLabel("Faz uso de algum anticoncepcional? ");
        lembreteLabel = new JLabel("Caso faça uso de algum metodo contraceptivo, deseja receber um alerta para lembrar de tomá-lo? ");


        // criando os campos de texto 
        nome = new JTextField();
        cpf = new JTextField();
        peso = new JTextField();
        data_nascimento = new JTextField();
        toma_anticoncepcional = new JTextField();
        lembrete = new JTextField(); 

        //Criando o botão ENVIAR
       JButton enviar = new JButton("Enviar");

       //Definindo o local e tamanho de cada botao
       nomLabel.setBounds(10,10,150,30);
       nome.setBounds(150,10,330,30);
       cpfJLabel.setBounds(10,40,150,30);
       cpf.setBounds(150,40,330,30);
       pesoLabel.setBounds(10,70,150,30);
       peso.setBounds(150,70,125,30);
       data_nascimento.setBounds(10,100,150,30);
       data_nscimentoLabel.setBounds(150,100,125,30);
       toma_anticoncepcional.setBounds(10,60,150,30);
       toma_anticoncepcionLabel.setBounds(150,80,150,30);
       lembrete.setBounds(10,50,150,30);
       lembreteLabel.setBounds(10,80,150,30);
       enviar.setBounds(200,150,150,30);

       // adicionando os componenetes no conteiner
       janela.add(nomLabel);
       janela.add(nome);
       janela.add(cpfJLabel);
       janela.add(cpf);
       janela.add(pesoLabel);
       janela.add(peso);
       janela.add(data_nscimentoLabel);
       janela.add(data_nascimento);
       janela.add(toma_anticoncepcionLabel);
       janela.add(toma_anticoncepcional);
       janela.add(lembreteLabel);
       janela.add(lembrete);


       //Monstrando p frame/janela pronta
       janela.setVisible(true);

       //Captura evento ao clicar no botão ENVIAR
       enviar.addActionListener(this);

    }
    
   
            

        }
 */