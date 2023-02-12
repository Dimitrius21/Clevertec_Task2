package ru.clevertec.mp;


import ru.clevertec.utils.StringUtils;


public class Utils {
    public boolean isAllPositiveNumbers(String ... str){
        StringUtils stringUtils = new StringUtils();
        if (str.length == 0) return false;
        boolean res = true;
        for(String st : str){
            res = res && stringUtils.isPositiveNumber(st);
        }
        return res;
    }
}
