package Pattern_programming_Assignment_1;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println();
		System.out.println();
	    int n=10;
	    for(int i=0;i<n;i++)
	    {
	        //////I/////
	        for(int j=0;j<n;j++)
	        {
	            if(i==0||i==n-1||j==n/2)
	                System.out.print("* ");
	            else
	                System.out.print("  ");
	        }
	        ////N////
	        System.out.print("   ");
	         for(int j=0;j<n;j++)
	        {
	            if(j==0||i==j||j==n-1)
	                System.out.print("* ");
	            else
	                System.out.print("  ");
	        }
	        ////E////
	        System.out.print("   ");
	         for(int j=0;j<n;j++)
	        {
	            if(i==0||j==0||i==n/2||i==n-1)
	                System.out.print("* ");
	            else
	                System.out.print("  ");
	        }
	        ////U////
	        System.out.print("   ");
	         for(int j=0;j<n;j++)
	        {
	            if((j==0&&i<n-1)||(i==n-1&&j<n-1&&j>0)||j==n-1&&i<n-1)
	                System.out.print("* ");
	            else
	                System.out.print("  ");
	        }
	        ////R////
	        System.out.print("   ");
	         for(int j=0;j<n;j++)
	        {
	            if(j==0||i==0&&j<n/2||j==n/2&&i<n/2+1||i==n/2&&j<n/2||i-j==n/2)
	                System.out.print("* ");
	            else
	                System.out.print("  ");
	        }
	        
	         ////O////
	         for(int j=0;j<n;j++)
	        {
	            if((i==0&&j!=0&&j!=n-1)||(j==0&&i!=0&&i!=n-1)||(i==n-1&&j!=0&&j!=n-1)||(j==n-1&&i!=0&&i!=n-1))
	                System.out.print("* ");
	            else
	                System.out.print("  ");
	        }
	        
	         ////N////
	        System.out.print("   ");
	         for(int j=0;j<n;j++)
	        {
	            if(j==0||i==j||j==n-1)
	                System.out.print("* ");
	            else
	                System.out.print("  ");
	        }
	        System.out.println();
	    }
		
	}

}
