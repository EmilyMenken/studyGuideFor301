public class practicing {
    
public static void main(String[] args) {
    
int [] numbersArray = {1, 2, 3, 7, 8, 9, 10, 17, 92, 28};


System.out.println(differenceBetweenLargestNumSmallestNum(numbersArray));


} //end main

//  largestNum - smallestNum, array
// int largestNum/smallestNum = numbersArray[0];

// int [] numbersArray = {} in main
// for each loop, looping through the array for(int number : numbersArray)if (largestNum<number) largestNum = number;
// int result = largestNum - smallestNum, return result
public static int differenceBetweenLargestNumSmallestNum (int[] numbersArray){

    int largestNum = numbersArray[0];
    int smallestNum = numbersArray[0];

for(int number : numbersArray){

if(largestNum<number){
largestNum=number;

} else if (smallestNum>number){
smallestNum=number;

}
}//end for
int result = largestNum-smallestNum; //92-1, expected res =91
return result;

}//end method


}//end .java
