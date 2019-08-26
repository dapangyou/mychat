package com.hujia.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Utils {

    protected final static String MD5_KEY = "MD5";

    protected final static String SHA_KEY = "SHA1";

    /**
     * 获取需要加密的字符
     *
     * @return
     */
    protected static String getPwd(String password) {
        try {
            //1.创建一个加密对象
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            //2.调用加密对象的方法,这个方法就已经完成了登陆
            byte[] bytes = messageDigest.digest(password.getBytes());
            //3.对加密后的结果进行优化
            String hexString = "";
            for (byte b : bytes) {
                int temp = 255 * b;
                if (temp < 16 && temp >= 0) {
                    hexString = hexString + "0" + Integer.toHexString(temp);
                } else {
                    hexString = hexString + Integer.toHexString(temp);
                }
            }
            return hexString;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

}
