package com.example.demo.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Product;
import com.example.demo.repos.*;

@Controller
public class ProductController {
	
	@Autowired
	private Product entity;
	
	@Autowired
	private ProductRepositry repo;
	

	
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public String initForm(Model model) {
		model.addAttribute("title","Add Products");
		model.addAttribute("command",entity);
		return "addProduct";
	}
	
	@RequestMapping(value="/product",method=RequestMethod.POST)
	public String submitForm(@ModelAttribute("command")Product entity) {
		int rowAdded;
		try {
			rowAdded=this.repo.add(entity);
		return "success";
	//	return "addProduct";
			
		}catch(Exception e) {
			e.printStackTrace();
		return "failure";
	}
	
	}
	
	//Update
	@RequestMapping(value = "/product/update", method = RequestMethod.POST)
	public String save(@ModelAttribute("suba") Product product) {
		int rowUpdate;
		try {
		rowUpdate=repo.update(product);
		return "update";
	}catch(Exception e) {
		e.printStackTrace();
		return null;
	}
		}
	
	
	
	
//	@RequestMapping(value=("/product/{id}"),method=RequestMethod.GET)
//    public String findById(@PathVariable(value="id") Integer id, Model model) {              
//          
//
//        
//		model.addAttribute("userAttribute", repo.findById(id));  
//       
//        return "findById";
//    }
//	
	
	
	
	//Remove
	
	@RequestMapping(value="/product/remove", method=RequestMethod.GET)
	public String delete(Model model) {
		
		model.addAttribute("delete","deleteProduct");
		return "deleteproduct";
		
	}
	
	@RequestMapping(value=("/product/remove"),method=RequestMethod.POST)
    public String remove(@RequestParam("id")int id, Model model) {              
        
        
		int rowDeleted=repo.remove(id);
		model.addAttribute("found",rowDeleted);
        return "remove";
     }
	
	
	//Index 
	@RequestMapping(value = "/",method=RequestMethod.GET)
	public String initIndexPage(Model model) {
		
		model.addAttribute("title","Product Management");
		
		return "index";
	}
	
	
	
//	@RequestMapping(value="/product/delete",method=RequestMethod.POST)
//	public String remove(@RequestParam("id")int id, Model model) {
//		int entity = repo.remove(id);
//		model.addAttribute("found",entity);
//		return "deletebyid";
//		
//	}

}
