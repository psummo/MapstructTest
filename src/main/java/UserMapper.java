import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;


@Mapper
public interface UserMapper {

    UserMapper Instance = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "nameSurname", source = "name")
    @Mapping(target = "date", source = "birthDate")
    @Mapping(
            target = "orderDtoList",
            expression = "java(userEntity.getOrderEntityList().stream().map(o -> o.getNameOrder()).collect(java.util.stream.Collectors.joining(\",\")))"
    )
    UserDto fromEntityToDto(UserEntity userEntity);
}
