package test_framework;


import org.apache.logging.log4j.*;

//import org.apache.log4j.Logger;

public class Demo_for_file {
	
	static Logger log = LogManager.getLogger(Demo_for_file.class.getName()); 
	public static void main(String[] args) 
	{
		 //Logger log = Logger.getLogger("Demo1"); 
		//DOMConfigurator.configure("log4j.xml");
	
		log.debug(" i am in debug------");
		log.error("file not found----------");
		log.info("i am info1");
		log.fatal("i am in fatal-------------");
		log.info("i am in info 2");
		// using trace alll data will print suppose there are 100000 lines outof which client required only error file then we can use level="error"
	

	}

}
