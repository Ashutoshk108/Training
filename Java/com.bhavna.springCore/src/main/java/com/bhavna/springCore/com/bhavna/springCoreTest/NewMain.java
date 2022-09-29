package com.bhavna.springCore.com.bhavna.springCoreTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhavna.springCore.com.bhavna.springCore.ExamNew;
import com.bhavna.springCore.com.bhavna.springCore.StudentNew;

public class NewMain
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext appContxtObj=new ClassPathXmlApplicationContext("NewConfig.xml");
        
        StudentNew student=(StudentNew)appContxtObj.getBean("stud");
        System.out.println(student);
        StudentNew student1=(StudentNew)appContxtObj.getBean("stud1");
        System.out.println(student1);
        ExamNew exam=(ExamNew)appContxtObj.getBean("exam");
        System.out.println(exam);
        ExamNew exam1=(ExamNew)appContxtObj.getBean("exam1");
        System.out.println(exam1);
        
    }
}
