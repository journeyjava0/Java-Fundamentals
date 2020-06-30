package labs_examples.arrays.labs;

/**
 *  Reversing an array in place
 *
 *
 *      This is a very common interview challenge.
 *
 *      Using a for loop, please demonstrate how to reverse the nums[] array in place using only one extra variable. Please note,
 *      you cannot use a second array and you cannot instantiate any new variables in the class below.
 *
 *      Hint: you have two index
 *
 */
public class Exercise_06 {

    public static void main(String[] args){
        int[] nums = {45, 87, 62, 99, 1, 42, 12};

        int temp;

        // Question: in the for loop below, why do we divide "nums.length" by 2?
        //Answer: because each time the last index of the array is moved to the beginning, the first index is
        //also moved to the end so because you're moving 2 elements each time, you only need to iterate through
        //the array half as many times.
        for(int i = 0; i < nums.length/2; i++){
            // swap elements at indexes in array
            // you have two indices readily available for you to use "i" (which increments) and "nums.length"
            // you've also got this "temp" variable you can use to hold a value temporarily
            temp = nums[i]; //storing each number in temp from it's first position to use it later
            nums[i] = nums[nums.length - (1+i)]; //element at the beginning is replaced by the last element
            nums[nums.length - (1+i)] = temp; //the last element receives the value of the first element
            }
        //at the end of the for loop, the order of elements from line 18 is now reversed
        System.out.print("Contents of array after for loop - ");

        // print each element of the array to verify reverse order
        for(int i : nums){
            System.out.print(i + " ");
        }
    }
}
