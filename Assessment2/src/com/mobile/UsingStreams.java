package com.mobile;

import static java.util.stream.Collectors.toMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class UsingStreams  {
	
	public static void findplace (List<Country> countryList) {
		
		Map<String,String> values = countryList.stream().collect
			(Collectors.toMap(Country::getPlace, Country::getCountry));
				
		values.forEach((key,value) ->System.out.println(  key  + "," +value));
		
		
	}


	
public static void countpopulation (List<Country> countryList) {
	
	
	Long usaPopulation=countryList.stream().filter(e ->e.getCountry().equals("USA"))
			.mapToLong(e->e.getPopulation()).sum();
			
			
	System.out.println("USA POPULATION  = " +usaPopulation);
	
	Long indianPopulation=countryList.stream().filter(e->e.getCountry().equals("INDIA"))
			.mapToLong(e->e.getPopulation()).sum();
	
	System.out.println("INDIAN POPULATION = " +indianPopulation);
	
	Long nepalPopulation=countryList.stream().filter(e->e.getCountry().equals("Nepal"))
			.mapToLong(e->e.getPopulation()).sum();
			
	
	System.out.println("nepal Population = " +nepalPopulation);
		
}

public static void countCountry(List<Country> countryList,String srString) {
	long count = countryList.stream()
			.filter(e -> e.getCountry().equalsIgnoreCase(srString)).count();
	System.out.println(srString +"Count :=" + count);
}


	public static void main(String[] args) {
		
		Country usa = new Country ("USA","Kansascity",501957);
		Country india = new Country ("INDIA","chennai ",7090000);
		Country usa1 = new Country ("USA","Los Angeles",3970000);
		Country nepal = new Country ("Nepal","Kathmandu",1000000);
		Country india1 = new Country ("INDIA","kolkata ",14900000);
		Country usa2 = new Country ("USA","Denver",706000);
		
		
		List<Country> countryList = Arrays.asList(usa,india,usa1,nepal,india1,usa2);
		UsingStreams.findplace(countryList);
		
		UsingStreams.countCountry(countryList, "USA");
		UsingStreams.countCountry(countryList, "Nepal");
		UsingStreams.countCountry(countryList, "INDIA");

		UsingStreams.countpopulation(countryList);
		
	
}

	
}
	

