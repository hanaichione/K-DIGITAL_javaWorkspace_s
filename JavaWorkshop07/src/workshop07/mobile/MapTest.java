package workshop07.mobile;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		double sum = 0.0;
		Map<String, Mobile> map = new HashMap<>();
		
		Mobile m1 = new Mobile("LU6800", "Optimus 2X", 800000.0);
        Mobile m2 = new Mobile("SU6600", "Optimus Black", 900000.0);
        Mobile m3 = new Mobile("KU5700", "Optimus Big", 700000.0);
        Mobile m4 = new Mobile("SU7600", "Optimus Mach", 950000.0);

        map.put(m1.getCode(), m1);
        map.put(m2.getCode(), m2);
        map.put(m3.getCode(), m3);
        map.put(m4.getCode(), m4);
        
        Set<String> keys = map.keySet();
        for (String key : keys) {
			System.out.println(map.get(key).printInfo());
			sum += map.get(key).getPrice();
		}
        
        System.out.println("합계 : " + sum);
        
        for (String key : keys) {
			map.get(key).setPrice(map.get(key).getPrice()*1.1);
		}
        
        System.out.println("가격 변경 후");
        sum = 0;
        
        for (String key : keys) {
			System.out.println(map.get(key).printInfo());
			sum += map.get(key).getPrice();
		}
        
        System.out.println("합계 : " + sum);
	}

}
