import com.example.A2.Business.CourseService;
import com.example.A2.Persistence.Entity.Course;
import com.example.A2.Persistence.Entity.Teacher;
import org.junit.Test;

public class Tests {
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
