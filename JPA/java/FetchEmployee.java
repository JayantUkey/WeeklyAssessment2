package com.fetch;

import java.util.List;
import javax.persistence.*;
import javax.persistence.criteria.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;

import com.employee.EmployeeEntity;

public class FetchEmployee {
	
	public static void main(String args[])

	  {
	    EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");
	    EntityManager em=emf.createEntityManager();
	    em.getTransaction().begin(); 
	    
	    CriteriaBuilder cb=em.getCriteriaBuilder();
	      

	    //For inserting data into db
	    EmployeeEntity e1=new EmployeeEntity();
	    e1.setEmpno(101);
	    e1.setName("Jayant");
	    e1.setDesignation("Software Engineer");
	    e1.setSal(42000);
	    e1.setAge(21);

	    EmployeeEntity e2=new EmployeeEntity();
	    e2.setEmpno(102);
	    e2.setName("Sarvesh");
	    e2.setDesignation("Software Architect");
	    e2.setSal(40000);
	    e2.setAge(22);
	    
	    EmployeeEntity e3=new EmployeeEntity();
	    e3.setEmpno(103);
	    e3.setName("Nikhil");
	    e3.setDesignation("Web Dev");
	    e3.setSal(45000);
	    e3.setAge(23);

	    em.persist(e1);
	    em.persist(e2);
	    em.persist(e3);
	    
	    //em.getTransaction().commit();
	    
	    

	    
	    
	    CriteriaQuery<EmployeeEntity> cq = cb.createQuery(EmployeeEntity.class);

	    Root<EmployeeEntity> empd=cq.from(EmployeeEntity.class);
	    //cq.orderBy(cb.asc(empd.get("age")));
	    CriteriaQuery<EmployeeEntity> select = cq.select(empd);
	    TypedQuery<EmployeeEntity> q = em.createQuery(select);
	    List<EmployeeEntity> list = q.getResultList();

	    System.out.print("empno");
	    System.out.print("\t name");
	    System.out.println("\t designation");
	    System.out.print("\t sal");
	    System.out.println("\t age");

	    for(EmployeeEntity e:list)
	    {
		    System.out.print(e.getEmpno());
		    System.out.print("\t"+e.getName());
		    System.out.print("\t"+e.getDesignation());
		    System.out.print("\t"+e.getSal());
		    System.out.print("\t"+e.getAge());
		    System.out.println("\n");
	    }

	    em.getTransaction().commit();
	    em.close();
	    emf.close();
	  

	  }

}
