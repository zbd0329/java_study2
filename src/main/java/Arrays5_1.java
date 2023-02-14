//if-else if-else 여러개의 조건식, 마지막 else 블럭은 생략이 가능하다.
//어차피 위에 조건들이 맞지않으면 실행될 것이기 때문이다.
//블럭 {} 여러문장을 하나로 묶어주는 것. 만약 조건문에서 실행할 조건이 하나라면 if(조건식) 명령문;으로 {}가 생략될 수 있다.
//⌘⇧↑/↓ 줄이동
//⌘D 줄복제
//⌥ ‘x’ 사용하지 않는 모든 탭 닫기
//라인 삭제: Command + Backspace
//단어 단위 이동: Option + 화살표(좌, 우)

import java.util.Arrays;

public class Arrays5_1 {
    public static void main(String[] args) {
  //Strubg 배열의 선언과 생성
        int[][] score = {
                {88, 35, 100},
                {84, 60, 55},
                {100, 99, 72},
                {33, 54, 77}
        };

        //길이 확인하기
        System.out.println("score.length = " + score.length);
        System.out.println("score[0].length = " + score[0].length);

        System.out.println();
        // 출력 예 1 : Arrays.toString()
        System.out.println("Arrays.toString()");
        System.out.println("Arrays.toString(score[0]) = " + Arrays.toString(score[0]));
        System.out.println("Arrays.toString(score[1]) = " + Arrays.toString(score[1]));
        System.out.println("Arrays.toString(score[2]) = " + Arrays.toString(score[2]));
        System.out.println("Arrays.toString(score[3]) = " + Arrays.toString(score[3]));

        System.out.println();
        // 출력 예 2 : for
        System.out.println("for");
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.println("score[" + i + "][" + j + "] = " + score[i][j]);
            }
            System.out.println();

        }

        System.out.println();
        // 출력 예 3 : 향상된 for
        System.out.println("향상된 for");
        for (int[] ints : score) {
            for (int it : ints) {
                System.out.println("anInt = " + it);
            }
            System.out.println();
        }



        //여기까지 지우기
    }
}

//import java.util.Arrays; 이걸 왜 써줘야 값이 나오는지 모르겠다.
//배열 어렵다.
