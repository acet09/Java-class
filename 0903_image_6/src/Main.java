
public class Main {
    public static void main(String[] args) {

        //-03_객체지향프로그램심화_3주차 6page- (마이너스 연산)
//        int temperature = 12;
//        int belowZero = -temperature;
//
//        System.out.println(temperature);
//        System.out.println(belowZero);
//        System.out.println(-belowZero);


        //-03_객체지향프로그램심화_3주차
//        int count = 3;
//
//        int a = ++count;
//        int b = count++;
//
//        System.out.println(a);      //4
//        System.out.println(b);      //4
//        System.out.println(count);  //5


        //-03_객체지향프로그램심화_3주차
//        int score = 10;
//        int a = -score;
//        int b = ++score;
//        int c = score--;
//
//        System.out.println(score); // 10
//        System.out.println(a); // -10
//        System.out.println(b); // 11
//        System.out.println(c); // 11
//        System.out.println(score); // 10


        // -03_객체지향프로그램심화_3주차 [for, while]
//        int count = 10;
//        for (int i = 0; i < count; i++) {
//            System.out.println("[" + i + "]");
//        }

//        int check = 0;
//        while (check < 10) {
//            System.out.println(check);
//            check++;
//        }


        // -03_객체지향프로그램심화_3주차 [정수와 소수의 차이점]
//        int total = 5;
//        int people = 2;
//
//        int a = total / people;   //2
//        double b = total / people;  //2.0
//        double c = (double) total / people;  //2.5
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);


        // -03_객체지향프로그램심화_3주차
//        int total = 5;
//        int people = 2;
//
//        double late = (double)(total/people);
//        double early = (double)total/people;
//
//        System.out.println(late);
//        System.out.println(early);


        // -03_객체지향프로그램심화_3주차 [홀짝 계산]
//        int number = -7;
//
//        System.out.println(number / 3);
//        System.out.println(number % 3);
//
//        boolean even = number % 2 == 0;
//        boolean odd = number % 2 != 0;
//
//        System.out.println(even);
//        System.out.println(odd);


        // -03_객체지향프로그램심화_3주차[byte+byte ... int]
//        byte x = 10;
//        byte y = 20;
//
//        int result = x + y;
//        byte wrong = x + y;  //int로 자동승격
//
//        byte narrowed = (byte) (x + y);
//
//        System.out.println(result);
//        System.out.println(narrowed);


        // -03_객체지향프로그램심화_3주차
//        int a = 7, b= 3;
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        System.out.println(a%b);
//
//        System.out.println(7/3);
//        System.out.println(7.0/3);
//        System.out.println((double)7/3);


        // -03_객체지향프로그램심화_3주차[overflow]
//        int max = Integer.MAX_VALUE;  //int타입 최대값 확인 방법
//        int overflow = max + 1;
//
//        System.out.println(max);
//        System.out.println(overflow);
//
//        double max_d = Double.MAX_VALUE;
//        System.out.println(max_d);


        // -03_객체지향프로그램심화_3주차[underflow]
//        int min = Integer.MIN_VALUE; //int타입 최소값
//        int underflow = min - 1;
//
//        System.out.println(min);
//        System.out.println(underflow);


        // -03_객체지향프로그램심화_3주차
//        int price = 1_500_000_000;
//        int count = 2;
//
//        long wrong = price * count;
//        long correct = (long) price * count;
//
//        System.out.println(wrong);
//        System.out.println(correct);
        //long result = intValue * intValue;가 안전하지 않을 수 있는 이유를 한 문장으로 적는다.
        //범위를 보장해 주지 않기 때문에 값이 튈수 있다.


        // -03_객체지향프로그램심화_3주차
//        double sum = 0.0;
//
//        sum += 0.1;
//        sum += 0.1;
//        sum += 0.1;
//        sum += 0.1;
//        sum += 0.1;
//        sum += 0.1;
//        sum += 0.1;
//        sum += 0.1;
//        sum += 0.1;
//        sum += 0.1;
//        System.out.println(sum); //0.9999999999999999


        // -03_객체지향프로그램심화_3주차
//        long priceWon = 3_500;
//        long count = 4;
//        long discountRate = 10;
//
//        long subtotalWon = priceWon * count;
//        long discountWon = subtotalWon * discountRate / 100;
//        long paymentWon = subtotalWon - discountWon;
//
//        System.out.println(paymentWon);


        // -03_객체지향프로그램심화_3주차
//        long subtotalWon = 14_000;
//        long discountRate = 10;
//
//        long wrong
//                = subtotalWon * (discountRate / 100);
//        long correct
//                = subtotalWon * discountRate / 100;
//
//        System.out.println(wrong);   // 0
//        System.out.println(correct); // 1400


//        double normal = 10.0 / 2.0;
//        double infinity = 10.0 / 0.0;
//        double nan = 0.0 / 0.0;
//
//        System.out.println(normal);   // 5.0
//        System.out.println(infinity); // Infinity
//        System.out.println(nan);      // NaN


//        double result = 10.0 / 0.0;
//        boolean infinite
//                = Double.isInfinite(result);
//        boolean nan
//                = Double.isNaN(result);
//        boolean invalid = infinite || nan;
//
//        System.out.println(infinite); // true
//        System.out.println(nan);      // false
//        System.out.println(invalid);  // true


//        String a = "Java";
//        String b = "Java";
//        String c = new String("Java");  //객체 생성
//
//        System.out.println(a == b);      // true 가능
//
//        System.out.println(a == c);      // false
//        System.out.println(a.equals(c)); // true


//        int age = 19;
//
//        boolean atLeast19 = age >= 20;
//        boolean atMost34 = age <= 34;
//        boolean inRange = atLeast19 || atMost34;
//
//        System.out.println(inRange);


//        int divisor = 0;
//        boolean safe
//                = divisor != 0
//                && 10 / divisor > 1;
//
//        System.out.println(safe); // false
//        나눗셈은 실행되지 않는다


//        int first = 7;  // ...0111
//        int second = 8; // ...1000
//
//        int firstLastBit = first & 1;  //a & b: 두 비트가 모두 1일 때만 1이다. 특정 비트를 확인하거나 끈다
//        int secondLastBit = second & 1; //a & b: 두 비트가 모두 1일 때만 1이다. 특정 비트를 확인하거나 끈다
//
//        System.out.println(firstLastBit);  // 1
//        System.out.println(secondLastBit); // 0


//        int value = 3;  // 0011
//
//        int one = value << 1; // 0110
//        int two = value << 2; // 1100
//
//        System.out.println(one); // 6
//        System.out.println(two); // 12
//
//        System.out.println(value >> 1);  // 1
//        System.out.println(value >>> 1); // 1


//        int total = 0;
////        total += 3_500;
//        total = total + 3_500;
////        total += 2_000;
//        total = total + 2_000;
////        total -= 500;
//        total = total - 500;
//        System.out.println(total);


////        int score = 60;
//        int score = 5;
//        String result = score >= 60 ? "합격" : "재시험";
//        System.out.println(result);



//        int price = 3_000;
//        int delivery = 500;
//        int count = 2;
//
//        int first = price + delivery * count;
//        int second = (price + delivery) * count;
//
//        System.out.println(first);  // 4000
//        System.out.println(second); // 7000





    }
}