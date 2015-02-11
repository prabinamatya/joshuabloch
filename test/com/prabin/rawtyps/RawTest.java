package com.prabin.rawtyps;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class RawTest {
	Raw testObject = new Raw();

	@Test
	public void testUnsafeAdd() {
		List<String> strings = new ArrayList<String>();
		testObject.unsafeAdd(strings, new Integer(23));
		strings.get(0);
	}

	@Test
	public void testRawNumElementsInCommon() {
		Set s1 = new HashSet();
		s1.addAll(Arrays.asList("a", new Integer(1), "c"));
		Set s2 = new HashSet();
		s2.addAll(Arrays.asList("d", "b", "e", new Integer(5)));
		int actual = Raw.rawNumElementsInCommon(s1, s2);
		assertEquals(1, actual);
	}

	@Test
	public void testNumElementsInCommon() {
		Set<String> s1 = new HashSet<String>();
		s1.addAll(Arrays.asList("a", "b", "c"));
		Set<String> s2 = new HashSet<String>();
		s2.addAll(Arrays.asList("d", "b", "e"));
		int actual = Raw.rawNumElementsInCommon(s1, s2);
		assertEquals(1, actual);
	}

}
