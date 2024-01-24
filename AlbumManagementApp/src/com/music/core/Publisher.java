//License Information

package com.music.core;

import com.music.validations.Validate;

/**
 * 
 * @author LahiruCW
 */
public final class Publisher {
    
    //declarations of variables
    private String name; //name of the publisher.
    private String address; // publisher address.
    private int yearOfRegister; // publisher register year.

    public Publisher(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(Validate.validateName(name)){
            this.name = name;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(Validate.validateName(address)){
            this.address = address;
        }
    }

    public int getYearOfRegister() {
        return yearOfRegister;
    }

    public void setYearOfRegister(int yearOfRegister) {
        if(Validate.validateDate(yearOfRegister)){
            this.yearOfRegister = yearOfRegister;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Publisher{");
        sb.append("name=").append(name);
        sb.append(", address=").append(address);
        sb.append(", yearOfRegister=").append(yearOfRegister);
        sb.append('}');
        return sb.toString();
    }
}
