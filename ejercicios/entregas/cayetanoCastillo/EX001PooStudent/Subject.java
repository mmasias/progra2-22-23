public class Subject {
    private String name;
    private Student[] students;
    private boolean isOrdered;
    private int position;
    private int capacity; 
    

    /**
     * Creates a new subject with the given name and capacity.
     * @param name The name of the subject.
     * @param capacity The maximum number of students that can be added to the subject.
     */
    public Subject(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.position = 0;
        this.isOrdered = false;
        this.students = new Student[capacity];
        /*Sets the attributes and capacity
         * Initialization of the attribute position to 0 and the attribute isOrdered to false
         * Creates an array Student object, the size of the array is designed by the capacity parameter
         */
        
    }

    public void addStudent(Student student) {
        if (position < capacity) {
            students[position] = student;
            position++;
            isOrdered = false;
            /*If position is minor than the size of the array
             *Save a new student on the position of the array
             *Increments the position in 1 unit
             *Sets the attribute isOrdered to false
             */
        }
    }

    public void orderStudents() {
        if (!isOrdered) {
            for (int i = 0; i < position; i++) {
                for (int j = i + 1; j < position; j++) {
                    if (students[i].getGrade() > students[j].getGrade()) {
                    	//if (students[i].getGrade() < students[j].getGrade()) {
                        Student temp = students[i];
                        students[i] = students[j];
                        students[j] = temp;
                        
                    }
                }
            }
            isOrdered = true;
        }
        /*If the array is not order(because the attribute isOrdered is equal to false) .
         *The method is going to order the array.
         *The order is done by the grade attribute of the student, in ascendent order.
         *When the array has been ordered, the attribute isOrdered is set to true.
         */
    }

    public float getMedian() {
        orderStudents();
        if (position % 2 == 0) {
            return (students[position / 2].getGrade() + students[position / 2 - 1].getGrade()) / 2;
        } else {
            return students[position / 2].getGrade();
        }
        	//Returns the median grade of the array subject
        }
    public float getAverageGrade() {
        orderStudents();
        float total = 0;
        float average = 0;
        for(int i=0; i < position; i++) {
        	total = total + students[i].getGrade();
        }
        average = total / capacity;
        
        return average;
    
        
        /*Returns the average evaluation of the students
         *
         */
    }
    public Student getBestStudent() {
    	float bestQualification = -1;
    	int position = 0;
    	for( int i = 0; i < position ; i++) {
    		if(students[i].getGrade() > bestQualification) {
    			position = i;
    			bestQualification = students[position].getGrade();
    		}
    	}
    	
    	return students[position];
    	/*The initial value of bestQualification is -1, so the next qualifications are going to modify
    	 *the bestQualification value and its position, because the method evaluates all the students 
    	 *qualifications.
    	 */
    }
    public Student getWorstStudent() {
    	float worstQualification = 1000;
    	int position = 0;
    	for( int i = 0; i < position ; i++) {
    		if(students[i].getGrade() > worstQualification) {
    			position = i;
    			worstQualification = students[position].getGrade();
    		}
    	}
    	
    	
    	return students[position];
    	/*The initial value of worstQualification is 1000, so the next qualifications are going to modify
    	 *the worstQualification value and its position, because the method evaluates all the students 
    	 *qualifications.
    	 */
    }
    
    public Student getStudent(int position) {
    	return students[position];
    	/*
    	 * The method returns the object Student that is indicated in the parameter position */
    }

    
    // get methods of the class Subject. All the attributes are done, except the attribute students
    
	public String getName() {
		return name;
	}

	public boolean getIsOrdered() {
		return isOrdered;
	}

	public int getPosition() {
		return position;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIsOrdered(boolean isOrdered) {
		this.isOrdered = isOrdered;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
    
    
}
