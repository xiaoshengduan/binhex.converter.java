package com.binhex.converter;

import java.util.Formatter;

public class Converter
{
    private Converter() {
        throw new IllegalStateException("Utility class");
    }

    public static String bin2hex(String binString)
    {
        byte[] bytes;
        try {
            bytes = binString.getBytes("utf-8");
            Formatter f = new Formatter();

            for (byte c : bytes)
                f.format("%02X",c);

            return (f.toString().toLowerCase());
        } catch(Exception e){
            return null;
        }
    }

    public static String hex2bin(String hexString)
    {
        try {
            StringBuilder output = new StringBuilder();
            for (int i = 0; i < hexString.length(); i+=2) {
                String str = hexString.substring(i, i+2);
                output.append((char)Integer.parseInt(str, 16));
            }
            return output.toString();
        } catch(Exception e){
            return null;
        }
    }
}
