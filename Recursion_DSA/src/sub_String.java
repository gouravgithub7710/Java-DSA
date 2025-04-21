public class sub_String {


    public static void subString(String s,String res,int idx)
    {
        if(idx==s.length()){
            System.out.print(res.length()==0?"null":res);
            return;
        }

        subString(s,res+s.charAt(idx),idx+1);
        subString(s,res,idx+1);
    }
    public static void main(String[] args) {

        subString("abc"," ",0);
    }
}
