/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nj.invoicing.activity.engine;

import com.nj.invoicing.TestImpl.LegImpl;
import com.nj.invoicing.TestImpl.ProgramImpl;
import com.nj.invoicing.TestImpl.ContractImpl;
import com.nj.invoicing.enums.ChargeTypeEnum;
import com.nj.invoicing.activity.LegCharge;
import java.math.BigDecimal;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author TheG49
 */
public class ActivityInvoiceEngineTest
{
    public ActivityInvoiceEngineTest()
    {
    }

    ActivityInvoiceEngine engine = null;

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
        engine = new ActivityInvoiceEngine();
    }

    @After
    public void tearDown()
    {
        engine = null;
    }

    @Test
    public void testCalculateDomesticSegmentFee()
    {
        ProgramImpl prog = new ProgramImpl();
        prog.dsf = new BigDecimal(7.2);

        LegImpl leg = new LegImpl();
        leg.numberOfPax = new BigDecimal(0);

        LegCharge charge = engine.calculateDomesticSegmentFee(prog, leg);
        assertNotNull(charge);
        assertNull(charge.fet);
        assertEquals("Expecting charge type of DSF", charge.type, ChargeTypeEnum.DomesticSegmentFee);
        assertEquals("Expecting rate of 7.2", prog.dsf, charge.rate);
        assertEquals("Expecting quantity of 0", leg.numberOfPax, charge.quantity);
        assertEquals("Total ", prog.dsf.multiply(leg.numberOfPax), charge.getTotal());
    }

    @Test
    public void testCalculateRegularHourlyRate()
    {
        ContractImpl contract = new ContractImpl();
        contract.hourlyRate = new BigDecimal(5000.00);

        LegImpl leg = new LegImpl();
        leg.hoursFlown = new BigDecimal(1.6);

        LegCharge charge = engine.calculateRegularHourlyRate(contract, leg);
        assertNotNull(charge);
        assertNull(charge.fet);
        assertEquals("Expecting charge type of RegularHourlyRAte", charge.type, ChargeTypeEnum.RegularHourlyRate);
        assertEquals("Expecting rate of 5000.00", contract.hourlyRate, charge.rate);
        assertEquals("Expecting quantity of 1.6", leg.hoursFlown, charge.quantity);
        assertEquals("Total ", contract.hourlyRate.multiply(leg.hoursFlown), charge.getTotal());
    }
}
