package baseball;

public class BaseballTeam {

    //フィールド
    private String name;
    private int win;
    private int lose;
    private int draw;

    //勝率を求めるメッソドgatRate
    public double getRate() {
        double rate = (double)this.win / (double)(this.win + this.lose);
        return rate;
    }

    //各チームの実績を報告するメソッドreport
    public void report() {
        System.out.println(this.name + "の2022年の成績は" + this.win + "勝" + this.lose + "敗" + this.draw + "分、勝率は" + getRate() + "です。");
    }

    //引数なしコンストラクタ
    public static void team() {
    }

    //引数ありコンストラクタ
    public void team(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    /*
    //フィールドに値がセット、その値をゲットできるようにする
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getWin() {
        return win;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getLose() {
        return lose;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getDraw() {
        return draw;
    }
    */

}
