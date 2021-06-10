package com.delivery.core.usecases.product;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doReturn;

import com.delivery.core.domain.Product;
import com.delivery.core.entities.TestCoreEntityGenerator;
import com.delivery.core.repositories.IProductRepository;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SearchProductsByNameOrDescriptionUseCaseTest {

    @InjectMocks
    private SearchProductsByNameOrDescriptionUseCase useCase;

    @Mock
    private IProductRepository repository;

    @Test
    public void executeReturnsMatchingProducts() {
        // given
        String searchText = "searchText";
        SearchProductsByNameOrDescriptionUseCase.InputValues input =
                SearchProductsByNameOrDescriptionUseCase.InputValues.builder()
                    .searchText(searchText).build();
        Product product = TestCoreEntityGenerator.randomProduct();

        // and
        doReturn(Collections.singletonList(product))
                .when(repository)
                .searchByNameOrDescription(searchText);

        // when
        List<Product> actual = useCase.execute(input).getProducts();

        // then
        assertThat(actual).containsOnly(product);
    }
}