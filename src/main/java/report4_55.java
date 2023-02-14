//if-else if-else 여러개의 조건식, 마지막 else 블럭은 생략이 가능하다.
//어차피 위에 조건들이 맞지않으면 실행될 것이기 때문이다.
//블럭 {} 여러문장을 하나로 묶어주는 것. 만약 조건문에서 실행할 조건이 하나라면 if(조건식) 명령문;으로 {}가 생략될 수 있다.
//⌘⇧↑/↓ 줄이동
//⌘D 줄복제
//⌥ ‘x’ 사용하지 않는 모든 탭 닫기
//라인 삭제: Command + Backspace
//단어 단위 이동: Option + 화살표(좌, 우)

public class report4_55 {
    public static void main(String[] args) {
//5-5. 다음은 1과 9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.
//코드를 완성하세요. 다만 Math.random()을 사용했기 때문에 실행 결과 예시와 다를 수 있습니다.
        int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] ball3 = new int[3];

        // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다
        for (int i = 0; i < ballArr.length; i++) {
            int j = (int) (Math.random() * ballArr.length);
            int tmp = 0;

            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }
        System.arraycopy(ballArr,0,ball3,0,3);
        // 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다
        for (int i = 0; i < ball3.length; i++) {
            System.out.print(ball3[i]);
        }

        //마지막 반복 횟수는 몇번을 해도 상관없다.
        //랜덤으로 중복되는 숫자가 나오지 않는것은 자기를 바꾸는 것이기 때문이다.
        //처음부터 중복된 숫자가 없었기 때문에 단순히 자리를 바꾸는 것으로 중복되는 숫자는 나오지 않는다.
        //만약 처음부터 중복된 숫자가 있었다면 반드시 그 숫자는 중복된다. (자기바꾸기)


    }
}

