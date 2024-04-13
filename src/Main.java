import java.util.Date;

class Student {
    private int id;
    private String lastName="";
    private String firstName="";
    private String middleName="";
    private Date dateOfBirth;
    private String address="";
    private String phoneNumber="";
    private String faculty="";
    private int course=0;
    private String group="";

    public Student(int id, String lastName, String firstName, String middleName, Date dateOfBirth,
                   String address, String phoneNumber, String faculty, int course, String group) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Прізвище: " + lastName);
        System.out.println("Ім'я: " + firstName);
        System.out.println("По батькові: " + middleName);
        System.out.println("Дата народження: " + dateOfBirth);
        System.out.println("Адреса: " + address);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Факультет: " + faculty);
        System.out.println("Курс: " + course);
        System.out.println("Група: " + group);
    }
}

public class Main {
    public static void main(String[] args) {
        // Створення масиву об'єктів Student
        Student[] students = new Student[3];

        // Ініціалізація об'єктів
        students[0] = new Student(1, "Карась", "Іван", "Петрович", new Date(2000, 2, 5),
                "вул. Димар, 7", "68957452", "Факультет інженерії програмного забезпечення", 2, "Група 12-В");
        students[1] = new Student(2, "Семенов", "Петро", "Іванович", new Date(1999, 1, 10),
                "вул. Пушкіна, 4", "2546987554", "Факультет комп'ютерних наук", 3, "Група 14-А");
        students[2] = new Student(3, "Сидоров", "Михайло", "Максимович", new Date(2001, 11, 20),
                "вул. Кривоноса, 10", "567891234", "Факультет фізики і математики", 1, "Група 32-В");

        // Виведення інформації про студентів
        for (Student student : students) {
            student.printInfo();
            System.out.println();
        }
    }
}