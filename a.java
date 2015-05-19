class co 
{
	private static String instance ="";
	
	private static Object check(Object o)
	{
		// Checks the instance of the Object
		if(o instanceof String)
			instance = ", string";
		
		if(o instanceof Integer)
			instance = ", integer";
		
		if(o instanceof Double)
			instance = ", double";
		
		if(o instanceof Float)
			instance = ", float";
		
		if(o instanceof Character)
			instance = ", char";
		
		if(o instanceof Short)
			instance = ", short";
		
		if(o instanceof Long)
			instance = ", long";
		
		if(o instanceof Boolean)
			instance = ", boolean";
		
		if(o instanceof Byte)
			instance = ", byte";
		
		// Return the value and instance
		return o+instance;
	}
	// methode that prints out the value
	public static void Print(Object o)
	{
			// Check if the type if not equals the supported onces.
			// If the types aren't supported then, will the program return, the value of the object,
			// and " is not an instance of supported objects"
		  if ((o instanceof String == false) &&
			  (o instanceof Integer == false) &&
			  (o instanceof Double == false) &&
			  (o instanceof Float == false) &&
			  (o instanceof Byte == false) &&
			  (o instanceof Long == false) &&
			  (o instanceof Short == false) &&
			  (o instanceof Boolean == false) &&
			  (o instanceof Character == false) )
			  System.out.println(o + " is not an instance of supported objects");
		  else
			  // If the object is an instance of supported object, then it prints out:
			  // Value + ", OBJECT"
			  System.out.println(check(o));
	}
}

public class a 
{
	public static void main(String[]args)
	{
		/* Prints the value of the Object and the instance,
		 * an example is, 
		 * String s = "Lucas"; co.Print(s); . 
		 * Would print "Lucas, string".
		 * Supported Types:
		 * Integer(int), String, Character(char), Boolean, Long, Short, Byte, Double, Float  
		 */
		co.Print("123");
	}
}
