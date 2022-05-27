package com.mobile.clas;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.mobile.Country;

public class Mainclass {

	

		public static void  findplace(List<Country> countryList) {
			
			Map<String,String> values = countryList.stream().
					collect(Collectors.toMap(Country::getPlace, Country::getCountry));
			
			
			values.forEach((key,value) ->System.out.println(  key  + "," +value));
			
	}
		
		public static void populationCount(List<Country> countryList) {
			
			Long usaPopulation = countryList.stream().filter(e ->e.getCountry().equals("USA"))
					.mapToLong(e->e.getPopulation()).sum();
			
			System.out.println("USA POPULATION :=" +usaPopulation);
			
					
			Long indiaPopulation = countryList.stream().filter(e ->e.getCountry().equals("INDIA"))
					.mapToLong(e->e.getPopulation()).sum();
			
			System.out.println("INDIA POPULATION :=" +indiaPopulation);

			
			Long nepalPopulation = countryList.stream().filter(e ->e.getCountry().equals("Nepal"))
					.mapToLong(e->e.getPopulation()).sum();
			
			System.out.println("NEPAL POPULATION :=" +nepalPopulation);

		}
		
		public static void cityCount(List<Country> countryList,String srString) {
			
			long count = countryList.stream().filter(e ->e.getCountry().equalsIgnoreCase(srString)).count();
			
			
		}
		
		
		
		public static void main(String[] args) {
			
			Country usa = new Country ("USA","Kansascity",501957);
			Country india = new Country ("INDIA","chennai ",7090000);
			Country usa1 = new Country ("USA","Los Angeles",3970000);
			Country nepal = new Country ("Nepal","Kathmandu",1000000);
			Country india1 = new Country ("INDIA","kolkata ",14900000);
			Country usa2 = new Country ("USA","Denver",706000);
			
			List<Country> countryList = Arrays.asList(usa,india,usa1,nepal,india1,usa2);
			
			Mainclass.findplace(countryList);
			
			Mainclass.populationCount(countryList);
			
			Mainclass.cityCount(countryList, "USA");
			
			Mainclass.cityCount(countryList, "INDIA");

			Mainclass.cityCount(countryList, "NEPAL");

			
			
			
			
		}

}
