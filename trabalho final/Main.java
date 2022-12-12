import java.util.Scanner;

public class Main {
    static Usuaria u1;
    static Fluxo_Menstrual fm;
    static Ciclo cl;
    static Suporte sp;
    static Consulta ct;
    static Aviso av;
    static Sintomas st;

public static void main(String[] args){
        menu();
    }
  public static void menu(){
            Scanner scan = new Scanner (System.in);
            int escolha = 0; 
            System.out.println("Diário de ciclos menstruais - Menu:\n");
            System.out.println("Criar Fluxo Menstrual:" + "Digite 1"+ "\n");
            System.out.println("Verificar estimativa de dias restantes:" + "Digite 2"+ "\n");
            System.out.println("Ligar lembrete de avisos:" + "Digite 3"+ "\n");
            System.out.println("Verificar Sintomas:" + "Digite 4"+ "\n");
            System.out.println("Obter Prontuário:" + "Digite 5"+ "\n");
            System.out.println("Marcar Consulta:" + "Digite 6"+ "\n");
            System.out.println("Sair:" + "Digite 7" + "\n");
            escolha = scan.nextInt();
                if(escolha == 1){
                    fm.Criar_Fluxo_Menstrual();
                    menu();
                }
                else if(escolha == 2){
                    System.out.println("Dias Restantes: " + cl.estim_dias_restantes());
                    menu();
                }
                else if(escolha == 3){
                    av.tomar_anticoncepcional();
                    menu();
                }
                else if(escolha == 4){
                    st.retornar_sintomas();
                    menu();
                }
                else if(escolha == 5){
                    System.out.println(ct.obter_prontuario());
                    menu();
                }
                else if(escolha == 6){
                    if(sp.confirmar_consulta()){
                        System.out.println("Consulta Marcada");
                    }
                    else{
                        System.out.println("Consulta Cancelada");
                    }
                    menu();
                }
                else if(escolha == 7){
                    System.out.println("Saindo do Programa...");
                }
                else{
                    System.out.println("Valor Inválido\n");
                    menu();
                }
    }
}
