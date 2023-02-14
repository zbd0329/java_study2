//if-else if-else 여러개의 조건식, 마지막 else 블럭은 생략이 가능하다.
//어차피 위에 조건들이 맞지않으면 실행될 것이기 때문이다.
//블럭 {} 여러문장을 하나로 묶어주는 것. 만약 조건문에서 실행할 조건이 하나라면 if(조건식) 명령문;으로 {}가 생략될 수 있다.
//⌘⇧↑/↓ 줄이동
//⌘D 줄복제
//⌥ ‘x’ 사용하지 않는 모든 탭 닫기
//라인 삭제: Command + Backspace
//단어 단위 이동: Option + 화살표(좌, 우)

public class Control4_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println((int)(Math.random() * 11) - 5);
        }
    }
}



//임의의 정수 만들기
//Math.random() -> 0.0 과 1.0 사이의 임의의 double 값을 반환합니다.
//        0.0 <= Math.random() < 1.0


//1 부터 5 사이의 random 한 정수 값 구하기
//        0.0 * 5 <= Math.random() * 5 < 1.0 * 5
//        (int)0.0 <= (int)(Math.random() * 5) < (int)5.0
//        0 + 1 <= (int)(Math.random() * 5) + 1 < 5 + 1
//        1 <= (int)(Math.random() * 5) + 1 < 6
// 1회차 : 이해 못함. 20개의 난수를 왜 출력하는지 모르겠다. 왜 *11인가? -5는 왜 해주는가?