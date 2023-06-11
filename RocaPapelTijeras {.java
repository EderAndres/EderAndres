public class RocaPapelTijeras {
    public static void main(String[] args) {
        determinarGanador("T", "R");
    }

    public static void determinarGanador(String jugador1, String jugador2) {
        String ganador = "";
        String resultado = "";

        if (jugador1.equals(jugador2)) {
            resultado = "Empate";
        } else {
            switch (jugador1) {
                case "T":
                    switch (jugador2) {
                        case "R":
                            ganador = "Jugador 1";
                            resultado = "Roca rompe tijeras";
                            break;
                        case "P":
                            ganador = "Jugador 2";
                            resultado = "Papel cubre roca";
                            break;
                    }
                    break;
                case "R":
                    switch (jugador2) {
                        case "T":
                            ganador = "Jugador 2";
                            resultado = "Roca rompe tijeras";
                            break;
                        case "P":
                            ganador = "Jugador 1";
                            resultado = "Papel cubre roca";
                            break;
                    }
                    break;
                case "P":
                    switch (jugador2) {
                        case "T":
                            ganador = "Jugador 1";
                            resultado = "Papel cubre roca";
                            break;
                        case "R":
                            ganador = "Jugador 2";
                            resultado = "Papel cubre roca";
                            break;
                    }
                    break;
            }
        }

        if (!ganador.equals("")) {
            System.out.println(jugador1 + "-" + jugador2 + " " + resultado + " gana el " + ganador);
        } else {
            System.out.println(jugador1 + "-" + jugador2 + " " + resultado);
        }
    }
}