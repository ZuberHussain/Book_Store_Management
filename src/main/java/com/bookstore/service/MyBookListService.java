package com.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.entity.MyBookList;
import com.bookstore.repository.MyBookRepositiry;

@Service
public class MyBookListService {
	@Autowired
	private MyBookRepositiry myBookRepositiry;
	
	
	public void saveMyBooks(MyBookList book) {
		myBookRepositiry.save(book);
		
	}
	public List<MyBookList> getAllMyBooks(){
		return myBookRepositiry.findAll();
	}
	public void deleteById(int id) {
		myBookRepositiry.deleteById(id);
		
	}
	

}
