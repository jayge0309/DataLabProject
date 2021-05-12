import core.data.*;
import java.util.ArrayList;

public class TopBillionaires{
ArrayList<Billionaires> allbillion = new ArrayList<Billionaires>();
public void collectBillionaires(){
    String filename = "forbes_billionaires.csv";
    
    DataSource ds = DataSource.connect(filename);
    ds.load();
    
    allbillion=ds.fetchList("Billionaires","Name", "NetWorth","Country","Source");
    
}
public Billionaires Information(){
    double lowest_net=1;
    String namee ="";
    Billionaires bill = null; 
    for(int i=1; i<allbillion.size()-1; i++){
        if(allbillion.get(i).getMoney()>allbillion.get(i+1).getMoney()&&allbillion.get(i).getMoney()>lowest_net){
            lowest_net=allbillion.get(i).getMoney();
            namee=allbillion.get(i).getName();
            bill = allbillion.get(i);
        }
    }
return bill;
}
}