package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "Basic Test Suite")
public class AppTest {

    @Test
    @DisplayName("creates the app")
    public void createsAnApp() {
        final App app = new App();

        assertThat(app, is(notNullValue()));
    }

    @Test
    @DisplayName("prints Fizz")
    public void printsFizz() {
        assertEquals("Fizz", FizzBuzz.get(3));
    }

    @Test
    @DisplayName("prints 1")
    public void prints1() {
        assertEquals("1", FizzBuzz.get(1));
    }
}