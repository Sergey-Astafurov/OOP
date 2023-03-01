package opp_seminars.seminar_2;

import java.time.LocalDate;
import java.time.Month;

public class WorkerCreator {
    private static WorkerCreator instance;

    public static WorkerCreator getInsctance() {
        if (instance == null) {
            instance = new WorkerCreator();
            instance.init();
        }
        return instance;
    }

    Worker worker;


    private void init() {
        worker = new Worker();

        worker.dayOfBirth = LocalDate.of(1900, Month.JANUARY, 1);
        worker.salary = 0;
        worker.firstName = "";
        worker.lastName = "";
        worker.address = "";
    }

    public WorkerCreator setDay(LocalDate ofBrith) {
        worker.dayOfBirth = ofBrith;
        return this;
    }

    public WorkerCreator setSalary(int salary) {
        worker.salary = salary;
        return this;
    }

    public WorkerCreator setFirstName(String firstName) {
        worker.firstName = firstName;
        return this;

    }

    public WorkerCreator setLastName(String lastName) {
        worker.lastName = lastName;
        return this;
    }

    public WorkerCreator setAddress(String address) {
        worker.address = address;
        return this;
    }

    public Worker Create() {
        return worker;
    }
}
