//if-else if-else 여러개의 조건식, 마지막 else 블럭은 생략이 가능하다.
//어차피 위에 조건들이 맞지않으면 실행될 것이기 때문이다.
//블럭 {} 여러문장을 하나로 묶어주는 것. 만약 조건문에서 실행할 조건이 하나라면 if(조건식) 명령문;으로 {}가 생략될 수 있다.
//⌘⇧↑/↓ 줄이동
//⌘D 줄복제
//⌥ ‘x’ 사용하지 않는 모든 탭 닫기
//라인 삭제: Command + Backspace
//단어 단위 이동: Option + 화살표(좌, 우)

public class Arrays4_1 {
    public static void main(String[] args) {
  //String 클래스
        String str ="ABCDEFG";
        char ch = str.charAt(3);
        System.out.println("ch = " + ch); // ch = D

        String str2 = str.substring(1,4);
        System.out.println("str2 = " + str2); // str2 = BCD

        String str3 = str.substring(1);
        System.out.println("str3 = " + str3); // str3 = BCDEFG

        String str4 = str.substring(1, str.length());
        System.out.println("str4 = " + str4); // str4 = BCDEFG

        char[] chArr = str.toCharArray();
        //System.out.println("Arrays.toString(chArr) = " + Arrays.toString(chArr));
        //Arrays에서 에러


        //여기까지 지우기
    }
}

//