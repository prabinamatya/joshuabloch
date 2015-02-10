package com.prabin.constants.inclass;

import static com.prabin.constants.inclass.PhysicalConstants.AVO_NUMBER;
import junit.framework.Assert;

import org.junit.Test;

/*
 * Use import static to avoid qualifying constants
 */
public class PhysicalConstantsTest {

	@Test
	public void test() {
		System.out.println(AVO_NUMBER); // check import static on top
		Assert.assertEquals(6.02214199e23, AVO_NUMBER);
	}
}
