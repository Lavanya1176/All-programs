import java.util.ArrayList;
import java.util.Scanner;

// Parent class for Health Care Center and Doctor classes
class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

// Health Care Center class
class HealthCareCenter extends Person {
    private String centerName;

    public HealthCareCenter(String name, String address, String centerName) {
        super(name, address);
        this.centerName = centerName;
    }

    // Getter and setter methods
    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }
}

// Doctor class
class Doctor extends Person {
    private String specialization;

    public Doctor(String name, String address, String specialization) {
        super(name, address);
        this.specialization = specialization;
    }

    // Getter and setter methods
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}

// Visitor class
class Visitor {
    private String name;
    private int age;
    private String address;
    private String phoneNumber;
    private Doctor doctor;
    private String appointmentDate;
    private String appointmentTime;

    public Visitor(String name, int age, String address, String phoneNumber, Doctor doctor, String appointmentDate, String appointmentTime) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.doctor = doctor;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }
}

public class ClinicAppointmentSystem {
    private HealthCareCenter healthCareCenter;
    private ArrayList<Doctor> doctors;
    private ArrayList<Visitor> visitors;

    public ClinicAppointmentSystem(HealthCareCenter healthCareCenter, ArrayList<Doctor> doctors) {
        this.healthCareCenter = healthCareCenter;
        this.doctors = doctors;
        this.visitors = new ArrayList<>();
    }

    // Getter and setter methods
    public Health
