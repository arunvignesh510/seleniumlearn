package log4jexample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class basicconfiguratorexample {
	
	
	static Logger logger = Logger.getLogger(basicconfiguratorexample.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    PropertyConfigurator.configure("log4j.properties");
    
    logger.fatal("this is fatal");
    logger.error("this is error");
    logger.warn("this is warn");
    logger.info("this is info");
    logger.debug("this is debug");
	}

}
