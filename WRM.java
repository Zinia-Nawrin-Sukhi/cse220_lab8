import java.util.Queue;
import java.util.LinkedList; 
public class WRM 
{
    Queue<Object> q = new LinkedList<Object>();
    
    public  void RegisterPatient(String name, String age, String blood)
    {
        patient p=new patient(name,age,blood);
        q.add(p);
        System.out.println();
    }
    
    public void print(){
        System.out.println(q);
    }
    
    public void ServePatient()
    {
          System.out.println("sz1: "+q.size());
        patient p=(patient)q.remove();
        System.out.println("Serving Patient: "+p.id +" " +p.name+"  "+p.age+"  "+p.blood);
         // System.out.println("sz1: "+q.size());
    }
  
    
    public void CancelAll()
    {
        System.out.println("sz "+q.size());
     for(int i=0; i<=q.size(); i++)
     {
     System.out.println("Cancel All : "+q.remove());
    
     }
     System.out.println("sz "+q.size());
    }
    
    public String CanDoctorGoHome()
    {
       String p;
        if(q.isEmpty())
        {
            p="Doctor can go home";
        }
        return "doctor can not go home";
    }
    
    public void ShowAllPatient()
    {
        String s=null;
        char[]l=s.toCharArray();
        for(int i=0 ;i<q.size();i++)
        {
            System.out.print(l[i]);
        }
//        for(int i=0; i<q.size();i++)
//        {
//            for(int j=0; j<i-1;j++)
//            {
//          
//            }
//        }
        
    }
}