/**
 Consider the Author class given below. Create a JPA application to perform CRUD operations 
 (i.e. insert, update, delete) on author entity. Also display the author details based on 
 provided author id. (Hint: Use find () method of EntityManager to do so)Note:Create required
  table in database before running application. 
 */
package com.mycompany.app;

import javax.persistence.*;

import com.mycompany.lab1.Author;

public class App {

	private EntityManager entityManager;

	public static void main(String args[]) {
		App appLab1 = new App();
		appLab1.start();
	}

	public void start() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("author-ms");
		entityManager = emf.createEntityManager();
	    Author Auth1=new Author("chetan", "Prakash", "Bhagat",012312541);
	    Author Auth2=new Author("J", "K","Rowling",987012546);
		Author Auth3 = new Author("Hector", "J", "Gracia", 86756678);
		Author Auth4 = new Author("Sudha", "N", "Murthy", 96756665);
		Author Auth5 = new Author("Gaur", "G", "Das", 76756678);
		Author Auth6 = new Author("Napoleon", "S", "Hill", 86759678);
		add(Auth1);
		add(Auth2);
		add(Auth3);
		add(Auth4);
		add(Auth5);
		add(Auth6);
		System.out.println("*****Inserted*****");
		System.out.println("Auth1 inserted with id=" + Auth1.getAuthorId());
		System.out.println("Auth2 inserted with id=" + Auth2.getAuthorId());
		System.out.println("Auth3 inserted with id=" + Auth3.getAuthorId());
		System.out.println("Auth4 inserted with id=" + Auth4.getAuthorId());
		System.out.println("Auth5 inserted with id=" + Auth3.getAuthorId());
		System.out.println("Auth6 inserted with id=" + Auth4.getAuthorId());
		int Auth1Id = Auth1.getAuthorId();
		Author found = findAuthorById(Auth1Id);
		System.out.println("*****Found*****");
		display(found);
		Auth1.setFirstName("John");
		Auth1.setMiddleName("D");
		Auth1.setLastName("Derk");
		Auth1 = update(Auth1);
		System.out.println("*****Updated*****");
		System.out.println("Auth1 changes updated");
		System.out.println("*****Display*****");
		display(Auth1);
		display(Auth2);
		display(Auth3);
		display(Auth4);
		System.out.println("*****Remove*****");
		remove(Auth1);
		System.out.println("Auth1 removed");
		entityManager.close();
		emf.close();

	}

	public void add(Author author) {
		EntityTransaction transaction1 = entityManager.getTransaction();
		transaction1.begin();
		entityManager.persist(author);
		transaction1.commit();
	}

	public Author findAuthorById(int id) {
		Author fetched = entityManager.find(Author.class, id);
		return fetched;
	}

	public Author update(Author author) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.merge(author);
		transaction.commit();
		return author;
	}

	void display(Author author) {
		System.out.println("Author id :: " + author.getAuthorId());
		System.out.println("Author firstname :: " + author.getFirstName());
		System.out.println("Author lastname :: " + author.getLastName());
		System.out.println("Author phoneNo :: " + author.getPhoneNo());
	}

	void remove(Author author) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Author removed = entityManager.find(Author.class, 1);
		System.out.println("student id :: " + author.getAuthorId());
		System.out.println("student firstname :: " + author.getFirstName());
		System.out.println("student lastname :: " + author.getLastName());
		System.out.println("student email :: " + author.getPhoneNo());
		entityManager.remove(removed);
		transaction.commit();
	}

}
