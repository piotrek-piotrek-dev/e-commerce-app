package com.piotrowski.ecommerce.customer;

import org.springframework.stereotype.Service;

@Service
class CustomerMapper {

    Customer toCustomer(final CustomerRequest request) {
        if (request == null) {
            return null;
        }

        return Customer.builder()
                .id(request.id())
                .firstname(request.firstname())
                .lastname(request.lastname())
                .email(request.email())
                .address(request.address())
                .build();
    }

    CustomerResponse fromCustomer(final Customer customer) {
        return new CustomerResponse(
                customer.getId(),
                customer.getFirstname(),
                customer.getLastname(),
                customer.getEmail(),
                customer.getAddress()
        );
    }
}