public class patient
{
    public  String name;
    String age;
    String blood;
    static int id=0;
    public patient(String n,String a,String b )
    {
        name=n;
        age=a;
        blood=b;
        id++;
    }
    public String toString()
    {
        return "Name:"+name+" "+"Age:"+age+" "+"Blood:"+blood+" "+"ID:"+id+"\n";
    }
    
}