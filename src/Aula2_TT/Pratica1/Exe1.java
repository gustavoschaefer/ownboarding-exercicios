package Aula2_TT.Pratica1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exe1 {

    public static void main(String[] args) {
        Senha s = new Senha();
        s.setSenha("1234567As!");
    }

    private static class Senha {

        private String senha="";
        private Pattern pattern;

        public Senha() {
            pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$", Pattern.CASE_INSENSITIVE);
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            Matcher matcher = pattern.matcher(senha);
            if (matcher.find()) {
                System.out.println("Senha ok");
                this.senha = senha;
            } else {
                System.out.println("Senha não ok");
            }
        }
    }
}
