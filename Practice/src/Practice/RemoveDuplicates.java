package Practice;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "ssstttgggunmm";
LinkedHashSet<Character> set = new LinkedHashSet<Character>();
for (char c : str.toCharArray()) {
	set.add(c);
}
StringBuilder sb = new StringBuilder();
for (Character c : set) {
	sb.append(c);
}
str = sb.toString(); 
System.out.println(str);
	}

}
