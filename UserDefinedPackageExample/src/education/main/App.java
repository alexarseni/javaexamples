package education.main;
//import education.college.*;   IMPORTS EVERYTHING IN THE PACKAGE
import education.college.Attendance; //imports only attendance class
//import education.school.Attendance;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Attendance att = new Attendance(); //COOSES COLLEGE BECAUSE IT IS IMPORTED
		education.school.Attendance att1 = new education.school.Attendance(); //SPECIFIES EXACTLY WHERE TO FIND THE CLASS - PATH- NO IMPORT NEEDED
		education.college.Attendance att2 = new education.college.Attendance();
		att.display();
		att1.display();
		att2.display();
	}

}
