import java.util.*;

public class Question2 {
    public static long pythagorasTriplet(){
        long a = 0, b=0 , c=0;
    
        for(long divisor=1; divisor<1000; divisor++){
            if( ((500000-(1000*divisor))%(1000-divisor)) ==0){
                a = (500000 - (1000*divisor))/(1000-divisor);
                b = divisor;
                c = (long)Math.sqrt(a*a + b*b);
                System.out.println("a is " + a + " b is: " + b + " c is : " + c);
                break;
            }
        }
        return a*b*c;
    }
    public static void main(String[] args){
        long ans=pythagorasTriplet();
        System.out.println(ans);
    }
}
