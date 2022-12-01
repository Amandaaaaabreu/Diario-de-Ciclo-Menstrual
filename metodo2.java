
 
 public class metodo2{
    public static void main(String[] args){

        int r;
        msg("teste", 3);
        r=soma(10,5);
        System.out.println(r);   
    }
    
    public static int soma(int n1,int n2){
      int res=n1+n2;
      return res;
    }

    public static void msg(String m, int l){
      for(int i=0;i<l;i++){
          System.out.println(m);
      }
        
    }
  
  }
