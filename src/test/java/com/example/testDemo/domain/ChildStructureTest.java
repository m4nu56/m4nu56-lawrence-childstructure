package com.example.testDemo.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


@ExtendWith(MockitoExtension.class)
class ChildStructureTest {

    @InjectMocks
    ChildStructure childStructure;

    @Test
    void should_get_site() {
        ChildDomain expectedSite =getExpectedChildDomain();
        ChildDomain actualSite = childStructure.setClientConfiguration();
        assertThat(actualSite, is(equalTo(expectedSite))); //this should fail
    }

    private ChildDomain getExpectedChildDomain() {
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


