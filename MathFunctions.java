import java.lang.Integer; 

public class MathFunctions{
    public static void mathFunctions(String[] args) {
 	int a = Integer.parseInt("111");
	int b = Integer.parseInt("222");
	
	System.out.println(a + b);
	
	
	System.out.println(Integer.compare(a, b));
	System.out.println(Integer.max(a, b));
	System.out.println(Integer.min(a, b));
   
      }
   }
}
