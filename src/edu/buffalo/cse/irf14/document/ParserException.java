/**
 * 
 */
package edu.buffalo.cse.irf14.document;

/**
 * @author nikhillo
 * Generic wrapper exception class for parsing exceptions
 */
public class ParserException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4691717901217832517L;
        
        public ParserException(Exception e){
            super("Parser Exception:", e);
            
        }
        
        public ParserException(String msg){
            super(msg);
            
        }

}
