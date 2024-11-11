import java.util.Scanner;
import java.util.Stack;

public class ProblemC {
    // Returns the path to secrets.txt
    public static String findSecretsTxt(String[] lines) {
        Stack<String> stack = new Stack<>();
        for (String line : lines) {
            String name = line.charAt(0) != '-' ? line : line.substring(line.indexOf(" ") + 1);
            int depth = line.length() - line.replace("-", "").length();
            boolean isDir = line.charAt(line.length() - 1) == '/';

            if (isDir) {
                while (stack.size() > depth) {
                    stack.pop();
                }
                stack.push(name);
            } else {
                if (name.equals("secrets.txt")) {
                    StringBuilder path = new StringBuilder("/");
                    for (String dir : stack) {
                        path.append(dir);
                    }
                    path.append("secrets.txt");
                    return path.toString();
                }
            }
        }
        return null;
    }

    // parsing code, DO NOT MODIFY
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int lineCount = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            String[] lines = new String[lineCount];
            for (int i = 0; i < lineCount; i++) {
                lines[i] = scanner.nextLine();
            }
            System.out.println(findSecretsTxt(lines));
        }
    }
}
