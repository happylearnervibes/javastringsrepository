class Employee {
    String firstName; // camel case strats with small letter and next word will start with capital letter
    String lastName;
    byte age;
    char gender; // developers wants to save space in database because male or female takes lot of storage

    public byte getAge(){
        return age;
    }
    // to get gender of employee
    public char getGender(){
        return gender;
    }

    public static void main(String[] args) {
//        Employee employee = new Employee();
//        employee.age = 45;
//        System.out.println(employee.getAge());
    }
}
