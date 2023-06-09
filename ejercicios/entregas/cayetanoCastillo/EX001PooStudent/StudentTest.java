import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class StudentTest {

	@Test
	void testStudent() {
		Student E = new Student("John","Doe","123456",6.8f);
		
		Assert.assertTrue(E.getName().equals("John"));
		Assert.assertTrue(E.getSurname().equals("Doe"));
		Assert.assertTrue(E.getId().equals("123456"));
		Assert.assertTrue(E.getGrade() == 6.8f);
		
		//Student constructor test check the constructor of the class
	}
	
	@Test
	void testgetName() {
		Student E = new Student("John","Doe","123456",6.8f);
		
		Assert.assertTrue(E.getName().equals("John"));
		
		
		//Student method getName test 
	}
	
	@Test
	void testgetSurname() {
		Student E = new Student("John","Doe","123456",6.8f);
		
		Assert.assertTrue(E.getSurname().equals("Doe"));
		
		
		//Student method getSurname test 
	}
	
	@Test
	void testgetId() {
		Student E = new Student("John","Doe","123456",6.8f);
		
		Assert.assertTrue(E.getId().equals("123456"));
		
		
		//Student method getId test 
	}
	
	@Test
	void testgetGrade() {
		Student E = new Student("John","Doe","123456",6.8f);
		
		Assert.assertTrue(E.getGrade() == 6.8f);
		
		
		//Student method getGrade test 
	}

}
