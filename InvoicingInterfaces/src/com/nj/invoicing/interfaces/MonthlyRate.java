/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nj.invoicing.interfaces;

import com.nj.invoicing.enums.FetEnum;
import java.math.BigDecimal;
import java.util.GregorianCalendar;

/**
 *
 * @author TheG49
 */
public interface MonthlyRate
{
    public BigDecimal getRate();
    public GregorianCalendar getStartDate();
    public GregorianCalendar getEndDate();
    public Enum getRateType();
    public FetEnum getFetFlag();
}
