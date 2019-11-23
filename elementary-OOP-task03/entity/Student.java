package by.htp.task3.entity;

import java.util.Arrays;

public class Student {
		private String name;
		private String surname;
		private int group;
		private int[] marks = new int[MARK_COUNT];
		
		private static final int MARK_COUNT = 5;
		
		public Student() {
			this.name = "Name";
			this.surname = "Surname";
			this.group = 0;
		}
		
		public Student(String name, String surname, int group, int[] marks) {
			this.name = name;
			this.surname = surname;
			this.group = group;
			this.marks = marks;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		public int getGroup() {
			return group;
		}

		public void setGroup(int group) {
			this.group = group;
		}

		public int[] getMarks() {
			return marks;
		}

		public void setMarks(int[] marks) {
			this.marks = marks;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + group;
			result = prime * result + Arrays.hashCode(marks);
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((surname == null) ? 0 : surname.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			if (group != other.group)
				return false;
			if (!Arrays.equals(marks, other.marks))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (surname == null) {
				if (other.surname != null)
					return false;
			} else if (!surname.equals(other.surname))
				return false;
			return true;
		}

		

		
		
}
