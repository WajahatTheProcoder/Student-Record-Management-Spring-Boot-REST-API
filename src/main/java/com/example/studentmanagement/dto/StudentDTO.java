package com.example.studentmanagement.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class StudentDTO {
    @NotBlank
    private String name;

    @NotNull @Min(0) @Max(100)
    private Integer marks1;

    @NotNull @Min(0) @Max(100)
    private Integer marks2;

    @NotNull @Min(0) @Max(100)
    private Integer marks3;

    @NotNull @Min(0) @Max(100)
    private Integer marks4;

    @NotNull @Min(0) @Max(100)
    private Integer marks5;

    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Integer getMarks1() { return marks1; }
    public void setMarks1(Integer marks1) { this.marks1 = marks1; }
    public Integer getMarks2() { return marks2; }
    public void setMarks2(Integer marks2) { this.marks2 = marks2; }
    public Integer getMarks3() { return marks3; }
    public void setMarks3(Integer marks3) { this.marks3 = marks3; }
    public Integer getMarks4() { return marks4; }
    public void setMarks4(Integer marks4) { this.marks4 = marks4; }
    public Integer getMarks5() { return marks5; }
    public void setMarks5(Integer marks5) { this.marks5 = marks5; }
}
