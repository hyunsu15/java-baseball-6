package baseball;

public class BaseBallUI {
    private static final String START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String PLAYING_MESSAGE = "숫자를 입력해주세요 : ";


    void gameStart() {
        System.out.println(START_MESSAGE);
    }

    void playing() {
        System.out.println(PLAYING_MESSAGE);
    }
}
