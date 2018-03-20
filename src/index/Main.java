package index;
import jaxb.*;
public class Main {

	public static void main(String[] args) {
		JaxBSupply jbs = new JaxBSupply();
		jbs.marshall();
		jbs.unmarshall();
		jbs.convetJavatoJson();
	}
	
}
