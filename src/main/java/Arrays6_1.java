//if-else if-else 여러개의 조건식, 마지막 else 블럭은 생략이 가능하다.
//어차피 위에 조건들이 맞지않으면 실행될 것이기 때문이다.
//블럭 {} 여러문장을 하나로 묶어주는 것. 만약 조건문에서 실행할 조건이 하나라면 if(조건식) 명령문;으로 {}가 생략될 수 있다.
//⌘⇧↑/↓ 줄이동
//⌘D 줄복제
//⌥ ‘x’ 사용하지 않는 모든 탭 닫기
//라인 삭제: Command + Backspace
//단어 단위 이동: Option + 화살표(좌, 우)

import java.util.Arrays;

public class Arrays6_1 {
    public static void main(String[] args) {
  //문자열 비교와 출력
        int[] num = {0, 1, 2};
        int[][] score = {
                {88, 35, 100},
                {84, 60, 55},
                {100, 99, 72},
                {33, 54, 77}
        };

        System.out.println("Arrays.toString(num) = " + Arrays.toString(num));
        System.out.println("Arrays.deepToString(score) = " + Arrays.deepToString(score));
        System.out.println();

        String[][] strArr1 = {
                {"AAA","BBB","CCC"},
                {"aaa","bbb","ccc"},
        };
        String[][] strArr2 = {
                {"AAA","BBB","CCC"},
                {"aaa","bbb","ccc"},
        };

        // 1 차원 비교에는 equals
        System.out.println("Arrays.equals(strArr1[0], strArr2[0]) = " + Arrays.equals(strArr1[0], strArr2[0])); // true
        System.out.println("Arrays.equals(strArr1[1], strArr2[0]) = " + Arrays.equals(strArr1[1], strArr2[0])); // false

        System.out.println("Arrays.equals(strArr1, strArr2) = " + Arrays.equals(strArr1, strArr2)); // false

        System.out.println();
        // 다차원 비교에는 deepEquals
        System.out.println("Arrays.deepEquals(strArr1, strArr2)");



        //여기까지 지우기
    }
}

//import java.util.Arrays; 이걸 왜 써줘야 값이 나오는지 모르겠다.
//배열 어렵다.
