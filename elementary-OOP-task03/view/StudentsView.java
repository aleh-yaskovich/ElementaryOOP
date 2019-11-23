package by.htp.task3.view;

import java.util.List;
import by.htp.task3.entity.Student;
import by.htp.task3.logic.GroupLogic;

public class StudentsView {
	public void printALevelStudents(List<Student> groupLogic) {
		System.out.println("Список отличников: ");
		for (int i = 0; i < groupLogic.size(); i++) {
			String surname = groupLogic.get(i).getSurname();
			int group = groupLogic.get(i).getGroup();
			System.out.println("Фамилия: "+surname+", группа "+group);
		}
	}
}
