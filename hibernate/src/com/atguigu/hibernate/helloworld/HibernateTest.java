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
		//1、创建sessionFactory
		SessionFactory sessionFactory = null;
		Configuration configuration = new Configuration().configure();
		
		//sessionFactory = configuration.buildSessionFactory(); //4.0以前这样创建
		
		//hibernate的任何配置和服务都需要在该对象中注册后才能有效
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().
				applySettings(configuration.getProperties()).buildServiceRegistry();
		
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		//2、创建Session
		Session session = sessionFactory.openSession();
		
		//3、开启事务
		Transaction transaction = session.beginTransaction();
		
		//4、执行保存操作
		News news = new News("Java","ATOUIGU",new Date(new java.util.Date().getTime())); //将这条数据插入到数据库中
		session.save(news);
		
		//5、提交事务
		transaction.commit();
		
		//6、关闭Session
		session.close();
		
		//7、关闭sessionFactory
		sessionFactory.close();
	}


}
