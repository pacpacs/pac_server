package com.pac.service;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;


@Service("ImageService")
public class ImageService {

	final static String ARTICLE_IMAGE_REPO ="/home/ec2-user/pac/git/images";
	Logger log = LoggerFactory.getLogger("com.pac.service.ImageService");
	
	//���� file upload
	protected List<String> upload(MultipartHttpServletRequest multipartRequest) throws Exception
	{
		//fileList�޾ƿ�
		List<String> fileList = new ArrayList<String>();
		Iterator<String> fileNames = multipartRequest.getFileNames();
		
		while(fileNames.hasNext()) {
			//�� ���� file���� upload����
			String fileName = fileNames.next();
			MultipartFile mFile = multipartRequest.getFile(fileName);
			
			//originalFileName ���ϰ� fileList�� ����
			String originalFileName = mFile.getOriginalFilename();
			fileList.add(originalFileName);
			
			File file = new File(ARTICLE_IMAGE_REPO+"/"+fileName);
			if(mFile.getSize()!=0) {
				if(! file.exists()) {
					if(file.getParentFile().mkdirs()) {
						file.createNewFile();
					}
				}
				mFile.transferTo(new File(ARTICLE_IMAGE_REPO+"/temp/"+originalFileName));
			}
			
			
		}
		return fileList;
	}
}
