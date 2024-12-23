package org.example;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
/**
 * Класс, представляющий сущность "Человек".
 */
public class Person {
    private int id;
    private String name;
    private String gender;
    private Department department;
    private double salary;
    private Date birthDate;

    // get и set

    /**
     * Возвращает имя человека.
     * @return Имя человека.
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает имя человека.
     * @param name Имя человека.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Возвращает ID человека.
     * @return ID человека.
     */
    public int getId() {
        return id;
    }

    /**
     * Устанавливает ID человека.
     * @param id ID человека.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Возвращает пол человека.
     * @return Пол человека.
     */
    public String getGender() {
        return gender;
    }

    /**
     * Устанавливает пол человека.
     * @param gender Пол человека.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Возвращает подразделение, к которому относится человек.
     * @return Подразделение.
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * Устанавливает подразделение человека.
     * @param department Подразделение.
     */
    public void setDepartment(Department department) {
        this.department = department;
    }

    /**
     * Возвращает зарплату человека.
     * @return Зарплата человека.
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Устанавливает зарплату человека.
     * @param salary Зарплата человека.
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Возвращает дату рождения человека.
     * @return Дата рождения человека.
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Устанавливает дату рождения человека.
     * @param birthDate Дата рождения человека.
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

}
