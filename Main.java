package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //divide and conquer algo for maximum subarray problem
//    int my_array[] = {-9,8,-7,6,-5,4,-3,2,-1,0};
//    int my_array[] = {0,-9,8,-7,6,-5,4,-3,2,-1};
//    int my_array[] = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7}; // Introduction to Algorithms
    int my_array[] = {-1,-2,-3,-4,-5};
//        int my_array[] = {-2, -5, 6, -2, -3, 1, 5, -6};  // Geeks for Geeks        System.out.println(Arrays.toString(my_array));

        MaximuSubArray obj0 = new MaximuSubArray();

        System.out.println(Arrays.toString(obj0.Brute(my_array)));

    }
}

