package com.delivery.dto;

import static org.assertj.core.api.Assertions.assertThat;

import com.delivery.core.domain.Customer;
import com.delivery.core.entities.TestCoreEntityGenerator;
import com.delivery.presenter.mappers.domainDto.CustomerDomainDtoMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CustomerResponseTest {
    @InjectMocks private CustomerDomainDtoMapper customerDomainDbMapper  = Mockito.spy(Mappers.getMapper(CustomerDomainDtoMapper.class));

    @Test
    public void fromCustomer() {
        // given
        Customer customer = TestCoreEntityGenerator.randomCustomer();

        // when
        CustomerResponse actual = customerDomainDbMapper.mapToDto(customer);

        // then
        assertThat(actual.getName()).isEqualTo(customer.getName());
        assertThat(actual.getEmail()).isEqualTo(customer.getEmail());
        assertThat(actual.getAddress()).isEqualTo(customer.getAddress());
    }
}