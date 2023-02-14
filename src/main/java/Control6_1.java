//if-else if-else 여러개의 조건식, 마지막 else 블럭은 생략이 가능하다.
//어차피 위에 조건들이 맞지않으면 실행될 것이기 때문이다.
//블럭 {} 여러문장을 하나로 묶어주는 것. 만약 조건문에서 실행할 조건이 하나라면 if(조건식) 명령문;으로 {}가 생략될 수 있다.
//⌘⇧↑/↓ 줄이동
//⌘D 줄복제
//⌥ ‘x’ 사용하지 않는 모든 탭 닫기
//라인 삭제: Command + Backspace
//단어 단위 이동: Option + 화살표(좌, 우)

public class Control6_1 {
    public static void main(String[] args) {
  //break 자신이 포함된 하나의 반복문 벗어남
        int sum = 0;
        int i = 0;

        while (true) {
            if(sum > 100)
                break;
            ++i;
            sum += i;
        }

        System.out.println("i = " + i);
        System.out.println("sum = " + sum);

  //여기까지 지우기
    }
}

//1회차 이해 못함