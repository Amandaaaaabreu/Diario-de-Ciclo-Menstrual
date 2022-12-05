
public class CarroCombate extends Carro_herança{
    private final int MAX_ARMAMENTO=100;
    private final int MIN_ARMAMENTO=0;
    private int qtdeArmamento;

public CarroCombate(String nome, int blindagem){
        // SUPER chama o construtor da classe pai;
        // não tenho a necesidade d usar o SUPER neste contexto, pois tudo que é da classe pai tbm é da classe filho
        super(nome); 
        super.setArmamento(true);
        super.setBlindagem(blindagem);
        this.qtdeArmamento=100;

    }

public void setQtdeArmamento(int qtdeArmamento){
    this.qtdeArmamento+=qtdeArmamento;
         if(this.qtdeArmamento > MAX_ARMAMENTO){
            this.qtdeArmamento=MAX_ARMAMENTO;
         }
         if(this.qtdeArmamento < MIN_ARMAMENTO){
            this.qtdeArmamento=MIN_ARMAMENTO;
         }
         
        }
        
public int getQtdeArmamento(){
        return this.qtdeArmamento;
    }

public void atirar(){
    if(this.qtdeArmamento > MIN_ARMAMENTO){
        setQtdeArmamento(-1);
    }
    else{
        System.out.println("Sem Munição");

    }
}

public void info(){
    super.info();
    System.out.printf("Quantidade de munição...:%d%n",this.qtdeArmamento);
   

        } 
 }




