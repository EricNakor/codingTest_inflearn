package stringCodingTest;

import java.util.Scanner;

class PalindromicString {
    public static void main(String[] args) {
        PalindromicString T = new PalindromicString();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }

    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                answer = "NO";
                break;
            }
        }
        return answer;
    }
}