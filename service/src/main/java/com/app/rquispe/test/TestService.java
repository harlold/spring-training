package com.app.rquispe.test;

import org.springframework.beans.factory.annotation.Autowired;
import test.TestDAO;

/**
 * Created by RubenJesus on 02/05/2015.
 */
public class TestService
{

    @Autowired
    private TestDAO testDAO;

    public String sayHello()
    {
        return testDAO.sayHello();
    }

}
