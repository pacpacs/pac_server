package com.pac.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Seo YunKyung
 *
 *
 */
@RestController
@RequestMapping("/recipe")
public class RecipeController {
    Logger log = LoggerFactory.getLogger("com.pac.controller.RecipeController");
}
