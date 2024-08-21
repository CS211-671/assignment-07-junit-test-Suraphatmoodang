package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s;

    @BeforeEach
    void init() {
        s = new Student("6xxxxxxxx", "StudentTest");
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.15 คะแนน")
    void testAddScore() {
        s.addScore(45.15);
        assertEquals(45.15, s.getScore());

    }

    @Test
    @DisplayName("Test isId method")
    void testIsId() {
        assertEquals(true, s.isId("6xxxxxxxx"));
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 85 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade() {
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test
    @DisplayName("Testing changeName and test output of object")
    public void testChangeName() {
        s.changeName("John");
        assertEquals("John", s.getName());
        s.changeName("Jack");
        assertEquals("Jack", s.getName());
    }

    @Test
    @DisplayName("Testing toString")
    void testToString() {
        assertEquals("{id: '6xxxxxxxx', name: 'StudentTest', score: 0.0}", s.toString());
    }


    @Test
    @DisplayName("Testing Constructor")
    void Student() {
        Student newS = new Student("60000000", "Michael");
        assertEquals("Michael", newS.getName());
        assertEquals("60000000", newS.getId());
        assertEquals(0, newS.getScore());
    }


}