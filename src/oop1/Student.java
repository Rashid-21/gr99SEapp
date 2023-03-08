package oop1;

public class Student {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname.toUpperCase();
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = Math.abs(avg);
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    private String name;
    private String surname;
    private int avg;
    private boolean isActive;

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", surname='" + surname + '\'' + ", avg=" + avg + ", isActive=" + isActive + '}';
    }


//        public Student(int id, String name, String surname, int avg, boolean isActive) {
//        this.id = id;
//        this.name = name;
//        this.surname = surname;
//        this.avg = avg;
//        this.isActive = isActive;
//    }


//    void printdata() {
//        if (isActive){
//
//            System.out.println("id si " + this.id + " adi " + this.name + " soyadi " + this.surname + " ortalama " + this.avg + " aktivdirmi " + this.isActive);
//
//        }
//    }


}
