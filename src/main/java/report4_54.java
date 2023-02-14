//if-else if-else 여러개의 조건식, 마지막 else 블럭은 생략이 가능하다.
//어차피 위에 조건들이 맞지않으면 실행될 것이기 때문이다.
//블럭 {} 여러문장을 하나로 묶어주는 것. 만약 조건문에서 실행할 조건이 하나라면 if(조건식) 명령문;으로 {}가 생략될 수 있다.
//⌘⇧↑/↓ 줄이동
//⌘D 줄복제
//⌥ ‘x’ 사용하지 않는 모든 탭 닫기
//라인 삭제: Command + Backspace
//단어 단위 이동: Option + 화살표(좌, 우)

public class report4_54 {
    public static void main(String[] args) {
//5-4. 2차원 배열 arr에 담긴 모든 총합과 평균을 구하는 프로그램을 완성하세요.        int[] arr = {10, 20, 30, 40, 50};
        int[][] arr = {
                { 5, 5, 5, 5, 5 },
                { 10, 10, 10, 10, 10 },
                { 20, 20, 20, 20, 20 },
                { 30, 30, 30, 30, 30 }
        };

        int total = 0;
        float average = 0;

        for (int i =0; i < arr.length; i++) {
            for(int j =0; j < arr[i].length; j++) {
                total += arr[i][j];
            }
        }

        average = total / (float)(arr.length * arr[0].length);

        //예제의 공식을 잘 보고 따라하면 될
        //전체 항목의 개수를 세는 함수는 어떻게 짜면될까?
//        for (int i =0; i < arr.length; i++){
//            for(int j =0; j <arr[j].length; j++)
//                System.out.println(); ???
//        }

        System.out.println("total=" + total);
        System.out.println("average=" + average);
    }
}

