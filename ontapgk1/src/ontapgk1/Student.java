package ontapgk1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person implements IPerson {

    Scanner sc = new Scanner(System.in);
    private float GPA;
    private String major;

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getFullname() {
        return fullname;
    }

    @Override
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Override
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public void displayInfo() {
        System.out.println(toString());
    }

    public void addStudent() {
        System.out.println("nhap id: ");
        this.id = sc.nextLine();

        System.out.println("nhap major: ");
        this.major = sc.nextLine();
        System.out.println("nhap GPA: ");
        this.GPA = sc.nextFloat();
        sc.nextLine();
        System.out.println("nhap fullname");
        this.fullname = sc.nextLine();
        System.out.println("nhap dateOfBirth: ");
        String date1 = sc.nextLine();
        SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy");

        try {
            this.dateOfBirth = date2.parse(date1);
        } catch (ParseException e) {
            System.out.println("wrong format");
            System.exit(0);
        }
    }

    @Override
    public String toString() {
        return "Student{" + "Name='" + fullname + '\'' + ", id='" + id + '\'' + ", DateOfBirth= " + dateOfBirth + ", GPA= " + GPA + ", Major= '" + major;
    }

    

    }

