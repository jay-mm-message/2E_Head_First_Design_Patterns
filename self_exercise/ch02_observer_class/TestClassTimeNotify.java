package ch02_observer_class;

import java.time.LocalDate;

public class TestClassTimeNotify {
    public static void main(String [] args) {
        System.out.println("\n");

        TeacherSubject t = new TeacherSubject();

        StudentA studentA = new StudentA(t);
        StudentB studentB = new StudentB(t);
        StudentC studentC = new StudentC(t);

        t.setClassTimes(LocalDate.of(2024, 6, 22));
        t.setClassTimes(LocalDate.of(2024, 7, 22));
    }
}
