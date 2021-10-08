package replit_practices.Methods;

public class newCountLetters {

    public static String countLetters(String str) {
        String dupl = "";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (dupl.contains(str.charAt(i) + "")) {
                continue;//  found duplicate char, once found it skip
            }
            dupl += str.charAt(i);
        }
        for (int k = 0; k < dupl.length(); k++) {
            int a = 0;
            for (int j = 0; j < str.length(); j++) {

                if (dupl.charAt(k) == str.charAt(j)) {
                    a++;
                }
            }
            result += a +""+ dupl.charAt(k);
        }
        return result;
    }
    public static void main(String[] args) {
        countLetters("aaaaabbbcc");
    }
}
