package quan_ly_hoc_sinh;

import java.util.Date;

public class Student {
    private String studentId;
    private String name;
    private Date birthDate;
    private String gender;
    private String address;
    private String phone;

    public Student(String studentId, String name, Date birthDate, String gender, String address, String phone) {
        this.studentId = studentId;
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Mã học sinh: " + studentId +
                ", tên: " + name +
                ", Ngày sinh: " + birthDate +
                ", Giới tính: " + gender +
                ", Địa chỉ: " + address +
                ", Số điện thoại: " + phone +
                '}';
    }
}
