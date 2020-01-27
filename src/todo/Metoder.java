	package todo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Metoder {
	List<String> todo = new ArrayList<>();
	List<String> doing = new ArrayList<>();
	List<String> done = new ArrayList<>();
	
	String s;
	Metoder m = new Metoder();
	int b = 0;
	Scanner scan = new Scanner(System.in);

	public void Start() {

		while (true) {
			s = scan.nextLine();
			if (s.length() <= 0) {
				System.err.println("Invalid input");
				continue;
			}
			if (s.equals("exit")) {
				break;
			}
			if (s.startsWith("todo.complete")) {
				b = Integer.parseInt(String.valueOf(s.charAt(14)));
				m.done.add(m.todo.get(b).toString());
				m.todo.remove(b);
				continue;

			}
			if (s.startsWith("done.show")) {
				for (int i = 0; i < m.done.size(); i++) {
					System.out.println(m.done.get(i).toString());
					continue;
				}
			}
			if (s.startsWith("todo.remove")) {
				b = Integer.parseInt(String.valueOf(s.charAt(14)));
				m.todo.remove(b);
				continue;
			}
			if (s.startsWith("todo.add")) { // 7 steg
				m.todo.add(s.substring(9));
				continue;
			}

			if (s.equals("todo.show")) {
				m.Show();
				continue;
			}
		}

		System.out.println("Hejdå");
		System.exit(0);
	}
	
	
	public void Show() {
		for (int i = 0; i < todo.size(); i++) {
			System.out.println(todo.get(i).toString());
		
	}}
	
//	public void Add() {
//		if (s.substring(0, 8).equals("todo.add")) { // 7 steg
//			 todo.add(s.substring(9));
//	}
	
//	public void Remove() {
//		run.b = Integer.parseInt(String.valueOf(run.s.charAt(14)));
//		todo.remove(run.b);
//	}
	
//	public void Complete() {
//		for(int i=0; i<todo.size(); i++) {
//		    if(todo.get(i) == m.todo.get()) {
//		        done.add(todo.remove(i));
//		    }
//		}
//	}
	
	
	
}