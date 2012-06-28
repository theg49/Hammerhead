/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nj.invoicing.TestImpl;

import com.nj.invoicing.enums.FetEnum;
import com.nj.invoicing.enums.MonthlyRateEnum;
import com.nj.invoicing.interfaces.MonthlyRate;
import java.math.BigDecimal;
import java.util.GregorianCalendar;

/**
 *
 * @author TheG49
 */
public class MonthlyRateImpl implements MonthlyRate
{
    public BigDecimal rate = null;
    public GregorianCalendar startDate = null;
    public GregorianCalendar endDate = null;
    public MonthlyRateEnum rateType = MonthlyRateEnum.None;
    public FetEnum fetFlag = FetEnum.Default;

    public MonthlyRateImpl (BigDecimal rate, GregorianCalendar start, GregorianCalendar end,
            MonthlyRateEnum rateType, FetEnum fetFlag)
    {
        this.rate = rate;
        startDate = start;
        endDate = end;
        this.rateType = rateType;
        this.fetFlag = fetFlag;
    }

    @Override
    public BigDecimal getRate()
    {
        return rate;
    }

    @Override
    public GregorianCalendar getStartDate()
    {
        return startDate;
    }

    @Override
    public GregorianCalendar getEndDate()
    {
        return endDate;
    }

    @Override
    public Enum getRateType()
    {
        return rateType;
    }

    @Override
    public FetEnum getFetFlag()
    {
        return fetFlag;
    }

}
