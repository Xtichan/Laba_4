package org.example;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        CsvReader csvReader = new CsvReader();
        List<Person> people = csvReader.readCsvFile("foreign_names.csv", ";");

        // Выводим информацию о людях из списка
        for (Person person : people) {
            System.out.println("Person ID: " + person.getId());
            System.out.println("Name: " + person.getName());
            System.out.println("Gender: " + person.getGender());
            System.out.println("Birth Date: " + person.getBirthDate());
            System.out.println("Department: " + person.getDepartment().getId()+ person.getDepartment().getName());
            System.out.println("Salary: " + person.getSalary());
            System.out.println("------------------------------");
        }
    }
}
