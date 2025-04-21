public class remove_specified_character_String {

    public static String removeChar(String s,int idx ,char ch)
    {
        if (idx<0) return " ";

        if (s.charAt(idx)==ch){
           return removeChar(s,idx-1,ch);
        }
        return removeChar(s,idx-1,ch)+s.charAt(idx);

    }
    public static void main(String[] args) {

        System.out.println(removeChar("prakash",7-1,'a'));//prksh
    }
}
