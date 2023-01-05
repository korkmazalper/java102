package enums;

public enum Day {

       PAZARTESI(1), SALI(2), CARSAMBA(3),PERSEMBE(4), CUMA(5),CUMARTESI(6),PAZAR(7);


    int day;
    Day(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
