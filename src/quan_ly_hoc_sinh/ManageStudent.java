package quan_ly_hoc_sinh;

import java.util.ArrayList;
import java.util.Date;

public class ManageStudent {
    ArrayList<Object> listStudent;

    public ArrayList<Object> getListStudent() {
        return listStudent;
    }

    public void setListStudent(Object listStudent) {
        this.listStudent.add(listStudent);
    }

    public void add(String studentId, String name, Date birthDate, String gender, String address, String phone) {
        Student student = new Student(studentId, name, birthDate, gender, address, phone);
        this.setListStudent(student);
    }

    public void update(byte index, String info) {

    }

    public void remove() {

    }

    public void search() {

    }

    public void displayAll() {

    }

    public void sortListByName() {

    }
}
