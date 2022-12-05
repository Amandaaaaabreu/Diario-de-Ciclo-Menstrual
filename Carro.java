public class Carro {

public static void main(String[] args){

    Carro_herança c1=new Carro_herança("Creta");
    Carro_herança c2=new Carro_herança("HRV");
    Carro_herança c3=new CarroCombate("Leopardo", 30);
    Carro_herança c4=new CarroCombate("Pantera", 100);

    c4.atirar();
    c4.atirar();
    c4.atirar();

    c3.atirar();
    c3.atirar();

    c3.sofrerDano(70);
    c1.sofrerDano(5);


    c1.info();
    c2.info();
    c3.info();
    c4.info();
    
}




}
