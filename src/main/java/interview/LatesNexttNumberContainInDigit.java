package interview;

/**
 * How to find largest number less than a given number and without a given digit?
 *
 * Write a java program to find the largest number ‘L’ less than a given number ‘N’
 * which should not contain a given digit ‘D’.
 * For example, If 145 is the given number and 4 is the given digit,
 * then you should find the largest number less than 145 such that it should not contain 4 in it.
 * In this case, 139 will be the answer. This program is one of the logical programs in java
 */

public class LatesNexttNumberContainInDigit {
    public static void main(String[] args) {
        System.out.println(getLThanN(123, 2));
        System.out.println(getLThanN(4582, 5));
        System.out.println(getLThanN(98512, 5));
        System.out.println(getLThanN(548624, 8));
    }

    //syntax String.valueOf() :can whatever you pass as a parameter is converted to String
    // and returned..
    public static int getLThanN(int number,int digit){
        for(int i=number;i>0;i--){
            if(!String.valueOf(i).contains(String.valueOf(digit))){
                return i;
            }
        }
        return -1;
    }

}
