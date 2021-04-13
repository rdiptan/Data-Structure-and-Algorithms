package utils;

import week_8to11.Constants;
import week_8to11.FileHandler;

public class Registration {

    public String registerUser(String[] userDetail) {
        FileHandler fh = new FileHandler();
        return fh.CreateOrAdd(Constants.userDetailFileName, userDetail);
    }
}
