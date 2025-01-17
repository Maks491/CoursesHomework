package Lesson4;

public class Lesson4 {
    public static void main(String[] args) {
        Employee employee = new Employee("Vasilev Vasilii Vasilevich ", "QA", "alex@gmail.com", "+375338752214", 1000, 22);
        employee.getEmployeeInfo();
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Petrov Petr Petrovich", "QA", "petr@gmail.com", "+375338796655", 1900, 34);
        employees[1] = new Employee("Leonidov Leonid Leonidovich", "AQA", "lenikjuli@gmail.com", "+375446789900", 600, 37);
        employees[2] = new Employee("Kisilev Anton Antonovich", "AQA", "kiselek@gmail.com", "+375297676767", 900, 33);
        employees[3] = new Employee("Semkov Stanislav Konstantinovich", "QA", "semkks@gmail.com", "+375447689900", 899, 28);
        employees[4] = new Employee("Matveev Matvei Sergeevich", "AQA", "matsergevich@gmail.com", "+375449908766", 570, 20);


        Park outer = new Park();
        Park.Attractions[] attractions = new Park.Attractions[2];
        attractions[0] = outer.new Attractions("carousel", "10:00-20:00", 7.30);
        attractions[1] = outer.new Attractions("bumperCars", "10:00-20:00", 10);
        attractions[0].getParkInfo();

    }

}