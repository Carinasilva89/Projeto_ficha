package com.projetoCarina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projetoCarina.entities.Endereco;
import com.projetoCarina.entities.Pessoa;

@SpringBootApplication
public class ProjetoCarinaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoCarinaApplication.class, args);
		
		Pessoa pessoaCarina = new Pessoa();

		pessoaCarina.setNome ("Carina Do Nascimento Silva");
		pessoaCarina.setNascimento("07/11/1989");
		
		
		
		Endereco enderecoCarina = new Endereco();
		enderecoCarina.setPessoa(pessoaCarina);
		
		enderecoCarina.setLogradouro("Rua Ipanema");
		enderecoCarina.setCep(4521354);
		enderecoCarina.setCidade("Goiania");
		enderecoCarina.setNumero("S/N");
		
		System.out.print("----------------------------------------");
		System.out.print("\n");	
		System.out.print("          CADASTRO PESSOA               ");
		System.out.print("\n");	
		System.out.print("----------------------------------------");
		System.out.print("\n");	
		System.out.print("\n");	
		System.out.println("Nome: " +enderecoCarina.getPessoa().getNome());
		System.out.println("Nascimento:" +enderecoCarina.getPessoa().getNascimento());
		System.out.print("----------------------------------------");
		System.out.print("\n");	
		System.out.print("          CADASTRO ENDERECO             ");
		System.out.print("\n");	
		System.out.print("----------------------------------------");
		System.out.print("\n");	
		System.out.print("\n");			
		System.out.println("Rua: " +enderecoCarina.getLogradouro());
		System.out.println("Cep: " +enderecoCarina.getCep());
		System.out.println("Cidade: " +enderecoCarina.getCidade());
		System.out.println("Numero: " +enderecoCarina.getNumero());	
		
		
		
	}

}
