package com;

public class ServerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server ss = new Server();
		ss.ownMethod();
		System.out.println("ADD "+ss.add(100, 200));
		System.out.println("SUB "+ss.sub(200, 50));
		
		Team1 team1 = new Server(); //CREATE A SERVER OBJECT THAT IS ASSIGNED TO TEAM1 INTERFACE
		//YOU CAN ONLY CAL THE FUNCTIONS OF TEAM 1 INTERFACE, SO NO SUB METHOD
		System.out.println("Team1 "+team1.add(20, 10));
		
		Team2 team2 = new Server();
		System.out.println("Team2 "+team2.sub(20, 10));
		
	}

}
