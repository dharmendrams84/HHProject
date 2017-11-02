package com.homehardware.dao;

import com.homehardware.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class HhDaoImpl implements HhDao {

	@Autowired
	private SessionFactory sessionFactory;

	/* (non-Javadoc)
	 * @see com.homehardware.dao.HhDao#saveEmployee(com.homehardware.Employee)
	 */
	@Override
	public final void saveEmployee(final Employee e) {
		final Session session = sessionFactory.openSession();
		final org.hibernate.Transaction tx = session.beginTransaction();
		session.save(e);
		tx.commit();
		session.flush();
	}

	public final void setEmployeeDetails(final Employee employee) {
		employee.setEmail("nehab@gmail.com");
		employee.setFirstname("neha");
		employee.setLastname("Bhatia");
		employee.setTelephone("88877766");
	}
}
