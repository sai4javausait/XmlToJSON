package XmlToJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;

import javax.xml.parsers.ParserConfigurationException;

import org.json.JSONObject;
import org.json.XML;
import org.xml.sax.SAXException;

public class XmlToJson {
	private static final int PRETTY_PRINT_INDENT = 4;
	public static void createStringFromXml() throws ParserConfigurationException, SAXException, IOException {
		File xmlFile = new File("src\\xml\\Supply.xml");
		Reader fileReader = new FileReader(xmlFile);
	    BufferedReader bufReader = new BufferedReader(fileReader);
	    
	    StringBuilder sb = new StringBuilder();
	    String line = bufReader.readLine();
	    
	    while( line != null){
	        sb.append(line).append("\n");
	        line = bufReader.readLine();
	    }
	    
	    String xmlToString = sb.toString();
	    System.out.println(xmlToString);
	    bufReader.close();
	    
	    
	    JSONObject jsonObj = XML.toJSONObject(xmlToString);
	    String jsonPretty = jsonObj.toString(PRETTY_PRINT_INDENT);
	    System.out.println(jsonPretty);
	    try {
			PrintWriter out = new PrintWriter("src\\xml\\Supply.json");
			out.println(jsonPretty);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Something wrong with Print writer"+ e.getMessage());
		}
	    
	}
	
}
