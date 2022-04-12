package com.mobile;
import java.util.*;
public class Appointment {
      private Map<Doctor,Set<Patient>> list;

			public Appointment() {
				super();
				list=new HashMap<>();
				// TODO Auto-generated constructor stub
			}

			public Map<Doctor, Set<Patient>> getList() {
				return list;
			}

			public void setList(Map<Doctor, Set<Patient>> list) {
				this.list = list;
			}

			public Appointment(Map<Doctor, Set<Patient>> list) {
				super();
				this.list = list;
			}

			@Override
			public String toString() {
				return "Appointment [list=" + list + "]";
			}
			public Set<Patient> getPatient(Doctor key){
				return this.list.get(key);
			}
			
}
