package accessors.Task;

public class A {
    private String name;
    private String details;

    private void setName ( String abc) {
        name = abc ;
    }

    public String getName (){
        return name;
    }

    public void setDetails ( String protectedDetails ){
        details = protectedDetails;

    }
    
    protected String getDetails (){
        return details;
    }
    


}
