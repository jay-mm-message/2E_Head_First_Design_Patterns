package ch02_observer_class;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class TeacherSubject implements Subject {

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyClassTime() {
        for (Observer observer : observers) {
            observer.update(this.newDate);
        }
    }
   
    List<Observer> observers;

    public TeacherSubject() {
        observers = new ArrayList<Observer>();
        newDate = LocalDate.of(1999, 9, 1);
    }

    public LocalDate newDate;
    public void setClassTimes(LocalDate newDate) {
        this.newDate = newDate;
        classTimesChanges();
    }

    public void classTimesChanges() {
        notifyClassTime();
    }
}
