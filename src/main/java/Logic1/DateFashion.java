package Logic1;

public class DateFashion {

    public static void main(String[] args) {
        dateFashion(5, 10);
    }

    public static int dateFashion(int you, int date) {

        if (you <= 2 || date <= 2){
            return 0;
        }
        if(you >= 8 || date >= 8) {
            return 2;
        } else {
            return 1;
        }
    }
}




