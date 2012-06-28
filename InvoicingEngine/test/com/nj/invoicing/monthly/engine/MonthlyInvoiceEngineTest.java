/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nj.invoicing.monthly.engine;

import com.nj.invoicing.TestImpl.ContractImpl;
import com.nj.invoicing.TestImpl.MonthlyRateImpl;
import com.nj.invoicing.enums.FetEnum;
import com.nj.invoicing.enums.MonthlyRateEnum;
import com.nj.invoicing.interfaces.Contract;
import com.nj.invoicing.interfaces.MonthlyRate;
import com.nj.invoicing.monthly.MonthlyCharge;
import com.nj.invoicing.util.DateUtil;
import java.math.BigDecimal;
import java.util.*;
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

    public void assertBigDecimal(int i, BigDecimal dec)
    {
        assertEquals(i, dec.intValue());
    }

    public void assertBigDecimal(double i, BigDecimal dec)
    {
        assertEquals(i, dec.doubleValue());
    }

    public GregorianCalendar getDate(int year, int month, int day)
    {
        return DateUtil.createDate(year, month, day);
    }

    /**
     * Test of determineApplicableMonthlyRates method, of class MonthlyInvoiceEngine.
     */
    @Test
    public void testDetermineApplicableMonthlyRates()
    {
        System.out.println("determineApplicableMonthlyRates");
        GregorianCalendar billingMonth = getDate(2012, 6, 1);
        ContractImpl contract = new ContractImpl();
        contract.monthlyRates = new ArrayList<MonthlyRate>(1);
        contract.monthlyRates.add(new MonthlyRateImpl(new BigDecimal(1000.00),
                getDate(2011, 6, 1), null, MonthlyRateEnum.MonthlyManagementFee, FetEnum.Default));

        MonthlyInvoiceEngine instance = new MonthlyInvoiceEngine();
        List<MonthlyCharge> result = instance.determineApplicableMonthlyRates(billingMonth, contract);

        assertNotNull(result);
        assertEquals(1, result.size());
        MonthlyCharge charge = result.get(0);
        assertEquals(null, charge.fet);
        assertBigDecimal(1, charge.quantity);
        assertBigDecimal(1000, charge.rate);
        assertEquals(FetEnum.Default, charge.taxable);
        assertBigDecimal(1000, charge.getTotal());
    }
}
