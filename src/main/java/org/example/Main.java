package com.solupharm;

import com.solupharm.models.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        User u1 = new User();
        u1.setFirstName("Stefan");
        u1.setLastName("Schmelz");
        u1.setRole(3);
        s.save(u1);
        User u2 = new User();
        u2.setFirstName("Jonas");
        u2.setLastName("Schmelz");
        u2.setRole(3);
        s.save(u2);
        s.getTransaction().commit();

//        Query query = s.createQuery("FROM Student");
//        List<User> users = query.list();
//        users.forEach(obj -> System.out.println(obj.getFirstName()));
//        System.out.println("Reading student records...");
//        for (User studentObj : users) {
//            System.out.println("First Name" + studentObj.getFirstName());
//            System.out.println("Last Name" + studentObj.getLastName());
//            System.out.println("Roll Number" + studentObj.getRole());
//        }
    }
}