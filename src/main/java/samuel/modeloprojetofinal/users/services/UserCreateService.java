package samuel.modeloprojetofinal.users.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import samuel.modeloprojetofinal.users.dto.UserCreateDTO;
import samuel.modeloprojetofinal.users.dto.UserResponseDTO;
import samuel.modeloprojetofinal.users.entities.User;
import samuel.modeloprojetofinal.users.repositories.UserRepository;
import samuel.modeloprojetofinal.users.services.UserMapper.UserMapper;

@Service
@RequiredArgsConstructor
public class UserCreateService {

    private final UserRepository userRepository;

    public UserResponseDTO createUser(UserCreateDTO dto) {
        User user = UserMapper.toEntity(dto);
        return UserMapper.toResponseDTO(userRepository.save(user));
    }
}
