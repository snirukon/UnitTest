package hacs;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestStudent {

    @Test
    void testCreateCourseMenu() {
        Course course = new Course("SER515", 1);
        Student student = new Student();
        assertTrue(student.createCourseMenu(course, 1) instanceof LowLevelCourseMenu);
    }

}
