package cookies;

public class GenericArrayList<T> {
    private int i=0;
    private Object obj[];
    private T t;

    public GenericArrayList()
    {
        obj=new Object[5];
    }

    public void add(T t)
    {
        /*
        this.t=t;

        if(i==obj.length-1)
        {
            //Increase the Capacity of Array by 50% of it's size
            obj=Arrays.copyOf(obj, obj.length+(obj.length/2));
            System.out.println(obj.length);
        }
        obj[i]=this.t;
        i++;
        */


        // Checks to see if current amount is not greater, if so resize
        if (this.i + 1 > obj.length) {
            Object[] newObj = new Object[this.i * 2];

            // Copy elements of current array to new array
            for (int i = 0; i < this.i; i++) {
                obj[i] = newObj[i];
            }

            // Points to new array
            obj = newObj;

        }

        // add new cookie
        obj[this.i] = t;

        // increment count to reflect the amount of cookie in cookies array
        this.i++;
    }


    public Object get(int i)
    {
        if(obj[i]!=null)
        {
            return obj[i];
        }
        else
        {
            throw new ArrayIndexOutOfBoundsException("index:"+i);
        }
    }
    public String toString()
    {
        String temp="";
        for(Object ob:obj)
        {
            if(ob!=null)
            {
                temp=temp+ob+',';
            }
        }
        String temp1=temp.substring(0, temp.length()-1);
        return "["+temp1+"]";
    }


}
