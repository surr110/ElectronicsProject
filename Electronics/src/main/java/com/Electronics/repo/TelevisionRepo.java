package com.Electronics.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import com.Electronics.entity.Television;

public interface TelevisionRepo extends JpaRepository<Television, Integer> {
	// native query also called as custom query----->why creating because color is
	// not unique and pre-defined like Id
	@Query(value = "select * from electronicdetails.etvs where color=?", nativeQuery = true)
	public List<Television> getBycolor(@PathVariable String a);

	@Query(value = "select * from electronicdetails.etvs where price=(select max(price)from etvs)", nativeQuery = true)
	public List<Television> getmaxPrice();

	@Query(value = "select min(price) from electronicdetails.etvs", nativeQuery = true)
	public int getminiprice();

	@Query(value = "select brand from electronicdetails.etvs where length(brand)>?", nativeQuery = true)
	public List<String> getblength(@PathVariable int a);

	@Query(value = "select count(*) from electronicdetails.etvs where price < ? and length(brand)<?", nativeQuery = true)
	public long getablength(@PathVariable int a, @PathVariable int b);

	@Query(value = "select brand from electronicdetails.etvs where price < ? and length(brand)<?", nativeQuery = true)
	public List<String> getabslength(@PathVariable int a, @PathVariable int b);

	//// <------------- JQuery------------>

	@Query(value = "select x from Television x where x.price>:n1 and x.price<:n2")
	public List<Television> getPriceRange(@Param("n1") int n1, @Param("n2") int n2);
	
	//  @Query(value = "select x from Television x where x.price>:n1 and x.price<:n2")
	//  public List<Television> getTvpricerange(@Param("n1") int n1, @Param("n2") int n2);

	@Query(value = "select X from Television X where X.price >=:n")
	public List<Television> getByPrice(@Param("n") int n);

	@Query(value="select  x from Television x where x.brand like  %:n")
	public List<Television> getsamebrand(@Param("n") String n);
	// for printing same letter starting name startsWith  (like :n%) // for check and prints letter contains at any place in letter (%:n%)
	// endsWith( like %:n")
	
	@Query(value="select x from Television x where x.price< :a and length(x.brand) < :b")
	public List<Television> getTvbrandlength(@Param ("a") int a, @Param("b") int b);
	
	
	@Query(value="select x from Television x where length(x.brand)< :a")
	public List<Television>getTVlength(@Param("a") int a);
	
	
	

}
