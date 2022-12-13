package bankamodeli;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Tutar giriniz: ");
        double price=sc.nextDouble();

        System.out.println("Kart Numarasi: ");
        String cardNumber=sc.next();

        System.out.println("Son kullanim tarihi:");
        String date=sc.next();

        System.out.println("Güvenlik kodu:");
        String cvc=sc.next();
        System.out.println("1. A Bankasi");
        System.out.println("2. B Bankasi");
        System.out.println("3. C Bankasi");
        System.out.println("?======================");
        System.out.println("Banka Seciniz(1-3):");
        int selectBank=sc.nextInt();
        switch (selectBank){
            default:
                System.out.println("Gecerli bir secim giriniz !");
                break;
            case 1:
                ABankasi aPos= new ABankasi("A Bankasi","123453433","1234567");
                aPos.connect("127.1.1.1");
                aPos.payment(price,cardNumber,date,cvc);
                break;
        case 2:
                BBankasi bPos= new BBankasi("A Bankasi","123453433","1234567");
                bPos.connect("10.23.123.2");
                bPos.payment(1232,"123123132123","232323","213");
                break;
        }
    }
}
