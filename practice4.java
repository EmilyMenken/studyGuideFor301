import java.util.HashMap;

public class practice4 {
    
    // Find the difference between the how many odd and even numbers there are in:
    // An array
    // An ArrayList
    // A HashSet
    // The values of a HashMap ✅
    

public static void main(String[] args) {
    
HashMap<Character, Integer> alphabet = new HashMap<>();

int countEven = 0;
int countOdd = 0;

alphabet.put('A', 1);
alphabet.put('B', 2);
alphabet.put('C', 3);
alphabet.put('D', 4);
alphabet.put('E', 5);
alphabet.put('F', 6);
alphabet.put('G', 7);
alphabet.put('H', 8);
alphabet.put('I', 9);
alphabet.put('J', 10);
alphabet.put('K', 11);
alphabet.put('L', 12);
alphabet.put('M', 13);
alphabet.put('N', 14);
alphabet.put('O', 15);
alphabet.put('P', 16);
alphabet.put('Q', 17);
alphabet.put('R', 18);
alphabet.put('S', 19);
alphabet.put('T', 20);
alphabet.put('U', 21);
alphabet.put('V', 22);
alphabet.put('W', 23);
alphabet.put('X', 24);
alphabet.put('Y', 25);
alphabet.put('Z', 26);

// alphabet.put('o', 27); -extra value for testing that it's not JUST returning 0


for(int oddVsEven : alphabet.values()){

if(oddVsEven %2 == 0){
countEven++;

}//end if
else{
countOdd++;

}//end else
}//end for

int result = countOdd-countEven; //expected res= 0, 13(even)-13(odd)=0
System.out.println(result);



System.out.println(sum(alphabet));


}//end main


public static int sum(HashMap<Character, Integer> adding){

int evenCount =0;
int oddCount =0;

    for(int summing : adding.values()){


        if(summing %2 == 0){

            evenCount++;



}//end if
            else{

                oddCount++;

        }//end else

}//end for

int result = evenCount + oddCount;
return result;

}//end method




















}//end practice4
