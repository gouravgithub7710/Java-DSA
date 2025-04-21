public class count_specified_character_String {

    public static int count_specified_character_String(String s,int idx,char ch)
    {
        if (idx<0) return 0;

        if (s.charAt(idx)==ch)
        {
            return 1+count_specified_character_String(s,idx-1,ch);
        }

        return 0+count_specified_character_String(s,idx-1,ch);
    }

    public static void main(String[] args) {


        System.out.println( count_specified_character_String("papa",4-1,'a'));
    }
}
