package com.example.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@Controller
public class ProductController {
	@Autowired
	private Product entity;
	
	@Autowired
	private ProductRepository repo;
	
	@RequestMapping(value = "/product",method = RequestMethod.GET)
	public String initForm(Model model) {

	model.addAttribute("title","Add Products");
	model.addAttribute("command",entity);
	
	return "addProduct";
	}
	
	@RequestMapping(value = "/product",method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("command") Product entity) {

    int rowAdded;
	try {
		rowAdded = this.repo.add(entity);
		return "succes";
	} catch (Exception e) {

		e.printStackTrace();
				return "failure";
	}
   
	}
	@RequestMapping(value="/product/srch",method=RequestMethod.GET)
	public String initSearchForm(Model model) {
		model.addAttribute("title","searchProduct");
		return "searchProduct";
	}
	
	@RequestMapping(value="/product/srch",method=RequestMethod.POST)
	public String searchProduct(@RequestParam("id")int id,Model model) {
		Optional<Product> entity = repo.findById(id);
		model.addAttribute("found",entity);
		return "showProduct";
		
	}
	@RequestMapping(value="/product/del",method=RequestMethod.GET)
	public String initSearchDel(Model model) {
		model.addAttribute("search","delbyid");
		return "del";
	}
	@RequestMapping(value="/product/del",method=RequestMethod.POST)
	public String delProduct(@RequestParam("id")int id,Model model){
		int entity = repo.remove(id);
		model.addAttribute("delete", entity);
		return "deletedProduct";
	}
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String inithome(Model model) {
		model.addAttribute("overview","All Context");
		return "index";
	}
	
	@RequestMapping(value="/product/update",method=RequestMethod.GET)
	public String initupdate(Model model) {
		model.addAttribute("update","update");
		return "update";
	}
	@RequestMapping(value="/product/update",method=RequestMethod.POST)
	public String delProduct(@RequestParam("id")int id,Model model){
		int entity = repo.Update(entity);
		model.addAttribute("delete", entity);
		return "deletedProduct";
	}

  
}
