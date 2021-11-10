package java_lessons;

public class CodeWarsTraining {

//    CodeWars task 8 and 7 kyu

//    DNA to RNA Conversion
//    Deoxyribonucleic acid, DNA is the primary information storage molecule in biological systems.
//    It is composed of four nucleic acid bases Guanine ('G'), Cytosine ('C'), Adenine ('A'),
//    and Thymine ('T').
//    Ribonucleic acid, RNA, is the primary messenger molecule in cells. RNA differs slightly
//    from DNA its chemical structure and contains no Thymine. In RNA Thymine is replaced
//    by another nucleic acid Uracil ('U').
//    Create a function which translates a given DNA string into RNA.
//    For example:
//            "GCAT"  =>  "GCAU"
//    The input string can be of arbitrary length - in particular, it may be empty.
//    All input is guaranteed to be valid, i.e. each input string will only
//    ever consist of 'G', 'C', 'A' and/or 'T'.
    public String dnaToRna(String dna) {
        return dna.replace("T", "U");
    }

//    I love you, a little , a lot, passionately ... not at all
//    Who remembers back to their time in the schoolyard, when girls would take
//    a flower and tear its petals, saying each of the following phrases each time a petal was torn:
//    I love you
//    a little
//    a lot
//    passionately
//    madly
//    not at all
//    When the last petal was torn there were cries of excitement, dreams, surging thoughts and emotions.
//    Your goal in this kata is to determine which phrase the girls would say for
//    a flower of a given number of petals, where nb_petals > 0.
    public static String howMuchILoveYou(int nb_petals) {
        if(nb_petals%6 == 1){
            return ("I love you");
        }else if(nb_petals%6 == 2){
            return ("a little");
        }else if(nb_petals%6 ==3){
            return ("a lot");
        }else if(nb_petals%6 ==4){
            return ("passionately");
        }else if(nb_petals%6 == 5){
            return ("madly");
        }else{
            return ("not at all");
        }
    }

//    Reversed Strings
//    Complete the solution so that it reverses the string passed into it.
//            'world'  =>  'dlrow'
//            'word'   =>  'drow'
    public static String solution(String str) {
        String result = "";
        int lenghtString = str.length();
        for (int i = lenghtString - 1; i >= 0; i--){
            result = result + str.charAt(i);
        }
        return result;
    }

//    Return the Nth Even Number
//    Example(Input --> Output)
//    1 --> 0 (the first even number is 0)
//            3 --> 4 (the 3rd even number is 4 (0, 2, 4))
//            100 --> 198
//            1298734 --> 2597466
    public static int nthEven(int n) {
        return n * 2 - 2;
    }

//    String repeat
//    Write a function called repeatStr which repeats the given string string exactly n times.
//    repeatStr(6, "I") // "IIIIII"
//    repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"
    public static String repeatStr(final int repeat, final String string) {
        String result = "";
        for (int i = 1; i <= repeat; i++) result += string;
        return result;
    }

//    Keep Hydrated!
//    Nathan loves cycling.
//    Because Nathan knows it is important to stay hydrated,
//    he drinks 0.5 litres of water per hour of cycling.
//    You get given the time in hours and you need to
//    return the number of litres Nathan will drink, rounded to the smallest value.
//    For example:
//    time = 3 ----> litres = 1
//    time = 6.7---> litres = 3
//    time = 11.8--> litres = 5
    public int Liters(double time)  {
        int result = (int) time;
        return result/2;
    }

//    Filter the number
//    Oh no! The number has been mixed up with the text. Your goal is to retreive the number
//    from the text, can you return the number back to it's original state?
//    Task
//    Your task is to return a number from a string.
//    Details
//    You will be given a string of numbers and letters mixed up, you have to return
//    all the numbers in that string in the order they occur.
    public static long filterString(final String value) {
        String str = "";
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) >= '0' && value.charAt(i) <= '9')
                str = str + value.charAt(i);
        }
        long val = Long.valueOf(str);
        return val;
    }

