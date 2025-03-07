public class practice {
     
// Find the difference between the largest and smallest integer in:
// An array ✅
// An ArrayList
// A HashSet
// The values of a HashMap

static int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

public static int LargestSmallestIntegerDiff(int[] arr){

int min = Integer.MAX_VALUE;
int max = Integer.MIN_VALUE;

for(int number : arr){

if(number<min) min = number;
if(number>max) max = number;


}//end for

int result = max - min;
System.out.println(result);
return result;

}//end LargestVsSmallest

public static void main (String[] args){

// System.out.println(arr [9]- arr[0]); //expected res = 9, difference between 10 and 1 is 9
LargestSmallestIntegerDiff(arr); //expected res = 9

}//end main


}//end practice