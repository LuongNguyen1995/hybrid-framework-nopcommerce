package javaBasic;

import java.io.File;

public class Topic_17_System_Property {

	public static final String PROJECT_PATH = System.getProperty("user.dir");
	
	//Windows/Mac/Linux
	
	public static final String UPLOAD_FILE_FOLDER = PROJECT_PATH + File.separator +"uploadFiles" ;

	public static void main (String[] args) {
		System.out.println(UPLOAD_FILE_FOLDER);
	}
}
