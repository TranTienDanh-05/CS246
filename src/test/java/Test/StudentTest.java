/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author trand
 */
import com.mycompany.mavenproject1.Student;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

public class StudentTest {

    public void testgetName() {
        Student st = new Student("1", "danh", 20);
        st.updateName("tiendanh");
        assertEquals("danh", st.getName());
    }

    public void testgetAge() {
        Student st = new Student("1", "danh", 2);
        st.setAge(3);
        assertEquals(3, st.getAge());
    }
}
