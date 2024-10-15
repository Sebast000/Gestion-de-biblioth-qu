public class Main {
    public static void main(String[] args) {
        // Affichage du formulaire de connexion
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);

        // Ajout d'un listener pour savoir si l'utilisateur est connecté
        loginForm.addLoginListener(new LoginListener() {
            @Override
            public void onLoginSuccess() {
                // Lorsque la connexion réussit, lancer l'IHM principale
                IHM.main(args);
            }

            @Override
            public void onLoginFailure() {
                System.out.println("Échec de la connexion. Veuillez réessayer.");
            }
        });
    }
}
