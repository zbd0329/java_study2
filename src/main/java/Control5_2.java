//if-else if-else 여러개의 조건식, 마지막 else 블럭은 생략이 가능하다.
//어차피 위에 조건들이 맞지않으면 실행될 것이기 때문이다.
//블럭 {} 여러문장을 하나로 묶어주는 것. 만약 조건문에서 실행할 조건이 하나라면 if(조건식) 명령문;으로 {}가 생략될 수 있다.
//⌘⇧↑/↓ 줄이동
//⌘D 줄복제
//⌥ ‘x’ 사용하지 않는 모든 탭 닫기
//라인 삭제: Command + Backspace
//단어 단위 이동: Option + 화살표(좌, 우)

public class Control5_2 {
    public static void main(String[] args) {
  //여기부터 시작
        int sum = 0;
        int i = 0;

        while (sum <= 100) {
            System.out.println("i = " + i);
            System.out.println("sum = " + sum);
            sum += ++i;
        }
  //여기까지 지우기
    }
}

//!= 는 붙여서 써야한다. 띄어쓰기하면 에러가 난다.

// while(조건식) {조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 문장;}
// 실행순서
// 1. 조건식
// 2. 조건식이 참일경우 문장 수행.
// 3. 조건식이 거짓이 될 때까지 반복

