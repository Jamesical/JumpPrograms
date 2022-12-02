package com.cognixia.jump.theaterproject;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MovieTheaterRunner {

	public static void main(String[] args) {
		
		//if improving later try putting more into the class itself
		
		int ROW = 5;
		int COL = 5; //enum later
		
		Map<Integer, String> patron = new TreeMap<Integer, String>(); //collects names of people with reserved seating
		
		
		MovieTheater movieTheater;
		
		movieTheater = new MovieTheater();		

		
		//creates the first 2d arr for the seats before reservations (can be improved i.e. auto made with dynamic values)
//		int[][] arr = new int[5][5];	
		movieTheater.setCol(ROW);
		movieTheater.setRow(COL);
		movieTheater.makeTheater();
				
//		for(int row = 0; row <arr.length ; row++) {
//			for(int col = 0; col < arr[row].length; col++) {
//				arr[row][col] = 0;
//			}
//		}
//		
		String cont = "y";
		int count = 1;
	
		
		//movieTheater.setSeats(arr); //sets the seats in the class
		
		
		Scanner scan = new Scanner(System.in);
		
		
		while(cont.equals("y")) {
		cont = "y";
		try {
		movieTheater.getSeats(); //prints out the seats in the class in the asked for format
		
		System.out.println("What seat do you want to reserve?\nRow: ");
		int row = scan.nextInt();
		row -= 1;
		System.out.println("__________");
		
		System.out.println("Column: ");
		int col = scan.nextInt();
		col -= 1;
		scan.nextLine(); //Consumes line for the String input from user
		System.out.println("__________");
		
		System.out.println("Name of the person sitting here: ");
		String name = scan.nextLine(); //can put name in map to call (improvements)
		patron.put(count++, name); //adds the names of those who bought seats 
		
		
		movieTheater.checkSeat(row, col);
		
		while(cont == "y") {
		
		System.out.println("\nWould you like to get another seat? (y/n)\n"
				+ 		   "Or print the names of people? (p)\n"
				+ 		   "Or delete patron? (d): ");
		String temp ="";
		temp = scan.nextLine();
		cont = temp.toLowerCase();
		
		switch(cont) {
		
		case "y":
			continue;
		case "n":
			continue;
		case "p":
			System.out.println(patron);
			cont = "y";
			break;
		case "d":		//NEEDS TO BE IMPROVED - when time permits
			System.out.println("Who to delete?\nRow: ");
			row = scan.nextInt();
			row -= 1;
			System.out.println("__________");
			
			System.out.println("Column: ");
			col = scan.nextInt();
			col -= 1;
			scan.nextLine(); //Consumes line for the String input from user
			System.out.println("__________");
			movieTheater.deleteSeat(row, col);
			
			System.out.println("Name of person?(num) ");
			System.out.println(patron);
			int key = scan.nextInt();
			scan.nextLine();
			patron.remove(key);
			
			
			cont = "y";
		
		}

		}
		
		} catch (Exception e) {
			
			System.out.println("You did not enter a proper value, try again");
			scan.nextLine();
		} 
		
		}	

		

		System.out.println("Thanks for using " + movieTheater.getTheaterName());
		scan.close();

	
		
		
	}
	
}

