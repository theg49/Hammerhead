/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nj.invoicing.activity;

/**
 *
 * @author TheG49
 */
public enum ChargeTypeEnum
{
    None(0),
    DomesticSegmentFee(1),
    RegularHourlyRate(2);

    public final int code;

    ChargeTypeEnum(int codeIn)
    {
        code = codeIn;
    }
}
