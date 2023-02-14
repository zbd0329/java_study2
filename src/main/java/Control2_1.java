//if-else if-else 여러개의 조건식, 마지막 else 블럭은 생략이 가능하다.
//어차피 위에 조건들이 맞지않으면 실행될 것이기 때문이다.
//블럭 {} 여러문장을 하나로 묶어주는 것. 만약 조건문에서 실행할 조건이 하나라면 if(조건식) 명령문;으로 {}가 생략될 수 있다.
//⌘⇧↑/↓ 줄이동
//⌘D 줄복제
//⌥ ‘x’ 사용하지 않는 모든 탭 닫기
//라인 삭제: Command + Backspace
//단어 단위 이동: Option + 화살표(좌, 우)

public class Control2_1 {
    public static void main(String[] args){
        int month = 1;
        String monthString ="";
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "July";
                break;
            case 7:
                monthString = "August";
                break;
            case 8:
                monthString = "September";
                break;
            case 9:
                monthString = "Octobor";
                break;
            case 10:
                monthString = "November";
                break;
            case 11:
                monthString = "11월";
                break;
            case 12:
                monthString = "12월";
                break;
            case 0:
            case 13:
                System.out.println("이런식으로 case 문을 사용할 수 없습니다");
                break;
            case 15:
            default:
                monthString = "Invalid month";
        }
        System.out.println(monthString);


        }
    }







//if는 조건식 결과에 불리언 정보만 가능
//switch는 정수나 문자열만 가능
//조건식 결과는 정수 또는 문자열이어야 한다.
//case문의 값은 정수 상수, 문자열만 가능하며, 중복불가


