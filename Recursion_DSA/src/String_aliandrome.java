import org.w3c.dom.ls.LSOutput;

public class String_aliandrome {

    public static boolean paliandrome(String s,int si,int ei)
    {
        if (si>=ei) return false;

        if (s.charAt(si)==s.charAt(ei))
        {
             paliandrome(s,si+1,ei-1);
             return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(paliandrome("ABA",0,3-1));
        System.out.println(paliandrome("ABB",0,3-1));
        System.out.println(paliandrome("aabbaa",0,6-1));
        System.out.println(paliandrome("AAbbaa",0,6-1));//case sensitive
    }
}
