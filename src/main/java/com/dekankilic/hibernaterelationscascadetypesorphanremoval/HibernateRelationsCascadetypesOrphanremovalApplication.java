package com.dekankilic.hibernaterelationscascadetypesorphanremoval;

import com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.Category;
import com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.Product;
import com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.ProductDetail;
import com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.Tag;
import com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.inheritance.discriminator.MachineAccessor;
import com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.inheritance.singletable.Machine;
import com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.inheritance.singletable.PrivateMachine;
import com.dekankilic.hibernaterelationscascadetypesorphanremoval.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class HibernateRelationsCascadetypesOrphanremovalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateRelationsCascadetypesOrphanremovalApplication.class, args);
	}

	/*
	@Bean
	public CommandLineRunner run(ProductRepository productRepository, CategoryRepository categoryRepository){
		return args -> {
			ProductDetail productDetail = ProductDetail.builder()
					.brand("Apple")
					.description("harika bir telefon")
					.warranty(true)
					.build();
			Category category = categoryRepository.findById(1).orElseThrow(() -> new RuntimeException("Category has not been found"));
			Set<Tag> tags = new HashSet<>();
			tags.add(Tag.builder().name("harika telefon").build());
			tags.add(Tag.builder().name("çok iyi telefon").build());
			tags.add(Tag.builder().name("müthiş telefon").build());
			// Eğer cascade kullanmasaydım, önce bu yukardakileri kendirepositoryleri vasıtası ile kaydedip, sonra product'ı kaydetmem gerekecekti. Fakat cascade
			// sayesinde product kaydedilirken onlar da kaydedilecekler.

			Product product = Product.builder()
					.name("Iphone 15")
					.quantity(13)
					.productDetail(productDetail)
					.category(category)
					.tags(tags)
					.build();

			productRepository.save(product);

			// categoryRepository.deleteById(1);
		};
	}
	*/

	/*@Bean
	public CommandLineRunner run(MachineRepository machineRepository, PrivateMachineRepository privateMachineRepository){
		return args -> {
			*//*
			PrivateMachine privateMachine = new PrivateMachine();
			privateMachine.setPrivateVpn("324235435435");
			machineRepository.save(privateMachine);
			*//*
			 List<Machine> machineList = machineRepository.findAll();
			 PrivateMachine privateMachine = privateMachineRepository.findById(1).get();
			System.out.println(privateMachine.getPrivateVpn());
		};
	}*/

	@Bean
	public CommandLineRunner run(MachineAccessorRepository machineAccessorRepository){
		return args -> {
			List<MachineAccessor> machineAccessors = machineAccessorRepository.findAll();
			System.out.println("asdsad");
		};
	}
}



















