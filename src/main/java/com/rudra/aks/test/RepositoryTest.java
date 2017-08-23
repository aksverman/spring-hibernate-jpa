package com.rudra.aks.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rudra.aks.JPAConfig;
import com.rudra.aks.bo.CommonBO;
import com.rudra.aks.bo.CustomerBO;
import com.rudra.aks.repository.CustomerRepository;

public class RepositoryTest<T> {

	@Autowired
	CustomerRepository<CommonBO> crepo;
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JPAConfig.class);
		/*CustomerRepository<CustomerBO>	cr = ctx.getBean(CustomerRepository.class);
		//List<CustomerBO> list = crepo.findAll();
		//System.out.println("Customer : " + list.size());
		RepositoryTest<CustomerBO> tes = new RepositoryTest<CustomerBO>();
		tes.getlist();*/
		ctx.close();
	}
	public void getlist() {
		List<CommonBO> findAll = crepo.findAll();
		System.out.println(" ---- " + findAll.size());
	}
	
}
