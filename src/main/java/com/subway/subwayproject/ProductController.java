package com.subway.subwayproject;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@RequestMapping(value = "/product", method = {RequestMethod.POST, RequestMethod.GET})
	public String productMain(
			HttpSession session,
			Model model,
			HttpServletRequest request,	
			@RequestParam Map<String, String> param)
		{
		
		return "/product/productMain";
	}
	
	@RequestMapping(value = "/order", method = {RequestMethod.POST, RequestMethod.GET})
	public String order(
			HttpSession session,
			Model model,
			HttpServletRequest request,	
			@RequestParam Map<String, String> param)
		{
		
		
		
		
		
		return "/product/orderMain";
	}
}
