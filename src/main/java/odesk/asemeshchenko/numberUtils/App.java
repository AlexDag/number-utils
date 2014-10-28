package odesk.asemeshchenko.numberUtils;

/**
 * Main Utils class
 *
 */
public class App 
{
	
	static private String HELP = "run options:\n  -rotate [shift] [number array]\nExample:-rotate 2 1,2,3,4,5,6";
	
	/**
	 * 
	 * @param args - expects three parametes :operation, shift and string of numbers coma separated
	 */
    public static void main( String[] args )
    {
        System.out.println( "Hello Number Utils!" );

        
        if(args.length>0 &&  "-help".equals(args[0])){
        	System.out.println(HELP);
        	return;
        }
        
        if(args.length<3){
        	System.out.println("Some options are wrong\nPlease,try with -help option");
        	return;
        }
        
        
       
        
        int shift= Integer.parseInt(args[1]); 
        String[] arrayString =  args[2].split(",");
        int[]array = new int[arrayString.length]; 
        
        for (int i = 0; i < arrayString.length; i++) {
			array[i] = Integer.parseInt(arrayString[i]);
			
		}
        
        switch (args[0]) {
		case "-rotate":
			int[] result= RotatePosition.rotate(shift, array);
			for (int i : result) {
				System.out.println(i);
			}
			
			break;

		default:
			System.out.println("Not found available operation.\nmTry with -help option");
			break;
		}
        
       
    }
}
