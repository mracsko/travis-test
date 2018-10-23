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
}