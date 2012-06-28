/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nj.invoicing.monthly.engine;

import com.nj.invoicing.interfaces.Contract;
import com.nj.invoicing.interfaces.MonthlyRate;
import com.nj.invoicing.monthly.MonthlyCharge;
import com.nj.invoicing.enums.MonthlyRateEnum;
import java.math.BigDecimal;
import java.util.*;

/**
 *
 * @author TheG49
 */
public class MonthlyInvoiceEngine
{
    public List<MonthlyCharge> determineApplicableMonthlyRates(GregorianCalendar billingMonth, Contract contract)
    {
        ArrayList<MonthlyCharge> charges = new ArrayList<MonthlyCharge>();
        if (billingMonth != null && contract != null)
        {
            List<MonthlyRate> rates = contract.getMonthlyRates();
            Iterator<MonthlyRate> iter = rates.iterator();
            while (iter.hasNext())
            {
                MonthlyRate rate = iter.next();
                GregorianCalendar end = rate.getEndDate();
                if (end == null || end.after(billingMonth))
                {
                    GregorianCalendar start = rate.getStartDate();
                    if (start.before(billingMonth))
                    {
                        MonthlyCharge charge = new MonthlyCharge();
                        charge.taxable = rate.getFetFlag();
                        charge.rate = rate.getRate();
                        charge.quantity = new BigDecimal(1);
                        charge.type = (MonthlyRateEnum) rate.getRateType();
                        charges.add(charge);
                    }
                }
            }
        }
        return charges;
    }
}
