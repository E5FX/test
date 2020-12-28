package com.z1805.demo.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.z1805.demo.util.Result;


@RestController
@RequestMapping("/myfile")
public class MyFileController {

	@RequestMapping("/upload")
	public Result upload(MultipartFile file) {
		String fileName=file.getOriginalFilename();
		String suffix=fileName.substring(fileName.indexOf("."), fileName.length());
		fileName=System.currentTimeMillis()+suffix;
		String path="E:\\workspace\\blog\\src\\main\\resources\\static\\img\\";
		File sfile=new File(path+fileName);
		if (!sfile.getParentFile().exists()) {
			sfile.getParentFile().exists();
		}
		try {
			file.transferTo(sfile);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		String str = sfile+"";
		str = str.replace("E:\\workspace\\blog\\src\\main\\resources\\static\\img\\", "../../img/");
		Result result=new Result(Result.SUCCESS_CODE, "", str);
		return result;
	}
}
