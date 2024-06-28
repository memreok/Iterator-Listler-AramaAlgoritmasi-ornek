package ödev5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MehmetEmreÖk_23010310055_Iterators {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Ali");
		names.add("Veli");
		names.add("Mehmet");
		names.add("Davut");
		
		Iterator<String> iterator = names.iterator();
		
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
			
			if (name.equals("Veli")) {
				
				iterator.remove();
				
			}
		}
		System.out.println("Koleksiyondan 'Veli' elemanı kaldırıldı!");
		
		System.out.println("Koleksiyonun güncel hali: ");
		
		for (String name : names) {
			System.out.println(name);
		}
		
	}

}
