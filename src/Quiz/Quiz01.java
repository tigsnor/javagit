package Quiz;

public class Quiz01 {

	public static void main(String[] args) 
	{
		
		   
	   for(int x=2 ; x<=9 ; x++)
	   {
		   int result = 1;
		   result = result*x;
		    for(int y=1 ; y<=9 ; y++)
	        {
		    	if(y!=1)
		    	{
	            System.out.printf("%-2d", x);
	            	for(int z=2 ; z<=y ; z++) 
	            	{
	            		System.out.printf("X %-2d",x);
	            	}
	            System.out.printf("= %-2d%n", result);
		    	}
		    	else
		    	{
	            System.out.printf("%-2dX %-2d=%2d%n",x,y,x*y);
		    	}
	        }
	    System.out.println(" ");   
	      }
    }
}
