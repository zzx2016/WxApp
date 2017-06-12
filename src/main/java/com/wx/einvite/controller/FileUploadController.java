package com.wx.einvite.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.wx.einvite.qiniu.QiNiuImageHelper;

@Controller
@RequestMapping("/file")
public class FileUploadController {
	
	@Autowired
	private QiNiuImageHelper qiNiuImageHelper;
	
	@RequestMapping("/upload")
	@ResponseBody
	public String upload(MultipartFile file) throws IOException{
		
		String str = qiNiuImageHelper.upload(file, file.getOriginalFilename());
		return str;
	}

}
