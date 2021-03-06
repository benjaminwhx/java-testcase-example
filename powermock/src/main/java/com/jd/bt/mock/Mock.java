package com.jd.bt.mock;

import java.io.File;

/**
 * User: 吴海旭
 * Date: 2016-11-26
 * Time: 下午8:21
 */
public class Mock {

    private int age;

    public int getAge() {
        return age;
    }

    public void doNothing() {
        System.out.println("do nothing");
    }

    public boolean callInternalInstance(String path) {
        File file = new File(path);
        return file.exists();
    }

    public boolean sendEmail(String userName, String password) {
        return false;
    }

    public boolean callArguementInstance(File file) {
        return file.exists();
    }

    public final boolean isAlive() {
        return false;
    }

    public String getDesc(String name) {
        return name + " call this method";
    }

    public static String replaceMethod1(String name) {
        return "replace1";
    }

    public static String replaceMethod2(String name) {
        return "replace2";
    }

    public static boolean isMan() {
        return false;
    }

    public boolean callPrivateMethod() {
        return isPublic();
    }

    private boolean isPublic() {
        return false;
    }

    public boolean callSystemFinalMethod(String str) {
        return str.isEmpty();
    }

    public String callSystemStaticMethod(String str) {
        return System.getProperty(str);
    }
}
