package Day2;

public class Reverse_String {

    public static void main(String[] args) {
        String name = "Gourav";

        StringBuilder sb = new StringBuilder(name);

        name = sb.reverse().toString();

        System.out.println(name);
    }
}
