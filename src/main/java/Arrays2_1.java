//if-else if-else 여러개의 조건식, 마지막 else 블럭은 생략이 가능하다.
//어차피 위에 조건들이 맞지않으면 실행될 것이기 때문이다.
//블럭 {} 여러문장을 하나로 묶어주는 것. 만약 조건문에서 실행할 조건이 하나라면 if(조건식) 명령문;으로 {}가 생략될 수 있다.
//⌘⇧↑/↓ 줄이동
//⌘D 줄복제
//⌥ ‘x’ 사용하지 않는 모든 탭 닫기
//라인 삭제: Command + Backspace
//단어 단위 이동: Option + 화살표(좌, 우)

public class Arrays2_1 {
    public static void main(String[] args) {
  //배열의 이름 .length

        int[] arr = new int[10];
        System.out.println("배열의 길이 = " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println();
        // index 범위를 벗어나는 경우 Error 발생
        for (int i = 0; i < arr.length + 1; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

  //여기까지 지우기
    }
}

//배열은 한번 생성되면 컴파일 후 실행되는 동안은 그 길이(크기)를 바꿀 수 없다
//배열의 한계 : 크기를 바꿀 수 없는 이유. 배정받은 주소에 연속적인 메모리 공간이 존재한다는 보장이 없다.
//불확실한 일은 왠만해서는 하지 않는다. (개발자의 사고)
//배열의 크기가 부족할때는 필요한 만큼의 크기의 배열을 새롭게 만든다.