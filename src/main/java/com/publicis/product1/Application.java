package com.publicis.product1;
import org.slf4j.*;
public class Application {
	static final Logger logger =LoggerFactory.getLogger(Application.class);
public static void main(String[] args) {
	logger.debug("Hello Maven, this is a bug");
	logger.info("Hello Maven, this is a info");
	logger.warn("Hello Maven, this is a warning");
	logger.error("Hello Maven, this is a error");
	logger.trace("hey guys , this is trace");
}
}
