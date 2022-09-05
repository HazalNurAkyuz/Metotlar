public class OverLoading {
    //add(int,int)
    static int add(int a, int b) {
        System.out.println("1.Metot");
        return a + b;
    }
    //add(int,int,int)
    static int add(int a, int b, int c) {
        System.out.println("2.Metot");
        return a + b + c;
    }
    //add(int,int,double)
    static double add(int a, int b, double c) {
        System.out.println("3.Metot");
        return a + b + c;
    }
    //add(int,double,int)
    static double add(int a, double b, int c) {
        System.out.println("4.Metot");
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(1,2,5.0));
        System.out.println(add(1,2.0,5));


    }
}
