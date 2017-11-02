package com.homehardware;

import com.homehardware.dao.HhDaoImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public final class HhController {

	protected static final Logger logger = Logger.getLogger(HhController.class);

	@Autowired
	private HhDaoImpl hhDaoImpl;

	/*
	 * @Autowired private Employee employee;
	 */
	@RequestMapping("/login")
	public final String login() {

		final Employee employee = new Employee();
		hhDaoImpl.setEmployeeDetails(employee);
		hhDaoImpl.saveEmployee(employee);

		return "home.html";
	}

}
