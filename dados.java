package Java;
import java.util.Scanner;

public class dados {
    public static void main(String[] args) {

        try (Scanner entr = new Scanner(System.in)) {
            int n1=0;
            int n2=0;
            int res=0;
            String nome="";

            System.out.println("Digite seu nome:");
            nome=entr.nextLine();
            System.out.println("Digite um numeral:");
            n1=entr.nextInt();
            System.out.println("Digite outro numeral:");
            n2=entr.nextInt();
            res=n1+n2;
            System.out.printf("%s a soma de %d com %d e igual a %d.",nome,n1,n2,res);
        }
    }
}
