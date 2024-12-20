package stringCodingTest;

import java.util.Scanner;

class ExtractInt {
    public static void main(String[] args) {
        ExtractInt T = new ExtractInt();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }

    public int solution(String s) {
        //int answer=0;
        String answer = "";
        for (char x : s.toCharArray()) {
            //if(x>=48 && x<=57) answer=answer*10+(x-48);
			/*if(Character.isDigit(x)){
				answer=answer*10+ Character.getNumericValue(x);
			}*/
            if (Character.isDigit(x)) answer += x;
        }
        return Integer.parseInt(answer);
    }
}