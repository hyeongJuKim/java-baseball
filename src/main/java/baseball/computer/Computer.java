package baseball.computer;

import camp.nextstep.edu.missionutils.Randoms;

/**
 * author : hyeongju
 * date : 2022.09.28
 * description :
 */
public class Computer {

    String computerNumbers;

    public Computer(){
        computerNumbers = generateTreeNumber();
    }

    public String getComputerNumbers() {
        System.out.println("Computer 숫자 : " + computerNumbers);
        return computerNumbers;
    }

    public void setComputerNumbers(String computerNumbers) {
        this.computerNumbers = computerNumbers;
    }

    /**
     * 중복없는 3자리 숫자를 생성한다
     * @return numbers 중복없는 숫자 3자리
     */
    public static String generateTreeNumber() {

        String nums = "";
        while (nums.length() < 3){
            String num = Integer.toString(Randoms.pickNumberInRange(1, 9));
            if(!nums.contains(num)){
                nums += num;
            }
        }

        return nums;
    }

}
