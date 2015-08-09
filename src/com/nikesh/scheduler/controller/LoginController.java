package com.nikesh.scheduler.controller;

import com.nikesh.scheduler.model.LoginModel;
import com.nikesh.scheduler.view.LoginView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Login Controller that controls the interaction between LoginView and
 * LoginModel.
 *
 * @author Nikesh Maharjan
 */
public class LoginController implements ActionListener {

    private LoginView loginView;
    private LoginModel loginModel;

    public LoginController(LoginView loginView, LoginModel loginModel) {
        this.loginView = loginView;
        this.loginView.addButtonListener(this);
        this.loginModel = loginModel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        loginModel.setUsername(loginView.getUsername());
        loginModel.setPassword(loginView.getPassword());
        boolean status = loginModel.isAuthorized();
        if (status == true) {
            // open new page
            // dispose old one
            System.out.println("Welcome to the scheduler.");
            loginView.dispose();
        } else {
            // send error message to the view
            loginView.showError();
        }
    }

}
