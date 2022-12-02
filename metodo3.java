public class metodo3 {
    public static void main (String[] args){

        
        atencao("Orientação a Objeto",3);
        System.out.println(soma(10,20,30));
        System.out.println(soma1(1,5,3,9,4));
        System.out.println(soma1(1.8,5.8,3.9,9,4));

    }

    private static char[] soma1(double d, double e, double f, int k, int l) {
        return null;
    }

    private static char[] soma1(double d, int i, int j, int k, int l) {
        return null;
    }

    public static int soma1(int... numeros){ // não precisei criar outro metodo para somar mais de 3 valores.

        int res=0;
    
    for(int n:numeros ){
        res+= n;
    }
        return res;
    }

    public static Double soma1(Double... numeros){ // não precisei criar outro metodo para somar mais de 3 valores.

        Double res=0.0;
    
    for(Double n:numeros ){
        res+= n;
    }
        return res;
    }

    public static int soma(int n1,int n2,int n3){
        int res=n1+n2+n3;
        return res;
       
    }

    public static void atencao(String m, int l){
        for (int i=0;i<l;i++){
            System.out.println(m);
        }
    }
}
