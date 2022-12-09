package universitecalisan;

public class Main {
    public static void main(String[] args) {
        Calisan calisan=new Calisan("Alper","+87458745874","aer@fg.tr");
        AkademikPersonel akademikPersonel= new AkademikPersonel("Selma Günay","+985647855","selma@belma.gov");
        Memur memur1= new Memur("Casted Memur","+658471542","aasd@tr.tr");
        Memur memur2= new Memur("Semih Kurt","+985745412","posta@mosta.com");
        memur1.setDepartman("Mutfak");
        memur2.setDepartman("Kalorifer");

        System.out.println(memur2.getDepartman());
        System.out.println(memur1.getDepartman());

    }
}
