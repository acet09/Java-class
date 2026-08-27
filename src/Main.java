import jdk.swing.interop.SwingInterOpUtils;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String name = "김자바";
//        int months = 6;
//        double rating = 4.567;
//        boolean avaliable = true;
//
//        System.out.printf("이름: %s%n", name);
//        System.out.printf("개월: %d%n", months);
//        System.out.printf("평점: %.2f%n",rating);
//        System.out.printf("가능: %b%n", avaliable);

        Scanner scanner = new Scanner(System.in);

        System.out.print("나이: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("이름: ");
        String name = scanner.nextLine();
        // 남아 있던 줄바꿈을 읽어 name이 빈 문자열

        System.out.println(name);


    }
}