package ch02_observer_class;

import java.time.LocalDate;

public class StudentB implements Observer {

    @Override
    public void update(LocalDate newDate) {
        System.out.println("\nStudent B: I get new class date");
        System.out.println("\n" + newDate);  
    }
 
    private TeacherSubject teacherSubject;
    public StudentB(TeacherSubject t) {
        this.teacherSubject = t;
        this.teacherSubject.registerObserver(this);
    }
}
