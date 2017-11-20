package com.ecreditpal.chain.bare.common.config;

import java.io.*;
import java.net.URL;

/**
 * @author lifeng
 * @version 1.0 on 2017/3/17.
 */
public class FileUtil {
    public static String getFilePath(String fileName) {
        ClassLoader classLoader = getClassLoader();
        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new RuntimeException("can not find file:" + fileName);
        }
        return resource.getPath();
    }

    private static ClassLoader getClassLoader() {
        ClassLoader cl;
        cl = Thread.currentThread().getClass().getClassLoader();
        if (cl == null) {
            cl = ClassLoader.getSystemClassLoader();
        }
        return cl;
    }

    public static String getRootPath() {
        File file = new File(System.getProperty("user.dir"));
        String rootPath = file.getPath();
        //单元测试时将会在此目录
        if (rootPath.endsWith("maas-web")) {
            rootPath = file.getParent();
        }
        return rootPath;
    }

    public static void copyFile(File src, String des) throws IOException {
        File desPath = new File(des);
        if (!desPath.exists()){
            boolean success = desPath.mkdir();
        }
        InputStream inStream = new FileInputStream(src);
        String destFile =des+File.separator+src.getName();
        FileOutputStream fs = new FileOutputStream(destFile);
        byte[] buffer = new byte[1025];
        int length;
        int byteread = 0;
        while ((byteread = inStream.read(buffer)) != -1) {
            fs.write(buffer, 0, byteread);
        }
        inStream.close();
    }

    public static String readFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String str;
        StringBuilder sb = new StringBuilder();
        while ((str=reader.readLine())!=null) {
            sb.append(str);
        }
        return sb.toString();
    }



}
