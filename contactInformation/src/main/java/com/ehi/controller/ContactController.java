package com.ehi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ehi.bean.Contact;
import com.ehi.service.ContactService;

@Controller
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	private ContactService contactService;


	@GetMapping("/getContacts")
	public String getCustomers(Model theModel)
	{
		List<Contact> contacts = contactService.getAllContacts();

		theModel.addAttribute("contact", contacts);

		return "contact_list";		
	}

	@GetMapping("/showFormForAddition")
	public String showFormForAddition(Model theModel)
	{
		Contact theContact = new Contact();

		theModel.addAttribute("contact", theContact);

		return "contact_form";
	}

	@PostMapping("/saveContact")
	public String saveCustomer(@Valid @ModelAttribute("contact") Contact theContact, BindingResult theBindingResult)
	{
		if(theBindingResult.hasErrors())
		{
			return "contact_form";
		}
		else
		{
			contactService.addOrUpdateContact(theContact);;
			return "redirect:/contact/getContacts";
		}
	}

	@GetMapping("/showFormForUpdate")
	public String updateContact(@RequestParam("contactId") int id, Model theModel)
	{
		Contact theContact = contactService.getContact(id);

		theModel.addAttribute("contact", theContact);

		return "contact_form";
	}

	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("contactId") int id)
	{
		contactService.deleteContact(id);;
		return "redirect:/contact/getContacts";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder)
	{
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
}

