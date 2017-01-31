package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } 
        
        catch (IllegalArgumentException e) {
            System.err.println("Invalid argument entered");}
            catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Please provide exactly two integers");   
        }
    }

    private static int addArguments(String[] args) {
        return Integer.valueOf(args[0]) + Integer.valueOf(args[1]) ;
    }
}
