package problem1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key,Student> studentsMap = new HashMap<>();
		students.forEach(student->{
			Key studentKey = new Key(student.getFirstName(),student.getLastName());
			studentsMap.put(studentKey,student);
		});
		return studentsMap;
	}
}
