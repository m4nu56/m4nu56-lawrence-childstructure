package com.example.testDemo.domain;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ChildStructure {

    public ChildDomain setClientConfiguration() {
        return ChildDomain.builder()
                .name("John")
                .age(1)
                .children(Children.builder()
                        .childType(Arrays.asList(
                                ChildType.builder().childTypeName(ChildTypeName.SHORT).flag(true).build(),
                                ChildType.builder().childTypeName(ChildTypeName.SLIM).flag(true).build(),
                                ChildType.builder().childTypeName(ChildTypeName.TALL).flag(true).build())).build())
                .build();
    }
}






