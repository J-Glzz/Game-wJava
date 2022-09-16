public class Legend {
    private String name, homeWorld;
    private int age;

    public Legend(String name, String homeworld, int age){
        this.name = name;
        this.homeWorld =  homeworld;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public String getHomeWorld(){
        return homeWorld;
    }
    public int getAge(){
        return age;
    }

    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name =  name;
            return true;
        }
        else
            return false;
    }
    public boolean setHomeworld(String homeworld){
        if(!homeworld.isEmpty()){
            this.homeWorld = homeworld;
            return true;
        }
        else
            return false;
    }
    public boolean setAge(int age){
        if(age > 0){
            this.age =  age;
            return true;
        }
        else
            return false;
    }
    public String showMessage(){
        return
                "Real name: " + name +
                        "\nAge: " + age +
                        "\nHomeworld: " + homeWorld + "\n";
    }
}
