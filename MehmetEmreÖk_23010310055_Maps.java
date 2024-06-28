package ödev5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MehmetEmreÖk_23010310055_Maps {

	public static void main(String[] args) {

		Map<String, String> danismanlar = new HashMap<String, String>();
		danismanlar.put("Evrim G. ", "Algoritma");
		System.out.println(danismanlar.size());
		System.out.println(danismanlar.toString());
		danismanlar.put("Furkan A. ", "Alg. Uyg. ");
		danismanlar.put("Evrim G. ","Algoritma2");
		System.out.println(danismanlar.toString());
		
		Map<String, Set<String>> danisman2 = new TreeMap<String, Set<String>>();
		danisman2.put("Evrim G. ", new HashSet<String>());
		System.out.println(danisman2.get("Evrim G."));
		danisman2.get("Evrim G. ").add("Algoritma");
		danisman2.get("Evrim G. ").add("Algoritma2");
		danisman2.get("Evrim G. ").add("Algoritma3");
		danisman2.get("Evrim G. ").add("Algoritma4");
		
		Set<String> list = new TreeSet<String>();
		list.add("Alg. Uyg. ");
		list.add("Matematik");
		list.add("Fizik");
		
		danisman2.put("Furkan A. ",list);
		System.out.println(danisman2);
		
		for (String key : danismanlar.keySet()) {
			System.out.println(key);
		}
		
		for (String value : danismanlar.values()) {
			System.out.println(value.toString());
		}
		
		for (Set value : danisman2.values()) {
			System.out.println(value.toString());
		}
		
	}

}
