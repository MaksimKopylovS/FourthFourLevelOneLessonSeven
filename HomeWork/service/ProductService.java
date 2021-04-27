package max_sk.HomeWork.service;

import lombok.RequiredArgsConstructor;
import max_sk.HomeWork.model.Product;
import max_sk.HomeWork.repository.ProductRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final EntityManager entityManager;


    public List<Product> productList(){
        return productRepository.findAll();
    }
}
