/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nj.invoicing.TestImpl;

import com.nj.invoicing.interfaces.Contract;
import com.nj.invoicing.interfaces.MonthlyRate;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Keith Canfield
 */
public class ContractImpl implements Contract
{
    public BigDecimal hourlyRate = null;
    public List<MonthlyRate> monthlyRates = null;

    @Override
    public BigDecimal getHourlyRate()
    {
        return hourlyRate;
    }

    @Override
    public List<MonthlyRate> getMonthlyRates()
    {
        return monthlyRates;
    }
}
