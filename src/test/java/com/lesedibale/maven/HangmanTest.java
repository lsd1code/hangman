package com.lesedibale.maven;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class HangmanTest {
  private Hangman hm = new Hangman();
  private Scanner scn;

  @BeforeAll
  void init() {
    scn = new Scanner(System.in);
  }

  @AfterAll
  void destroy() {
    scn.close();
  }

  @Test
  void testHideWord() {
    assertEquals("_______", hm.hideWord("ronaldo"));
  }

  @Test
  void testHideWordError() {
    assertThrows(RuntimeException.class, () -> hm.hideWord("word-with-dashes"));
  }

  // @Test
  // void testGetValue() {
  // assertEquals("hello", hm.getValue());
  // }
}
