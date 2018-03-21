package index;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import XmlToJava.XmlToJson;
import jaxb.*;
public class Main {

	public static void main(String[] args) {
//		JaxBSupply jbs = new JaxBSupply();
		XmlToJson xm = new XmlToJson();
//		jbs.marshall();
//		jbs.unmarshall();
//		jbs.convetJavatoJson();
		try {
			xm.createStringFromXml();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
