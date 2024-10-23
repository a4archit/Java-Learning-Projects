import java.util.Scanner;

// main class
class TextAnalyser {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking string from user
        System.out.print("Enter some text: ");
        String s = sc.nextLine();
        
        int noOfParagraph = noOfParagraph(s);
        int words = lengthOfText(s);
        int noOfSentences = noOfSentences(s);
        String lWord = getLargestWord(s);
        String sWord = getSmallestWord(s);
        char vowels[] = "aeiou".toCharArray();
        int totalVowels = getTotalVowels(s);
        int vowelCounts[] = getVowelCounts(s);
		int totalWhiteSpaces = getWhiteSpacesCounts(s);
		int totalCharacters = getTotalCharactersCount(s);
        
        
        //displying the output
        System.out.println("\n\tSome Insights : \n\t--------------\n");
        System.out.println("\tTotal paragraphs: "+noOfParagraph);
        System.out.println("\tTotal words     : "+words);
        System.out.println("\tTotal Sentences : "+noOfSentences);
        System.out.println("\tLargest word    : "+lWord);
        System.out.println("\tSmallest word   : "+sWord);
		System.out.println("\tTotal spaces    : "+totalWhiteSpaces);
		System.out.println("\tTotal Characters: "+totalCharacters);
        System.out.println("\n\tVowel insights  : ");
        System.out.println("\t\tTotal   : "+totalVowels);
        for(int i=0; i<vowels.length; i++){
			if (vowelCounts[i] != 0){
            System.out.println("\t\t   | "+vowels[i]+"  : "+vowelCounts[i]);
			}
		}
        sc.close();

        System.out.println();
    }
    
	public static int getTotalVowels(String text){
        // Returns the total number of vowels(int)
        int total = 0;
        // getting vowel insights
        int vowelArr[] = getVowelCounts(text);
        for (int value: vowelArr){
            total += value;
        }
        return total;
    }

	public static int getWhiteSpacesCounts(String text){
        // returns the total number of white spaces
        int counts = 0;
        char textArr[] = text.toCharArray();
        for (char c: textArr){
            if (c == ' '){
                counts++;
            }
        }
        return counts;
    }
    
    public static int getTotalCharactersCount(String text){
        // returns the total number of characters in text
        return text.toCharArray().length;
    }
    
    public static int[] getVowelCounts(String text){
        /********************************************
         * Returns an array of length 5
         * Each index of returnable array will in this format
         *					a -> arr[0]
         *  e -> arr[1]
         *  i -> arr[2]
         *  o -> arr[3]
         *  u -> arr[4]
         *******************************************/
        
        int vowelArr[] = {0,0,0,0,0};
        char[] vowels, textArr;
        
        vowels = "aeiou".toCharArray();
        textArr = text.toCharArray();
        
        for(char character: textArr){
            for(char vowel: vowels){
                if(character == vowel){
                    switch(vowel){
                        case 'a':
                            vowelArr[0]++;
                            break;
                        case 'e':
                            vowelArr[1]++;
                            break;
                        case 'i':
                            vowelArr[2]++;
                            break;
                        case 'o':
                            vowelArr[3]++;
                            break;
                        default:
                            vowelArr[4]++;
                    }
                }
            }
        }
        
        return vowelArr;
    }
    
    public static String getSmallestWord(String text){
    	// This method will return the smallest word from given text 
        String words[] = text.trim().split(" ");
        String smallestWord = words[0];
        for (String word: words){
            if (smallestWord.length() > word.length()){
                smallestWord = word;
            }
        }
        return smallestWord;
    }
    public static String getLargestWord(String text){
        // This method will return the largest word from given text 
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
        // returns the length of given text
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

    public static int noOfParagraph(String s){
        int paragraph;
        paragraph = s.split("\n\n").length;
        return paragraph;
    }

    
    
}
