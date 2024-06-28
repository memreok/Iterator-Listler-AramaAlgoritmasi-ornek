package ödev5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MehmetEmreÖK_23010310055_Sets {

	public static void main(String[] args) {

		Set<String> sehirler = new HashSet<String>();
		System.out.println(sehirler.isEmpty());
		sehirler.add("Bartın");
		sehirler.add("Ankara");
		sehirler.add("İstanbul");
		sehirler.add("Bartın");
		System.out.println(sehirler.size());
		System.out.println(sehirler.toString());
		System.out.println(sehirler.contains("Bartın"));
		
		Set<String> sehirler2 = new TreeSet<String>();
		sehirler2.add("Zonguldak");
		sehirler2.add("Yalova");
		System.out.println(sehirler2.toString());
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ankara");
		list.add("Malatya");
		list.add("Rize");
		System.out.println(list.get(0));
		System.out.println(list.toString());
		
		
		sehirler2.addAll(list);
		System.out.println(sehirler2.toString());
		
		sehirler.addAll(list);
		System.out.println(sehirler.toString());
		
		sehirler2.addAll(sehirler);
		System.out.println(sehirler2.toString());
		
		for (String sehir : sehirler2) {
			System.out.println(sehir);
		}
		
	}

}
