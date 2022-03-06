package collection_review.service.impl;

import collection_review.model.Candidates;
import collection_review.service.Candidate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Intern extends Candidates implements Candidate {
    List<Intern> arrIntern = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private String majors;
    private String semester;
    private String universityName;

    public Intern() {
    }

    public Intern(String majors, String semester, String universityName) {
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Intern(String id, String firstName, String lastName, String birthDay, String address, int phone, String email, String majors, String semester, String universityName) {
        super(id, firstName, lastName, birthDay, address, phone, email);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public List<Intern> getArrIntern() {
        return arrIntern;
    }

    public void setArrIntern(List<Intern> arrIntern) {
        this.arrIntern = arrIntern;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Intern{" +
                ", majors='" + majors + '\'' +
                ", semester='" + semester + '\'' +
                ", universityName='" + universityName + '\'' +
                '}';
    }

    @Override
    public void addCandidate() {
        System.out.print("Input your id: ");
        String id = sc.nextLine();
        System.out.print("Input your fist name: ");
        String firstName = sc.nextLine();
        System.out.print("Input your last name: ");
        String lastName = sc.nextLine();
        System.out.print("Input your birth date: ");
        String birthDay = sc.nextLine();
        System.out.print("Input your address: ");
        String address = sc.nextLine();
        System.out.print("Input your phone number: ");
        int phone = Integer.parseInt(sc.nextLine());
        System.out.print("Input your email: ");
        String email = sc.nextLine();
        System.out.print("Input your major: ");
        String major = sc.nextLine();
        System.out.print("Input your semester: ");
        String semester = sc.nextLine();
        System.out.print("Input your university name: ");
        String universityName = sc.nextLine();
        Intern intern = new Intern(id, firstName, lastName, birthDay, address, phone, email, major, semester, universityName);
        arrIntern.add(intern);
    }

    @Override
    public void displayCandidate() {
        System.out.println("\nINTERN CANDIDATE: ");
        for (int i = 0; i < arrIntern.size(); i++) {
            String inter = arrIntern.get(i).getFirstName() +" "+ arrIntern.get(i).getLastName();
            System.out.println(inter);
        }
    }

    @Override
    public void searchCandidate() {
        System.out.print("Input name you want see information: ");
        String strInterm = sc.nextLine();
        for (int i = 0; i < arrIntern.size(); i++) {
            if ( arrIntern.get(i).getFirstName().contains(strInterm)  || arrIntern.get(i).getLastName().contains(strInterm)) {
                System.out.print(arrIntern.get(i).getFirstName() + " " + arrIntern.get(i).getLastName() + " || ");
                System.out.print(arrIntern.get(i).getBirthDay() + " || ");
                System.out.print(arrIntern.get(i).getAddress() + " || " );
                System.out.print(arrIntern.get(i).getPhone() + " || ");
                System.out.println(arrIntern.get(i).getEmail());
            }
        }
    }
}
