package org.example;

import lombok.ToString;


@ToString
public class INum implements Comparable{

    private int num;

    public int getNum() {
        return num;
    }

    public INum(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return 10;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((INum)obj).num;
    }

    // Arrays.sort 호출하면 기본형(int,double) 타입 정렬
    // 객체형타입(Inum,Person)을 정렬하려면
    // Comparable 상속받아서 compareTo 재정의해서 사용

    // 오름차순 this.num - ((INum)o).num
    // 내림차순 ((INum)o).num - this.num
    @Override
    public int compareTo(Object o) {
        return ((INum)o).num - this.num;
    }
}
