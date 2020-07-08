package codingbatpractice.logic1;

/**
 *Questions:
 *Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
 *Examples:
 *twoAsOne(1, 2, 3) → true
 *twoAsOne(3, 1, 2) → true
 *twoAsOne(3, 2, 2) → false
 */

public class TwoAsOne {
    public boolean twoAsOne(int a, int b, int c) {
     if((a+b==c)||(b+c==a)||(a+c==b)){
         return true;
        }else{
         return false;
        }
    }

}
