package com.akshayLocal.DSA.programs.arrayMatrix;

public class SearchInSortedMatrix {

    public static void main(String args[])
    {

        int[][] a = { {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60},
                {64,75,81,90}};

        int target = 0;
        System.out.println(searchEle(a,4,target));
    }


    public static boolean searchEle(int[][] a,int n , int element)
    {
        int i=0;
        int j = n-1;
        while(i<n && j >0)
        {
            if(a[i][j]==element)
                return true;
            else if(a[i][j]>element)
            {
                j--;
            }
            else if(a[i][j]<element)
            {
                i++;
            }
        }
        return false;
    }

}
