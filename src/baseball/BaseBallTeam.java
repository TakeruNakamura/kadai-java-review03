package baseball;

public class BaseBallTeam {
    String name;
    int win;
    int lose;
    int draw;

    public BaseBallTeam() {

    }

    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;


    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getWin() {
        return win;
    }

    private void setWin(int win) {
        this.win = win;
    }

    private int getLose() {
        return lose;
    }

    private void setLose(int lose) {
        this.lose = lose;
    }

    private int getDraw() {
        return draw;
    }

    private void setDraw(int draw) {
        this.draw = draw;
    }

    public static double getRate(double win, double lose) {
        double result = win / (win + lose);
        return result;
    }

    public void report() {
        double rate = getRate((double)this.win, (double)this.lose);

        System.out.println(this.name + "の2022年の成績は" + this.win + "勝" + this.lose + "敗" + this.draw + "分、勝率は" + rate + "です。");
    }

}
