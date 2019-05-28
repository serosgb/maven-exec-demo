package org.serosgb.lab0a;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		
		for (String arg : args) {
			System.out.println( "props : " + arg);
		}
		
		String myProp = System.getProperty("myProp");
		
		if (myProp == null) {
			System.err.println("myProp has not been set");
		} else {
			System.out.println("myProp is set to: " + myProp);
		}
    }
}
