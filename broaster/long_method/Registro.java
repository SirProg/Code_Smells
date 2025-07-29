public class Registro {
    
    public void registrarUsuario(String nombre, String email, String contraseña) {
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("El nombre es obligatorio.");
            return;
        }
        if (email == null || !email.contains("@")) {
            System.out.println("El correo electrónico no es válido.");
            return;
        }
        if (contraseña == null || contraseña.length() < 6) {
            System.out.println("La contraseña debe tener al menos 6 caracteres.");
            return;
        }

        if (email.equals("admin@empresa.com")) {
            System.out.println("El usuario ya está registrado.");
            return;
        }

        String contraseñaEncriptada = "";
        for (char c : contraseña.toCharArray()) {
            contraseñaEncriptada += (char) (c + 1);
        }

        System.out.println("Guardando usuario en la base de datos...");
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Contraseña encriptada: " + contraseñaEncriptada);

        System.out.println("Enviando correo de bienvenida a " + email + "...");
        System.out.println("Usuario registrado exitosamente.");
    }
}