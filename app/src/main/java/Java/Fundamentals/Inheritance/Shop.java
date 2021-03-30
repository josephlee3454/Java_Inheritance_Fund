package Java.Fundamentals.Inheritance;



public class Shop {
    public String name;
    public String Description;
    public int dollNum;


    public Shop(String name, String description, int dollNum){
        this.name = name;
        this.Description = Description;
        this.dollNum = dollNum;
    }

    public String toString(){
        return String.format("welcome to %s this restraunt is %s the price %d dollars", this.name, this.Description, this.dollNum );
    }

    public String getName(){
        return this.name;
    }

    public String retDesc(){
        return this.Description;
    }
    public int retDollNum(){
        return this.dollNum;
    }


}

