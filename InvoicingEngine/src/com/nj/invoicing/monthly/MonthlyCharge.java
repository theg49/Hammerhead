/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nj.invoicing.monthly;

import java.math.BigDecimal;

/**
 *
 * @author TheG49
 */
public class MonthlyCharge
{
    public BigDecimal rate = null;
    public BigDecimal quantity = null;
    public MonthlyRateEnum type = MonthlyRateEnum.None;
    public BigDecimal fet = null;
    public String calculationText = null;

    public BigDecimal getTotal()
    {
        if (rate == null || quantity == null)
        {
            return new BigDecimal(0);
        }
        else
        {
            return rate.multiply(quantity);
        }
    }

}
