package com.example.testDemo.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class ChildDomain {
    private String name;
    private int age;
    private Children children;
}
