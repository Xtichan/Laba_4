package org.example;

/**
 * Класс, представляющий сущность "Подразделение".
 */
public class Department {
    private int id;
    private static int nextId = 1; // Статическая переменная для хранения следующего доступного ID
    private String name;
    /**
     * Конструктор по умолчанию.
     */
    public Department() {
        this.id = nextId++; // Присваивает уникальный ID и увеличивает счетчик для следующего доступного ID
        this.name = "Default"; // Устанавливает имя по умолчанию
    }

    /**
     * Создает новый объект подразделения с указанным именем и присваивает ему уникальный ID.
     *
     * @param name название подразделения
     */
    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }
    // get и set для полей
    /**
     * Возвращает ID подразделения.
     * @return ID подразделения.
     */
    public int getId() {
        return id;
    }
    /**
     * Устанавливает ID подразделения.
     * @param id ID подразделения.
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Возвращает название подразделения.
     * @return Название подразделения.
     */
    public String getName() {
        return name;
    }
    /**
     * Устанавливает название подразделения.
     * @param name Название подразделения.
     */
    public void setName(String name) {
        this.name = name;
    }


}
