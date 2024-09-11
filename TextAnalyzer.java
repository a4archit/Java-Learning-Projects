import java.util.Scanner;

public class TextAnalyzer {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking string from user
        System.out.print("Enter some text: ");
        String s = sc.nextLine();
        
        int words = lengthOfText(s);
        int noOfSentences = noOfSentences(s);
        String lWord = largestWord(s);
        
        //displying the output
        System.out.println("\n\tSome Insights: \n\t--------------\n");
        System.out.println("\tTotal words: " + words);
        System.out.println("\tTotal Sentences: "+noOfSentences+"\n");
        System.out.println("\tLargest Word: "+lWord+"\n");
        
    }
    
    public static String getLargestWord(String text){
        """ This method will return the largest word from given text """
        String words[] = text.trim().split(" ");
        String largestWord = words[0];
        for (String word: words){
            if (largestWord.length() < word.length()){
                largestWord = word;
            }
        }
        return largestWord;
    }
    
    public static int lengthOfText(String text){
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
