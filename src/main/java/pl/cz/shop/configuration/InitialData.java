package pl.cz.shop.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import pl.cz.shop.entity.Product;
import pl.cz.shop.entity.User;
import pl.cz.shop.enums.ProductUnitEnum;
import pl.cz.shop.repository.ProductRepository;
import pl.cz.shop.repository.UserRepository;

import javax.annotation.PostConstruct;

@Configuration
public class InitialData {

        private final ProductRepository productRepository;
        private final UserRepository userRepository;

        @Autowired //juz nie jest potrzebne
        public InitialData(ProductRepository productRepository, UserRepository userRepository) {

            this.productRepository = productRepository;
            this.userRepository = userRepository;
        }

        @PostConstruct
        public void setObjects() {

            setProduct();
            setUsers();
        }

        public void setProduct() {

            Product product = new Product();
            product.setTitle("Pomarańcze");
            product.setDescription("Kraj pochodzenia: Hiszpania");
            product.setMainPhoto("https://i.iplsc.com/pomarancze-obnizaja-cisnienie/0001QINR5B5TNVGN-C122-F4.jpg");
            product.setPrice(5.00);
            product.setUnit(ProductUnitEnum.kilogram);

            Product product2 = new Product();
            product2.setTitle("Banany");
            product2.setDescription("Zielone, import");
            product2.setMainPhoto("http://echokamienia.pl/wp-content/uploads/2016/06/Banan.jpg");
            product2.setPrice(4.00);
            product2.setUnit(ProductUnitEnum.kilogram);

            Product product3 = new Product();
            product3.setTitle("Arbuz");
            product3.setDescription("Krajowy");
            product3.setMainPhoto("https://www.ogrodinfo.pl/wp-content/uploads/2018/09/fotolia_arbuz_d-696x392.jpg");
            product3.setPrice(7.00);
            product3.setUnit(ProductUnitEnum.sztuka);

            productRepository.save(product);
            productRepository.save(product2);
            productRepository.save(product3);
        }

        private void setUsers() {

            User user1 = new User();
            user1.setLogin("admin");
            user1.setPassword("admin");

            userRepository.save(user1);
        }
    }