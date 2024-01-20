package kundan.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kundan.blog.dto.UserDto;
import kundan.blog.models.User;
import kundan.blog.repository.UserRepo;

public class UserServiceImpl implements UserService{
    
	@Autowired
	private UserRepo userrepo;
	
	
	@Override
	public UserDto createUser(UserDto user) {
		
		return null;
	}

	@Override
	public UserDto updateUser(UserDto user, Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Integer UserId) {
		// TODO Auto-generated method stub
		
	}
	
	private User dtoToUser(UserDto userDto) {
		
        User user=new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setAbout(userDto.getAbout());
        user.setPassword(userDto.getPassword());
        return user;
	}

	
	private UserDto userToDto(User user) {
		
		UserDto userDto=new UserDto();
		
		userDto.setName(user.getName());
		userDto.setAbout(user.getAbout());
		userDto.setEmail(user.getEmail());
		userDto.setId(user.getId());
		userDto.setPassword(user.getPassword());
		
		
		return userDto;
		
	}
	

}
