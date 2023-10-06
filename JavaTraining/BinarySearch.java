import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    
    //This code is a basic implementation of the binary search algorithm

    public static void main(String[] args){

        int elements = 0, array[],i, target, first, last, middle;
        Scanner scanner = new Scanner(System.in);

        //user input the array size
        System.out.println("Enter number of elements: ");
        elements = scanner.nextInt();

        //initialize the array 
        array = new int[elements];

        //user input the array elements
        System.out.println("Enter " +elements +" elements: ");
        for (i = 0; i < elements; i++)
            array[i] = scanner.nextInt();

        first = 0;
        last = elements - 1;
        middle = elements/2;

        //sort the array in ascending order 
        Arrays.sort(array, first , elements);

        System.out.println("Array after sorting : ");
        System.out.println(Arrays.toString(array));

        //user input the search target
        System.out.println("Enter a value to search: ");
        target = scanner.nextInt();

        //binary search for single target , stops when first one is found
       search(first, last, middle, target, array);


    }

    private static void search(int first, int last, int middle, int target, int[] array)
    {
        while (first <= last){
            if (array[middle] < target)
                first = middle + 1;
            else if (array[middle] == target){
                System.out.println(target +" found at location " +(middle + 1) +".");
                break;
            }
            else 
                last = middle - 1;
            middle = (first + last)/2;

        }
        if (first > last)
            System.out.println(target +" is not present in the list.");


    }
}
