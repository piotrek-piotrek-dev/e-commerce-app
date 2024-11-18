package com.piotrowski.ecommerce.customer;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
class Address {

    private String street;
    private String houseNumber;
    private String zipCode;
}
