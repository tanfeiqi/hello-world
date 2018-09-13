package com.tanfeiqi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tan on 2018/9/5.
 */
public class RegxTest {
    private static Pattern params_pattern = Pattern.compile("(?<=\\()[^\\)]+");
    private static Pattern pattern_special =Pattern.compile("(?<=\\().+");

    public static String[] getParams(String code){
        int length =code.length();
        int index =code.indexOf(")");
        Matcher m;
        String param = null;
        if (length > index+2){
            m =pattern_special.matcher(code);
            if (m.find()){
                param =m.group();
                param =param.substring(0,param.lastIndexOf(")"));

            }
        }else {
            m =params_pattern.matcher(code);
            if (m.find()){
                param =m.group();
            }
        }
        String[] list=null;
        if (param!=null && !param.isEmpty()){
            list =param.split(",");
            for (int i=0;i< list.length;i++){
                if (!list[i].isEmpty()) {
                    if (list[i].trim().indexOf("\"") == 0){
                        list[i] = list[i].substring(1, list[i].length());
                    }
                    if (list[i].lastIndexOf("\"") ==list[i].length()-1){
                        list[i] = list[i].substring(0, list[i].length() - 1);
                    }
                }
                if (list[i].contains("\\\"")){
                    list[i] =list[i].replace("\\","");
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String line = "open app (com.mogujie, x2) sadaaaasdasd";
        String[] arr = getParams(line);
        if (arr.length > 0) {
            for(int i = 0; i < arr.length; i ++) {
                System.out.println("转义的字符串数组" + i + " 是: " + arr[i]);
            }
        } else {
            System.out.println("结果为空");
        }
    }
}
