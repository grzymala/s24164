package com.company;

public class Main {

    public static void main(String[] args)
    {
        int[] arr_a = { 1, 2, 3, 7, 9, 0 };
        int[] arr_b = { 1, 2, 3, 9, 0, 6, 3 };
        int[] arr_c = { 1, 2, 3, 7, 9, 0, 0 };
        int[] arr_d = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // Zadanie 1
        System.out.println("\nZadanie 1");
        printArray(arr_d);
        printArray(reverseArr(arr_d));

        // Zadanie 2
        System.out.println("\nZadanie 2");
        System.out.println(arrayToString(arr_a));

        // Zadanie 3
        System.out.println("\nZadanie 3");
        printArray(arr_d);
        printArray(getEven(arr_d));

        // Zadanie 4
        System.out.println("\nZadanie 4");
        System.out.println(arrayEquals(arr_a, arr_c));

        // Zadanie 5
        System.out.println("\nZadanie 5");
        printArray(arr_a);

        // Zadanie 6
        System.out.println("\nZadanie 6");
        System.out.println(isInArray(arr_a, 7));

        // Zadanie 7
        double[] arr_e = { 1, 2, 3, 4, 5 };
        // (1 + 2 + 3 + 4 + 5) / 5 = 15 / 5 = 3
        System.out.println("\nZadanie 7");
        System.out.println(getAlgebraicMean(arr_e));

        // Zadanie 8
        System.out.println("\nZadanie 8");
        printArray(arr_a);
        System.out.println(isIncreasing(arr_a));
        printArray(arr_b);
        System.out.println(isIncreasing(arr_b));
    }



    // Zadanie 1
    static int[] reverseArr(int[] arr)
    {
        for(int i = 0; i < arr.length/2; i++)
        {
            int tmp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = tmp;
        }

        return arr;
    }



    // Zadanie 2
    static String arrayToString(int[] arr)
    {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr.length; i++)
        {
            sb.append(arr[i]);
            if(i < arr.length-1)
                sb.append(",");
        }

        return sb.toString();
    }



    // Zadanie 3
    static int[] getEven(int[] arr)
    {
        int even = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]%2 == 0)
                even++;
        }

        int u = 0;
        int[] output = new int[even];
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]%2 == 0)
            {
                output[u++] = arr[i];
            }
        }

        return output;
    }

    // Zadanie 4
    static boolean arrayEquals(int[] arr_a, int[] arr_b)
    {
        if(arr_a.length != arr_b.length)
            return false;

        for(int i = 0; i < arr_a.length; i++)
            if(arr_a[i] != arr_b[i])
                return false;

        return true;
    }

    // Zadanie 5
    static void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
            if(i < arr.length-1)
                System.out.print(",");
        }
        System.out.println();
    }

    // Zadanie 6
    static boolean isInArray(int[] arr, int val)
    {
        for(int i = 0; i < arr.length; i++)
            if(arr[i] == val)
                return true;

        return false;
    }

    // Zadanie 7
    static double getAlgebraicMean(double[] arr)
    {
        double sum = 0;
        for(int i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum/arr.length;
    }

    // Zadanie 8
    static boolean isIncreasing(int[] arr)
    {
        for(int i = 1; i < arr.length-1; i++)
            if(arr[i] > arr[i+1])
                return false;

        return true;
    }

}

