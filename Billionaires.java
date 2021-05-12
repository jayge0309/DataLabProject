public class Billionaires {
    private String name;
    private String country;
    private String source;
    private double money;
    
    public Billionaires(String name, String country, String Source, double money){
        this.name=name;
        this.country=country;
        this.source=source;
        this.money=money;
    }
    public String getName(){
        return name;
    }
    public String getCountry(){
        return country;
    }
    public String getSource(){
        return source; 
    }
    public double getMoney(){
        return money;
    }
    
}