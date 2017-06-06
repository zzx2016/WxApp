package com.qiniu.test;

import com.wx.einvite.boot.Application;
import com.wx.einvite.config.QiNiuConfig;
import com.wx.einvite.qiniu.QiNiuImageHelper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by admin on 2017/6/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class QiNiuTest {

	@Autowired
	private QiNiuImageHelper qiniuHelper;

	@Test
	public void uploadImage() {

		System.out.println(qiniuHelper.upload("D:/123.png", "qq.jpg"));
	}

	@Test
	public void overlayUpload() {

		System.out.println(qiniuHelper.overlayUpload("E:/c1000/c1000_top_logo.png", "qq.jpg"));
	}

	@Test
	public void download() {
		qiniuHelper.download("qq.jpg");
	}

	@Test
	public void deleteImage() {

		qiniuHelper.delete("qq.jpg");
	}
}
