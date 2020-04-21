package com.webage.api;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import com.webage.domain.Customer;
import com.webage.repository.CustomersRepository;

@RestController
@RequestMapping("/customers")
public class CustomerAPI {
	
	@Autowired
	CustomersRepository repo;
	
	@GetMapping
	public Iterable<Customer> getAll() {
		return repo.findAll();
	}
	
	@GetMapping("/{customerId}")
	public Optional<Customer> getCustomerById(@PathVariable("customerId") Long customerId) {
		return repo.findById(customerId);
	}
	
	@PostMapping
	public ResponseEntity<?> addCustomer(@RequestBody Customer newCustomer, UriComponentsBuilder uri) {
		if(!isValidCustomer(newCustomer, 0L)) {
			return ResponseEntity.badRequest().build();
		}
		
		newCustomer = repo.save(newCustomer);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newCustomer.getId()).toUri();
		ResponseEntity<?> response = ResponseEntity.created(location).build();
		return response;
	}
	
	@PutMapping("/{customerId}")
	public ResponseEntity<?> putCustomer(@RequestBody Customer newCustomer, @PathVariable("customerId") long customerId) {
		if(!isValidCustomer(newCustomer, customerId)) {
			return ResponseEntity.badRequest().build();
		}
		
		newCustomer = repo.save(newCustomer);
		return ResponseEntity.ok().build();
	}
	
	private boolean isValidCustomer(Customer newCustomer, Long customerId) {
		if((newCustomer.getId() != customerId) || (newCustomer.getName() == null) || (newCustomer.getEmail() == null)) {
			return false;
		}
		return true;
	}
	
}
