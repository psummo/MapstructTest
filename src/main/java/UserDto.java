import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class UserDto {

    private String nameSurname;
    private String date;
    private String orderDtoList;
    private String id;
    private int testNumConverter;
}
