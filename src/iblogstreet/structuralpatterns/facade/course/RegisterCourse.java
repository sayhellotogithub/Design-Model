package iblogstreet.structuralpatterns.facade.course;

public class RegisterCourse {
	public boolean checkAvailable(String courseName)
    {
		System.out.println(String.format("正在验证课程 %s是否人数已满",courseName));       
        return true;
    }
}