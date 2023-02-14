//if-else if-else 여러개의 조건식, 마지막 else 블럭은 생략이 가능하다.
//어차피 위에 조건들이 맞지않으면 실행될 것이기 때문이다.
//블럭 {} 여러문장을 하나로 묶어주는 것. 만약 조건문에서 실행할 조건이 하나라면 if(조건식) 명령문;으로 {}가 생략될 수 있다.
//⌘⇧↑/↓ 줄이동
//⌘D 줄복제
//⌥ ‘x’ 사용하지 않는 모든 탭 닫기
//라인 삭제: Command + Backspace
//단어 단위 이동: Option + 화살표(좌, 우)

public class Arrays2_2 {
    public static void main(String[] args) {
  //배열의 초기화
        int[] num1 = new int[]{1,2,3,4,5,6,7,8,9};
        int[] num2 = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < num1.length; i++) {
            System.out.println("num1[" +i + "] = " + num1[i]);
        }
        System.out.println();
        for (int i = 0; i < num2.length; i++) {
            System.out.println("num2[" +i + "] = " + num2[i]);
        }

        System.out.println();

        //주의 할 점
        int[] num3;
        // num3 = {1,2,3,4,5,6,7,8,9}; // 에러 발생 결과 안나옴

        //위처럼 나눠서 표현한다면 아래처럼 해야함.

        int[] num4;
        num4 = new int[]{1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < num4.length; i++) {
            System.out.println("num4[" +i + "] = " + num4[i]);
        }


  //여기까지 지우기
    }
}

//초기화 방법
//int[] num = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//new int[] 를 생략할 수 있습니다.