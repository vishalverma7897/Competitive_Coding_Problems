package Practice;

import java.util.Arrays;
import java.util.List;

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"Aman", "Sahil", "Rahul"};
		List<String> list = Arrays.asList(str);
		list.forEach(System.out::println);
		
		

	}

}
