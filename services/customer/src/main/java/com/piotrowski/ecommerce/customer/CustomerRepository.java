package com.piotrowski.ecommerce.customer;

import org.springframework.data.mongodb.repository.MongoRepository;

interface CustomerRepository extends MongoRepository<Customer, String> {
}
