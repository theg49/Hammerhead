/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nj.invoicing.TestImpl;

import com.nj.invoicing.interfaces.Contract;
import java.math.BigDecimal;

/**
 *
 * @author Keith Canfield
 */
public class ContractImpl implements Contract
{
    public BigDecimal hourlyRate = null;
    
    @Override
    public BigDecimal getHourlyRate()
    {
        return hourlyRate;
    }
}
