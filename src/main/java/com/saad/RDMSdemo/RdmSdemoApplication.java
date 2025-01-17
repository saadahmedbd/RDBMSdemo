package com.saad.RDMSdemo;

import com.saad.RDMSdemo.model.*;
import com.saad.RDMSdemo.repository.categoryRepo;
import com.saad.RDMSdemo.repository.productRepo;
import com.saad.RDMSdemo.repository.studentRepo;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@SpringBootApplication
public class RdmSdemoApplication implements CommandLineRunner {

	@Autowired
	public studentRepo StudentRepo;
	@Autowired
	public productRepo ProductRepo;

	@Autowired
	public categoryRepo CategoryRepo;

//	private Logger logger = (Logger) LoggerFactory.getLogger(RdmSdemoApplication.class);

	public static void main(String[] args) {
		 SpringApplication.run(RdmSdemoApplication.class, args);

	}


	@Override
	public void run(String... args) throws Exception {
//		student Student =new student();
//		Student.setStudentId(4);
//		Student.setName("saad");
//		Student.setAbout("software engineer");
//
//		Laptop laptop =new Laptop();
//		laptop.setLaptopId(2);
//		laptop.setModel("mac book");
//		laptop.setBand("apple");
//
////		important
//
//		laptop.setStudent(Student);
//
//		Student.setLaptop(laptop);
////		laptop table data do not save
////		if  want to save data on the laptop class then ww have two option
////		1 is save manually laptop data
////		or use  cascade=cascade.all that is s all laptop data
//
//
//		StudentRepo.save(Student);

//		one-to-many relationship
//		student Student =new student();
//		Student.setStudentId(5);
//		Student.setName("saad");
//		Student.setAbout("software engineer");
//
//
//		address a1 =new address();
//		a1.setStreet_id(1);
//		a1.setArea_name("janpur");
//		a1.setCity("sirajgon");
//		a1.setCountry("bangladesh");
//		a1.setStudent(Student);
//
//		address a2=new address();
//		a2.setStreet_id(2);
//		a2.setArea_name("bankpara");
//		a2.setCity("sirajgonj");
//		a2.setCountry("bangladesh");
//		a2.setStudent(Student);
//
//		List<address> addressList=new ArrayList<>();
//		addressList.add(a1);
//		addressList.add(a2);
//		Student.setAddresses(addressList);
//
//		StudentRepo.save(Student);

//		many-to-many relation

		category c1=new category();
		c1.setCategoryId("c1d");
		c1.setCategoryName("eletric");

		category c2=new category();
		c2.setCategoryId("c2d");
		c2.setCategoryName("mobile");

		products p1=new products();
		p1.setProductId("p1s");
		p1.setProductName("samsung");

		products p2 =new products();
		p2.setProductId("p2s");
		p2.setProductName("iphone");

		products p3=new products();
		p3.setProductId("p3s");
		p3.setProductName("walton");

		List<products> category1products=c1.getProductsList();
		category1products.add(p1);
		category1products.add(p2);
		category1products.add(p3);

		List<products> category2products=c2.getProductsList();
		category2products.add(p1);
		category1products.add(p2);

		CategoryRepo.save(c1);
		CategoryRepo.save(c2);

	}
}
