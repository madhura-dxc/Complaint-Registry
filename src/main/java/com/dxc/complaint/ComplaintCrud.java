package com.dxc.complaint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class ComplaintCrud {
	
	public String addComplaint(Complaint complaint) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application-context.xml");
		HibernateTemplate ht=(HibernateTemplate)ctx.getBean("hibernateTemplate");
		ht.save(complaint);
		return "Complaint Registered....";
	}
	
	public String resolveComplaint(Resolve resolve) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application-context.xml");
		HibernateTemplate ht=(HibernateTemplate)ctx.getBean("hibernateTemplate");
		ht.save(resolve);
		ht=(HibernateTemplate)ctx.getBean("hibernateTemplate");
		Complaint c=(Complaint)ht.get(Complaint.class,resolve.getComplaintId());
		c.setcStatus("Resolved");
		
			ht.update(c);
			return "RESOLVED COMPLAINT........";
	}
	
	public List<Complaint> showComplaint() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		HibernateTemplate ht=(HibernateTemplate)ctx.getBean("hibernateTemplate");
		List<Complaint> complaint = ht.find("from Complaint");
		return complaint;
	}

	public List<Resolve> showResolve() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		HibernateTemplate ht=(HibernateTemplate)ctx.getBean("hibernateTemplate");
		List<Resolve> resolve = ht.find("from Resolve");
		return resolve;
	}

	public String resolveComp(Resolve resolve){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application-context.xml");
		HibernateTemplate ht=(HibernateTemplate)ctx.getBean("hibernateTemplate");
		ht.save(resolve);
	ht=(HibernateTemplate)ctx.getBean("hibernateTemplate");
	Complaint c=(Complaint)ht.get(Complaint.class,resolve.getComplaintId());
	c.setcStatus("Resolved");
	
		ht.update(c);
		return "RESOLVED COMPLAINT........";
	}
	
	

}
