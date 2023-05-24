package com.practice11;

public class Main {
    static int arr[]={10,15,69,64,78};
    static int largest()
    {
        int i;
        int max=arr[0];
        for(i=0;i< arr.length;i++)
            if(arr[i]>max)
                max=arr[i];
            return max;

    }


    public static void main(String[] args) {
	// write your code here
        System.out.println("Largest in given array is"+largest());

    }
}
