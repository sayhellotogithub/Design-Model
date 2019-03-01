package iblogstreet.structuralpatterns.facade.course;

public class NotifyStudent {
	public Boolean notify(String studentName) {
		System.out.println(String.format("正在向%s发生通知", studentName));
		return true;
	}
}