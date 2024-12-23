package org.example;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
/**
 * Класс для считывания данных из CSV файла и преобразования их в список объектов Person.
 */
public class CsvReader {
    /**
     * Считывает данные из CSV файла и возвращает список объектов Person.
     *
     * @param csvFilePath путь к файлу CSV
     * @param separator   разделитель в CSV файле
     * @return список объектов Person
     */
    public List<Person> readCsvFile(String csvFilePath, String separator) {
        // реализация метода
        List<Person> people = new ArrayList<>();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(csvFilePath);
        if (inputStream != null) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
                String line;
                br.readLine(); // пропускаем заголовок
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(separator);
                    if (data.length == 6) {
                        Person person = new Person();
                        person.setId(Integer.parseInt(data[0]));
                        person.setName(data[1]);
                        person.setGender(data[2]);
                        person.setBirthDate(new SimpleDateFormat("dd.MM.yyyy").parse(data[3]));
                        Department department = new Department();
                        department.setId(generateDepartmentId());
                        department.setName(data[4]);
                        person.setDepartment(department);
                        person.setSalary(Integer.parseInt(data[5]));
                        people.add(person);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return people;
    }

    /**
     * Генерирует и возвращает уникальный ID для подразделения.
     *
     * @return уникальный ID для подразделения
     */
    private int generateDepartmentId() {
        // Пример реализации генерации уникального ID
        return Math.abs(UUID.randomUUID().hashCode());
    }
}
