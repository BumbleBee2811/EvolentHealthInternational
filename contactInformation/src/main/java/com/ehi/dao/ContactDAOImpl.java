package com.ehi.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.ehi.bean.Contact;


@Repository
public class ContactDAOImpl implements ContactDAO {

	private List<Contact> contacts = new ArrayList<>();
	
	@PostConstruct
	private void contactValueUpdate() {
		contacts.add(new Contact(1, "Gautam", "Gambhir", "GG@gmail.com", "9898989898", "Active"));
		contacts.add(new Contact(2, "Virender", "Sehwag", "VS@gmail.com", "9898989898", "Inactive"));
		contacts.add(new Contact(3, "Sachin", "Tendulkar", "ST@gmail.com", "9898989898", "Active"));
		contacts.add(new Contact(4, "Rahul", "Dravid", "RD@gmail.com", "9898989898", "Active"));
		contacts.add(new Contact(5, "Sourav", "Ganguly", "SG@gmail.com", "9898989898", "Active"));
		contacts.add(new Contact(6, "Yuvraj", "Singh", "YS@gmail.com", "9898989898", "Active"));
		contacts.add(new Contact(7, "MS", "Dhoni", "MSD@gmail.com", "9898989898", "Active"));

	}
	
	
	@Override
	public List<Contact> getAllContacts() {
		
		return contacts;
	}

	@Override
	public void addOrUpdateContact(Contact contact) {
		
		if(contact.getId()==null)
		{
			int id = contacts.get(contacts.size()-1).getId();
			contact.setId(id+1);
			contacts.add(contact);
		}
		else
		{
			for (Contact c : contacts) {
				if(c.getId()==contact.getId())
				{
					c.setFirstName(contact.getFirstName());
					c.setLastName(contact.getLastName());
					c.setEmail(contact.getEmail());
					c.setPhoneNumber(contact.getPhoneNumber());
					c.setStatus(contact.getStatus());
					
				}
			}
			
		}	

	}


	@Override
	public void deleteContact(int id) {
		for(int i=0;i<contacts.size();i++)
		{
			if(contacts.get(i).getId()== id)
			{
				contacts.remove(i);
			}
		}

	}


	@Override
	public Contact getContact(int id) {
		
		Contact contact = null;
		for (Contact c : contacts) {
			if(c.getId()==id)
			{
				contact = c;
				break;
			}
		}
		return contact;
		
	}

}
