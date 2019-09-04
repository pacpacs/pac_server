package com.pac.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pac.domain.CustomImage;
import com.pac.domain.User;
import com.pac.service.ImageService;

/**
 * @author Seo YunKyung
 *
 * 
 */
@RestController
@RequestMapping("/image")
public class ImageController {
	
	Logger log = LoggerFactory.getLogger("com.pac.controller.ImageController");
	
	@Autowired
	ImageService imageService;
		
	@PostMapping("/upload")
	public ResponseEntity<CustomImage> uploadImage(CustomImage image) throws Exception{
		
		CustomImage customImage = 
				imageService.upload(image.getBase64Image(), image.getFileName(), image.getTag());
		log.debug(customImage.toString());
		return ResponseEntity.status(HttpStatus.OK).body(customImage);		
	}
	
	@PostMapping("/upload/list")
	public ResponseEntity<List<CustomImage>> uploadImage(List<CustomImage> imageList) throws Exception{
		
			List<CustomImage> customImageList = new ArrayList<CustomImage>(); 
		
		for(CustomImage image : imageList) {
			customImageList.add(imageService.upload(image.getBase64Image(), image.getFileName(), image.getTag()));
		}
		
		
		return ResponseEntity.status(HttpStatus.OK).body(customImageList);		
	}
}
