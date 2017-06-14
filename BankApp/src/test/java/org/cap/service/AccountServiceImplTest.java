package org.cap.service;

import java.util.Arrays;
import java.util.Collection;

public class AccountServiceImplTest {
	private static Integer[][] parameters = new Integer[][] { { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 },
			{ 6, 8 } };

	public static Collection<Object[]> data() {
		return Arrays.asList(parameters);
	}
}
