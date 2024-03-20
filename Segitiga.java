
public class Segitiga {
    
    static int Keliling(int a, int b, int c){
        return a + b + c;
    }
    
    static double Keliling(double a, double b, double c){
        return a + b + c;
    }
    
    public static void main(String[] args) {
        System.out.println(Keliling(2, 3, 4));
        System.out.println(Keliling(2.0, 3.0, 4.0));
    }
}
