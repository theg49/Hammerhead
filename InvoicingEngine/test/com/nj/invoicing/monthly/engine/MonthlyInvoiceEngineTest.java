/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nj.invoicing.monthly.engine;

import com.nj.invoicing.interfaces.Contract;
import java.util.Date;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author TheG49
 */
public class MonthlyInvoiceEngineTest
{
    public MonthlyInvoiceEngineTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception
    {
    }

    @AfterClass
    public static void tearDownClass() throws Exception
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of determineApplicableMonthlyRates method, of class MonthlyInvoiceEngine.
     */
    @Test
    public void testDetermineApplicableMonthlyRates()
    {
        System.out.println("determineApplicableMonthlyRates");
        Date billingMonth = null;
        Contract contract = null;
        MonthlyInvoiceEngine instance = new MonthlyInvoiceEngine();
        List expResult = null;
        List result = instance.determineApplicableMonthlyRates(billingMonth,
                contract);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
