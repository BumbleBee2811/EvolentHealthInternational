package com.ehi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehi.bean.Contact;
import com.ehi.dao.ContactDAO;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDAO contactDAO;
	
	@Override
	public List<Contact> getAllContacts() {
		return contactDAO.getAllContacts();
	}
	@Override
	public void addOrUpdateContact(Contact theContact) {
		contactDAO.addOrUpdateContact(theContact);
		
	}

	@Override
	public void deleteContact(int id) {
		contactDAO.deleteContact(id);
	}

	@Override
	public Contact getContact(int id) {
		
		return contactDAO.getContact(id);
	}


	

}
