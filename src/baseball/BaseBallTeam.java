package baseball;

public class BaseBallTeam {

    //フィールド
    private String name;
    private int win;
    private int lose;
    private int draw;

    //勝率を求めるメソッド（gatRate）
    public double getRate() {
        double rate = (double)win / (double)(win + lose);
        return rate;
    }

    //各チームの成績を報告するメソッド（report）
    public void report() {
        System.out.println(name + "の2022年の成績は" + win + "勝" + lose + "敗" + draw + "分、勝率は" + getRate() + "です。");
    }

    //引数なしコンストラクタ
    public BaseBallTeam() {
        name = "未設定";
        win = 0;
        lose = 0;
        draw = 0;
    }

    //引数ありコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    //フィールドに値の設定と取得ができるようにする
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

}
