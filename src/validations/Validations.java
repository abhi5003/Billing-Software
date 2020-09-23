/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validations;

/**
 *
 * @author Abhi
 */

import java.util.regex.*;


public class Validations 
{   
    private Pattern name;
    private Pattern phoneno;
    private Pattern password;
    private Pattern email;
    
    private Matcher matcher;
    private static final String NAME_PATTERN="^[A-Za-z]{3,25}$";
    private static final String PHONE_PATTERN="^[0-9]{10}$";
    private  static final String PASSWORD_PATTERN="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
    private static  final String EMAIL_PATTERN="^(.+)@(.+)$";
    public Validations() 
    {
        name=Pattern.compile(NAME_PATTERN);
        phoneno=Pattern.compile(PHONE_PATTERN);
        password=Pattern.compile(PASSWORD_PATTERN);
        email=Pattern.compile(EMAIL_PATTERN);
    }
    
    public boolean nameValidate(final String name1)
    {
        matcher=name.matcher(name1);
        return matcher.matches();
    }
    
    public boolean phoneValidate(final String phoneno1)
    {
        matcher=phoneno.matcher(phoneno1);
        return matcher.matches();
    }
    
    public boolean passValidate(final String password1)
    {
        matcher=password.matcher(password1);
        return matcher.matches();
    }
    
    public boolean emailValidate(final  String email1)
    {
        matcher=email.matcher(email1);
        return matcher.matches();
    }
}
