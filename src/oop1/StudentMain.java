package oop1;

public class StudentMain {

    public static void main(String[] args) {
//        Student telebe = new Student();
//        telebe.id = 101;
//        telebe.name = "Nihad";
//        telebe.surname = "Azizov";
//        telebe.avg = 72;
//        telebe.isActive = true;

//        telebe.printdata();

        Student student = new Student();
        //get
        student.setId(102);
        student.setName("Rashid");
        student.setSurname("Alakbarov");
        student.setAvg(-77);
        student.setActive(true);

//        System.out.println(student);


//        //get
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getSurname());
        System.out.println(student.getAvg());
        System.out.println(student.isActive());



    }
}
