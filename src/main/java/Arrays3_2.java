//if-else if-else 여러개의 조건식, 마지막 else 블럭은 생략이 가능하다.
//어차피 위에 조건들이 맞지않으면 실행될 것이기 때문이다.
//블럭 {} 여러문장을 하나로 묶어주는 것. 만약 조건문에서 실행할 조건이 하나라면 if(조건식) 명령문;으로 {}가 생략될 수 있다.
//⌘⇧↑/↓ 줄이동
//⌘D 줄복제
//⌥ ‘x’ 사용하지 않는 모든 탭 닫기
//라인 삭제: Command + Backspace
//단어 단위 이동: Option + 화살표(좌, 우)

public class Arrays3_2 {
    public static void main(String[] args) {
  //총합과 평균
        int sum = 0; //총합을 저장
        float avg = 0f; // 평균을 저장

        int[] score = {100, 40, 33, 50, 77, 29};

        for (int i = 0; i < score.length; i++) {
            System.out.println("score[" + i + "] = " + score[i]);
        sum += score[i];
        }

        avg = sum / (float) (score.length);
        // 계산결과를 float 타입으로 얻기 위해 형변환

        System.out.println("총합 = " + sum);
        System.out.println("평균 = " + avg);

        //여기까지 지우기
    }
}

//