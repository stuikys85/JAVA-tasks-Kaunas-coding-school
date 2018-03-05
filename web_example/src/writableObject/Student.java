package writableObject;

public class Student {// klase kuri saugo ne viena kintamaji o visus kurie yra lenyteleje

    private int id;
    private String name;
    private String surname;
    private String phone;
    private String email;

    public Student(int id, String name, String surname, String phone, String email) {
        this.id = id;//paims name is lenteles ir priskirs name lenteleje (virsuje paima string name)
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
