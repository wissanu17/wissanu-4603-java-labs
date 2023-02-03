 /**
 * This is abstract class that called Competition which has two protected
 * variable as name and region.
 * This method have setter and getter method of name and region and have two
 * abstract method that called setDescription() and setSponsorship().
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

    // This is setter method for set name.
    public void setName(String name) {
        this.name = name;
    }

    // This is getter method for get name.
    public String getName() {
        return name;
    }

    // This is setter method for set region.
    public void setRegion(String region) {
        this.region = region;
    }

    // This is getter method for get region.
    public String getRegion() {
        return region;
    }

    abstract void setDescription();

    abstract void setSponsorship();
}
