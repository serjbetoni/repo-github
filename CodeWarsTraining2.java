package java_lessons;
import java.util.*;

public class CodeWarsTraining2 {
//    CodeWars task 7 kyu

//    Implement a function that accepts 3 integer values a, b, c. The function should
//    return true if a triangle can be built with the sides of given length and false in any other case.
    public static boolean isTriangle(int a, int b, int c){
        return a + b > c && b + c > a && c + a > b ? true : false;
    }

//    You are given array of integers, your task will be to count all pairs in that array and return their count.
//    Notes:
//    Array can be empty or contain only one value; in this case return 0
//    If there are more pairs of a certain number, count each pair only once. E.g.: for [0, 0, 0, 0]
//    the return value is 2 (= 2 pairs of 0s)
//    Random tests: maximum array length is 1000, range of values in array is between 0 and 1000
    public static int duplicates(int[] array) {
        Arrays.sort(array);
        int numOfPairs = 0;
        int i = 0;
        while (i < array.length) {
            int number = array[i];
            int count = 1;
            i++;
            while (i < array.length && array[i] == number) {
                count++;
                i++;
            }
            if (count >= 2) {
                numOfPairs = numOfPairs + count / 2;
            }
        }
        return numOfPairs;
    }

//    Your car is old, it breaks easily. The shock absorbers are gone and you think it can
//    handle about 15 more bumps before it dies totally.
//    Unfortunately for you, your drive is very bumpy! Given a string showing either
//    flat road ("_") or bumps ("n"), work out if you make it home safely. 15 bumps or under,
//    return "Woohoo!", over 15 bumps return "Car Dead".
    public static String bumps(final String road) {
        char[] roadChar = road.toCharArray();
        int result = 0;
        for (int i = 0; i < roadChar.length; i++){
            if (roadChar[i] == 'n'){
                result++;
            }
        }
        if (result >= 15) {
            return "Car Dead";
        } else {
            return "Woohoo!";
        }
    }

//    Find the greatest common divisor of two positive integers. The integers can be large,
//    so you need to find a clever solution.
//    The inputs x and y are always greater or equal to 1, so the greatest common divisor
//    will always be an integer that is also greater or equal to 1.
    public static int compute(int x, int y) {
        int divider = 1;
        int biggerNum;
        if (x >= y) {
            biggerNum = x;
        } else {
            biggerNum = y;
        }
        int result = 1;
        for (int i = 0; i < biggerNum; i++){
            if (x % divider == 0 && y % divider == 0){
                result = divider;
            }
            divider++;
        }
        return result;
    }

//    In this Kata, we will check if a string contains consecutive letters as they appear
//    in the English alphabet and if each letter occurs only once.
    public static boolean solve(String s){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        System.out.println(sortedString);
        return alphabet.contains(sortedString);
    }

//    Return the number (count) of vowels in the given string.
//    We will consider a, e, i, o, u as vowels for this Kata (but not y).
//    The input string will only consist of lower case letters and/or spaces.
    public static int getCount(String str) {
        String strWithoutVowel = str.replaceAll("[eEuUiIoOaA]","");
        int vowelsCount = 0;
        return vowelsCount = str.length() - strWithoutVowel.length();
    }

//    I will give you an integer. Give me back a shape that is as long and wide as the integer.
//    The integer will be a whole number between 1 and 50.
    public static final String generateShape(int n) {
        String result = "";
        for (int i = n; i > 0; i--){
            for (int j = n; j >= 0; j--){
                if (j == 0 && i != 1){
                    result += "\n";
                } else if (j != 0){
                    result += "+";
                }
            }
        }
        return result;
    }

//    Trolls are attacking your comment section!
//    A common way to deal with this situation is to remove all of the vowels
//    from the trolls' comments, neutralizing the threat.
//    Your task is to write a function that takes a string and return a new string with all vowels removed.
//    For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
//    Note: for this kata y isn't considered a vowel.
    public static String disemvowel(String str) {
        return str.replaceAll("[eEuUiIoOaA]","");
    }

//    Given an integral number, determine if it's a square number:
//    In mathematics, a square number or perfect square is an integer that is the square of an integer;
//    in other words, it is the product of some integer with itself.
//    The tests will always use some integral number, so don't worry about that in dynamic typed languages.
    public static boolean isSquare(int n) {
        if (n < 0) return false;
        if (Math.sqrt((double) n) % 1 == 0) {
            return true;
        } else {
            return false;
        }
    }

//    Consider an array/list of sheep where some sheep may be missing from their place.
//    We need a function that counts the number of sheep present in the array (true means present).
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return (int)Arrays.stream(arrayOfSheeps)
                .filter(c -> c!=null && c==true)
                .count();
    }

//    Your classmates asked you to copy some paperwork for them. You know that
//    there are 'n' classmates and the paperwork has 'm' pages.
//    Your task is to calculate how many blank pages do you need. If n < 0 or m < 0 return 0.
    public static int paperWork(int n, int m) {
        if ( n < 0 || m < 0) return 0;
        else return n * m;
    }

}
