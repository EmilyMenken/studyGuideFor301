public class practice {
     
// Find the difference between the largest and smallest integer in:
// An array ✅
// An ArrayList
// A HashSet
// The values of a HashMap


public static int LargestSmallestIntegerDiff(int[] arr){

// int min = Integer.MAX_VALUE;
// int max = Integer.MIN_VALUE;

int min2 = arr[0];
int max2 = arr[0];


for(int number : arr){

if(number<min2) min2 = number;
if(number>max2) max2 = number;


}//end for

int result = max2 - min2;

return result;

}//end LargestVsSmallest

public static void main (String[] args){

int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

// System.out.println(arr [9]- arr[0]); //expected res = 9, difference between 10 and 1 is 9

System.out.println(LargestSmallestIntegerDiff(arr)); //expected res = 9


System.out.println(MaxVsMinPlusTwo(arr));

}//end main



// diff between min and max +2



public static int MaxVsMinPlusTwo(int[] plus) {

int max = plus[0];
int min = plus[0];

for( int dog : plus){

if (dog<min) {
    
min = dog;

} else if (dog>max){

max = dog;

}

}

int result = max-min;

result += 2;

return result;

}//end method


}//end practice