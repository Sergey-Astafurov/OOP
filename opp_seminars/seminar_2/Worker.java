package opp_seminars.seminar_2;

import java.time.LocalDate;

public class Worker {
    public LocalDate dayOfBirth;
    public int salary;
    public String firstName;
    public String lastName;
    public String address;

    @Override
    public String toString() {
        return String.format("%s %s %s ", this.firstName, this.lastName, this.address);
    }
}
