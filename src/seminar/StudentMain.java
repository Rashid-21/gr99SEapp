package seminar;

import java.util.LinkedList;
import java.util.List;

public class StudentMain {

    public static void main(String[] args) {

        City city = new City();
        city.setCityId(100);
        city.setCityName("Baku");
        city.setPopulation(700000);


        University university = new University();
        university.setUniID(1000);
        university.setUniName("ADNSU");
        university.setCity(city);


        Loan loan1 = new Loan();
        loan1.loanID = 100;
        loan1.amount = 2000;

        Loan loan2 = new Loan();
        loan2.loanID = 101;
        loan2.amount = 5000;


        List<Loan> loans = new LinkedList<>();
        loans.add(loan1);
        loans.add(loan2);


        Student student = new Student();
        student.setId(10000);
        student.setName("Natiq");
        student.setUniversity(university);
        student.setLoan(loans);


        System.out.println(student);
    }
}
