import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int a1[][]={
	            {1,2,3},
	            {4,5,6},
	            {7,8,9}
	    };
	     int a2[][]={
	            {1,2,3},
	            {4,5,6},
	            {7,8,9}
	    };
	    
	    
	    
		System.out.println("Arrays Equals\n"+Arrays.equals(a1,a2));
		System.out.println("Arrays Deep Equals\n"+Arrays.deepEquals(a1,a2));
	}
}

