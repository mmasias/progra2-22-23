
    import org.junit.jupiter.api.Test;

    import static org.junit.jupiter.api.Assertions.*;

    class StudentTest {

        @Test
        void creationTest(){
            Student testStudent = new Student("Martin", "González", "733273", 4.0f);
        }
        @Test
        void getName() {
            Student testStudent = new Student("Martin", "González", "733273", 4.0f);

            String expectedName = "Martin";

            assertEquals(expectedName, testStudent.getName());
        }

        @Test
        void getSurname() {
            Student testStudent = new Student("Martin", "González", "733273", 4.0f);

            String expectedSurname = "González";

            assertEquals(expectedSurname, testStudent.getSurname());
        }
        @Test
        void getId() {
            Student testStudent = new Student("Martin", "González", "733273", 4.0f);

            String expectedId = "733273";

            assertEquals(expectedId, testStudent.getId());

        }

        @Test
        void getGrade() {
            Student testStudent = new Student("Martin", "González", "733273", 4.0f);

            float expectedGrade = 4.0f;

            assertEquals(expectedGrade, testStudent.getGrade());
        }

        @Test
        void setGrade() {
            Student testStudent = new Student("Martin", "González", "733273", 4.0f);

            testStudent.setGrade(7.0f);
            float expectedGrade = 7.0f;

            assertEquals(expectedGrade, testStudent.getGrade());
        }

    }
