public class Fetch_characters {

//reverse
    public static void fetch(String s,int idx)
    {
        if (idx<0)
        {
            return;
        }
        System.out.print(s.charAt(idx));
        fetch(s,idx-1);
    }

    public static void main (String args[])
    {
        fetch("Gourav",6-1);
    }
}
