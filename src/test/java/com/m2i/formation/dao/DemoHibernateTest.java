package com.m2i.formation.dao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.m2i.formation.dao.entity.Formation;

public class DemoHibernateTest {
	DemoHibernate demo = new DemoHibernate();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreateFormation() {
		Formation f = new Formation("SPRING");
		demo.createFormation(f);

	}

}
