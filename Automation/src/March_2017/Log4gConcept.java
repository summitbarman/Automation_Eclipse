package March_2017;

import org.apache.log4j.Logger;

public class Log4gConcept 
{
	public static void main(String[] args) 
	{
		
		Logger l=Logger.getLogger("Log4gConcept");
	    l.info("Hi");
	    System.out.println("hi");
		/*l.fatal("fatal_1");
		l.error("error_1");
		l.warn("WARN_1");
		l.info("INFO_1");
		l.debug("debug_1");
		l.trace("trace_1");
		
		l.fatal("fatal_2");
		l.error("error_2");
		l.warn("WARN_2");
		l.info("INFO_2");
		l.debug("debug_2");
		l.trace("trace_2");
*/	}
}
