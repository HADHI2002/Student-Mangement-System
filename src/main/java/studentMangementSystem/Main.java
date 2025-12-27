package studentMangementSystem;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
        StudentData std=new StudentData();
		
        while(true) {
        	System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            try {
            	switch(choice){
            	case 1:
            		System.out.print("Enter name: ");
                    String name = sc.next();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter grade: ");
                    String grade = sc.next();
                    std.addStudent(name, age, grade);
                    break;
            	case 2:
            		std.displayStudents();
            		break;
            	case 3:
            		System.out.print("Enter ID to update: ");
                    int idU = sc.nextInt();
                    System.out.print("Enter new grade: ");
                    String newGrade = sc.next();
                    std.updateStudent(idU, newGrade);
                    break;
            	case 4:
                    System.out.print("Enter ID to delete: ");
                    int idD = sc.nextInt();
                    std.deleteStudent(idD);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;
            	}
            }catch(Exception e){
            	e.printStackTrace();
            }
        }
	}
}
