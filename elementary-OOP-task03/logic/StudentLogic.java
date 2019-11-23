package by.htp.task3.logic;

import by.htp.task3.entity.Student;

public class StudentLogic {
	public boolean isALevelStudent (Student student) {
		int[] marks = student.getMarks();
		boolean res = true;
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] < 9) {
				res = false;
				break;
			}
		}
		return res;
	}
}
