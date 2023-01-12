package fixturefinale;

public class Week {
    int weekNo;
    Play play;

    public Week(int weekNo, Play play) {
        this.weekNo = weekNo;
        this.play = play;
    }

    public int getWeekNo() {
        return weekNo;
    }

    public void setWeekNo(int weekNo) {
        this.weekNo = weekNo;
    }

    public Play getPlay() {
        return play;
    }

    public void setPlay(Play play) {
        this.play = play;
    }

    @Override
    public String toString() {
        return "Week{" +
                "weekNo=" + weekNo +
                ", play=" + play +
                '}';
    }
}
