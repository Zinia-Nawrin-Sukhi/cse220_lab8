import java.util.Queue;
import java.util.LinkedList; 
//Object []s={"ria", "zia","lia","pia"};
public class tester
{
    public static void main(String[]args)
    { 
        
        WRM m=new WRM();    
        m.RegisterPatient("ria","25","O+");
        m.RegisterPatient("fia","26","O-");
        m.RegisterPatient("sumaia","20","A+");
        m.RegisterPatient("nella","35","B+");
        m.RegisterPatient("sonia","45","A-");
        m.print();
        m.ServePatient();
        m.CancelAll();
        System.out.print(m.CanDoctorGoHome());
        //m.ShowAllPatient();
    }
}