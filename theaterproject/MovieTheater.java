package com.cognixia.jump.theaterproject;

public class MovieTheater {
	
	private int[][] seats;
	private int row;
	private int col;
	private String theaterName;
	
	MovieTheater(){
		row = 5;
		col = 5;
		setTheaterName("Cinemook");
	}


	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}
	
	public void makeTheater() {
		seats = new int[row][col];
		for(int row = 0; row <seats.length ; row++) {
			for(int col = 0; col < seats[row].length; col++) {
				seats[row][col] = 0;
			}
		}	
	}

	public int[][] getSeats() {
		
		System.out.println("__________\n\nSEATS\n__________");
		for(int row = 0; row <seats.length ; row++) {
			for(int col = 0; col < seats[row].length; col++) {
				System.out.print(seats[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println("__________\n");
		return seats;
		
	}

	public void setSeats(int[][] seats) {
		this.seats = seats;
	}

	
	public void deleteSeat(int row, int col) {
		seats[row][col] = 0;
	}

	
	public Boolean checkSeat(int row, int col) {
		
		if(seats[row][col] == 1) { 
			System.out.println("Seat has already been taken"); 
			return false ;	
		}
		
		seats[row][col] = 1;
		return true;
		
	}


	public String getTheaterName() {
		return theaterName;
	}


	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	
}




