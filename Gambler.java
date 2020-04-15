package com.java;

import com.bridgelabz.fellowship.utils.InputUtility;
import com.bridgelabz.fellowship.utils.Utility;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Gambler {
  public static void main(String[] args) {
		  PropertyConfigurator.configure("loggers//log4j.properties");
		  Logger logger =Logger.getLogger(Gambler.class);
		   logger.info("Enter stack goal number: ");
		   int stack=InputUtility.intVal();
		   int goal=InputUtility.intVal();
		   int n=InputUtility.intVal();
		  try {
			Utility.gamblingStart(stack, goal, n);
		} catch (Exception e) {
			e.printStackTrace();
		}
 	}
 }
