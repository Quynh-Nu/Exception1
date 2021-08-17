import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi s: ");
        String s = sc.nextLine();
        System.out.println("Nhap ki tu muon dem: ");
        char c = sc.nextLine().charAt(0);
        System.out.println(countWord(s));
        countVowelConsonant(s);
        printUpperCase(s);
        printChar(s);
        countChar(c, s);
    }

    //1. In ki tu viet hoa trong chuoi truyen vao
    public static void printUpperCase(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                System.out.println("Upper case is: " + s.charAt(i));
            }
        }
    }

    //2. Chi in ra ki tu trong chuoi truyen vao
    public static void printChar(String s) {
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                continue;
            }
            newS = newS + s.charAt(i);
        }
        System.out.println("printChar: " + newS);
    }

    //3. Dem so lan xuat hien ki tu
    public static void countChar(char c, String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("countChar = " + count);
    }

    //4. Nhap chuoi ki tu, dem so luong cac tu trong chuoi
    public static int countWord(String s) {
        int wordCount = 0;
        boolean isWord = false;
        int endOfLine = s.length() - 1;
        char[] characters = s.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (Character.isLetter(characters[i]) && i != endOfLine) {
                isWord = true;
            } else if (!Character.isLetter(characters[i]) && isWord) {
                wordCount++;
                isWord = false;
            } else if (Character.isLetter(characters[i]) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }

    //7 Dem so luong nguyen am va phu am xuat hien trong chuoi
    public static void countVowelConsonant(String s) {
        String newS = s.toLowerCase();
        int countVowel = 0;
        int countConsonant = 0;
        for (int i = 0; i < newS.length(); i++) {
            if (newS.charAt(i) == ' ' || newS.charAt(i) == '\0' || s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                continue;
            }
            if (newS.charAt(i) == 'u' || newS.charAt(i) == 'e' || newS.charAt(i) == 'o' || newS.charAt(i) == 'a' || newS.charAt(i) == 'i') {
                countVowel = countVowel + 1;
            }
            if (newS.charAt(i) != 'u' && newS.charAt(i) != 'e' && newS.charAt(i) != 'o' && newS.charAt(i) != 'a' && newS.charAt(i) != 'i') {
                countConsonant = countConsonant + 1;
            }
        }
        System.out.println("countVowel = " + countVowel);
        System.out.println("countConstant = " + countConsonant);
    }
}


