package com.example.testDemo.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
public class Children {
    private final List<ChildType> childType;
}
