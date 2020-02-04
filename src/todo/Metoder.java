	package todo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
	
	// 
	public void Start() throws IOException {
		textScan();
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
			if (s.startsWith("load")) {
				textScan();
				continue;
			}
			if (s.startsWith("done.show")) {
				for (int i = 0; i < done.size(); i++) {
					System.out.println(done.get(i).toString());
					continue;
				}
			}
			if (s.startsWith("todo.remove")) {
				b = Integer.parseInt(String.valueOf(s.charAt(12)));
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
	
	// Hämtar alla rader i textfilen och lägger till i arrayen
	public void textScan() throws IOException {
		InputStream inputstream = new FileInputStream("todo.txt");
		BufferedReader lasare = new BufferedReader(new InputStreamReader(inputstream));
		String rad = lasare.readLine();
		
		while (rad != null) {
			todo.add(rad);
			rad = lasare.readLine();
		}
		inputstream.close();
		
	}
	public void FilPrint() throws IOException {
		String bap =  "HEjsamsAN";
		BufferedWriter out = new BufferedWriter(new FileWriter("todo.txt"));
		for (int i = 0; i < todo.size(); i++) {
			out.write(todo.get(i).toString());
			out.newLine();
	}
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