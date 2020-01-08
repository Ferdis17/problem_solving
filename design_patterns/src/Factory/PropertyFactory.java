package Factory;

public class PropertyFactory {

    public Property getProperty(String propertyType){

        if(propertyType == null){
            return null;
        } else if(propertyType.equalsIgnoreCase("House")){
            return new House();
        } else if(propertyType.equalsIgnoreCase("Condo")){
            return new Condo();
        } else if(propertyType.equalsIgnoreCase("Apartment")){
            return new Apartment();
        }
        return null;
    }
}
