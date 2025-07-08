package idh.java;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMyLinkedList {
    MyLinkedList<String> list;

    @BeforeAll
    public static void setUpOnce() {

    }

    @BeforeEach
    public void setUp() {
	list = new MyLinkedList<String>();
    }

    @Test
    public void testEmptyList() {
	assertEquals(0, list.size());
    }

    @Test
    public void testIsEmpty() {
	assertTrue(list.isEmpty());
	assertFalse(!list.isEmpty());
    }
    
    @Test
    public void testException() {
	
	assertThrows(IndexOutOfBoundsException.class, () -> list.get(5));
    }

    @AfterAll
    public static void afterall() {
	
    }
    
    @AfterEach
    public void aftereach() {

    }
}
