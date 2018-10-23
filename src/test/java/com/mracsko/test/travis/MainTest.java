package com.mracsko.test.travis;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

  @Test
  public void test1() {
    Assert.assertTrue(1 == 1);
  }

  @Test
  public void test2() {
    Assert.assertEquals(150, 150);
  }

  @Test
  public void test3() {
    System.out.println();
    System.out.println("=============================");
    System.out.println("Printing properties");
    System.out.println("=============================");
    System.getProperties().list(System.out);
    System.out.println("-----------------------------");
    System.out.println();
  }
}