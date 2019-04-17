import com.example.A2.Persistence.Entity.Course;
import com.example.A2.Persistence.Entity.Teacher;
import com.example.A2.Persistence.Repo.CourseRepository;
import com.example.A2.Persistence.Repo.TeacherRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration
public class PersistenceTests {
    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private CourseRepository courseRepository;


    @SuppressWarnings("deprecation")
    @Test
    public void findAllTeachers_notEmpty() {

        List<Teacher> teacherList = teacherRepository.findAll();

        Assert.notEmpty(teacherList);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void findAllCourses_notEmpty() {

        List<Course> courseList = courseRepository.findAllByTeacherFirstName("Cosmina");

        Assert.notEmpty(courseList);
    }
}
