public class StringOperations {

    public static void concatenateStrings(int n) {
        String str = "String";
        str += "test";
        System.out.println("String Concatenation:" + str);

        StringBuilder sb = new StringBuilder();
        sb.append("test");
        System.out.println("StringBuilder Concatenation:" + sb.toString());

        StringBuffer sbf = new StringBuffer();
        sbf.append("test");
        System.out.println("StringBuffer Concatenation:" + sbf.toString());
    }

    public static void reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        System.out.println("Reversed using StringBuilder: " + sb.reverse());

        StringBuffer sbf = new StringBuffer(input);
        System.out.println("Reversed using StringBuffer: " + sbf.reverse());
    }

    public static void replaceSubstring(String input, String oldSub, String newSub) {
        String replacedString = input.replace(oldSub, newSub);
        System.out.println("Replaced using String: " + replacedString);

        StringBuilder sb = new StringBuilder(input);
        int index;
        while ((index = sb.indexOf(oldSub)) != -1) {
            sb.replace(index, index + oldSub.length(), newSub);
        }
        System.out.println("Replaced using StringBuilder: " + sb.toString());

        StringBuffer sbf = new StringBuffer(input);
        while ((index = sbf.indexOf(oldSub)) != -1) {
            sbf.replace(index, index + oldSub.length(), newSub);
        }
        System.out.println("Replaced using StringBuffer: " + sbf.toString());
    }

    public static void main(String[] args) {
        int n = 10000;
        System.out.println("\nConcatenation Performance:");
        concatenateStrings(n);

        System.out.println("\nString Reversal:");
        reverseString("JavaProgramming");

        System.out.println("\nString Replacement:");
        replaceSubstring("Hello Java Java", "Java", "Python");
    }
}
