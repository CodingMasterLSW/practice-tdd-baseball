package baseball.view;

public class OutputView {

    public static final String START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    public static final String NUMBER_INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    public static final String RESTART_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    public static final String END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    public static final String RESULT_MESSAGE = "%d 볼 %d 스트라이크";
    public static final String NOT_CONTAINS_BALL_MESSAGE = "%d 스트라이크";

    public void startMessage() {
        System.out.println(START_MESSAGE);
    }

    public void numberInputMessage() {
        System.out.print(NUMBER_INPUT_MESSAGE);
    }

    public void restartMessage() {
        System.out.println(RESTART_MESSAGE);
    }

    public void endMessage() {
        System.out.println(END_MESSAGE);
    }

    public void gameResultMessage(int[] arr) {
        if (arr[0] == 0 && arr[0] != 3) {
            System.out.printf(NOT_CONTAINS_BALL_MESSAGE, arr[1]);
            return;
        }
        System.out.printf(RESULT_MESSAGE, arr[0], arr[1]);
    }

}
