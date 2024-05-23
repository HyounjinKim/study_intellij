package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Table {
    private int ttindex;
    private String theater;
    private Date startTime;
    private Date endTime;
    private int mobieNum;

}
