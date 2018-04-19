package fr.utbm.lo54.service;

import fr.utbm.lo54.entity.Course;
import fr.utbm.lo54.entity.CourseSession;
import fr.utbm.lo54.repository.CourseSessionDao;

/**
 * Created by matbo on 14/04/2018.
 */
public class CourseSessionService {
    public CourseSession getCourse(int id){
        CourseSessionDao courseSessionDao = new CourseSessionDao();
        return courseSessionDao.getCourseSession(id);
    }
}
