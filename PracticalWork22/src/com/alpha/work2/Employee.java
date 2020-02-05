package com.alpha.work2;
/*
Добавьте в пакет work2 описание класса Employee, который содержит
поля экземпляра: firstName, lastName, occupation, telephone; статическое
поле numberOfEmployees; методы доступа (геттеры); несколько
конструкторов, которые должны инициализировать поля экземпляра и
инкрементировать поле numberOfEmployees.
3. Добавьте в код метода run() создание нескольких объектов типа Employee
и вывод значения поля numberOfEmployees.
4. Запустите приложение на исполнение.
 */
public class Employee {

    private String firstName;
    private String lastName;
    private String occupation;
    private String telephone;
    private static int numberOfEmployees;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public static void setNumberOfEmployees(int numberOfEmployees) {
        Employee.numberOfEmployees = numberOfEmployees;
    }

    public Employee(String firstName, String lastName, String occupation, String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
        this.numberOfEmployees += 1;
    }
}
