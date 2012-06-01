/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nj.invoicing.monthly;

/**
 *
 * @author TheG49
 */
public enum MonthlyRateEnum
{
    None(0),
    PremiumManagementFee(559),
    MonthlyManagementFee(560),
    PromissoryNote(561),
    MonthlyLeasePayment(562),
    LeaseUseTax(563);

    public final int code;

    MonthlyRateEnum(int codeIn)
    {
        code = codeIn;
    }
}
