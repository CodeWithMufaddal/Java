public class PS2 {

   // This is Called Variable Arguments
   static int arr(int a, int... arr) {
      int result = 0;
      for (int i : arr) {
         result += i;
      }
      return result;
   }

   public static void main(String[] args) {
      System.out.println("the sum is: " + arr(4, 2, 3, 7, 2));
   }

}
