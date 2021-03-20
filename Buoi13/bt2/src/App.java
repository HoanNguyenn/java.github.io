public class App {
    public static void main(String[] args) throws Exception {
        PersonModel<Student> listStudent = new PersonModel<Student>();
        listStudent.add(new Student(4456, "Hoan", 20));
        listStudent.add(new Student(327, "Lisa", 23));
        
        listStudent.display(); 

        PersonModel<Employee> listEmployee = new PersonModel<>();
        listEmployee.add(new Employee(234, "Lina", 23000000));
        listEmployee.add(new Employee(223,"Kana", 4000000));

        listEmployee.display();;

       


    }
}
