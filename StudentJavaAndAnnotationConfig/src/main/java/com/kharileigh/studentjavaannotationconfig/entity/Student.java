/**
 *
 * @author kharileigh
 * <------ 1st STEP : CREATE POJO - encapsulated entity - getters & setters / lombok API -------->
 */

package com.kharileigh.studentjavaannotationconfig.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class Student {
    
    private int rollNo;
    private String name;
    private int grade;
}
