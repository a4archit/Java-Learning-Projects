import java.util.Scanner;

public class TextAnalyzer {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking string from user
        System.out.print("Enter some text: ");
        String s = sc.nextLine();
        
        int words = getWords(s);
        int noOfSentences = noOfSentences(s);
        //displying the output
        System.out.println("\n\tSome Insights: \n\t--------------\n");
        System.out.println("\tTotal words: " + words);
        System.out.println("\tTotal Sentences: "+noOfSentences+"\n\n");
    }
    
    public static int getWords(String text){
        int words;
        words = text.trim().split(" ").length;
        return words;
    }

    public static int noOfSentences(String s){
        String[] sa = s.split("[.!?]+");
        int no = 0;
        for(String sentence: sa){
            if (!sentence.trim().isEmpty()){
                no++;
            }
        }
        return no;
    }
    
}
