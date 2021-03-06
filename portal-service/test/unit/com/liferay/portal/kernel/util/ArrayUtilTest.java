/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.kernel.util;

import com.liferay.portal.kernel.test.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eudaldo Alonso
 */
public class ArrayUtilTest extends TestCase {

	public void testToDoubleArray() throws Exception {
		List<Double> list = new ArrayList<Double>();

		list.add(1.0);
		list.add(2.0);

		double[] array = ArrayUtil.toDoubleArray(list);

		assertEquals(array.length, list.size());

		for (int i = 0; i < list.size(); i++) {
			Double value = list.get(i);

			assertEquals(value.doubleValue(), array[i]);
		}
	}

	public void testToFloatArray() throws Exception {
		List<Float> list = new ArrayList<Float>();

		list.add(1.0F);
		list.add(2.0F);

		float[] array = ArrayUtil.toFloatArray(list);

		assertEquals(array.length, list.size());

		for (int i = 0; i < list.size(); i++) {
			Float value = list.get(i);

			assertEquals(value.floatValue(), array[i]);
		}
	}

	public void testToIntArray() throws Exception {
		List<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);

		int[] array = ArrayUtil.toIntArray(list);

		assertEquals(array.length, list.size());

		for (int i = 0; i < list.size(); i++) {
			Integer value = list.get(i);

			assertEquals(value.intValue(), array[i]);
		}
	}

	public void testToLongArray() throws Exception {
		List<Long> list = new ArrayList<Long>();

		list.add(1L);
		list.add(2L);

		long[] array = ArrayUtil.toLongArray(list);

		assertEquals(array.length, list.size());

		for (int i = 0; i < list.size(); i++) {
			Long value = list.get(i);

			assertEquals(value.longValue(), array[i]);
		}
	}

}