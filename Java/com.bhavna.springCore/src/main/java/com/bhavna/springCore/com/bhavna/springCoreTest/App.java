package com.bhavna.springCore.com.bhavna.springCoreTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhavna.springCore.com.bhavna.springCore.Exam;
import com.bhavna.springCore.com.bhavna.springCore.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext appContxtObj=new ClassPathXmlApplicationContext("config.xml");
        
        Student student=(Student)appContxtObj.getBean("stud");
        System.out.println(student);
        Student student1=(Student)appContxtObj.getBean("stud1");
        System.out.println(student1);
        Exam exam=(Exam)appContxtObj.getBean("exam");
        System.out.println(exam);
        Exam exam1=(Exam)appContxtObj.getBean("exam1");
        System.out.println(exam1);
        
    }
}
