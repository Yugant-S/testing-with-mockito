package org.testing.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testing.model.User;
import org.testing.repository.UserRepository;
import org.testing.service.UserService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class UserServiceTest {
    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserService userService;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetUserById() {
        User fakeUser = new User(1L, "Aditya");

        when(userRepository.findById(1L)).thenReturn(fakeUser);

        User result = userService.getUserById(1L);

        assertEquals("Aditya", result.getName());

    }
}
