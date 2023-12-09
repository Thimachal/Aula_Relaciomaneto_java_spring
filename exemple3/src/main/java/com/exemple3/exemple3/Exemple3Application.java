package com.exemple3.exemple3;

import com.exemple3.exemple3.Models.Courses;
import com.exemple3.exemple3.Models.Students;
import com.exemple3.exemple3.Repositories.CoursetRepository;
import com.exemple3.exemple3.Repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Exemple3Application {

	public static void main(String[] args) {
		SpringApplication.run(Exemple3Application.class, args);
	}

	@Bean
	public CommandLineRunner mappingDemo(StudentRepository sr, CoursetRepository cr) {

		return args -> {

			// Criar um aluno
			Students student = new Students();
			student.setStudentname("Thima");

			// Cadastrar na tabela alunos
			sr.save(student);

			// Criar três cursos
			Courses c1 = new Courses();
			c1.setCourseName("Java - Spring Boot");

			Courses c2 = new Courses();
			c2.setCourseName("Python - Flask");

			Courses c3 = new Courses();
			c3.setCourseName("PHP - Laravel");

			// Cadastrar os cursos na tabela cursos
			cr.saveAll(Arrays.asList(c1, c2, c3));

			// Adicionar o primeiro e o terceiro curso no aluno
			student.getCoursesList().addAll(Arrays.asList(c1, c3));

			// Atualizar a lista de cursos do aluno
			sr.save(student);
		};
	}

}
