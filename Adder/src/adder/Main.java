package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide two integers to add");
        }
    }

    private static int addArguments(String[] args) 
    {
    	
    	if (String.valueOf(args[0]).equals( "-"))
    	{
    		
    		return Integer.valueOf(args[1])*-1 + Integer.valueOf(args[2]) *-1;
    	}
    	else
    	{
        return Integer.valueOf(args[1]) + Integer.valueOf(args[2]) ;
    	}
    }
}
