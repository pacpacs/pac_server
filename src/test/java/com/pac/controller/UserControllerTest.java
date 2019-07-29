package com.pac.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.pac.domain.User;
import com.pac.service.UserService;


public class UserControllerTest {
	
	@Mock
	UserService userService;
	
	@InjectMocks
	private UserController userController;
	private MockMvc mockMvc;
    
	private User user;
	
	public MockHttpSession session;
	public MockHttpServletRequest request;
	
//	@Before
//	public void init() {
//		user = new User( "user","testUser", "test", "file://");
//		
//		session = new MockHttpSession();
//        session.setAttribute("userDAO", user);
//        
//        request = new MockHttpServletRequest();
//        request.setSession(session);
//        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
//        
//
//        MockitoAnnotations.initMocks(this);
//        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
//	}
//	
	@Test
	public void getAllUserTest() {
		
	}

}
