import java.util.ArrayList;
import java.util.Scanner;

// COLLECTION Question 1
// Name: Tran Thanh Ngan Vu

class q2  {
    public static void main(String[] args) {
        LongWords x = new LongWords();
        x.createWords();
    }
}

class LongWords {
    ArrayList <String> wordlist = new ArrayList<String>();

    public void createWords() {
        Scanner input = new Scanner(System.in);
        String blank = "";
        int f = 0;
        for (int i = 0; f < 10000; i++) {
            System.out.print("Enter word " + (i+1) + ": ");
            String word = input.nextLine();
            if (word == blank) {
                System.out.println();
                System.out.println("Done");
                f = 1000009;
                System.out.println();
            }
            wordlist.add(word);
            System.out.println("Your word list has " + (i+1) + " words");
            for (String words: wordlist) {
                System.out.println(words);
            }
        }
    }
}
