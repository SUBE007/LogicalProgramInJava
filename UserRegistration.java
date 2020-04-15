package com.java;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.fellowship.utils.InputUtility;

public class UserRegistration {

	public static void main(String[] args) {
		 PropertyConfigurator.configure("loggers//log4j.properties");
		 Logger logger=Logger.getLogger(UserRegistration.class);
		 try
		 {
		 logger.info("Enter first name of user:");
		 String fname=InputUtility.stringVal();
		 logger.info("FirstName Valid ?:"+UserRegUtils.isValidFirstName(fname));

		 logger.info("Enter last name of user:");
		 String lname=InputUtility.stringVal();
		 logger.info("LastName Valid ?:"+UserRegUtils.isValidFirstName(lname));

		 logger.info("Enter email of user:");
		 String email=InputUtility.stringVal();
		 logger.info("Email Valid ?:"+UserRegUtils.isValidEmailAddr(email));

		 logger.info("Enter mobile no. of user:");
		 String phno=InputUtility.stringVal();
		 logger.info("Phone No. Valid ?:"+UserRegUtils.isValidPhoneNo(phno));

		 logger.info("Enter password:");
		 String passwd=InputUtility.stringVal();
		 logger.info("Password Valid ?:"+UserRegUtils.isValidPasswd(passwd));
		 }
        catch (Exception e) {
	                  e.printStackTrace();
       }//catch
	}//main

}//class
