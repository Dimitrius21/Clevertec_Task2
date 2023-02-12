package ru.clevertec.utils;

import static org.apache.commons.lang3.math.NumberUtils.createNumber;

public class StringUtils {
    public boolean isPositiveNumber(String str){
        Number number = createNumber(str);
        return number.doubleValue() > 0 ? true : false;
    }
}
