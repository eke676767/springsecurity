package com.cos.security1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.security1.model.User;

//CRUD 함수를 JpaRepository가 들고잇음.
//@Repositrory라는 어노테이션이 없어도 ioc가 가능. jpaRepository를 상속했기 때문에
public interface UserRepository extends JpaRepository<User, Integer>{
	
	//findby 규칙 -> username 문법
	// select * from user where username =1 ? 
	public User findByUsername(String username); //jpa query methods 
}
