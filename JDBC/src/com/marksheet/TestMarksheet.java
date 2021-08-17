package com.marksheet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestMarksheet {
	public static void main(String[] args) throws Exception {
		 // testAdd();
		// testUpdate();
		// testDelete();
		 testGet();
		// testSelect();
		// testMerit();

	}

	public static void testAdd() throws Exception {
		MarksheetBean bean = new MarksheetBean();

		bean.setRollno("EN110");
		bean.setFname("Vijay");
		bean.setLname("Singh");
		bean.setPhy(66);
		bean.setChe(75);
		bean.setMat(87);

		MarksheetModel m = new MarksheetModel();

		m.testAdd(bean);
		System.out.println("Insertion Done");

	}

	private static void testUpdate() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setRollno("EN10");
		bean.setFname("Ajay");
		bean.setLname("Singh");
		bean.setPhy(76);
		bean.setChe(87);
		bean.setMat(87);
		bean.setId(6);

		MarksheetModel m = new MarksheetModel();

		m.testUpdate(bean);
		System.out.println("Update Done");

	}

	private static void testDelete() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setRollno("EN109");
		MarksheetModel m = new MarksheetModel();

		m.testDelete(bean);
		System.out.println("Data Deleted");

	}

	private static void testGet() throws Exception {
		MarksheetBean bean = new MarksheetBean();

		bean.setRollno("EN102");
		MarksheetModel m = new MarksheetModel();

		m.testGet(bean);
	}

	
	  private static void testSelect() throws Exception {
		  MarksheetBean bean = new MarksheetBean(); 
		  MarksheetModel m = new MarksheetModel(); 
		  m.testSelect(bean);
	  
	  }
	 

	private static void testMerit() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		List<MarksheetBean> mb= new ArrayList<>();
		MarksheetModel m = new MarksheetModel();
		mb=m.testMerit(bean);
		
		Iterator<MarksheetBean> it=mb.iterator();
		while (it.hasNext()) {
			bean=it.next();
			System.out.print(" "+bean.getId());
			System.out.print(" "+bean.getRollno());
			System.out.print(" "+bean.getFname());
			System.out.print(" "+bean.getLname());
			System.out.print(" "+bean.getPhy());
			System.out.print(" "+bean.getChe());
			System.out.println(" "+bean.getMat());
			
		}

	}

}
