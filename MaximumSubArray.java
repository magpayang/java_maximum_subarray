package com.company;

public class MaximumSubArray {
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

    public int MaximSubArrayDivideandConquer(ArrayClass someObject, int ldx, int hdx){
        someObject.setLower_idx(ldx);
        someObject.setHigher_idx(hdx);

        if (someObject.getLower_idx() == someObject.getHigher_idx()){
            return someObject.ValueOnIndex(someObject.getLower_idx());
        }
        else{
            int mdx = (int)(someObject.getLower_idx() + someObject.getHigher_idx())/2;

//            someObject.setLower_idx(ldx);
            someObject.setMidpoint_idx(mdx);
//            someObject.setHigher_idx(hdx);

            int current_ldx = someObject.getLower_idx();
            int current_mdx = someObject.getMidpoint_idx();
            int current_hdx = someObject.getHigher_idx();

            int Left_sum = MaximSubArrayDivideandConquer(someObject, current_ldx, current_mdx);
            int Left_ldx = someObject.getLower_idx();
            int Left_hdx = someObject.getHigher_idx();

            int Cross_sum = MaximSubArrayCross(someObject, current_ldx, current_mdx, current_hdx);
            int Cross_ldx = someObject.getLower_idx();
            int Cross_hdx = someObject.getHigher_idx();

            int Right_sum = MaximSubArrayDivideandConquer(someObject, current_mdx + 1, current_hdx);
            int Right_ldx = someObject.getLower_idx();
            int Right_hdx = someObject.getHigher_idx();

            if (Left_sum >= Right_sum && Left_sum >= Cross_sum){
                someObject.setLower_idx(Left_ldx);
                someObject.setHigher_idx(Left_hdx);
                return Left_sum;
            }else if (Right_sum >= Left_sum && Right_sum >= Cross_sum){
                someObject.setLower_idx(Right_ldx);
                someObject.setHigher_idx(Right_hdx);
                return Right_sum;
            }else{
                someObject.setLower_idx(Cross_ldx);
                someObject.setHigher_idx(Cross_hdx);
                return Cross_sum;
            }

        }
    }

    public int MaximSubArrayCross(ArrayClass someObject, int ldx, int mdx, int hdx){
        int [] temp_array = someObject.getInput_array();

        int [] LeftArray = new int[mdx - ldx + 1];
        int LeftSum = Integer.MIN_VALUE;

        int sum = 0;
        for (int i = mdx; i > ldx - 1; --i){
            sum += temp_array[i];
            if (sum > LeftSum){
                LeftSum = sum;
                someObject.setLower_idx(i);
            }
        }

        int [] RightArray = new int[hdx - mdx];
        int RightSum = Integer.MIN_VALUE;

        sum = 0;
        for (int i = mdx + 1; i < hdx + 1; ++i){
            sum += temp_array[i];
            if (sum > RightSum){
                RightSum = sum;
                someObject.setHigher_idx(i);
            }
        }

        return LeftSum + RightSum;
    }


}
