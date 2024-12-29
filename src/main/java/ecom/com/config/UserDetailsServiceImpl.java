package ecom.com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ecom.com.model.UserDtls;
import ecom.com.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // Retrieve user from the database using the email (username)
        UserDtls user = userRepository.findByEmail(username);

        // If user does not exist, throw an exception
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }

        // Return a custom user object which implements UserDetails
        return new CustomUser(user);
    }
}
