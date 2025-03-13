public class practicing2 {
    
public static void main(String[] args) {
    
String [] wordsArray = {"Bog","Barrels","Bats","Penguin","BAD!","Barracuda","Anaconda"};

System.out.println("The longest B word is: "+ returnLongestBWord(wordsArray));

}//end main

// longest word that starts with b
// String [] wordsArray {"","","","",};
// String theLongestWord = "";
// for incrementing loop (i++) to get length() of wordsArray
// String word = wordsArray[i];
// if (word.tartsWith("B") && word.length()>theLongestWord.length())

public static String returnLongestBWord(String[] wordsArray){
String theLongestWord = "";

for(int i = 0; i<wordsArray.length; i++){
    String word = wordsArray[i];
    
if(word.startsWith("B") && word.length()>theLongestWord.length()){
theLongestWord = word;

}
}//end for
String result = theLongestWord;
    return result;
}//end method



}//end .java
