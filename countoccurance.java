package mock;

public class countoccurance {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		String text = sc.nextLine();
		char c = sc.next().charAt(0);
		for(int i=0;i<text.length();i++) {
			if(text.charAt(i) == c) {
				count++;
			}
		}

		System.out.println("The character " + c + " occured " + count + " number of times.");
	}
}
