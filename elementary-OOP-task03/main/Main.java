package by.htp.task3.main;

import java.util.ArrayList;
import java.util.List;
import by.htp.task3.entity.Student;
import by.htp.task3.logic.StudentLogic;
import by.htp.task3.entity.Group;
import by.htp.task3.logic.GroupLogic;
import by.htp.task3.view.StudentsView;

public class Main {
	public static void main (String[] args) {
		
		Student student1 = new Student("Ivan", "Ivanov", 1, new int[]{9,9,9,8,8});
		Student student2 = new Student("Petr", "Petrov", 1, new int[]{9,9,9,9,9});
		Student student3 = new Student("Sidor", "Sidorov", 1, new int[]{4,9,9,8,8});
		Student student4 = new Student("Aleh", "Yaskovich", 1, new int[]{9,9,9,10,10});
		Student student5 = new Student("Bill", "Gates", 1, new int[]{9,9,9,10,9});
		Student student6 = new Student("Vasili", "Bykov", 2, new int[]{9,9,9,8,8});
		Student student7 = new Student("ilia", "Repin", 2, new int[]{9,9,6,9,9});
		Student student8 = new Student("Mikle", "Schumaher", 2, new int[]{10,9,9,10,10});
		Student student9 = new Student("Nick", "Nickson", 2, new int[]{9,9,9,9,9});
		Student student10 = new Student("Jack", "Danials", 2, new int[]{10,9,10,10,9});
		
		Group group = new Group();
		group.getStudents().add(student1);
		group.getStudents().add(student2);
		group.getStudents().add(student3);
		group.getStudents().add(student4);
		group.getStudents().add(student5);
		group.getStudents().add(student6);
		group.getStudents().add(student7);
		group.getStudents().add(student8);
		group.getStudents().add(student9);
		group.getStudents().add(student10);
		
		GroupLogic groupLogic = new GroupLogic();
		
		// Создаем лист отличников
		List<Student> honours = groupLogic.isALevelStudent(group);
		
		// Выводим лист отличников
		StudentsView view = new StudentsView();
		view.printALevelStudents(honours);
		
		
		
	}
}
