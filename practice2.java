import java.util.ArrayList;

public class practice2 {

// Find the longest word that starts with a specific character letter in:
// An array
// An ArrayList ✅
// A HashSet
// The values of a HashMap


public static void main (String[] args){

    ArrayList<String> wordsThatStartWithB= new ArrayList<>();

    wordsThatStartWithB.add("Bat");
    wordsThatStartWithB.add("Anacondaaaaaaaaaaaa");
    wordsThatStartWithB.add("Ball");
    wordsThatStartWithB.add("Barracuda");
    wordsThatStartWithB.add("Baaaaarnacles");
    wordsThatStartWithB.add("Bye");

String theLongestWord = "";


    for(int i = 0; i <wordsThatStartWithB.size(); i++){
        String word = wordsThatStartWithB.get(i);

    if (word.startsWith("B") && word.length() > theLongestWord.length()){
        theLongestWord = word;
    }//end if
    }//end for

System.out.println("The longest word in the arrayList that starts with B is: "+theLongestWord+ "!");

}//end main


}//end practice2