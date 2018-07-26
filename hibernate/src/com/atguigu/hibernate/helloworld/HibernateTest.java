package com.atguigu.hibernate.helloworld;

import static org.junit.Assert.*;

import java.sql.Date;

import javax.security.auth.login.AppConfigurationEntry;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

public class HibernateTest {

	@Test
	public void test() {
		//1������sessionFactory
		SessionFactory sessionFactory = null;
		Configuration configuration = new Configuration().configure();
		
		//sessionFactory = configuration.buildSessionFactory(); //4.0��ǰ��������
		
		//hibernate���κ����úͷ�����Ҫ�ڸö�����ע��������Ч
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().
				applySettings(configuration.getProperties()).buildServiceRegistry();
		
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		//2������Session
		Session session = sessionFactory.openSession();
		
		//3����������
		Transaction transaction = session.beginTransaction();
		
		//4��ִ�б������
		News news = new News("Java","ATOUIGU",new Date(new java.util.Date().getTime())); //���������ݲ��뵽���ݿ���
		session.save(news);
		
		//5���ύ����
		transaction.commit();
		
		//6���ر�Session
		session.close();
		
		//7���ر�sessionFactory
		sessionFactory.close();
	}


}
