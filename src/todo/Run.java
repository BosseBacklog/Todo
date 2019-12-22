package todo;

import java.util.Scanner;

public class Run {

	String s;
	Metoder m = new Metoder();
	int b = 0;
	Scanner scan = new Scanner(System.in);

	public void Start() {

		while (true) {
			//Lägg till startswith 
			s = scan.nextLine();
			if(s.length() <= 0) {
				System.err.println("Invalid input");
				continue;
			}
			if (s.equals("exit")) {
				break;
			}
			if (s.equals("exit1")) {
				m.todo.remove(1);
				continue;
			}
			if (s.substring(0, 8).equals("todo.add")) { // 7 steg
				m.todo.add(s.substring(9));
				continue;
			}
			if (s.equals("todo.show")) {
				m.Show();
				continue;
			}
			if (s.substring(0, 13).equals("todo.complete")) {
				b = Integer.parseInt(String.valueOf(s.charAt(14)));
				m.todo.remove(b);
				continue;
				}
//				s.startsWith(prefix)
			}
		System.out.println("Hejdå");
		System.exit(0);	
		}
		
	}

