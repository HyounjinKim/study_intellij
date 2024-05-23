package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// clone 매서드를 정의하려면
// cloneable 인터페이스를 상속받아야한다

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Point implements Cloneable{
    private int xpos;
    private int ypos;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
