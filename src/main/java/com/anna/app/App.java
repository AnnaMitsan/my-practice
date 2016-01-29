package com.anna.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.anna.app.Airplane;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		Airplane plane = (Airplane) context.getBean("boing");
		plane.fly();
		Airplane plane2 = (Airplane) context.getBean("luxBoing");
		plane2.fly();
		Airplane plane3 = (Airplane) context.getBean("bomber");
		plane3.fly();
			
		Airplane plane4 = (Airplane) context.getBean("manyPilots");
		plane4.fly();
		
		Airplane plane5 = (Airplane) context.getBean("manyPilotsNew");
		plane5.fly();
    }
}
