package collection_review.service.impl;

import collection_review.model.Candidates;
import collection_review.service.Candidate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fresher extends Candidates implements Candidate {
    List<Fresher> arrayFresher = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private String graduationDate;
    private String graduationRank;
    private String education;

    public Fresher() {
    }

    public Fresher(String graduationDate, String graduationRank, String education) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public Fresher(String id, String firstName, String lastName, String birthDay, String address, int phone, String email, String graduationDate, String graduationRank, String education) {
        super(id, firstName, lastName, birthDay, address, phone, email);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public List<Fresher> getArrayFresher() {
        return arrayFresher;
    }

    public void setArrayFresher(List<Fresher> arrayFresher) {
        this.arrayFresher = arrayFresher;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Fresher{" +
                "graduationDate='" + graduationDate + '\'' +
                ", graduationRank='" + graduationRank + '\'' +
                ", education='" + education + '\'' +
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
        System.out.print("Input your graduation date: ");
        String graduationDate = sc.nextLine();
        System.out.print("Input your graduation rank: ");
        String graduationRank = sc.nextLine();
        System.out.print("Input your education: ");
        String education = sc.nextLine();

        Fresher fresher = new Fresher(id, firstName, lastName, birthDay, address, phone, email, graduationDate, graduationRank, education);
        arrayFresher.add(fresher);
    }

    @Override
    public void displayCandidate() {
        System.out.println("\nFRESHER CANDIDATE: ");
        for (int i = 0; i < arrayFresher.size(); i++) {
            String name = arrayFresher.get(i).getFirstName() +" "+ arrayFresher.get(i).getLastName();
            System.out.println(name);
        }
    }

    @Override
    public void searchCandidate() {
        System.out.print("Input name you want see information: ");
        String inputfresher = sc.nextLine();
        for (int i = 0; i < arrayFresher.size(); i++) {
            if ( arrayFresher.get(i).getFirstName().contains(inputfresher)  || arrayFresher.get(i).getLastName().contains(inputfresher)) {
                System.out.print(arrayFresher.get(i).getFirstName() + " " + arrayFresher.get(i).getLastName() + " || ");
                System.out.print(arrayFresher.get(i).getBirthDay() + " || ");
                System.out.print(arrayFresher.get(i).getAddress() + " || " );
                System.out.print(arrayFresher.get(i).getPhone() + " || ");
                System.out.println(arrayFresher.get(i).getEmail());
            }
        }
    }
}
