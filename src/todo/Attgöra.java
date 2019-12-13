package todo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Attgöra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
//		Metoder m = new Metoder();
//		hej.add("objekt1");
		Scanner scan = new Scanner(System.in);
		List todo = new ArrayList();
		while (true) {

			s = scan.nextLine();
			if (s.substring(0, 8).equals("todo.add")) { // 7 steg

				todo.add(s.substring(9));

			}
			if (s.equals("todo.show")) {
				for (int i = 0; i < todo.size(); i++) {
					System.out.println(todo.get(i).toString());

				}

			}
			if (s.equals("exit")) {
				break;
			}
		}
		System.out.println("Slut");
		System.exit(0);
	}

}
