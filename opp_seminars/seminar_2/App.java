package opp_seminars.seminar_2;
import java.time.LocalDate;




public class App {
    public static void main(String[] args) {
        Worker w = WorkerCreator.getInsctance()
                    .setFirstName("Sergey")
                    .setLastName("Astafurov")
                    .setSalary(50000)
                    .Create();

                    Worker wс= WorkerCreator.getInsctance()
                    .setFirstName("Sergey")
                    .setLastName("Astafurывафыov")
                    .setSalary(50000)
                    .Create();

        Worker wсс = WorkerCreator.getInsctance()
                    .setFirstName("Sergey")
                    .setLastName("ыв")
                    .setSalary(50000)
                    .Create();

        System.out.println(wс);
        System.out.println(wсс);
        System.out.println(w);



    }
}

