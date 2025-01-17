package com.saad.RDMSdemo;

import com.saad.RDMSdemo.model.Laptop;
import com.saad.RDMSdemo.model.student;
import com.saad.RDMSdemo.repository.studentRepo;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.logging.Logger;

@SpringBootApplication
public class RdmSdemoApplication implements CommandLineRunner {

	@Autowired
	public studentRepo StudentRepo;

//	private Logger logger = (Logger) LoggerFactory.getLogger(RdmSdemoApplication.class);

	public static void main(String[] args) {
		 SpringApplication.run(RdmSdemoApplication.class, args);

	}


	@Override
	public void run(String... args) throws Exception {
		student Student =new student();
		Student.setStudentId(4);
		Student.setName("saad");
		Student.setAbout("software engineer");

		Laptop laptop =new Laptop();
		laptop.setLaptopId(2);
		laptop.setModel("mac book");
		laptop.setBand("apple");

//		important

		laptop.setStudent(Student);

		Student.setLaptop(laptop);
//		laptop table data do not save
//		if  want to save data on the laptop class then ww have two option
//		1 is save manually laptop data
//		or use  cascade=cascade.all that is save all laptop data


		StudentRepo.save(Student);


	}
}
