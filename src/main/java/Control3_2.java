//if-else if-else 여러개의 조건식, 마지막 else 블럭은 생략이 가능하다.
//어차피 위에 조건들이 맞지않으면 실행될 것이기 때문이다.
//블럭 {} 여러문장을 하나로 묶어주는 것. 만약 조건문에서 실행할 조건이 하나라면 if(조건식) 명령문;으로 {}가 생략될 수 있다.
//⌘⇧↑/↓ 줄이동
//⌘D 줄복제
//⌥ ‘x’ 사용하지 않는 모든 탭 닫기
//라인 삭제: Command + Backspace
//단어 단위 이동: Option + 화살표(좌, 우)

public class Control3_2 {
    public  static void main (String[] args) {
        //1번
        for (int i = 1; i <= 10; i = i*2) {
            System.out.println("1번 i는 현재" + (i) + "입니다.");
        }
        System.out.println();
        //2번
        for (int i = 10; i >= 1; i--){
            System.out.println("2번 i는 현재" +(i) + "입니다." );
        }
    }


    }



//for(초기화;조건식;증감식){조건의 결과가 참인 동안 반복적으로 실행하고자하는 문장;}
//실행순서 1. 초기화 2. 조건식 3. 조건식이 참일경우 문장수행 4. 증감식 5. 조건식이 거짓이 될때까지 반복
