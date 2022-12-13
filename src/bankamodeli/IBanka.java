package bankamodeli;

public interface IBanka {
    final String hostIpAddress ="127.0.0.1";
    public boolean connect(String ipAdress);
    public void payment(double preis,String cardNumber, String expireDate, String cvc);
}
