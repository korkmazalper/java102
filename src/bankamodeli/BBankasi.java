package bankamodeli;

public class BBankasi implements IBanka{
    private String bankaAdi;
    private String terminalId;
    private String password;

    public BBankasi(String bankaAdi, String terminalId, String password) {
        this.bankaAdi = bankaAdi;
        this.terminalId = terminalId;
        this.password = password;
    }



    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean connect(String ipAdress) {
        System.out.println("Kullanici ip:" + ipAdress);
        System.out.println("Makina ip:" + this.hostIpAddress);
        System.out.println(this.getBankaAdi() + " baglantisi hazir !");
        return true;
    }

    @Override
    public void payment(double preis, String cardNumber, String expireDate, String cvc) {

    }
}
