package collection_review.service.impl;

import collection_review.model.Candidates;
import collection_review.service.Candidate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Experience extends Candidates implements Candidate {
    List<Experience> arrayExp = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private int expInYear;
    private String proSkill;

    public Experience() {
    }

    public Experience(int expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public Experience(String id, String firstName, String lastName, String birthDay, String address, int phone, String email, int expInYear, String proSkill) {
        super(id, firstName, lastName, birthDay, address, phone, email);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public List<Experience> getArrayExp() {
        return arrayExp;
    }

    public void setArrayExp(List<Experience> arrayExp) {
        this.arrayExp = arrayExp;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Experience{" +
                "expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
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
        System.out.print("Input your exp in Year: ");
        int expYear = Integer.parseInt(sc.nextLine());
        System.out.print("Input your skill: ");
        String skill = sc.nextLine();

        Experience experience = new Experience(id, firstName, lastName, birthDay, address, phone, email, expYear, skill);
        arrayExp.add(experience);
    }

    @Override
    public void displayCandidate() {
        System.out.print("\nEXPERIENCE CANDIDATE:");
        for (int i = 0; i < arrayExp.size(); i++) {
            String exp = arrayExp.get(i).getFirstName() +" "+ arrayExp.get(i).getLastName();
            System.out.println(exp);
        }
    }

    @Override
    public void searchCandidate() {
        System.out.print("Input name: ");
        String inputExp = sc.nextLine();
        for (int i = 0; i < arrayExp.size(); i++) {
            if ( arrayExp.get(i).getFirstName().contains(inputExp)  || arrayExp.get(i).getLastName().contains(inputExp)) {
                System.out.print(arrayExp.get(i).getFirstName() + " " + arrayExp.get(i).getLastName() + ", ");
                System.out.print(arrayExp.get(i).getBirthDay() + ", ");
                System.out.print(arrayExp.get(i).getAddress() + ", " );
                System.out.print(arrayExp.get(i).getPhone() + ", ");
                System.out.println(arrayExp.get(i).getEmail());
            }
        }
    }
}
