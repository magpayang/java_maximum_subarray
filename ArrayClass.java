package com.company;

public class ArrayClass {
    private int lower_idx;
    private int higher_idx;
    private int midpoint_idx;
    private int [] input_array;

    public ArrayClass(int lower_idx, int higher_idx,  int midpoint_idx, int[] input_array){
        this.lower_idx = lower_idx;
        this.higher_idx = higher_idx;
        this.midpoint_idx = midpoint_idx;
        this.input_array = input_array;
    }

    // getters
    public int getLower_idx(){
        return this.lower_idx;
    }

    public int getHigher_idx(){
        return this.higher_idx;
    }

    public int getMidpoint_idx(){
        return this.midpoint_idx;
    }

    public int[] getInput_array(){
        return this.input_array;
    }

    public int ValueOnIndex(int idx){
        return this.input_array[idx];
    }

    //setters
    public void setLower_idx(int lower_idx){
        this.lower_idx = lower_idx;
    }

    public void setHigher_idx(int higher_idx){
        this.higher_idx = higher_idx;
    }

    public void setMidpoint_idx(int midpoint_idx){
        this.midpoint_idx = midpoint_idx;
    }


}
