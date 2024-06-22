package ch02_observer_class;

import java.time.LocalDate;

public interface Observer {
    public void update(LocalDate newDate);
}
