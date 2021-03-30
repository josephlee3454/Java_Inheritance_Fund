package Java.Fundamentals.Inheritance;



public class Shop {
    public String name;
    public String Desc;
    public int dollNum;


    public Shop(String name, String Desc, int dollNum){
        this.name = name;
        this.Desc = Desc;
        this.dollNum = dollNum;
    }

    public String toString(){
        return String.format("welcome to %s this restraunt is %s the price %d dollars", this.name, this.Desc, this.dollNum );
    }

    public String getName(){
        return this.name;
    }

    public String getDesc(){
        return this.Desc;
    }
    public int retDollNum(){
        return this.dollNum;
    }


}

