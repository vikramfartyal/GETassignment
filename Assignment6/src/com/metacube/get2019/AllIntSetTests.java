package com.metacube.get2019;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ GetComplementTest.class, IsMemberTest.class,
		IsSubsetTest.class, SizeTest.class, UnionTest.class })
public class AllIntSetTests {

}
