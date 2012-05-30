/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nj.invoicing.activity.engine;

import com.nj.invoicing.activity.ChargeTypeEnum;
import com.nj.invoicing.activity.LegCharge;
import com.nj.invoicing.interfaces.Leg;
import com.nj.invoicing.interfaces.Program;

/**
 *
 * @author TheG49
 */
public class ActivityInvoiceEngine
{
    public LegCharge calculateDomesticSegmentFee(Program program, Leg leg)
    {
        LegCharge charge = null;
        if (program != null && leg != null)
        {
            charge = new LegCharge();
            charge.rate = program.getDomesticSegmentFee();
            charge.quantity = leg.getNumberOfPassengers();
            charge.type = ChargeTypeEnum.DomesticSegmentFee;
        }
        return charge;
    }
}
