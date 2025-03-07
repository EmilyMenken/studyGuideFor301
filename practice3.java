import java.util.HashSet;


public class practice3 {
    
    // Count how many words are longer than n characters and shorter than m characters in:
    // An array
    // An ArrayList
    // A HashSet ✅
    // The values of a HashMap

public static void main (String[] args){

HashSet<String> longerThanNShorterThanM= new HashSet<>();


int m = 10; //shorter than 10
int n = 4; //longer than 4

    longerThanNShorterThanM.add("Log");
    longerThanNShorterThanM.add("Noggin");
    longerThanNShorterThanM.add("Carcharodontosaurus");
    longerThanNShorterThanM.add("Jeffery");
    longerThanNShorterThanM.add("Strawberry");
    longerThanNShorterThanM.add("Blizzard");

for(String word: longerThanNShorterThanM){



if (word.length()> n && word.length() <m) {
    
System.out.println(word);


}//end if

}//end for

}//end main



}//end practice3
