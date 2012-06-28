/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nj.invoicing.util;

import java.util.*;

/**
 *
 * @author TheG49
 */
public class DateUtil
{
    public static GregorianCalendar createDate(int year, int month, int day)
    {
        TimeZone tz= TimeZone.getTimeZone("GMT");
        GregorianCalendar date = new GregorianCalendar(tz);
        date.set(Calendar.YEAR, year);
        date.set(Calendar.MONTH, month);
        date.set(Calendar.DAY_OF_MONTH, day);
        date.set(Calendar.HOUR_OF_DAY, 5);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);
        return date;
    }
}
