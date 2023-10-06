package basicss;

public class Stringgg {

	public static void main(String[] args) {
		String s="hello";
		String s1="welcome";
		String s2="Hello";
		String s3="   HELLOworld";
		String s4="hello my dear";
	//1.CONCATE =hellowelcome
		
		System.out.println(s.concat(s1));
		System.out.println(1+2+s+5+2);
	//2.EQUAL(COMPARING)	NOT USE ==,ONLY USE =,OTHERWISE IT COMPARE MEMORY REFERENCE ID
System.out.println(s.equals(s1));
System.out.println(s.equalsIgnoreCase(s2));
//3.displayloweranduppercase
System.out.println(s1.toLowerCase());
System.out.println(s.toUpperCase());
//4.TRIM
System.out.println(s3.trim());
//5.contains
System.out.println(s4.contains("my"));
//6.LENGTH
System.out.println(s.length());
//7.SUBSTRING
System.out.println(s.substring(1,4));//ell
//8.startswithand endswith
System.out.println(s1.startsWith("hello"));
System.out.println(s4.endsWith("dear"));
//9.SPLIT
String s5="hello welcome to luminar";
String[]str=s5.split(" ");
for(String value:str)
{
	System.out.println(value);
}
	//9/CHARAT(to find character position)
System.out.println(s.charAt(1));
//10.REPLACE
System.out.println(s4.replace("hello","HAI"));
	}

	
}
