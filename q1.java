//DIAGRAM Question 1
// Name: Tran Thanh Ngan Vu

class q1 {
    public static void main(String[] args) {
        
    }
    
}

abstract class Toy {
    String name; 
    double price; 

    public Toy(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract public String getName();

    abstract public void setName(String name);

    abstract public void setPrice(double price);

    abstract public double getPrice();
}

class Doll extends Toy {
    String dressColor; 
    String hairColor;

    public Doll(String dressColor, String hairColor, String name, double price) {
        super(name, price);
        this.dressColor = dressColor;
        this.hairColor = hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setDressColor(String dressColor) {
        this.dressColor = dressColor;
    }

    public String getDressColor() {
        return dressColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Car extends Toy {
    String color;
    int speed;

    public Car(String color, int speed, String name, double price ) {
        super(name, price);
        this.color = color;
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}






