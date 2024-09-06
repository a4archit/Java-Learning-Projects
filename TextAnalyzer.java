import java.util.Scanner;

public class TextAnalyzer {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking string from user
        System.out.print("Enter some text: ");
        String s = sc.nextLine();
        int words = getWords(s);
        System.out.println("Total words: " + words);
    }
    
    public static int getWords(String text){
        int words;
        words = text.trim().split(" ").length;
        return words;
    }
    
}