//    Greet Me
//    Write a method that takes one argument as name and then greets that name,
//    capitalized and ends with an exclamation point.
//    Example:
//            "riley" --> "Hello Riley!"
//            "JACK"  --> "Hello Jack!"
    public static String greetMe(String name){
        return ("Hello " + name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase() + "!");
    }

//    Convert boolean values to strings 'Yes' or 'No'.
//    Complete the method that takes a boolean value and return
//    a "Yes" string for true, or a "No" string for false.
    public static String boolToWord(boolean b)
    {
        String result;
        if (b == true){
            result = "Yes";
        } else {
            result = "No";
        }
        return result;
    }

//    Remove First and Last Character
//    It's pretty straightforward. Your goal is to create a function that removes the first
//    and last characters of a string. You're given one parameter, the original string.
//    You don't have to worry with strings with less than two characters.
    public static String remove(String str) {
        int lenghtString = str.length();
        return str.substring(1,(lenghtString - 1));
    }

//    Transportation on vacation
//    After a hard quarter in the office you decide to get some rest on a vacation.
//    So you will book a flight for you and your girlfriend and try to leave all the mess behind you.
//    You will need a rental car in order for you to get around in your vacation.
//    The manager of the car rental makes you some good offers.
//    Every day you rent the car costs $40. If you rent the car for 7 or more days,
//    you get $50 off your total. Alternatively, if you rent the car for 3 or more days,
//    you get $20 off your total.
//    Write a code that gives out the total amount for different days(d).
    public static int rentalCarCost(int d) {
        int everyDayRent = 40;
        int sevenDaysSale = 50;
        int moreThreeDaysSale = 20;
        int totalPrice = 0;
        if ( d < 3){
            totalPrice = everyDayRent * d;
        } else if (d >= 7) {
            totalPrice = everyDayRent * d - sevenDaysSale;
        } else if ( (d >= 3) && ( d < 7)){
            totalPrice = everyDayRent * d - moreThreeDaysSale;
        }
        return totalPrice;
    }

//    Is n divisible by x and y?
//    Create a function that checks if a number n is divisible by two numbers x AND y.
//    All inputs are positive, non-zero digits.
//    Examples:
//            1) n =   3, x = 1, y = 3 =>  true because   3 is divisible by 1 and 3
//            2) n =  12, x = 2, y = 6 =>  true because  12 is divisible by 2 and 6
//            3) n = 100, x = 5, y = 3 => false because 100 is not divisible by 3
//            4) n =  12, x = 7, y = 5 => false because  12 is neither divisible by 7 nor 5
    public static boolean isDivisible(long n, long x, long y) {
        if ( (n % x == 0) && (n % y == 0) ){
            return true;
        } else {
            return false;
        }
    }

//    Opposite number
//    Very simple, given a number, find its opposite.
//    Examples:
//            1: -1
//            14: -14
//            -34: 34
    public static int opposite(int number)
    {
        return number * (-1);
    }

//    Return Negative
//    In this simple assignment you are given a number
//    and have to make it negative. But maybe the number is already negative?
//    Examples
//    Kata.makeNegative(1); // return -1
//    Kata.makeNegative(-5); // return -5
//    Kata.makeNegative(0); // return 0
//    Notes
//    The number can be negative already, in which case no change is required.
//    Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.
    public static int makeNegative(final int x) {
        int negativeNumber = x;
        if (negativeNumber > 0) {
            negativeNumber = negativeNumber * (-1);
        }
        return negativeNumber;
    }

//    Correct the mistakes of the character recognition software
//    Character recognition software is widely used to digitise printed texts.
//    Thus the texts can be edited, searched and stored on a computer.
//    When documents (especially pretty old ones written with a typewriter),
//    are digitised character recognition softwares often make mistakes.
//    Your task is correct the errors in the digitised text.
//    You only have to handle the following mistakes:
//    S is misinterpreted as 5
//    O is misinterpreted as 0
//    I is misinterpreted as 1
//    The test cases contain numbers only by mistake.
    public static String correct(String string) {
        return string.replace("5", "S").replace("0", "O").replace("1", "I");
    }

