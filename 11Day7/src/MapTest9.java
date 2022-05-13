import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class MapTest9 {

	public static void main(String[] args) {
		Properties props = System.getProperties();

		Enumeration<?> enu = props.propertyNames(); // key 가져옴
		while (enu.hasMoreElements()) {
			String key = (String) enu.nextElement();
			String value = props.getProperty(key); // value 가져옴
			System.out.println(key + "\t" + " = " + value);
		}

	}

}
