public class Note {
//CLASS
    // it is nit mandatory to provide modifier to the class, it takes as public itself
    //modifier is public , private, default, protected for a class
    //[modifier] <datatype> <field-name> [=<initial-value>];
    // data type can be primitive or non primitive  referenced
    // in some rare scenarios , developers will initialize the variables
    // based on business requirements, we may intialize the fieeld values otherwise we generally mostly dont initialize the values


//METHOD

    //method in class or interface defines behaviour of object belonging to that class. it serves block of code that
    // can be invoked to execute.
    // which initialize the method is caller.
    // method may receive input paramter values from caller and returns value, method can have  0 paramters , including that it
    //doesnot accept any input
    // method is always encapsulated in body of class/ interface can not exist independently.
    // return type of method represents the type of value returned when mehtod executed. it can be primitve or referenced type.if
    //the absense pf a return value then it means void.
    /*<modifiers> <return-type> <method-name> (<parameters>){
    [throws-clause]

    {
            [return stmt;]
    }
}
     */
    // parameter is a varaible which is used to store an argument that is passed to the method during execution of method.
    // arguments are valyues which are passed to a method when it is called.
}

//RETURN TYPE OF METHOD
    //void method doesnot return any immediate value, non void getMethod returns the value.
// getter and setter methods
//method signature
     // method has a sigature which uniquly identify a method with in a specific class
     // method signature has 4 componenets - name of mehtod, type of parameters, no of parameters and order of parameters
     // example - public int add(int num1, int num2) --> add(int, int)
     // modifiers, return types , parameter names nad throw clause are not components of menthod signature
     // Java class can not more than one method signature.
// RETURN KEYWORD
    // return keyword purpose is to return the control from method to the caller
// METHOD INVOCATION
   // process of running the code which calls a method.
   // eg : sum(6,4);  objName.sum(6,4);  ClassName.sum(6,4);
// MAIN METHOD
   // main method should be public other wise jvm cannot access it to execute.
   // jvm can not create a object before invoking method which is main method.that why main method is static.