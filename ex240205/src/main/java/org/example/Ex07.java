package org.example;

class User{
    enum Gender{
        MALE,FEMALE
    }
    private String name;
    private Gender gen;

    public User(String name, Gender gen) {
        this.name = name;
        this.gen = gen;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gen=" + gen +
                '}';
    }
}

public class Ex07 {
    public static void main(String[] args) {
        User user = new User("홍길동", User.Gender.MALE);
        User user1 = new User("박미자", User.Gender.FEMALE);

        System.out.println(user);
        System.out.println(user1);
    }
}
