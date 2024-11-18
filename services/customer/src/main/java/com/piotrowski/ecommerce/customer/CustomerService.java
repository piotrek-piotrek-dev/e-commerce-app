package com.piotrowski.ecommerce.customer;

import com.piotrowski.ecommerce.exception.CustomerNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.String.format;

@Service
@RequiredArgsConstructor
class CustomerService {

    private final CustomerRepository repository;
    private final CustomerMapper mapper;

    String createCustomer(final CustomerRequest request) {
        var customer = repository.save(mapper.toCustomer(request));

        return  customer.getId();
    }

    List<CustomerResponse> findAllCustomers() {
        return repository.findAll()
                .stream()
                .map(mapper::fromCustomer)
                .toList();
    }

    CustomerResponse findById(final String customerId) {
        return repository.findById(customerId)
                .map(mapper::fromCustomer)
                .orElseThrow(() -> new CustomerNotFoundException(format("No found customer with the provided ID:: %s", customerId)));
    }
}
