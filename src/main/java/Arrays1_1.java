//if-else if-else 여러개의 조건식, 마지막 else 블럭은 생략이 가능하다.
//어차피 위에 조건들이 맞지않으면 실행될 것이기 때문이다.
//블럭 {} 여러문장을 하나로 묶어주는 것. 만약 조건문에서 실행할 조건이 하나라면 if(조건식) 명령문;으로 {}가 생략될 수 있다.
//⌘⇧↑/↓ 줄이동
//⌘D 줄복제
//⌥ ‘x’ 사용하지 않는 모든 탭 닫기
//라인 삭제: Command + Backspace
//단어 단위 이동: Option + 화살표(좌, 우)

public class Arrays1_1 {
    public static void main(String[] args) {
  //배열 : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
        int[] age = new int[5]; //선언과 생성 동시에
        //int[] age; 참조변수 배열 age 생성
        //age = new int[5]; 배열의 생성

        int beatitudoAge = age[3];
        System.out.println("beatitudoAge = " + beatitudoAge);

        System.out.println("age 배열의 전체값 확인");
        System.out.println("age[0] =" + age[0]);
        System.out.println("age[1] =" + age[1]);
        System.out.println("age[2] =" + age[2]);
        System.out.println("age[3] =" + age[3]); //3번 배열에만 값이 있음
        System.out.println("age[4] =" + age[4]);

  //여기까지 지우기
    }
}

//배열을 다루기 위한 참조변수의 선언
//int[] age;
//String[] name;
//int age[];
//String name[];
// 배열의 시작 주소를 참조변수에 저장한다. 둘을 연결한 뒤 참조 변수를 이용하여 배열을 다룰 수 있음

