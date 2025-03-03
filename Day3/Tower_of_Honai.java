package Day3;

public class Tower_of_Honai {

    public static void main(String[] args) {
        Tower_of_Honai t1 = new Tower_of_Honai();
        t1.toh(2,"Source","Destination", "Helper");
    }

    public void toh(int n, String s, String d , String h) {

        if (n==0){return;}

        toh(n-1,s,h,d);
        System.out.println("Disk "+n+" moved from "+s+" to "+d);
        toh(n-1,h,d,s);
    }
}
