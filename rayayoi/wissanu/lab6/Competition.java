 /**
 * This is abstract class Competition has 2 protected variable as name and region
 * That have setter and getter method for name and region and have 2 abstract method(setDescription() and setSponsorship()).
 * 
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : Febuary 3, 2022
 * 
 */
package rayayoi.wissanu.lab6;

abstract class Competition {
    
    protected String name;
    protected String region;

    abstract void setDescription();
    
    abstract void setSponsorship();

    //setter method for set name.
    public void setName(String name) {
        this.name = name;
    }

    //getter method for get name.
    public String getName() {
        return name;
    }

    //setter method for set region.
    public void setRegion(String region) {
        this.region = region;
    }

    //getter method for get region.
    public String getRegion() {
        return region;
    }
}
