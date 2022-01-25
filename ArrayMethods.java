import java.util.Arrays;

public class ArrayMethods {
   public static void main() {

      int[] array = { 2144, 234, 355, 233, 5654, 7868 };

      Arrays.sort(array);
      Arrays.parallelSort(array);
      System.out.println(Arrays.toString(array));
   }
}
