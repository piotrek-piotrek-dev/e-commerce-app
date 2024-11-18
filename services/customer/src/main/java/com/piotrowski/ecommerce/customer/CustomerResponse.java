package com.piotrowski.ecommerce.customer;

record CustomerResponse(

        String id,
        String firstname,
        String lastname,
        String email,
        Address address
) {
}
