/*
    My name is Carter, and I made this bubble sort program for my software and programming Dev class.
    This program takes a list of numbers in an array, and it sorts them from least to greatest, but 
    only if it is needed. In other words, if the two numbers that it analyses are in the right order,
    the program won't flip them, but it will if they aren't.
 */

public class Sort {
    public static void main(String[] args) {
        
        int array[] = {81,34,56,74,23,57,92,90};  // This is the array that is sorted by the rest of the program. 
        
        int aL = array.length;

        for(int i=0; i < aL-1; i++) {
            for(int j=0; j < aL-i-1; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array [j + 1] = temp;
                    for(int x = 0; x < array.length; x++) {
                        System.out.println(x + " = " + array[x]);   // This prints the array. 
                    }
                }
            }
        }
    }
}