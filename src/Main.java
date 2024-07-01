import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main( String[] args ) {
		List <Student> studenti = new ArrayList <>();
		System.out.println(studenti);

		Student st1 = new Student("Mario", 20);
		Student st2 = new Student("Paolo", 18);
		Student st3 = new Student("Francesco", 22);
		Student st4 = new Student("Piero", 17);

		studenti.add(st1);
		studenti.add(st2);
		studenti.add(st3);
		studenti.add(st4);

		System.out.println(studenti);
	}
}