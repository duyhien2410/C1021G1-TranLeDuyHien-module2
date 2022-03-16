package case_study.models;

public class Employee extends Person{
    private String standard;
    private String position;
    private String wage;

    public Employee() {
    }

    public Employee(String code, String name, String birthDay, String genders, String identityCard, String phoneNumber, String email, String standard, String position, String wage) {
        super(code, name, birthDay, genders, identityCard, phoneNumber, email);
        this.standard = standard;
        this.position = position;
        this.wage = wage;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                "standard='" + standard + '\'' +
                ", position='" + position + '\'' +
                ", wage='" + wage + '\'' +
                '}';
    }
}
