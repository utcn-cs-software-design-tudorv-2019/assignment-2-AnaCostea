import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration
public class Assignment2Tests {
    @Test
    public void contextLoads() {
    }

    @Test
    public void Test(){
        Teacher t1 = new Teacher();
        Course c1 = new Course();
        c1.setIdCourse(1);
        c1.setName("Baze de Date");
        c1.setTeacher(t1);

        CourseService cs1 = new CourseService();
        c1 = cs1.create(c1);
    }
}
