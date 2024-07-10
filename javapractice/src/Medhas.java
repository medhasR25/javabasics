public class Medhas {
    int id;
    String name;
    int age;
    double salary;

    public Medhas(int id,String name,int age,double salary){
        this.id=id;
        this.name =name;
        this.age=age;
        this.salary=salary;

    }

    @Override
    public String toString() {
        return "Medhas [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }
    public static void main(String[] args) {
        Medhas.p1=new Medhas(2, "Medhas", 22, 200);
        System.out.println(p1.toString());
        
    }




    
}
