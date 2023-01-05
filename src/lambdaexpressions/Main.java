package lambdaexpressions;

public class Main {
    public static void main(String[] args) {
        /**
         * Asagidaki form anaonym siniflar olarak anilir. bu nesnelerin metotlari aslinda lambda expressionlarla basitce olusturulabilirler.
         */
        Matematik toplama = new Matematik() {
            @Override
            public int transaction(int a, int b) {
                return a+b;
            }
        };
        Matematik cikarman = new Matematik() {
            @Override
            public int transaction(int a, int b) {
                return a-b;
            }
        };
        Matematik carpma = new Matematik() {
            @Override
            public int transaction(int a, int b) {
                return a*b;
            }
        };
        System.out.println(toplama.transaction(2,1));
        System.out.println(cikarman.transaction(2,1));
        System.out.println(carpma.transaction(2,1));
    }
}
