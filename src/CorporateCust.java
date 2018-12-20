/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wennshenglim
 */
public class CorporateCust {

    private String username, name, email, phoneNo, address, corporateName;
    private int creditLimit;

    public CorporateCust(String username, String name, String email, String phoneNo, String corporateName,
            String address, int creditLimit) {
        this.username = username;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.corporateName = corporateName;
        this.address = address;
        this.creditLimit = creditLimit;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }
    
    @Override
    public String toString() {
        return String.format("%-16s | %-20s | %-24s | %-14s | %-20s | %-28s | %-12s |", username, name, email, phoneNo, corporateName, address, creditLimit);
    }
}
