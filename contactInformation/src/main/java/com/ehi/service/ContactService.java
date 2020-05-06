package com.ehi.service;

import java.util.List;

import com.ehi.bean.Contact;


public interface ContactService {
	
	public List<Contact> getAllContacts();
	public void addOrUpdateContact(Contact theContact);
	public void deleteContact(int id);
	public Contact getContact(int id);
	
	

}
