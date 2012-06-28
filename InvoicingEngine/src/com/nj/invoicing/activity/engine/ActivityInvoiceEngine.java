/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nj.invoicing.activity.engine;

import com.nj.invoicing.enums.ChargeTypeEnum;
import com.nj.invoicing.activity.LegCharge;
import com.nj.invoicing.interfaces.Leg;
import com.nj.invoicing.interfaces.Program;
import com.nj.invoicing.interfaces.Contract;

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

    public LegCharge calculateRegularHourlyRate(Contract contract, Leg leg)
    {
        LegCharge charge = null;
        if (contract != null && leg != null)
        {
            charge = new LegCharge();
            charge.rate = contract.getHourlyRate();
            charge.quantity = leg.getHoursFlown();
            charge.type = ChargeTypeEnum.RegularHourlyRate;
        }
        return charge;
    }
}
