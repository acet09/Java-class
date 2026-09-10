import java.util.Scanner;

public class java_0910 {
    public static void main(String[] args) {
//        int amount = 29_999;
//        int deliveryFee;
//
//        if (amount >= 30_000) {
//            System.out.println("배송비 부담");
//            deliveryFee = 3000;
//        } else {
//            System.out.println("배송비 무료");
//            deliveryFee = 0;
//        }
//        System.out.println(deliveryFee);


//75점은 세 번째 블록에서 멈춘다
//        int score = 75;
//        String grade;
//
//        if (score >= 90) {
//            grade = "A";
//        } else if (score >= 80) {
//            grade = "B";
//        }else if (score >= 70) {
//            grade = "C";
//        }else {
//            grade = "F";
//        }
//        System.out.println("학점 :"+ score +"점 / "+ grade);

//        1부터 6까지 한 값이 나온다
//        int number = (int) (Math.random() * 6) + 1;
//        System.out.println("주사위 숫자 : " + number);
//
//        if (number == 1) {
//            System.out.println("1번");
//        } else if (number == 2) {
//            System.out.println("2번");
//        } else {
//            System.out.println("3번부터 6번");
//        }


//switch문 ... menu가 2이면 배송 문의가 나온다

////        int menu = 1;
//        int menu = 3;
//
//        switch (menu)
//        {
//            case 1:
//                System.out.println("결제 문의");
////                break;
//            case 2:
//                System.out.println("배송 문의");
//                break;
//            default:
//                System.out.println("기타 문의");
//

//        break; 없는 경우
//        int time = 9;
//
//        switch (time) {
//            case 8:
//                System.out.println("출근");
//            case 9:
//                System.out.println("회의");
//            case 10:
//                System.out.println("업무");
//            default:
//                System.out.println("외근");
//        }

//      case 활용법
//        char grade = 'b';
//
//        switch (grade) {
//            case 'A':
//            case 'a':
//                System.out.println("우수 회원");
//                break;
//            case 'B':
//            case 'b':
//                System.out.println("일반 회원");
//                break;
//            default:
//        }


//      람다 방식 (->)
//        char grade = 'B';
//
//        switch (grade) {
//            case 'A', 'a' -> System.out.println("우수 회원");
//            case 'B', 'b' -> System.out.println("일반 회원");
//            default -> System.out.println("손님");
//        }

//      람다 방식 - 값이 바로 저장됨
//        String status = "PAYMENT";
//        String status = "";
//        String message = switch (status) {
//            case "PAYMENT" -> "결제 확인 중";
//            case "PREPARING" -> "상품 포장 중";
//            case "SHIPPING" -> "배송 중";
//            case "COMPLETED" -> "배송 완료";
//            default -> "알 수 없는 상태";
//        };
//
//        System.out.println(message);

//      @강의실 좌성 번호 만들기 중첩 for문 행,열 조합
//        for (int row = 1; row <= 3; row++) {
//            for (int column = 1; column <= 5; column++) {
//                int seat = (row - 1) * 5 + column;
//                System.out.print(seat + " ");
//            }
//            System.out.println();
//        }

//      실수 카운터의 출력값을 확인한다 .. 종료값이 정확하지 않다
//        for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
//            System.out.println(x);
//        }
//        출력값
//        0.1
//        0.2
//        0.3
//        0.4
//        0.5
//        0.6
//        0.70000005
//        0.8000001
//        0.9000001

//        Scanner scanner = new Scanner(System.in);
//
//        int completedCount = 0;
//        int cancelledCount = 0;
//        int salesTotal = 0;
//
//        for (int order = 1; order <= 5; order++) {
//            System.out.print(order + "번 주문 금액을 입력하세요. 취소 주문은 -1: ");
//            int amount = scanner.nextInt();
//            if (amount == -1) {
//                cancelledCount++;
//                System.out.println("취소 주문은 매출 계산에서 제외합니다.");
//                continue;
//            }
//            if (amount < 0) {
//                System.out.println("잘못된 금액은 처리하지 않습니다.");
//                continue;
//            }
//            completedCount++;
//            salesTotal += amount;
//        }
//
//        System.out.println("완료 주문: " + completedCount + "건");
//        System.out.println("취소 주문: " + cancelledCount + "건");
//        System.out.println("매출 합계: " + salesTotal + "원");
//
//        scanner.close();


    }
}

