class unaryOperator{
    public static void main(String args[]){
        int x = 10;
        System.out.println(x);
        x = ++x; // It is stored in the cache or temporary memory then reflected in the main memory.
        System.out.println(x);
        x = ++x; // same
        System.out.println(x);
        x = ++x;
        System.out.println(x);
        x = ++x;
        System.out.println(x);
        x=x++; Here the x becomes 15 but the cache value memory value is 14. so while the termination ends it modifies the new data from old.
        System.out.println(x);
        x=x++;
        System.out.println(x);
        x=x++;
        System.out.println(x);

    }
}