	package todo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Metoder {
	List<String> todo = new ArrayList<>();
	List<String> doing = new ArrayList<>();
	List<String> done = new ArrayList<>();
	
	
	String s;

	int b = 0;
	Scanner scan = new Scanner(System.in);

	public void Start() throws IOException {

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
				done.add(todo.get(b).toString());
				todo.remove(b);
				continue;

			}
			if (s.startsWith("done.show")) {
				for (int i = 0; i < done.size(); i++) {
					System.out.println(done.get(i).toString());
					continue;
				}
			}
			if (s.startsWith("todo.remove")) {
				b = Integer.parseInt(String.valueOf(s.charAt(14)));
				todo.remove(b);
				continue;
			}
			if (s.startsWith("save")) {
				FilPrint();
				continue;
			}
			if (s.startsWith("todo.add")) { // 7 steg
				todo.add(s.substring(9));
				continue;
			}

			if (s.equals("todo.show")) {
				Show();
				continue;
			}
		}

		System.out.println("Hejdå");
		System.exit(0);
	}
	
	
	public void Show() {
		for (int i = 0; i < todo.size(); i++) {
			System.out.println(todo.get(i).toString());
		
	}
}
	
	public void FilPrint() throws IOException {
		String bap =  "HEjsamsAN";
		BufferedWriter out = new BufferedWriter(new FileWriter("todo.txt"));
		for (int i = 0; i < todo.size(); i++) {
			out.write(todo.get(i).toString());
			out.newLine();
//			System.out.println(todo.get(i).toString());	
	}
//		out.write(bap);

		out.close();
	}
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