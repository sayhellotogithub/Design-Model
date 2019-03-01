package iblogstreet.structuralpatterns.facade.course;

public class FacadeClient {

//	public static void main(String[] args) {
//		RegisterCourse registerCourse = new RegisterCourse();
//		NotifyStudent notifyStudent = new NotifyStudent();
//		if (registerCourse.checkAvailable("课程A")) {
//			notifyStudent.notify("cc");
//		} else {
//			System.out.println("选课失败");
//		}
//	}

    public static void main(String[] args) {
        RegisterFacade registerFacade = new RegisterFacade();
        if (registerFacade.register("课程B", "cc")) {
            System.out.println("注册成功");
        } else {
            System.out.println("注册失败");
        }
    }
}