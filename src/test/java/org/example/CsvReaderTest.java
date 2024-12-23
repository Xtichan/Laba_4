package org.example;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
/**
 * Класс с unit тестами для CsvReader.
 */
public class CsvReaderTest {
    /**
     * Проверяет правильность чтения данных из CSV файла.
     */
    @Test
    public void testReadCsvFile() {
        CsvReader csvReader = new CsvReader();
        List<Person> people = csvReader.readCsvFile("foreign_names.csv", ";");
        assertEquals(25898, people.size());
    }
    /**
     * Проверяет создание объектов Person на основе данных из CSV файла.
     */
    @Test
    public void testPersonObjectCreation() {
        CsvReader csvReader = new CsvReader();
        List<Person> people = csvReader.readCsvFile("foreign_names.csv", ";");
        for (Person person : people) {
            assertNotNull(person.getId());
            assertNotNull(person.getName());
            assertNotNull(person.getGender());
            assertNotNull(person.getBirthDate());
            assertNotNull(person.getDepartment());
            assertNotNull(person.getSalary());
        }
    }
}
