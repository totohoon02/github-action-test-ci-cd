package com.githubactiontestcicd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    void helloTest(){
        String msg = "Hello!";
        Assertions.assertThat(msg).isEqualTo("Hello!");
    }
}
