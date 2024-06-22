package ch02_observer_class;

import java.time.LocalDate;

public class StudentA implements Observer {

    @Override
    public void update(LocalDate newDate) {
        System.out.println("\nStudent A: I get new class date");
        System.out.println("\n" + newDate);        
    }

    private TeacherSubject teacherSubject;
    public StudentA(TeacherSubject t) {
        this.teacherSubject = t;
        this.teacherSubject.registerObserver(this);
    }
}
