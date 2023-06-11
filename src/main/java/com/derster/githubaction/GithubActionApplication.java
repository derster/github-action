package com.derster.githubaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubActionApplication.class, args);
	}

	@GetMapping("/welcome")
	public String Welcome(){
		return "Welcome to Derster !!!";
	}


//	echo "# github-action" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin git@github.com:derster/github-action.git
//	git push -u origin main

}
