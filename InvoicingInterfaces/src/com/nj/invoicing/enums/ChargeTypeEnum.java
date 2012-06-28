/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nj.invoicing.enums;

/**
 *
 * @author TheG49
 */
public enum ChargeTypeEnum
{
    None(0),
    RegularHourlyRate(1),
    DomesticSegmentFee(10);

    public final int code;

    ChargeTypeEnum(int codeIn)
    {
        code = codeIn;
    }
}
