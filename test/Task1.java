import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import st1920.automaton.RegExpMatcher;

public class Task1 {

	@Test
	public void test1() {
		boolean a = RegExpMatcher.matches("","[a-z]");
		assertFalse(a);
	}

	@Test 
	public void test2() {
		boolean a = RegExpMatcher.matches("aaa","");
		assertTrue(a);
	}
	@Test
	public void test3() {
		boolean a = RegExpMatcher.matches("aaa","[1-100]");
		assertTrue(a);
	}
	
	@Test
	public void test4() {
		boolean a = RegExpMatcher.matches("1111","[a-z]?");
		assertFalse(a);
	}
	
	@Test
	public void test5() {
		boolean a = RegExpMatcher.matches("DDDDD","[1-(-10)]{3}");
		assertFalse(a);
	}
	
	@Test
	public void test6() {
		boolean a = RegExpMatcher.matches("DDDDD","[1-10]{-10}");
		assertFalse(a);
	}
	
	@Test
	public void test7() {
		boolean a = RegExpMatcher.matches("DDDDD113rcewc","{10}[1-10]");
		assertFalse(a);
	}
	
	@Test
	public void test8() {
		boolean a = RegExpMatcher.matches("DDDDD113rcewc","^#");
		assertFalse(a);
	}
	
	@Test
	public void test9() {
		boolean a = RegExpMatcher.matches("","()<3-7>");
		assertFalse(a);
	}
	
	@Test
	public void test10() {
		boolean a = RegExpMatcher.matches("DDDDD113rcewc","[]");
		assertFalse(a);
	}
	
	@Test
	public void test11() {
		boolean a = RegExpMatcher.matches("5",",{10}<3-7-0>");
		assertFalse(a);
	}
	
	@Test
	public void test12() {
	    boolean a = RegExpMatcher.matches("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG"," ^");
		assertFalse(a);
	}
	
	@Test
    public void test13() {
        assertFalse(RegExpMatcher.matches("a", "*********"));
    }

	@Test
	public void test14() {
		boolean a = RegExpMatcher.matches("86420", "aaa");
		assertFalse(a);
	}

	@Test
	public void test15() {
		boolean a = RegExpMatcher.matches("ccc", "((ccc))");
		assertFalse(a);
	}



}
