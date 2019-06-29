import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args){

        UserEntity entity = new UserEntity();
        entity.setName("Test");
        entity.setBirthDate(LocalDate.now());

        OrderEntity xiaomi = new OrderEntity();
        xiaomi.setBrandName("Xiaomi");
        xiaomi.setNameOrder("Electric scooter");
        entity.getOrderEntityList().add(xiaomi);

        OrderEntity appleWatch = new OrderEntity();
        appleWatch.setBrandName("Apple");
        appleWatch.setNameOrder("Watch 3");
        entity.getOrderEntityList().add(appleWatch);

        UserDto dto = UserMapper.Instance.fromEntityToDto(entity);
        System.out.print(dto);
    }
}
