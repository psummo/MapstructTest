import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderEntity {

    private int orderId;
    private String nameOrder;
    private String brandName;
    private UserEntity userEntity;
}
