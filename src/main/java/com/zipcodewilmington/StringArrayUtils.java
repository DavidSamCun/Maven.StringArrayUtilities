package com.zipcodewilmington;

import java.sql.Array;
import java.util.ArrayList; //Imported for learning
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }   //Done

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }   //Done

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }   //Done

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length -2];
    }   //Done

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        return Arrays.asList(array).contains(value);
    }   //DONE

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        //Array.copyOf(array, array.length) //does not work. only copies
        String[] output = new String[array.length];


        System.out.println(array.length);         //Attempt 2
        int i = 0;
        for (String input : array) {
            output[i] = array[array.length - 1 - i];
            i++;
        }

//        for( int i = 0; i < array.length; i++){    //Attempt 1
//            output[i] = array[array.length -1 - i];
//            System.out.println(array[i]);
//            System.out.println(output[i]);
//        }

        return output;
    }   //Done

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean palindromic = true;
        String[] reverse = StringArrayUtils.reverse(array); //reverse array first

        for (int i = 0; i < array.length ; i++) {
            if (array[i] != reverse[i]) {
                palindromic = false;
                break;
            }
        }

        return palindromic;
    }   //Done

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        ArrayList<String> output = new ArrayList<>();

        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurs = 0;

        for (String test: array){
            if(test.equals(value)){
                occurs++;
            }
        }
        return occurs;
    }   //Done

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        //ArrayList<String> output2 = new ArrayList<>();
        //output2 = ArrayList(array);


        String[] copy = new String[array.length];
        int arraylength = array.length;
        int spot = 0;
        int z = 0;
        int j = 0;  //remove count
        for ( int i = 0; i < array.length-j; i++) {
            if (valueToRemove.equals(array[i])){ //Move to last if equal
                spot = array.length - 1 - i;
                copy[spot] = array[i];
                copy[i] = array [ i + 1];
                j++;
                z++;
                System.out.println("Array index for this is at interation "+ z +" at " + spot + " is " + copy[array.length - 1 -i]);
                z++;
            } else if (!valueToRemove.equals(array[i])) {      //Copy if not equal
               copy[i] = array[i +j];
                System.out.println("Array index for this is at interation "+ z +" at " + i + " is " + copy[i]);
                z++;
            }


//            (!valueToRemove.equals(array[i])) {      //Copy if not equal
//                copy[i] = array[i];
//                System.out.println(copy[i]);
//            } else if (valueToRemove.equals(array[i])){
//            output[i]=array[i + j];
//            i++;
//            j++;
//            System.out.println(output[i]);
//            }
        }
        for ( int i = 0; i < array.length; i++){
            System.out.println(copy[i]);
        }

        String[] output = new String[arraylength -1 - j];
        output = Arrays.copyOfRange(copy, 0, array.length - j);

        return output;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
