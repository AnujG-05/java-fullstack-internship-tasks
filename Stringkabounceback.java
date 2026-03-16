import java.util.*;
public class Stringkabounceback {
    public static void main(String[] args) {
        
        String str = "  Hello World  ";
        String str1 = "Hello";
        String str2 = "world";
        String text = "I am Anuj";

        // A. size
        // .length(): returns the size of the string enclosed under "" (inlcluding white spaces), return type integer
        int len = str1.length();
        System.out.println(len);            // 5
        System.out.println("lol ".length());    // 4

        // B. Emptiness
        // .isEmpty(): returns true if the string is empty otherwise false, return type boolean
        String s = "";
        System.out.println(s.isEmpty());    // true;
        System.out.println("str".isEmpty());  // false

        // C. Character Access
        // .charAt(index: ): returns the character at specified index, return type char
        char ch0 = text.charAt(0);
        System.out.println(ch0);               // I
        System.out.println("5* coder".charAt(1));  // *

        // D. Substring / Extraction
        // .substring(beginning index:, ending index:) => [)
        System.out.println(text.substring(5));      // Anuj
        System.out.println(str1.substring(1, 5));   // ello
        System.out.println("goal".substring(0, 3));  // goa
        
        // E. Concatenation
        // .concat(string: ): concates two string
        System.out.println(str1.concat("i"));  // Helloi
        System.out.println(str1 + " ".concat(text));   //Hello I am Anuj

        // F. Case Conversion
        // .toUpperCase(): capitalize all letters in the string; .toLowerCase() does opposite
        System.out.println(str2.toUpperCase());  // WORLD
        System.out.println("gUptA".toLowerCase()); // gupta

        // G. Trimming
        // .trim(): removes whitespacesn present in the beginning and end of the string
        System.out.println(str.trim());   // Hello World
        System.out.println("     sky is blue ".trim());   // sky is blue

        // H. Replacement
        // .replace(old char:, new char:): returns the string with replacements of all the old char with the new char
        System.out.println(str1.replace("H", "c")); // cello
        System.out.println("WorldclubseLll".replace("l", ""));   // WordcubseL

        // I. Comparison
        // .equals(string:): boolean type, true if exact equal
        System.out.println("world".equals(str2));   // true
        System.out.println(str2.equalsIgnoreCase("WOrld"));  // true
        
        // .compareTo(string:): lexicographical comparison, return type integer
        System.out.println("anuj".compareTo("anuj"));   // 0
        System.out.println("Anuj".compareTo("azul"));   // -32  see here, 65(ascii value of A)-97(ascii value of a)
        System.out.println("anuj".compareTo("anil"));   // 12   distance of [i,u)

        // .startsWith(prefix: ): true if the string starts with the prefix specified in ()
        System.out.println(str.startsWith(str1));   // false

        String trimmed = str.trim();
        System.out.println(trimmed.startsWith(str1));

        // .endsWith(suffix: ): true if the string ends with the suffix specified in ()
        System.out.println(str2.endsWith(trimmed)); // false
        System.out.println(trimmed.endsWith(str2));  // false
        System.out.println(trimmed.endsWith(str2.replace("w","W")));  // true

        System.out.println();
        System.out.println();

        // doubt cleared
        String s1 = " lol";
        System.out.println(s1.startsWith(" ")); // true;
        System.out.println(s1.startsWith(" l")); // true;
        System.out.println(s1.startsWith(" lol")); // true;
        System.out.println(s1.startsWith("lol")); // false;
        System.out.println(s1.startsWith("l")); // false;
        
        System.out.println(s1.endsWith(" ")); // false;
        System.out.println(s1.endsWith(" l")); // false;
        System.out.println(s1.endsWith(" lol")); // true;
        System.out.println(s1.endsWith("lol")); // true;
        System.out.println(s1.endsWith("l")); // true;   
        
        System.out.println();
        System.out.println();

        // J. Searching
        // .contains(String:)
        System.out.println(str.contains(str1));   // true
        System.out.println(str.contains("ello"));   // true
        System.out.println(str1.contains(str));   // false
        
        // .indexOf(String)
        System.out.println(text.indexOf("a"));  // 2
        System.out.println(text.indexOf("Anuj"));  // 5

        // .lastIndexOf(String)
        System.out.println(str.lastIndexOf(str1));  // 2
        System.out.println(str2.lastIndexOf("or")); // 1

        // K. Splitting
        // .split(String)  return type String[]
        String[] splitted = str.split("l"); // [  He, , o Wor, d  ]
        System.out.print(Arrays.toString(splitted));

        System.out.println();

        // L. Conversion
        // .toCharArray()   return type char[]
        char[] ch= str.toCharArray();
        System.out.print(Arrays.toString(ch));  // [ ,  , H, e, l, l, o,  , W, o, r, l, d,  ,  ]
        
        System.out.println();

        // point to be noted 
        System.out.print(Arrays.toString("I'mAnuj".toCharArray()));   // [I, ', m, A, n, u, j]
    }
}


// Summary:
// Size/Emptines: "length(), isEmpty()",
// Character Access: charAt(int index),
// Substring: "substring(int begin), substring(int begin, int end)",
// Concatenation: "concat(String), + operator",
// Case:"toUpperCase(), toLowerCase()",
// Whitespace: trim(),
// Replacement: "replace(char old, char new)",       Extra: "Also replaceAll, replaceFirst (not in your code)"
// Comparison: "equals(Object), equalsIgnoreCase(String), compareTo(String), startsWith(String), endsWith(String)",
// Search: "contains(CharSequence), indexOf(String), lastIndexOf(String)",
// Split/Convert: "split(String regex), toCharArray()".