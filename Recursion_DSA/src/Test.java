class Test
{
    public static void method3(){
        System.out.println("method m3 exe started...");
        System.out.println("method m3 exe ended...");
    }
    public static void method2(){
        System.out.println("method m2 exe started...");
        method3();
        System.out.println("method m2 exe ended...");
    }
    public static void method1(){
        System.out.println("method m1 exe started...");
        method2();
        System.out.println("method m1 exe ended...");
    }
    public static void main(String[] args)
    {
        System.out.println("main method exe started...");
        method1();
        System.out.println("main method exe ended...");
    }
}