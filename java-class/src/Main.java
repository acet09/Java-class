import java.util.*;
import java.util.Scanner;

class Students {
    String studentId;
    String name;
}

public class Main {
    public static void main(String[] args) {

        Students[] st = new Students[5];

        st[0] = new Students();
        st[0].name = "KIM";

        if(st[0].name.equals("KIM")){
            System.out.println("일치");
        }else {
            System.out.println("불일치");
        }




//        int[] scores = {70, 80};
//        int[] copied = scores;
//        copied[0] = 100;
//        System.out.println(scores[0]);


//        int[] original = {80, 90, 100};
//        int[] alias = original;
//        alias[1] = 50;
//        System.out.println(original[1]);
//        System.out.println(original == alias);
        // 출력: 50
        // 출력: true


//        int[] numbers1 = {10, 20, 30};
//        int[] numbers2 = {10, 20, 30};
//        int[] numbers3 = numbers1;
//        System.out.println(numbers1 == numbers2);  //배열을 새로 생성했기 때문에 주소값이 다르다
//        System.out.println(numbers1 == numbers3);
//        System.out.println(Arrays.equals(numbers1,numbers2)); //import 해야됨


//        String[] names = new String[3];  //index가 3 0..1..2
//        System.out.println(names.length);
//        System.out.println(names[0]);
// 출력: 3
// 출력: null
// names[0].length();
// NPE 발생


//        String order = "COFFEE,2,HOT";
//        String[] parts = order.split(",");  //split : " "를 기준으로 문자열 나눈다.
//        if (parts.length == 3) {
//            System.out.println("상품: " + parts[0]);
//            System.out.println("수량: " + parts[1]);
//            System.out.println("옵션: " + parts[2]);
//        }


//        int[] scores;
//        scores = new int[5];
//        scores[0] = 95;
//        scores[1] = 88;
//        System.out.println(scores[0]);
//        String[] scores;
//        scores = new String[5];
//        scores[0] = "98";
//        scores[1] = "11";
//        System.out.println(scores[3]);


//        int[] scores = {95, 88, 72, 64, 100};
//        int[] backup;
//        backup = new int[]{95, 88, 72};
//        System.out.println(backup[0]);
//        int[] backup = {95, 88, 72}; //이미 생성된 배열에는 초기화가 불가능
// backup = {95, 88, 72};
// 위 문장은 컴파일 오류


//        int[] numbers = {10, 20, 30};
//        System.out.println(numbers[0]);
//        System.out.println(numbers[2]);
//      System.out.println(numbers[3]);  //out of bounds ... 배열 범위밖 인덱스를 사용됨
//      ArrayIndexOutOfBoundsException


//        Scanner scanner = new Scanner(System.in);
//
//        int[] scores = new int[5];
//        for (int index = 0; index < scores.length; index++) {
//            System.out.print((index + 1) + "번 점수: ");
//            scores[index] = scanner.nextInt();
//        }


//        int[] scores = {1, 2, 3, 4, 5};
//        int total = 0;
//        for (int index = 0; index < scores.length; index++) {
//            total += scores[index];
//        }
//        double average = (double) total / scores.length;
//        System.out.println(average);


//        if (scores.length > 0) {
//            int max = scores[0];
//            for (int index = 1; index < scores.length; index++) {
//                if (scores[index] > max) {
//                    max = scores[index];
//                }
//            }
//        }


//        int[][] dailySales = {
//                {12000, 18000, 9000},
//                {21000, 15000},
//                {8000, 11000, 17000, 13000}
//        };
//        System.out.println(dailySales[1].length);
//        // 출력: 2


//        for (int row = 0; row < dailySales.length; row++) {
//            for (int column = 0; column < dailySales[row].length;
//                 column++) {
//                System.out.println(dailySales[row][column]);
//            }
//        }

//        int[][] sales = {
//                {12000, 18000, 9000},
//                {21000, 15000},
//                {8000, 11000, 17000, 13000}
//        };
//
//        int grandTotal = 0;
//        for (int day = 0; day < sales.length; day++) {
//            int dayTotal = 0;
//            for (int amount : sales[day]) {
//                dayTotal += amount;
//            }
//            grandTotal += dayTotal;
//        }
//
//        System.out.println(grandTotal);


//        String[] participants = new String[3];
//        System.out.println(participants.length);
//        System.out.println(participants[0]
//        );
//        participants[0] = "김서윤";
//        System.out.println(
//                participants[0].length()
//        );


//        int[] original = {10, 20, 30};
//        int[] longer = Arrays.copyOf(original, 5);
//        int[] shorter = Arrays.copyOf(original, 2);
//
//        for (int i = 0; i < longer.length; i++) {
//            System.out.println(longer[i]);
//            System.out.println(shorter[i]); //길이가 총 2개뿐이라 못들어가 out of bounds 범위 밖
//        }
// longer: [10, 20, 30, 0, 0]
// shorter: [10, 20]


//        int[] scores = {81, 94, 76, 88};
//
//        for (int score : scores) {
//            score = 0;
//        }
//        System.out.println(Arrays.toString(scores));
// [81, 94, 76, 88]
// 배열은 바뀌지 않는다.


//        if (args.length == 0) {System.out.println("이름을 입력하세요.");
//            return;
//        }
//        for (String name : args) {
//            System.out.println(name);
//        }

// 둘 다 true
// enum은 보통 ==로 비교해도 안전하다.


    }
}
