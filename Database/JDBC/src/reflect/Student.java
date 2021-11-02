package reflect;

public class Student extends Person{

    public String className;
    private String address;

    private Student(String name,int age,String className){
        super(name,age);
        this.className = className;
    }

    public Student(){
        super();
    }

    public Student(String name, int age, String className, String address) {
        super(name, age);
        this.className = className;
        this.address = address;
    }

    private void add(int a,int b){
        System.out.println(a+b);;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "className='" + className + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
