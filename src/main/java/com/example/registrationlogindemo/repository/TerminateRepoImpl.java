package com.example.registrationlogindemo.repository;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class TerminateRepoImpl implements TerminateRepo{

	@PersistenceContext
	EntityManager manager;
	
//	protected final Log logger = LogFactory.getLog(getClass());
	
	
	@Override
	public String idleTerminateConnectivity() {
		// TODO Auto-generated method stub
		Session currentSession = manager.unwrap(Session.class);
		String hql = "  SELECT pg_terminate_backend(pid) \r\n" + 
				"FROM pg_stat_activity\r\n" + 
				"WHERE " + 
				"	pid <> pg_backend_pid()\r\n" + 
				"	AND state in ('idle', 'idle in transaction', 'idle in transaction (aborted)', 'disabled') \r\n" + 
				"	AND state_change < current_timestamp - INTERVAL '5' MINUTE;  ";
		Query query = currentSession.createQuery (hql);
		
		String count = " SELECT count (*)\r\n" + 
				"FROM pg_stat_activity\r\n" + 
				"WHERE \r\n" + 
				"	pid <> pg_backend_pid()\r\n" + 
				"	AND state in ('idle', 'idle in transaction', 'idle in transaction (aborted)', 'disabled') \r\n" + 
				"	AND state_change < current_timestamp - INTERVAL '5' MINUTE;" ;
		Query quCount = currentSession.createQuery(count);
		return query.toString();
		
	}

}
