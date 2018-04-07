import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
Program Name: TestMortgage.java
      Author: Shradhdha Parsana
        Date: Apr 4, 2018 8:18:42 AM
 Description:
*/
public class TestMortgage
{	

	// @Test
	// public void testApprovedDebt()
	// {
	// Mortgage m = new Mortgage(60.0, 1);
	// assertEquals(true, m.isQualified());
	// }
	//
	// @Test
	// public void testNotApprovedDebt()
	// {
	// Mortgage m = new Mortgage(70, 1);
	// assertEquals(false, m.isQualified());
	// }
	//
	// @Test
	// public void testApprovedDebtForLowerCerdit()
	// {
	// Mortgage m = new Mortgage(40, 3);
	// assertEquals(true, m.isQualified());
	// }
	//
	// @Test
	// public void testNotApprovedDebtForLowerCerdit()
	// {
	// Mortgage m = new Mortgage(66, 3);
	// assertEquals(false, m.isQualified());
	// }
	//
	// Test cases with 0 previous Debt Load
	@Test
	public void testApprovedDebt()
	{
		Mortgage m = new Mortgage(0.0, 250.0, 60.0, 2);
		assertEquals(true, m.isQualified());
	}

	@Test
	public void testNotApprovedDebt()
	{
		Mortgage m = new Mortgage(0.0, 70.0, 50.0, 2);
		assertEquals(false, m.isQualified());
	}

	@Test
	public void testApprovedDebtForLowerCerdit()
	{
		Mortgage m = new Mortgage(0.0, 350.0, 50.0, 4);
		assertEquals(true, m.isQualified());
	}

	@Test
	public void testNotApprovedDebtForLowerCerdit()
	{
		Mortgage m = new Mortgage(0.0, 60.0, 50.0, 4);
		assertEquals(false, m.isQualified());
	}

	// Test cases with previous Debt Load
	@Test
	public void testApprovedDebtV2()
	{
		Mortgage m = new Mortgage(50.0, 200.0, 50.0, 2);
		assertEquals(true, m.isQualified());
	}

	@Test
	public void testNotApprovedDebtV2()
	{
		Mortgage m = new Mortgage(50.0, 120.0, 50.0, 2);
		assertEquals(false, m.isQualified());
	}

	@Test
	public void testApprovedDebtForLowerCerditV2()
	{
		Mortgage m = new Mortgage(50.0, 300.0, 50.0, 4);
		assertEquals(true, m.isQualified());
	}

	@Test
	public void testNotApprovedDebtForLowerCerditV2()
	{
		Mortgage m = new Mortgage(50.0, 200.0, 50.0, 4);
		assertEquals(false, m.isQualified());
	}

	// Test cases with Invalid salary
	@Test
	public void testNagativeSalary()
	{
		Mortgage m = new Mortgage(50.0, -100.0, 50.0, 2);
		assertEquals(false, m.isQualified());
	}

	@Test
	public void testZeroSalary()
	{
		Mortgage m = new Mortgage(50.0, 0.0, 50.0, 2);
		assertEquals(false, m.isQualified());
	}

	// Test cases with Invalid Dept Load
	@Test
	public void testNagativeDebtLoad()
	{
		Mortgage m = new Mortgage(-50.0, 120.0, 50.0, 2);
		assertEquals(false, m.isQualified());
	}

	// Test cases with Invalid Mortgage
	@Test
	public void testNagativeMortgage()
	{
		Mortgage m = new Mortgage(50.0, 120.0, -50.0, 2);
		assertEquals(false, m.isQualified());
	}

	@Test
	public void testZeroMortgage()
	{
		Mortgage m = new Mortgage(50.0, 120.0, 0.0, 2);
		assertEquals(false, m.isQualified());
	}

	// Test cases with Invalid Credit
	@Test
	public void testZeroCredit()
	{
		Mortgage m = new Mortgage(50.0, 200.0, 10.0, 0);
		assertEquals(false, m.isQualified());
	}

	@Test
	public void testCreditMoreThanLimit()
	{
		Mortgage m = new Mortgage(50.0, 200.0, 10.0, 7);
		assertEquals(false, m.isQualified());
	}

}
