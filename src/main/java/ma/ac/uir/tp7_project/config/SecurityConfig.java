package ma.ac.uir.tp7_project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers("/", "/register", "/css/**", "/js/**", "/images/**", "/fonts/**").permitAll() // Allow access to the root URL and other specified paths
                                .anyRequest().authenticated() // Require authentication for any other request
                )
                .formLogin(formLogin ->
                        formLogin
                                .loginPage("/login") // Specify the custom login page URL
                                .permitAll()
                )
                .logout(LogoutConfigurer::permitAll); // Allow logout for all users
        return http.build();
    }
}