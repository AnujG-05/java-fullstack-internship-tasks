
public class StringMethods {
    public static void main(String[] args) {

        String str = "  Hello World  ";
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "hello";
        String text = "Java programming language";

        // -------- Basic Operations --------

        // Get Length: str.length()
        int length = str.length();
        System.out.println("length(): " + length);

        // Concatenation: str1 + str2, str1.concat(str2)
        String concatPlus = str1 + " " + str2;
        System.out.println("str1 + str2: " + concatPlus);

        String concatMethod = str1.concat(" ").concat(str2);
        System.out.println("concat(): " + concatMethod);

        // Character Access: str.charAt(index)
        char c = str1.charAt(1); // 'e'
        System.out.println("charAt(1): " + c);

        // Substring: str.substring(start, end)
        String sub1 = text.substring(5);        // from index 5 to end
        System.out.println("substring(5): " + sub1);

        String sub2 = text.substring(5, 16);    // [5,16)
        System.out.println("substring(5,16): " + sub2);

        // Replace Characters: str.replace(old, new)
        String replaced = text.replace('a', '@');
        System.out.println("replace('a','@'): " + replaced);

        // Convert Case: toUpperCase(), toLowerCase()
        String upper = text.toUpperCase();
        System.out.println("toUpperCase(): " + upper);

        String lower = text.toLowerCase();
        System.out.println("toLowerCase(): " + lower);

        // Trim Whitespace: trim()
        String trimmed = str.trim();
        System.out.println("trim(): \"" + trimmed + "\"");

        // Compare Strings: equals(), equalsIgnoreCase()
        boolean eq1 = str1.equals("Hello");
        System.out.println("equals(\"Hello\"): " + eq1);

        boolean eq2 = str1.equalsIgnoreCase(str3);  // "Hello" vs "hello"
        System.out.println("equalsIgnoreCase(\"hello\"): " + eq2);

        // Check Prefix/Suffix: startsWith(), endsWith()
        boolean starts = text.startsWith("Java");
        System.out.println("startsWith(\"Java\"): " + starts);

        boolean ends = text.endsWith("language");
        System.out.println("endsWith(\"language\"): " + ends);

        // Search Substring: contains(), indexOf()
        boolean hasProg = text.contains("programming");
        System.out.println("contains(\"programming\"): " + hasProg);

        int idxProg = text.indexOf("programming");
        System.out.println("indexOf(\"programming\"): " + idxProg);

        // Split String: split(" ")
        String sentence = "one two three";
        String[] parts = sentence.split(" ");
        System.out.print("split(\" \"): ");
        for (String p : parts) {
            System.out.print("[" + p + "] ");
        }
        System.out.println();

        // Convert to Char Array: toCharArray()
        char[] chars = str1.toCharArray();
        System.out.print("toCharArray(): ");
        for (char ch : chars) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // -------- Detailed Function List --------

        // length()
        int len2 = text.length();
        System.out.println("length() again: " + len2);

        // charAt(int index)
        char ch0 = text.charAt(0);
        System.out.println("charAt(0): " + ch0);

        // substring(int begin)
        String sub3 = text.substring(10);
        System.out.println("substring(10): " + sub3);

        // substring(int begin, int end)
        String sub4 = text.substring(0, 4); // "Java"
        System.out.println("substring(0,4): " + sub4);

        // concat(String str)
        String concat3 = "Java".concat(" Rocks");
        System.out.println("concat(\"Java\",\" Rocks\"): " + concat3);

        // equals(String str)
        boolean e1 = "abc".equals("abc");
        System.out.println("equals(\"abc\"): " + e1);

        // equalsIgnoreCase(String str)
        boolean e2 = "ABC".equalsIgnoreCase("abc");
        System.out.println("equalsIgnoreCase(\"abc\"): " + e2);

        // compareTo(String str)
        int cmp = "apple".compareTo("banana");
        System.out.println("compareTo(\"banana\"): " + cmp);

        // contains(CharSequence s)
        boolean containJava = text.contains("Java");
        System.out.println("contains(\"Java\"): " + containJava);

        // startsWith(String prefix)
        boolean sw = text.startsWith("J");
        System.out.println("startsWith(\"J\"): " + sw);

        // endsWith(String suffix)
        boolean ew = text.endsWith("e");
        System.out.println("endsWith(\"e\"): " + ew);

        // indexOf(String str)
        int idx1 = text.indexOf("a");   // first 'a'
        System.out.println("indexOf(\"a\"): " + idx1);

        // lastIndexOf(String str)
        int idx2 = text.lastIndexOf("a");  // last 'a'
        System.out.println("lastIndexOf(\"a\"): " + idx2);

        // toLowerCase()
        System.out.println("toLowerCase(): " + text.toLowerCase());

        // toUpperCase()
        System.out.println("toUpperCase(): " + text.toUpperCase());

        // trim()
        String spaced = "   Java   ";
        System.out.println("Before trim: \"" + spaced + "\"");
        System.out.println("After trim: \"" + spaced.trim() + "\"");

        // replace(char old, char new)
        String rep = "banana".replace('a', 'o');
        System.out.println("replace('a','o'): " + rep);

        // split(String regex)
        String data = "red,green,blue";
        String[] colors = data.split(",");
        System.out.print("split(\",\"): ");
        for (String color : colors) {
            System.out.print("[" + color + "] ");
        }
        System.out.println();

        // toCharArray()
        char[] arr = "ABC".toCharArray();
        System.out.print("toCharArray(\"ABC\"): ");
        for (char ch : arr) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // isEmpty()
        String empty = "";
        String nonEmpty = "x";
        System.out.println("empty.isEmpty(): " + empty.isEmpty());
        System.out.println("nonEmpty.isEmpty(): " + nonEmpty.isEmpty());
    }
}
