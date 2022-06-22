package j;

public class StringContainingString {
	public static void main(String[] args) {
		String str1 = "learn java";
		String str2 = "java";
		String str3 = "java";
		Boolean result;
		if(str1.contains(str2)) {
			System.out.println(str1+" contains "+str2);
		}
		else {
			System.out.println(str1+ "does not contain "+str2);
			
		}
				
	}

}
