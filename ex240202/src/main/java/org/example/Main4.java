package org.example;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person>{
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //    @Override
//    public int compareTo(Object o) {
//        return this.age - ((Person)o).age;
//    }
}

class Comp implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o2.age - o1.age;
    }
}

public class Main4 {
    public static void main(String[] args) {
        // 방법1
        // TreeSet 순서가 있는 자료형 컬렉션
        // 제네릭 객체를 넣으려면 Comparable 인터페이스르 상속받아
        // CompareTo 메서드 재정의
        // 방법2
        // Comparator 인터페이스를 상속받아
        // TreeSet 객체 생성시에 생성자 변수로 넣어주면 된다.
        Set<Person> ts = new TreeSet<>(new Comp());
        ts.add(new Person("홍길동",100));
        ts.add(new Person("김길동",20));
        ts.add(new Person("이길동",10));

        System.out.println(ts);
    }
}
