package cn.exjoy.spring.start.tools;

import org.apache.xerces.impl.dv.util.Base64;

public class Base64Helper {
    public static final String encrypt(String source) {

        return Base64.encode(source.getBytes());
    }
}
