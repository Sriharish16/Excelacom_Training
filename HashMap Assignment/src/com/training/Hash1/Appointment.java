package com.training.Hash1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.training.Hash.*;

public class Appointment {
	
private Map<Doctor,Set<Patient>>list;

public Appointment() {
	super();
	list=new HashMap<>();
}



/**
 * @return the list
 */
public Map<Doctor, Set<Patient>> getList() {
	return list;
}



/**
 * @param list the list to set
 */
public void setList(Map<Doctor, Set<Patient>> list) {
	this.list = list;
}



@Override
public String toString() {
	return "Appointment [list=" + list + "]";
}







}




