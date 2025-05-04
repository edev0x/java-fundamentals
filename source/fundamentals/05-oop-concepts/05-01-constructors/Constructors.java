public class Constructors {
    public static void main(String[] args) {
        // Crear un objeto de la clase Student
        Student student = new Student();
        System.out.println("Objeto student creado con el constructor por defecto.");
        System.out.println("Nombre: " + student.getFirstName() +
                ", Apellido: " + student.getLastName() +
                ", Fecha de nacimiento: " + student.getBirthDate());
        

        System.out.println("-----------------------------------");
        // Crear un objeto de la clase Student con el constructor parametrizado
        Student student2 = new Student("Jane", "Smith", "02/02/2002");

        System.out.println("Objeto student2 creado con el constructor parametrizado.");
        System.out.println("Nombre: " + student2.getFirstName() +
                ", Apellido: " + student2.getLastName() +
                ", Fecha de nacimiento: " + student2.getBirthDate());
    }
}

/**
 * Clase de ejemplo para demostrar el uso de constructores.
*/

class Student {
    private String firstName;
    private String lastName;
    private String birthDate;

    /**
     * Constructor por defecto.
     */
    public Student() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.birthDate = "01/01/1995";
    }

    /**
     * Constructor parametrizado.
     * @param firstName Nombre del estudiante
     * @param lastName Apellido del estudiante
     * @param birthDate Fecha de nacimiento del estudiante
     */
    public Student(String firstName, String lastName, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    
}