//    Double Char
//    Given a string, you have to return a string in which each
//    character (case-sensitive) is repeated once.
//    doubleChar("String") ==> "SSttrriinngg"
//    doubleChar("Hello World") ==> "HHeelllloo  WWoorrlldd"
//    doubleChar("1234!_ ") ==> "11223344!!__  "
    public static String doubleChar(String s){
        String result = "";
        int i = 0;
        while (i < s.length()){
            char c = s.charAt(i);
            result = result + c + c;
            i++;
        }
        return result;
    }

//    Expressions Matter
//    Given three integers a ,b ,c, return the largest number obtained after inserting
//    the following operators and brackets: +, *, ()
//    In other words , try every combination of a,b,c with [*+()] , and return the Maximum Obtained
//    Consider an Example :
//    With the numbers are 1, 2 and 3 , here are some ways of placing signs and brackets:
//            1 * (2 + 3) = 5
//            1 * 2 * 3 = 6
//            1 + 2 * 3 = 7
//            (1 + 2) * 3 = 9
//    So the maximum value that you can obtain is 9.
    public static int expressionsMatter(int a, int b, int c)
    {
        int operationOne = a * (b + c);
        int operationTwo = a * b * c;
        int operationThree = a + b * c;
        int operationFour = (a + b) * c;
        int operationFive= a + b + c;
        int operationSix = a * b + c;
        int maxValue = operationOne;
        if (maxValue < operationTwo) maxValue = operationTwo;
        if (maxValue < operationThree) maxValue = operationThree;
        if (maxValue < operationFour) maxValue = operationFour;
        if (maxValue < operationFive) maxValue = operationFive;
        if (maxValue < operationSix) maxValue = operationSix;
        return maxValue;
    }

//    Grasshopper - Summation
//    Write a program that finds the summation of every number from 1 to num.
//    The number will always be a positive integer greater than 0.
//    For example:
//    summation(2) -> 3
//                    1 + 2
    public static int summation(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) result += i;
        return result;
    }

//    Even or Odd
//    Create a function that takes an integer as an
//    argument and returns "Even" for even numbers or "Odd" for odd numbers.
    public static String even_or_odd(int number) {
        if (number % 2 == 0){
            return "Even";
        } else {
            return "Odd";
        }
    }

//    Find the smallest integer in the array
//    Given an array of integers your solution should find the smallest integer.
//    For example:
//    Given [34, 15, 88, 2] your solution will return 2
//    Given [34, -345, -1, 100] your solution will return -345
//    You can assume, for the purpose of this kata, that the supplied array will not be empty.
    public static int findSmallestInt(int[] args) {
        int result = args[0];
        for (int i=0; i <= args.length - 1; i++){
            if (result >= args[i] ){
                result = args[i];
            }
        }
        return result;
    }

//    Opposites Attract
//    Timmy & Sarah think they are in love, but around where they live,
//    they will only know once they pick a flower each. If one of the
//    flowers has an even number of petals and the other has an odd number
//    of petals it means they are in love.
//    Write a function that will take the number of petals of each flower
//    and return true if they are in love and false if they aren't.
    public static boolean isLove(final int flower1, final int flower2) {
        boolean love;
        if ( (flower1 % 2 == 0) && (flower2 % 2 != 0)){
            love = true;
        } else if ( (flower2 % 2 == 0) && (flower1 % 2 != 0)){
            love = true;
        } else {
            love = false;
        }
        return love;
    }

//    Convert a Number to a String!
//    We need a function that can transform a number into a string.
//    What ways of achieving this do you know?
    public static String numberToString(int num) {
        String result = String.valueOf(num);
        return result;
    }

//    Returning Strings
//    Make a function that will return a greeting statement that uses an input;
//    your program should return, "Hello, <name> how are you doing today?".
    public static String greet(String name)
    {
        return ("Hello, " + name + " how are you doing today?");
    }

//    Multiply
//    This code does not execute properly. Try to figure out why.
    public static Double multiply(Double a, Double b) {
        return a * b;
    }
}

