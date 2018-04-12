package fr.utbm.lo54.entity;
// Generated 12 avr. 2018 21:08:10 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CourseSession generated by hbm2java
 */
public class CourseSession  implements java.io.Serializable {


     private Integer id;
     private Course course;
     private Location location;
     private Date startDate;
     private Date endDate;
     private int max;
     private Set clients = new HashSet(0);
     private Set clients_1 = new HashSet(0);

    public CourseSession() {
    }

	
    public CourseSession(Course course, Location location, Date startDate, Date endDate, int max) {
        this.course = course;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.max = max;
    }
    public CourseSession(Course course, Location location, Date startDate, Date endDate, int max, Set clients, Set clients_1) {
       this.course = course;
       this.location = location;
       this.startDate = startDate;
       this.endDate = endDate;
       this.max = max;
       this.clients = clients;
       this.clients_1 = clients_1;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Course getCourse() {
        return this.course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }
    public Location getLocation() {
        return this.location;
    }
    
    public void setLocation(Location location) {
        this.location = location;
    }
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public int getMax() {
        return this.max;
    }
    
    public void setMax(int max) {
        this.max = max;
    }
    public Set getClients() {
        return this.clients;
    }
    
    public void setClients(Set clients) {
        this.clients = clients;
    }
    public Set getClients_1() {
        return this.clients_1;
    }
    
    public void setClients_1(Set clients_1) {
        this.clients_1 = clients_1;
    }




}

