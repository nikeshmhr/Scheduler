/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nikesh.scheduler.tests;

import com.nikesh.scheduler.controller.LoginController;
import com.nikesh.scheduler.model.LoginModel;
import com.nikesh.scheduler.view.LoginView;

/**
 *
 * @author Nikesh Maharjan
 */
public class LoginTest {

    public static void main(String[] args) {
        LoginView lv = new LoginView();
        LoginModel lm = new LoginModel();
        LoginController lc = new LoginController(lv, lm);
    }

}
