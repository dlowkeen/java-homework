package management;

import students.*;

public interface CourseManagementInterface {
	boolean enroll(Student st);
	boolean drop(Student st);
	double calculateClassAverage();
}
