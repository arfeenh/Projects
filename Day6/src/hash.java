import java.util.HashMap;
import java.util.Map;

public class hash {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap();
		
		hm.put(1, "abc");
		
		hm.put(2, "xyz");
		
		for(Map.Entry<Integer, String> m:hm.entrySet()) {
			System.out.println(m);
		}
		
	}

}
