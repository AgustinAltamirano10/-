package GettersYSetters;





public class Alumno {

    private int id; 
    private String name;
    private String lastName;

    /**
     * @post crea un alumno
     */
    public Alumno(int id, String name, String lastName)
    {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public Alumno()
    {
        
    }

    /**
     * @post muestra al alumno
     */
    public void showAlumno()
    {
        System.out.println("id: " +  id);
        System.out.println("name: " +  name);
        System.out.println("Last name: " +  lastName);
    }

    public int getId ()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
} 








