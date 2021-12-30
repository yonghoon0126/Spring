package test1;

import org.apache.log4j.Logger;

public class Abc {

	private static Logger logger = Logger.getLogger(Abc.class);
			
	public static void main(String[] args) {
		
		logger.debug("[DEBUG]모드 로그^^");
		logger.info ("[INFO] 모드 로그^^");
		logger.warn ("[WARN] 모드 로그^^", new Exception("오류"));
		logger.error("[ERROR] 모드 로그^^");
		logger.fatal("[FATAL] 모드 로그^^"); 
	}

}
