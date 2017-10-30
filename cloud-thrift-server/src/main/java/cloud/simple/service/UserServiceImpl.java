package cloud.simple.service;

import org.apache.thrift.TException;

import cloud.simple.interfaces.UserDto;
import cloud.simple.interfaces.UserService;

public class UserServiceImpl implements UserService.Iface{

	@Override
	public UserDto getUser() throws TException
	  {		
		UserDto user = new UserDto(1000,"david2");
		return user;
	  }

}
