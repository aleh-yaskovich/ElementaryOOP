package by.htp.task3.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.task3.entity.Student;
import by.htp.task3.entity.Group;
import by.htp.task3.logic.StudentLogic;

public class GroupLogic {
	
	public List<Student> isALevelStudent(Group group) {
		StudentLogic studentLogic = new StudentLogic();
		List<Student> honours = new ArrayList<Student>();
		for (int i = 0; i < group.getStudents().size(); i++) {
			if (studentLogic.isALevelStudent(group.getStudents().get(i))) {
				honours.add(group.getStudents().get(i));
			}
		}
		return honours;
	}	
	
}


