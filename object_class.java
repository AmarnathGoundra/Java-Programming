class Laptop
{
    String model;
    int price;

    public String toString()
    {
        return "Model : " + model + ", Price : " + price;
    }

    public boolean equals(Laptop that)
    {
        return (this.model.equals(that.model) && this.price == that.price);
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
}

public class object_class 
{
    public static void main(String args[])    
    {
        Laptop obj = new Laptop();
        obj.model = "Lenovo";
        obj.price = 1000;

        System.out.println(obj);

        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo";
        obj1.price = 1000;

        System.out.println(obj1);

        boolean result = obj.equals(obj1);
        System.out.println(result);
    }

    @Override
    public String toString() {
        return "object_class []";
    }
}
