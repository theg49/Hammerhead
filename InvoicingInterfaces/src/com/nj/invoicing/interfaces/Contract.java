/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nj.invoicing.interfaces;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Keith Canfield
 */
public interface Contract
{
    public BigDecimal getHourlyRate();
    public List<MonthlyRate> getMonthlyRates();
}
