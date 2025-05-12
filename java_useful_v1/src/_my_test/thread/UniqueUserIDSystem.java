package _my_test.thread;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueUserIDSystem {

    private HashSet<String> registeredIDs;

    public UniqueUserIDSystem() {
        registeredIDs = new HashSet<>();

    }

    public boolean addUserId(String userId) {
        return registeredIDs.add(userId);
    }


    public void start() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("사용하고 싶은 ID를 입력하세요 종료하려면 'exit' 입력");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("ID를 입력해주세요");
                continue;
            }

            if("exit".equals(input)) {
                System.out.println("시스템을 종료 합니다.");
                break;
            }

            boolean isRegistered = addUserId(input);
            if (isRegistered) {
                System.out.println("새로운 사용자 ID가 등록되었습니다");
            } else {
                System.out.println("이미 등록된 사용자 ID 입니다.");
            }
        }
        scanner.close();
    }


}
