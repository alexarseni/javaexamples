package mod;

class Student {
	int regNumber;
	String studentName;
	
	Student(int reg_no, String name){
		this.regNumber = reg_no;
		this.studentName = name;
	}
}
public class StudentMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare array of 'Student' objects
		Student[] arr;
		arr = new Student[5];
		
		arr[0] = new Student(1, "Manish");
		arr[1] = new Student(2, "Aravind");
		arr[2] = new Student(3, "Satish");
		arr[3] = new Student(4, "Hari");
		arr[4] = new Student(5, "Ahmed");
		
		for (int i=0; i<arr.length; i++) {
			//this will only display the memory address of the different elements, not the content
			System.out.println(arr[i]);
		}
		for (int i =0; i< arr.length; i++) {
			System.out.println("The student with registration number "+arr[i].regNumber + " is "+arr[i].studentName);
		}
	}
}