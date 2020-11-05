import java.util.*;

public class Question3 {

   public static int solution() {

        int n = 0, dow = 2;
        int[] months = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      
        for (int y = 1901; y <= 2000; y++) {
          int fact=0;
          if((y % 4 == 0 && y % 100 != 0 || y % 400 == 0)){
              fact=1;
          }
          months[1] = 28 +fact;
      
          for (int month: months) {
            dow+= month % 7;
            if (dow % 7 == 0) {
              n++;
            }
          }
        }
        return n;
      }
    public static void main(String[] args) {
        int count=solution();
        System.out.println(count); //171
      }
}
