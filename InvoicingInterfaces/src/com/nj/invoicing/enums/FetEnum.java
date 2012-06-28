/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nj.invoicing.enums;

/**
 *
 * @author TheG49
 */
public enum FetEnum
{
    None(0),
    Yes(1),
    No(2),
    Default(3);

    public final int code;

    FetEnum(int codeIn)
    {
        code = codeIn;
    }
}
