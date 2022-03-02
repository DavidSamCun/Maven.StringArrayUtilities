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

        ArrayList<String> =
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

        return null;
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
