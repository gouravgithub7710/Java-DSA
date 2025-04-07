public class Fetch_characters_Forward_direc {

public static void Fetchcharacters_forward(String s,int idx)
{
    if (idx<0){return;}
    Fetchcharacters_forward(s,idx-1);
    System.out.print(s.charAt(idx));
}
    public static void main(String[] args) {
        Fetchcharacters_forward("Gourav",6-1);
    }
}
