import java.util.*;

public class BeWild <T extends List<?>>{
	
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
	
	public static <T> List<T> listLength(List<?> list) {	
		ArrayList<Integer> length=new ArrayList<Integer>();	
		for(int i=0;i<list.size();i++) {
			CharSequence seq=(CharSequence)list.get(i);
			length.add(seq.length());
		}
		return (List<T>) length;	
	}
	
	public static <T> List<T> fusion(List<?> l1, List<?> l2){
		ArrayList<Object> alternateList = new ArrayList<Object>();
		
		if (l1 == null ||l2 == null)
			throw new IllegalArgumentException("The list can not be null!");
		else if (l1.size() != l2.size())
			System.out.println("The size of 2 lists are not fusible");
		else {
			
			for (int i = 0; i< l1.size(); i++) {
				alternateList.add(l1.get(i));
				alternateList.add(l2.get(i));
			}
		}
		
		return (List<T>) alternateList;
	}

	public static void main(String[] args) {
		List<String> list=Arrays.asList("foo", "toto");
		List<Integer> list2=Arrays.asList(1,2,3,4,5);
		print(list);
		print(list2);
		
		longeur(list);
		longeur(list2);
		
		List<String> l=Arrays.asList("colonel", "reyel");
		System.out.println(listLength(l));
		
		List<String> l1= Arrays.asList("C", "rc");
		List<StringBuilder> l2= Arrays.asList(new StringBuilder("a ma"), new StringBuilder("he!"));
		List<? extends CharSequence> r1=fusion(l1,l2);
		List<?> r2=fusion(l1,l2);
		List<Integer> l3 = Arrays.asList(1,2);
		List<Integer> l4 = Arrays.asList(10,20);
		
		List<Integer> l5 = new LinkedList<Integer>();
		l5.add(4);
		l5.add(5);
		
		List<Integer> r3 = fusion(l3,l4);
		List<?> r4 = fusion(l1,l3);
		List<?> r5 = fusion(l1,l5);

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
	}
}
