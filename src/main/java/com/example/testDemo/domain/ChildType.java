package com.example.testDemo.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
public class ChildType {
    private final ChildTypeName childTypeName;
    private final boolean flag;
}
