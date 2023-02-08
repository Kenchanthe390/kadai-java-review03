package baseball;

public class Review03 {

    public static void main(String[] args) {

       BaseballTeam yakuruto = new BaseballTeam();
       BaseballTeam dena = new BaseballTeam();
       BaseballTeam tigers = new BaseballTeam();
       BaseballTeam giants = new BaseballTeam();
       BaseballTeam carp = new BaseballTeam();
       BaseballTeam dragons = new BaseballTeam();

       yakuruto.team("東京ヤクルトスワローズ", 80, 59, 4);
       yakuruto.report();

       dena.team("横浜DeNAベイスターズ", 73, 68, 2);
       dena.report();

       tigers.team("阪神タイガース", 68, 71, 4);
       tigers.report();

       giants.team("読売ジャイアンツ", 68, 72, 3);
       giants.report();

       carp.team("広島東洋カープ", 66, 74, 3);
       carp.report();

       dragons.team("中日ドラゴンズ", 66, 75, 2);
       dragons.report();
       }

    }

