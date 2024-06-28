package ödev5;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class MehmetEmreÖk_23010310055_Courses {

	public static void main(String[] args)  throws FileNotFoundException {
		
		Scanner input = new Scanner(new File("C:\\Users\\mehmetemre\\OneDrive - Bartın Üniversitesi\\Belgeler\\Courses.txt"));
		String isimString = "mehmet";
		String arananString = "m";
		Set<String> dersler = new TreeSet<String>();
		dersler = read(input);
		
		for (String ders : dersler) {
			System.out.println(ders);
		}
		System.out.println(dersler.size());
		System.out.println(!isimString.startsWith(arananString));

	}
	public static Set<String> read(Scanner in){
		Set<String> dersler = new TreeSet<String>();
		
		while (in.hasNext()) {
			dersler.add(in.nextLine());
			
		}
		return dersler;
	}

}
