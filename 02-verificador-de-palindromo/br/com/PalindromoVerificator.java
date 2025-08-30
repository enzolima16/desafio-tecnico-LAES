package br.com;

public class PalindromoVerificator {
    public static boolean palindromoCheck(String f) {
        StringBuilder sb = new StringBuilder();
        for (char c : f.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        String s = sb.toString();

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String f = " ";
        System.out.println(PalindromoVerificator.palindromoCheck(f));
    }
}