package com.lesedibale.maven;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class HangmanTest {
  @Test
  void sampleTest() {
    fail("This is a failing test");
  }
}
