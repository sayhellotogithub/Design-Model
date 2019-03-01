package iblogstreet.structuralpatterns.facade.course;

public class RegisterFacade {
    NotifyStudent notifyStudent;
    RegisterCourse registerCourse;

    public RegisterFacade() {
        notifyStudent = new NotifyStudent();
        registerCourse = new RegisterCourse();
    }

    public boolean register(String courseName, String stuName) {
        if (registerCourse.checkAvailable(courseName)) {
            return notifyStudent.notify(stuName);
        } else {
            return false;
        }
    }
}