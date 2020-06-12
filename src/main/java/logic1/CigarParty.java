package logic1;

public class CigarParty {

    public static void main(String[] args) {
        cigarParty(30, false);

    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if ((cigars >= 40 && cigars <= 60) && !isWeekend) {
            return true;
        } else if (cigars >= 40 && isWeekend) {
            return true;
        } else {
            return false;
        }
    }

}
