import java.util.*;
public class ArrayListDemo{
	public static void main(String[] args){
		List<String> listStrings = new ArrayList<String>();
		listStrings.add("One");
		listStrings.add("Two");
		listStrings.add("Three");
		listStrings.add("Four");
		System.out.println(listStrings);
		listStrings.add(1,"A2");
		System.out.println(listStrings);
		if(listStrings.contains("Hello"))
			System.out.println("Found the element");
		else
			System.out.println("There is no such element");
		for(int i=0;i<listStrings.size();i++){
			String newString = listStrings.get(i);
			if(newString.startsWith("T"))
				System.out.println("The found element is "+newString);
		}
	}
}
