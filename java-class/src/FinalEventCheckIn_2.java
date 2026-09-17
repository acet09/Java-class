import java.util.Scanner;

class StudentEntry_2 {
    String studentId;
    String name;
}

public class FinalEventCheckIn_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentEntry_2[] entries = new StudentEntry_2[5];

        while (true) {
            System.out.println("\n[취업 특강 접수]");
            System.out.println("1 신청  2 명단  3 취소  4 현황  0 종료");
            System.out.print("선택: ");
            String menu = scanner.nextLine().trim();

            if (menu.equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (menu) {
                case "1":
                    System.out.print("학번: ");
                    String studentId = scanner.nextLine().trim();
                    System.out.print("이름: ");
                    String name = scanner.nextLine().trim();

                    // TODO 1. 빈 학번이나 빈 이름은 거절하세요.
                    // TODO 2. 같은 학번이 이미 있는지 배열 전체를 확인하세요.
                    // TODO 3. null인 첫 칸을 찾고 StudentEntry 객체를 저장하세요.
                    // TODO 4. 다섯 칸이 모두 찼다면 정원 마감을 출력하세요.
                    if (studentId.isEmpty() || name.isEmpty()) {
                        System.out.println("학번과 이름을 모두 입력");
                        break;
                    }

                    boolean duplicate = false;
                    for (StudentEntry_2 entry : entries) {
                        if (entry != null && entry.studentId.equals(studentId)) {
                            duplicate = true;
                            break;
                        }
                    }

                    if (duplicate) {
                        System.out.println("이미 신청한 학생");
                        break;
                    }

                    int emptyIndex = -1;
                    for (int i = 0; i < entries.length; i++) {
                        if (entries[i] == null) {
                            emptyIndex = i;
                            break;
                        }
                    }
                    System.out.println("인덱스 : " + emptyIndex);

                    if (emptyIndex == -1) {
                        System.out.println("정원마감");
                        break;
                    }

                    StudentEntry_2 newEntry = new StudentEntry_2();
                    newEntry.studentId = studentId;
                    newEntry.name = name;
                    entries[emptyIndex] = newEntry;
                    System.out.println(name + "학생 신청 완료");
                    break;

                case "2":
                    // TODO 5. null을 건너뛰며 위치, 학번, 이름을 출력하세요.
                    int displayed = 0;
                    for (StudentEntry_2 entry : entries) {
                        if (entry != null) {
                            System.out.println("위치:" + displayed++);
                            System.out.println("학번:" + entry.studentId + "\n이름:" + entry.name);
                        }
                    }
                    // 아무도 없으면 "등록된 신청자가 없습니다."를 출력하세요.
                    if (displayed == 0) {
                        System.out.println("등록된 신청자가 없습니다.");
                    }
                    break;

                case "3":
                    System.out.print("취소할 학번: ");
                    String cancelId = scanner.nextLine().trim();
                    // TODO 6. 학번을 찾아 해당 칸에 null을 넣으세요.
                    // 없는 학번이라면 그 사실을 알려 주세요.
                    int canceldeIndex = -1;
                    int cnt = 0;

                    for (StudentEntry_2 entry : entries) {
//                        System.out.println("엔트리:"+entry.studentId);

                        if (entry.studentId.equals(cancelId)) {
                            canceldeIndex = cnt++;
                        }else {
                            canceldeIndex = -1;
                        }
                    }

                    if (canceldeIndex == -1) {
                        System.out.println("해당 학생의 신청이 없음");
                    }   else {
                         String canceledName = entries[canceldeIndex].name;
                         entries[canceldeIndex] = null;
                         System.out.println(canceledName + "학생의 신청을 취소");
                    }
                    break;

                case "4":
                    // TODO 7. null이 아닌 칸을 세어 현재 인원과 남은 자리를 출력하세요.
                    int count = 0;
//                    for () {
//                        if() {
//
//                        }
//
//                    }
                    System.out.println("현재 자리:");
                    System.out.println("남은 자리:");
                    break;

                default:
                    System.out.println("0부터 4까지 선택하세요.");
            }
        }
    }
}
