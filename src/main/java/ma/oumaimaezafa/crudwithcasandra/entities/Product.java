package ma.oumaimaezafa.crudwithcasandra.entities;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.math.BigDecimal;
import java.util.UUID;

@Table("products")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product {
    @PrimaryKey
    private String id;
    private String name;
    private BigDecimal price;
    private int quantity;
}


