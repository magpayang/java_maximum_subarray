package com.company;

public class MaximuSubArray {
    public int [] Brute(int [] input_array){
        //;
        int max_sum = input_array[0];
        int start_index = 0;
        int end_index = 0;
        int running_sum;

        for (int idx = 0; idx < input_array.length; ++idx){
            running_sum = input_array[idx];
            if (running_sum > max_sum){
                max_sum = running_sum;
                start_index = idx;
                end_index = idx;
            }
            for (int jdx = idx + 1; jdx < input_array.length; ++jdx){
                running_sum = running_sum + input_array[jdx];
                if (running_sum > max_sum){
                    max_sum = running_sum;
                    start_index = idx;
                    end_index = jdx;
                }
            }
        }

        int [] return_array = new int[end_index - start_index + 1];
        for (int idx = 0; idx <= end_index - start_index; ++idx){
            return_array[idx] = input_array[start_index + idx];
        }
        return return_array;
    }

}
