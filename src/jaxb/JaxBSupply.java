package jaxb;
import javax.xml.bind.*;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.*;
public class JaxBSupply {
	private static ObjectMapper mapper; 
	ReferenceDetails ref = new ReferenceDetails("PURCHASE_ORDEr","po2","1");
	Supply sup = 
			new Supply("TMSNA_INV_ORG","item1","GOOD", "EACH", "node1", "PO", "2017-04-01", "false","2", ref);
	static {
		mapper = new ObjectMapper();
	}
	
	//Marshalling from Java Object to XML
	public void marshall() {
		try {
			JAXBContext jo = JAXBContext.newInstance(Supply.class);
			Marshaller mx = jo.createMarshaller();
			
			mx.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			mx.marshal(sup, System.out);
			mx.marshal(sup, new File("src\\xml\\Supply.xml"));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(""+e.getMessage());
		}
	}
	
	//Unmarshalling from XML to Java Object
	public void unmarshall() {
		try {
			JAXBContext jo = JAXBContext.newInstance(Supply.class);
			Unmarshaller umx = jo.createUnmarshaller();
			Supply sup =  (Supply)umx.unmarshal(new File("src\\xml\\Supply.xml"));
			System.out.println("\n******* Supply.xml to Java Object conversion *******\n");
			System.out.println("Inventory Id:"+sup.getInverntoryOrganizationId());
			System.out.println("Item Id:"+sup.getItemId());
			System.out.println("Unit of Measure:"+sup.getUnitOfMeasureId());
			System.out.println("Supply Type:"+sup.getSupplyId());
			System.out.println("Arrival date:"+sup.getArrivalDate());
			System.out.println("Quantity:"+sup.getQuantity());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(""+e.getMessage());
		}
	}
	
	//Helper for Java-Json conversion
	public static String javatoJsonHelper(Object obj) {
		String jsonResult = "";
		try {
			jsonResult = mapper.writeValueAsString(obj);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in JsonGeneration"+ e.getMessage());
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in JsonMapping"+ e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in JsonIOException"+ e.getMessage());
			e.printStackTrace();
		}
		return jsonResult;
	}
	
	public void convetJavatoJson() {
		 String jsonSupply = JaxBSupply.javatoJsonHelper(sup);
		 System.out.println("\n*********** Json Convertion from Java Objects ***********\n");
		 System.out.println(jsonSupply);
		 try {
			PrintWriter out = new PrintWriter("src\\xml\\Supply.json");
			out.println(jsonSupply);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Something wrong with Print writer"+ e.getMessage());
		}
	}
	
}
