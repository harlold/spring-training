package com.app.rquispe.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by RubenJesus on 02/05/2015.
 */
@Controller
public class TestController
{
    @Autowired
    private TestService testService;
}
