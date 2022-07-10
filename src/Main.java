public class Main {
    public static void main(String[] args) {

        persona mipersona = new persona();
        mipersona.setEdad(23);
        mipersona.setNombre("Andres Brieva");
        mipersona.setTelefono(4364079);

        System.out.println("Nombre: " + mipersona.getNombre() + " Edad: " + mipersona.getEdad() + " Telefono: " + mipersona.getTelefono() );

    }

    static class persona {
        private int edad;
        private String nombre;
        private int telefono;



        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getTelefono() {
            return telefono;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }
    }
}