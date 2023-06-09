import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class SubjectTest {

	
	
	@Test
	void testgetName() {
		Subject A = new Subject("Math",6);
		
		Assert.assertTrue(A.getName().equals("Math"));
		//Subject method getName test 
	}
	@Test
	void testgetCapacity() {
		Subject A = new Subject("Math",6);
		
		Assert.assertTrue(A.getCapacity() == 6);
		//Subject method getCapacity test 
	}
	@Test
	void testgetIsOrdered() {
		Subject A = new Subject("Math",6);
		
		Assert.assertFalse(A.getIsOrdered());
		//Subject method getIsOrdered test 
	}
	@Test
	void testgetPosition() {
		Subject A = new Subject("Math",6);
		
		Assert.assertTrue(A.getPosition() == 0);
		//Subject method getPosition test 
	}
	@Test
	void testgetStudent() {
		Subject A = new Subject("Math",6);
		Student E = new Student("John","Doe","123456",5);
		
		A.addStudent(E);
		A.getStudent(0);
		Assert.assertTrue(A.getStudent(0).getName().equals("John"));
		Assert.assertTrue(A.getStudent(0).getSurname().equals("Doe"));
		Assert.assertTrue(A.getStudent(0).getId().equals("123456"));
		Assert.assertTrue(A.getStudent(0).getGrade() == 5);
		//Subject method getStudent test 
	}
	@Test
	void testaddStudent() {
		Subject A = new Subject("Math",6);
		Student E = new Student("John","Doe","123456",5);
		
		A.addStudent(E);
		A.getStudent(0);
		
		Assert.assertTrue(A.getPosition() == 1);
		Assert.assertFalse(A.getIsOrdered());
		Assert.assertTrue(A.getStudent(0).getName().equals("John"));
		Assert.assertTrue(A.getStudent(0).getSurname().equals("Doe"));
		Assert.assertTrue(A.getStudent(0).getId().equals("123456"));
		Assert.assertTrue(A.getStudent(0).getGrade() == 5);
		Assert.assertTrue(A.getStudent(0).getSurname().equals("Doe"));
		Assert.assertTrue(A.getStudent(0).getId().equals("123456"));
		Assert.assertTrue(A.getStudent(0).getGrade() == 5);
		//Subject method addStudent test: checks the attributes that are related 
		//with the insertion of a new Student object  
	}
	@Test
	void testOrderStudent() {
		Subject A = new Subject("Math",6);
		Student E = new Student("John","Doe","123456",5);
		Student E2 = new Student("Jane", "Doe", "123457", 4.0f);
		 Student E3 = new Student("John", "Smith", "123458", 3.0f);
		A.addStudent(E);
		A.addStudent(E2);
		A.addStudent(E3);
		
		Assert.assertFalse(A.getIsOrdered());
		A.orderStudents();
		Assert.assertTrue(A.getIsOrdered());
		
		//Subject method orderStudent test. Checks the order of the array students.
		//The verification is done before the method and after the method orderStudent call
	}
	
	@Test
	void testGetBestStudent() {
		Subject A = new Subject("Math",6);
		Student E = new Student("John","Doe","123456",5);
		Student E2 = new Student("Jane", "Doe", "123457", 4.0f);
		Student E3 = new Student("John", "Smith", "123458", 3.0f);
		A.addStudent(E);
		A.addStudent(E2);
		A.addStudent(E3);
		
		Assert.assertTrue(A.getBestStudent().getName().equals("John"));
		//Subject method getBestStudent test. Checks the the name of the best grade that here is John  
	}
	@Test
	void testGetWorstStudent() {
		Subject A = new Subject("Math",6);
		Student E = new Student("John","Doe","123456",5);
		Student E2 = new Student("Jane", "Doe", "123457", 4.0f);
		Student E3 = new Student("John", "Smith", "123458", 3.0f);
		A.addStudent(E);
		A.addStudent(E2);
		A.addStudent(E3);
		
		Assert.assertTrue(A.getWorstStudent().getSurname().equals("Smith"));
		//Subject method getBestStudent test. Checks the the surname of the worst grade that here is Smith
	}
	@Test
	void testGetAverage() {
		Subject A = new Subject("Math",6);
		Student E = new Student("John","Doe","123456",5);
		Student E2 = new Student("Jane", "Doe", "123457", 4.0f);
		Student E3 = new Student("John", "Smith", "123458", 3.0f);
		A.addStudent(E);
		A.addStudent(E2);
		A.addStudent(E3);
		
		Assert.assertTrue(A.getAverageGrade() == 3);
		//Subject method getAverage test. The correct result is 3 
	}
	@Test
	void testGetMedian() {
		Subject A = new Subject("Math",6);
		Student E = new Student("John","Doe","123456",5);
		Student E2 = new Student("Jane", "Doe", "123457", 4.0f);
		Student E3 = new Student("John", "Smith", "123458", 3.0f);
		A.addStudent(E);
		A.addStudent(E2);
		A.addStudent(E3);
		
		Assert.assertFalse(A.getMedian() == 1);
		//Subject method getBestStudent test. Checks the the name of the best grade that here is John
	}
	
