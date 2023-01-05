package lambdaexpressions;

public class MainLambda {
    public static void main(String[] args) {
        /**
         * Böylece Lambda Expression formda kisa bir bicimde metotlar ipmlemente edilmis oldu.
         * metotdun gerceklesmesinde blok kullanilirsa, deger döndürülecekse return kullanilmalidir.
         */
        Matematik toplama= (a,b) -> a+b;
        Matematik cikarma = (a,b) -> a-b;
        Matematik carpma = (a,b) -> a*b;
        Matematik bölme = (a,b)->{
            if(b==0) b=1;
            return a/b;
        };
        Matematik selamVer= (a,b)->{
             System.out.println("sselam " + a + " Selam " + b);
             return 0;
        };
        System.out.println(toplama.transaction(3,2));
        selamVer.transaction(2,3);
    }
}
