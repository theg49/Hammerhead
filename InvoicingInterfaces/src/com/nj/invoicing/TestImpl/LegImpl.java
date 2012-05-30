/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nj.invoicing.TestImpl;

import com.nj.invoicing.interfaces.Leg;
import java.math.BigDecimal;

/**
 *
 * @author TheG49
 */
public class LegImpl implements Leg
{
    public BigDecimal numberOfPax = null;

    @Override
    public BigDecimal getNumberOfPassengers()
    {
        return numberOfPax;
    }
}
