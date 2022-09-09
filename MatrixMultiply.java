import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a[][]={
	         {11,2,2},
	         {1,2,23},
	         {3,55,3}
	    };
	    int b[][]={
	         {1,2,26},
	         {1,3,13},
	         {35,7,3}
	    };
	    int c[][]=new int[3][3],i,j;
	    for(i=0;i<a.length;i++)
	    {
	        for(j=0;j<b.length;j++)
	        {
	            System.out.print((c[i][j]=a[i][j]*b[i][j])+" ");
	        }
	    System.out.println();
	    }
	}
}

