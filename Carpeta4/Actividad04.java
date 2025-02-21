/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad04;
class Profesor {
    private String nombre;
    private int numeroNomina;
    private double sueldoPorHora;
    private String materia;
    private int horasPorSemana;

    // Constructor
    public Profesor(String nombre, int numeroNomina, double sueldoPorHora) {
        this.nombre = nombre;
        this.numeroNomina = numeroNomina;
        this.sueldoPorHora = sueldoPorHora;
        this.materia = null;  // Materia no asignada inicialmente
        this.horasPorSemana = 0;  // Horas no asignadas inicialmente
    }

    // Asignar materia y horas
    public void asignarMateria(String materia, int horasPorSemana) {
        if (this.materia == null) {
            this.materia = materia;
            this.horasPorSemana = horasPorSemana;
        } else {
            System.out.println("El profesor " + this.nombre + " ya tiene asignada la materia " + this.materia + ".");
        }
    }

    // Calcular sueldo semanal
    public double calcularSueldoSemanal() {
        return sueldoPorHora * horasPorSemana;
    }

    // Mostrar información del profesor
    public String toString() {
        return "Profesor: " + nombre + "\nNúmero de Nómina: " + numeroNomina + "\nMateria: " + (materia != null ? materia : "No asignada") +
               "\nSueldo por hora: " + sueldoPorHora + "\nSueldo semanal: " + calcularSueldoSemanal();
    }
}

class Alumno {
    private String matricula;
    private String nombre;
    private int edad;
    private String curso;

    // Constructor
    public Alumno(String matricula, String nombre, int edad) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
        this.curso = null; // Curso no asignado inicialmente
    }

    // Asignar curso (materia)
    public void asignarCurso(String curso) {
        if (this.curso == null) {
            this.curso = curso;
        } else {
            System.out.println("El alumno " + this.nombre + " ya está inscrito en el curso " + this.curso + ".");
        }
    }

    // Mostrar información del alumno
    public String toString() {
        return "Alumno: " + nombre + "\nMatrícula: " + matricula + "\nEdad: " + edad + "\nCurso: " + (curso != null ? curso : "No asignado");
    }
}

class Materia {
    private String nombre;
    private String clave;
    private int creditos;
    private int horasSemanales;

    // Constructor
    public Materia(String nombre, String clave, int creditos, int horasSemanales) {
        this.nombre = nombre;
        this.clave = clave;
        this.creditos = creditos;
        this.horasSemanales = horasSemanales;
    }

    // Mostrar información de la materia
    public String toString() {
        return "Materia: " + nombre + "\nClave: " + clave + "\nCréditos: " + creditos + "\nHoras semanales: " + horasSemanales;
    }

    // Obtener los créditos de la materia
    public int getCreditos() {
        return creditos;
    }
}

class Curso {
    private String nombre;
    private Materia materia1;
    private Materia materia2;
    private Materia materia3;
    private int totalCreditos;

    // Constructor
    public Curso(String nombre, Materia materia1, Materia materia2, Materia materia3) {
        this.nombre = nombre;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;
        this.totalCreditos = materia1.getCreditos() + materia2.getCreditos() + materia3.getCreditos();
    }

    // Mostrar información del curso
    public String toString() {
        return "Curso: " + nombre + "\nTotal de créditos: " + totalCreditos + 
               "\nMateria 1: " + materia1.toString() + 
               "\nMateria 2: " + materia2.toString() + 
               "\nMateria 3: " + materia3.toString();
    }
}

public class Actividad04 {
    public static void main(String[] args) {
        // Crear instancia de profesor
        Profesor profesor = new Profesor("Andrés Manuel", 12345, 250);

        // Crear instancias de materias
        Materia matematicas = new Materia("Matemáticas", "MATH3MAT1CA5", 6, 20);
        Materia filosofia = new Materia("Filosofía", "Fil0S0F1A", 5, 15);
        Materia historia = new Materia("Historia", "HIST0R1A", 6, 20);

        // Crear instancia de curso
        Curso curso = new Curso("Curso1", matematicas, filosofia, historia);

        // Asignar materia al profesor
        profesor.asignarMateria("Matemáticas", 20);

        // Crear instancia de alumno
        Alumno alumno = new Alumno("A001", "Presi", 19);

        // Asignar curso al alumno
        alumno.asignarCurso("Curso1");

        // Mostrar la información del profesor, alumno y curso
        System.out.println(profesor);
        System.out.println();
        System.out.println(alumno);
        System.out.println();
        System.out.println(curso);
    }
}
