package ru.geekbrains;

public class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private String cash;
    private int age;

    public Person(String name, String position, String email,
                  String phone, String cash, int age) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.cash = cash;
    }
//    public info(String name, String position, String email,
//            String phone, String cash, int age) {
//            System.out.println("; Имя пользователя: " + name +
//                    "; должность: " + position +
//                    "; email: " + email +
//                    "; телефон: " + phone +
//                    "; зарплата: " + cash +
//                    "; Возраст: " + age);
//    }
//

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван", "Начальник отдела", "ii@simple.com", "+7(499)111-11-11", "100000р.", 35);
        persArray[1] = new Person("Иванов Петр", "Зам. начальника отдела", "ii@simple.com", "+7(499)111-11-12", "900000р.", 33);
        persArray[2] = new Person("Иванов Сергей", "Специалист", "ii@simple.com", "+7(499)111-11-13", "700000р.", 37);
        persArray[3] = new Person("Иванов Василий", "Специалист", "ii@simple.com", "+7(499)111-11-14", "700000р.", 45);
        persArray[4] = new Person("Иванов Игорь", "Специалист", "ii@simple.com", "+7(499)111-11-15", "700000р.", 47);


        for (int i = 0; i < persArray.length; i++) {
            if (info.age >= 40) {
                System.out.println(persArray[i]);
            }
        }
    }
    public void print40Age(int age) {
        for (int i = 0; i < persArray.length; i++) {
            if (age >= 40) {
                System.out.println(persArray[i]);
            }

        }
    }



}
