package Practice;

public class BinaryStringProcess {
    public static int secondsToRemoveOccurrences(String s) {
        int seconds = 0;
        
        // Continue processing until no "01" exists
        while (s.contains("01")) {
            s = s.replaceAll("01", "10");
            seconds++;
        }
        
        return seconds;
    }

    public static void main(String[] args) {
        String s = "0110101";
        int result = secondsToRemoveOccurrences(s);
        System.out.println("Output: " + result); // Output: 4
    }
}
 