package com.z1805.demo.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GetFoldFileNames {

    /**
     *
     * @author zdz8207
     */
    public static void main(String[] args) {
        for (String map : getFileName()) {
			System.out.println(map);
		}
    }

    public static List<String> getFileName() {
    	List<String> list=new ArrayList<>();
    	
        String path = "E:\\workspace\\blog\\src\\main\\resources\\static\\img\\category"; // 路径
        File f = new File(path);
        if (!f.exists()) {
            System.out.println(path + " not exists");
            return null;
        }

        File fa[] = f.listFiles();
        for (int i = 0; i < fa.length; i++) {
            File fs = fa[i];
            list.add(fs.getName());
        }
        return list;
    }
}