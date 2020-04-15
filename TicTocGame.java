package com.java;

import com.bridgelabz.fellowship.utils.InputUtility;
import com.bridgelabz.fellowship.utils.Utility;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TicTocGame {

	public static void main(String[] args) {
	   PropertyConfigurator.configure("loggers//log4j.properties");
     Logger logger=Logger.getLogger(TicTocGame.class);
		logger.info("Symbol X->Computer O->User: ");
        logger.info("Enter Order of Matrix: ");
   	      int n=InputUtility.intVal();
   	   char t[][]=new char[n][n];
          try {
        	  Utility.callingGame( n,t);
		} catch (Exception e) {
		e.printStackTrace();
		}
           
        
          
	}

}
