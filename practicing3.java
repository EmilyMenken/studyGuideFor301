public class practicing3 {

public static void main(String[] args) {

String [] wordsArray = {"Dogs","Kitties","Horses","Departments","Plants","Houses"};


countWordsBetweenMN(wordsArray);

}//end main

// count how many words are longer than n but shorter than m. Include n and m?
//      m>word>n
// int n and m
// int n = 4
// int m = 10
// returning int count
// String [] wordsArray = {"","","","","",""};
// for each (String word : wordsArray)
// if (word.length()>n && word.length()<m) print word

public static int countWordsBetweenMN (String[] wordsArray){
   
    int n = 4;
    int m = 10;
    int count = 0;
   
for(String word : wordsArray){

if(word.length()>n && word.length()<m){

count++;
System.out.println(count);

}//end if

}//end for

return count;

}//end method




}//end .java
