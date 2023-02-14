//if-else if-else 여러개의 조건식, 마지막 else 블럭은 생략이 가능하다.
//어차피 위에 조건들이 맞지않으면 실행될 것이기 때문이다.
//블럭 {} 여러문장을 하나로 묶어주는 것. 만약 조건문에서 실행할 조건이 하나라면 if(조건식) 명령문;으로 {}가 생략될 수 있다.
//⌘⇧↑/↓ 줄이동
//⌘D 줄복제
//⌥ ‘x’ 사용하지 않는 모든 탭 닫기
//라인 삭제: Command + Backspace
//단어 단위 이동: Option + 화살표(좌, 우)

public class Arrays3_1 {
    public static void main(String[] args) {
  //배열의 출력
        int[] arr = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        // 배열을 가리키는 참조변수 arr을 출력
        System.out.println("arr = " + arr);

        //예외 확인하기 - char[]
        char[] chArr = {'a', 'b', 'c','d'};
        System.out.println(chArr); // abcd 가 출력되는데 이는 println 메서드의 기능 때문!

        //배열의 요소 하나씩 출력하기
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        // Arrays.toString(배열) : 배열의 모든 요소를 문자열로 만들어서 반환한다.
        // System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));


        //여기까지 지우기
    }
}

//