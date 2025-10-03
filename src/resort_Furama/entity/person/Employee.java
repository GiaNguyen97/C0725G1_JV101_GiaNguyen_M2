package resort_Furama.entity.person;

import java.time.LocalDate;

public class Employee extends Person{
    private String idOfEmployee;
    private String educationLevelOfEmployee;
    private String roleOfEmployee;
    private String salaryOfEmployee;

    public Employee() {
    }

    public Employee(String nameOfPerson, LocalDate dayOfBirth, String gender, String idCardNumber, String phoneNumber, String email, String idOfEmployee, String educationLevelOfEmployee, String roleOfEmployee, String salaryOfEmployee) {
        super(nameOfPerson, dayOfBirth, gender, idCardNumber, phoneNumber, email);
        this.idOfEmployee = idOfEmployee;
        this.educationLevelOfEmployee = educationLevelOfEmployee;
        this.roleOfEmployee = roleOfEmployee;
        this.salaryOfEmployee = salaryOfEmployee;
    }

    public String getIdOfEmployee() {
        return idOfEmployee;
    }

    public void setIdOfEmployee(String idOfEmployee) {
        this.idOfEmployee = idOfEmployee;
    }

    public String getEducationLevelOfEmployee() {
        return educationLevelOfEmployee;
    }

    public void setEducationLevelOfEmployee(String educationLevelOfEmployee) {
        this.educationLevelOfEmployee = educationLevelOfEmployee;
    }

    public String getRoleOfEmployee() {
        return roleOfEmployee;
    }

    public void setRoleOfEmployee(String roleOfEmployee) {
        this.roleOfEmployee = roleOfEmployee;
    }

    public String getSalaryOfEmployee() {
        return salaryOfEmployee;
    }

    public void setSalaryOfEmployee(String salaryOfEmployee) {
        this.salaryOfEmployee = salaryOfEmployee;
    }

    @Override
    public String toString() {
        return "Employee{"+idOfEmployee+", "+super.toString()+educationLevelOfEmployee+", "+roleOfEmployee+", "+salaryOfEmployee+"}";
    }

    @Override
    public String getInforToCSV() {
        return idOfEmployee+","+super.getInforToCSV()+","+educationLevelOfEmployee+","+roleOfEmployee+","+salaryOfEmployee;
    }
}
