package com.truyenho.service.impl;

import com.truyenho.model.Customer;
import com.truyenho.repository.CustomerRepository;
import com.truyenho.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

  @Autowired
  private CustomerRepository customerRepository;

  public CustomerServiceImpl() {
  }

  @Override
  public List<Customer> findAll() {
    return customerRepository.findAll();
  }

  @Override
  public Customer findById(Long id) {
    return customerRepository.findById(id);
  }

  @Override
  public void save(Customer customer) {
    customerRepository.save(customer);
  }

  @Override
  public void remove(Long id) {
    customerRepository.remove(id);
  }
}
