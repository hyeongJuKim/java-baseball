package baseball.common;

/**
 * author : hyeongju
 * date : 2022.09.28
 * description : 출력 message
 */
public enum Message {
    MSG_GA_START("숫자 야구 게임시 시작되었습니다 !"),
    MSG_INPUT_NUMBERS("숫자를 입력해주세요 : "),
    MSG_GAME_ENDING("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    MSG_QUESTION_NEW_OR_EXIT("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),

    MSG_RULE_BALL("볼"),
    MSG_RULE_STRIKE("스트라이크"),
    MSG_RULE_OUT("아웃"),

    MSG_INPUT_ERROR("1-9까지 3자리 숫자만 입력이 가능합니다.");

    private final String message;

    Message(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

}
