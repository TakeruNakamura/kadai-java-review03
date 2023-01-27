package baseball;

public class Review03 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        BaseBallTeam team01 = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        BaseBallTeam team02 = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        BaseBallTeam team03 = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        BaseBallTeam team04 = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        BaseBallTeam team05 = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        BaseBallTeam team06 = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);

        team01.report();
        team02.report();
        team03.report();
        team04.report();
        team05.report();
        team06.report();

    }

}
