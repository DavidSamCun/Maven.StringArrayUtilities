package com.zipcodewilmington;

import java.sql.Array;
import java.util.ArrayList; //Imported for learning
import java.util.Arrays;
import java.util.Locale;

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

        for ( int i = 0; i < array.length; i ++){
            if(array[i].equals(value)){
                return true;
            }
        }
        return false;
        //return Arrays.asList(array).contains(value);
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
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String oneword = "";
        boolean[] lettertrue = new boolean[26];
        for (int i = 0; i < array.length; i++){
            oneword += array[i];
        }
        oneword = oneword.replace(" ", "");
        oneword = oneword.toLowerCase(Locale.ROOT);
        System.out.println(oneword);

        for (int i = 0; i < oneword.length(); i++){
                int letter = oneword.charAt(i) - 'a';
                lettertrue[letter] = true;
        }

        for (int i = 0; i< 26; i++){
            if(!lettertrue[i])
                return false;
        }
        return true;
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

        String[] copy = new String[array.length];
        int spot = 0;
        int j = 0;  //remove count
        for ( int i = 0; i < array.length-j; i++) {
            if (valueToRemove.equals(array[i])){                //Move to last if equal
                spot = array.length - 1 - i;
                copy[spot] = array[i];
                copy[i] = array [ i + 1];
                j++;
            } else if (!valueToRemove.equals(array[i])) {      //Copy if not equal
               copy[i] = array[i +j];
            }
        }
        String[] output = new String[array.length -1 - j];
        output = Arrays.copyOfRange(copy, 0, array.length - j);
        return output;
    } //Done

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        String[] hold = new String[array.length];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            hold[j] = array[i];
            while(i + 1 < array.length && hold[j].equals(array[i+1])){
                hold[j] = array[i];
                i++;
            }
            System.out.println(hold[j]);                                  //once it stops matching, move to next index j for hold array
            j++;
        }
        String[] output = new String[j];
        output = Arrays.copyOfRange(hold, 0, j);                      //Copy values to output array

            return output;
        }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        String[] hold = new String[array.length];           //Declare hold array
        int j = 0;                                          //Position of hold array

        for (int i = 0; i < array.length; i++) {
            hold[j] = array[i];                                             //Hold the first value
            while (i + 1 < array.length && array[i].equals(array[i+1]) ) {  //If first condition is true, compare index i and i+1
                hold[j] += array[i + 1];                                    //concatonate String if same
                i++;                                                        //move to next array[i] index
                }
            //System.out.println(hold[j]);                                  //once it stops matching, move to next index j for hold array
            j++;
        }
        String[] output = new String[j];
        output = Arrays.copyOfRange(hold, 0, j);                      //Copy values to output array

        return output;
    }   //Done


}
