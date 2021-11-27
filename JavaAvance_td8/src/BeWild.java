import java.util.*;

public class BeWild {
	
	private static <T> void print(List<T> list) {
		for(T o:list)
			System.out.println(o);
	}
	
	private static <T> void longeur(List<T> list) {
		CharSequence cs;
		for(T o:list) {
			cs = o.toString();
			System.out.println(cs);
			System.out.println("Length : " + cs.length());
		}
	}
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("foo", "toto");
		List<Integer> list2=Arrays.asList(1,2,3,4,5);
		print(list);
		print(list2);
		
		longeur(list);
		longeur(list2);

	}
}
