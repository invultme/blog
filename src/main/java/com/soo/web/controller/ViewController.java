package com.soo.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.soo.web.service.boardService;

@Controller
public class ViewController {
		
	private static final Logger logger = LoggerFactory.getLogger(ViewController.class);
	
	@Autowired
	private boardService boardService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
	    
		return "home";
	}
	
	@RequestMapping(value = "/{path1}/{path2}", method = RequestMethod.GET)
	public String view1(@PathVariable("path1") String path1, @PathVariable("path2") String path2)
	{
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		ArrayList<HashMap<String, Object>> list = boardService.boardListInfo(map);
		System.out.println(list);
		return path1 + "/" + path2;
	}
	
	/*
	@RequestMapping(value = "/{path1}/{path2}/{path3}", method = RequestMethod.GET)
	public String view2(@PathVariable("path1") String path1, @PathVariable("path2") String path2, @PathVariable("path3") String path3)
	{
		
		return path1 + "/" + path2 + "/" + path3;
	}
	*/
	
}