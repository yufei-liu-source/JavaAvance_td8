
public class Main {
	public static void main(String[] args) {
		Max m = new Max();
		System.out.println(m.myMax(42,1664)); //1664
		System.out.println(m.myMax(2014,86,13)); //2014		
		
		System.out.println(m.myMax(8.6,16.64)); //16.64
		System.out.println(m.myMax("Denis", "Cornaz")); //Denis
		System.out.println(m.myMax(8.6, "Denis")); //ne doit pas compiler !
	}
}
