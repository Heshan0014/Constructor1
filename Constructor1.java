class Constructor1 {
    int id;
    String name;


    Constructor1 () {
        System.out.println(id);
        System.out.println(name);
    }


    void display() {
        System.out.println(id + " " + name);

    }

    public static void main(String[] args) {


        Constructor1  obj1 = new Constructor1 ();
        Constructor1 obj2 = new Constructor1 ();


        obj1.display();
        obj2.display();
    }
}


