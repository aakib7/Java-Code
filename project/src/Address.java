/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaqib
 */
public class Address {
    
    private String adress;
    private String country;
    private String prov;

    public Address(String adress, String country, String prov) {
        this.adress = adress;
        this.country = country;
        this.prov = prov;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    @Override
    public String toString() {
        return "Address{" + "adress=" + adress + ", country=" + country + ", prov=" + prov + '}';
    }
    
    
    
}
