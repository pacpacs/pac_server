package com.pac.service;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.tomcat.util.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.pac.domain.CustomImage;


@Service("ImageService")
public class ImageService {

	 @Autowired
	 ServletContext servletContext;
	 
	final static String REGISTER = "REGISTER";
	final static String RECIPE_BOARD = "BOARD";
	
	//서버용
//	final static String ARTICLE_IMAGE_REPO ="/home/ec2-user/pac/git/images";
	
	//로칼서버용
	final static String ARTICLE_IMAGE_REPO ="C:\\Users\\carys\\Desktop\\pac\\pac_server\\images";
	final static String REGISTER_REPO = "register\\";
	final static String RECIPE_BOARD_REPO = "board\\";
	
	Logger log = LoggerFactory.getLogger("com.pac.service.ImageService");
	
	//one file upload
	public CustomImage upload(String base64Image, String fileName, String tag) throws Exception
	{

		CustomImage customImage = new CustomImage();
		customImage.setBase64Image(base64Image);
		customImage.setTag(tag);
		
		try
        {
            //This will decode the String which is encoded by using Base64 class
            byte[] imageByte=Base64.decodeBase64(base64Image);
            

            String directory = "";
          
			//회원가입용 
			if(tag.compareTo(REGISTER)==0) {
				//TODO  file이름 중복처리
				directory = servletContext.getContextPath()+"images\\"+REGISTER_REPO+fileName;
			}
			//레시피 보드용
			else if(tag.compareTo(RECIPE_BOARD)==0){
				directory = servletContext.getContextPath()+"images\\"+fileName;
			}
			
            new FileOutputStream(directory).write(imageByte);
            
            customImage.setFileName(directory);
  
            return customImage;
        }
        catch(Exception e)
        {
        	log.error(e.getMessage());
            return null;
        }
	}

}
