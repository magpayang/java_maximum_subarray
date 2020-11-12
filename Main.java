package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //divide and conquer algo for maximum subarray problem
//    int my_array[] = {-9,8,-7,6,-5,4,-3,2,-1,0};
//    int my_array[] = {0,-9,8,-7,6,-5,4,-3,2,-1};
//    int my_array[] = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7}; // Introduction to Algorithms
//    int my_array[] = {-1,-2,-3,-4,-5};
//    int my_array[] = {0,-1,1,1,1};
//    int my_array[] = {0,-1};
//    int my_array[] = {-1,1};
        int my_array[] = {-2, -5, 6, -2, -3, 1, 5, -6};  // Geeks for Geeks        System.out.println(Arrays.toString(my_array));

        ArrayClass someObject = new ArrayClass(0, my_array.length-1, 0, my_array);
        MaximumSubArray Obj0 = new MaximumSubArray();

        int sum = Obj0.MaximSubArrayDivideandConquer(someObject, 0, my_array.length-1);
        System.out.println(sum);

        int [] temp = Obj0.Brute(my_array);
        System.out.println(Arrays.toString(temp));

        for (int i = someObject.getLower_idx(); i < someObject.getHigher_idx() + 1; ++i){
            System.out.print(my_array[i] + " ");
        }

    }
}

