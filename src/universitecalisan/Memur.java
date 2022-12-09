package universitecalisan;

public class Memur extends Calisan{
    private String departman;
    private String mesai;

    public Memur(String adSoyad, String telefon, String eposta) {
        super(adSoyad, telefon, eposta);
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }

    public void calis(){}
}
