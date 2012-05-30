/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nj.invoicing.TestImpl;

import com.nj.invoicing.interfaces.Program;
import java.math.BigDecimal;

/**
 *
 * @author TheG49
 */
public class ProgramImpl implements Program
{
    public BigDecimal dsf = null;

    @Override
    public BigDecimal getDomesticSegmentFee()
    {
        return dsf;
    }

}
