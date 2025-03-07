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

System.out.println("The longest word in the arrayList that starts with B is: "+theLongestWord+ "!"); //expected res = Baaaaarnacles, longest B word at 13

String result = returnShortestB(wordsThatStartWithB);
System.out.println("The shortest word is: " + result);
}//end main



public static String returnShortestB(ArrayList<String> list){
   

    String shortestWord = list.get(0);

    for(int i = 0; i<list.size(); i++){

    String word = list.get(i);

        if(word.startsWith("B") && word.length()<shortestWord.length()){

           shortestWord = word;


        }// end if



}//end for


return shortestWord;

}// end of method


}//end practice2