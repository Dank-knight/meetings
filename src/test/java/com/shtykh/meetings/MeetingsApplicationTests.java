package com.shtykh.meetings;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
class MeetingsApplicationTests {

    @Test
    void contextLoads() {
        assertThat(Boolean.TRUE, is(Boolean.TRUE));
    }

}
