import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class UserEntity {
    private String name;
    private LocalDate birthDate;
    private List<OrderEntity> orderEntityList;
    private int id;
    private String testNumConverter;

    {
        orderEntityList = new ArrayList<>(1);
    }


}
