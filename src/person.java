class person {
    String name;
    String addres;
    final String country = "Indonesia";

    person(String name, String addres){
        this.name = name;
        this.addres = addres;
    }

    person(String paramName){
        name = paramName;
    }

    person(){

    }

    void sayHello (String paramName ){
        System.out.println("Hello " +paramName+ " My Name Is " +name);

    }

}
