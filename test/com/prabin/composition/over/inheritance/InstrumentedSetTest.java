package com.prabin.composition.over.inheritance;

import java.util.Arrays;
import java.util.HashSet;

import junit.framework.Assert;

import org.junit.Test;

public class InstrumentedSetTest {

	@Test
	public void test() {
		InstrumentedSet<String> testObject = new InstrumentedSet<String>(
				new HashSet<String>());
		testObject.addAll(Arrays.asList("itema1", "items2", "itesm3"));

		Assert.assertEquals(3, testObject.getAddCount());
	}

}
