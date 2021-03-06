package iodemos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class ReadWriteProperties {

	
	public void toWrite(){
		 try (OutputStream output = new FileOutputStream("config.properties")) {

	            Properties prop = new Properties();

	            // set the properties value
	            prop.setProperty("db.url", "localhost");
	            prop.setProperty("db.user", "cybage");
	            prop.setProperty("db.password", "cybage@123");

	            // save properties to project root folder
	            prop.store(output, null);

	            System.out.println(prop);

	        } catch (IOException io) {
	            io.printStackTrace();
	        }
	}
	
	
	public void toRead(){
		  try (InputStream input = new FileInputStream("myProp.properties")) {

	            Properties prop = new Properties();

	            // load a properties file
	            prop.load(input);

	            // get the property value and print it out
	            System.out.println(prop.getProperty("username"));
	            System.out.println(prop.getProperty("password"));
	           // System.out.println(prop.getProperty("db.password"));

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	}
}
