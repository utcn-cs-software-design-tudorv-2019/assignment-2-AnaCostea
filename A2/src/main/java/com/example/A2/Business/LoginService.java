package com.example.A2.Business;

import com.example.A2.Persistence.Entity.Login;
import com.example.A2.Persistence.Repo.LoginRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class LoginService {
    @Inject
    LoginRepository loginRepository;

    public List<Login> getAllUsersLoggedIn()
    {
        return loginRepository.findAll();
    }

    public Login create(Login newLogin)
    {
        return loginRepository.save(newLogin);
    }


}
