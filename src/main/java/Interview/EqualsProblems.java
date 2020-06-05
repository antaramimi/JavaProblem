package Interview;

public class EqualsProblems {

    public static void main(String[] args) {
        String name="hi";
        String nameSecond= new String("hi");

        System.out.println(name.equals(nameSecond));
        System.out.println(name==nameSecond);

        Integer ch = 12;
        int chSecond=12;

        System.out.println(ch.equals(chSecond));
        System.out.println(ch==chSecond);



    }
}
