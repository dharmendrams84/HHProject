package com.homehardware;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public final class HhController {
	protected static final Logger logger = Logger.getLogger(HhController.class);

	@Autowired
    private SessionFactory sessionFactory;
	
	/*@Autowired
    private Employee employee;
	*/
	@RequestMapping("/login")
	public final String login() {
		logger.error("inside login method");
		final Session session = sessionFactory.openSession();
		final Employee employee = session.load(Employee.class,1);
		logger.error("after persisting employee "+employee.getEmail());
		return "home";
	}
}
