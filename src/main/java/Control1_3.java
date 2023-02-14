public class Control1_3 {
    public static void main(String[] args) {
        char ch ='P';

        if(ch >= 'a' && ch <= 'z') {
            System.out.println("해당 문자는 영문 소문자입니다.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("해당 문자는 영문 대문자입니다");
        } else {
            System.out.println("해당 문자는 영문자가 아닙니다");
        }

        int score= 81;


        if (score >= 90) {
            System.out.println("A등급입니다");
        } else if(score >= 80) {
            System.out.println("B등급입니다");
        } else if(score >= 70) {
            System.out.println("C등급입니다");
            System.out.println("과락입니다");

        } else {
        }
    }
}


//if-else if-else 여러개의 조건식, 마지막 else 블럭은 생략이 가능하다.
//어차피 위에 조건들이 맞지않으면 실행될 것이기 때문이다.
//블럭 {} 여러문장을 하나로 묶어주는 것. 만약 조건문에서 실행할 조건이 하나라면 if(조건식) 명령문;으로 {}가 생략될 수 있다.
//⌘⇧↑/↓ 줄이동
//⌘D 줄복제
//⌥ ‘x’ 사용하지 않는 모든 탭 닫기
//라인 삭제: Command + Backspace
//단어 단위 이동: Option + 화살표(좌, 우)