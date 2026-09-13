package tn.tekup.tekbook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class BookController {

    // Modifiez ce texte a l etape 1 et a l etape 2 pour invalider le cache Docker.
    private static final String MESSAGE = "TekBook — plateforme de reservation";

    @GetMapping("/")
    public Map<String, String> accueil() {
        return Map.of("service", MESSAGE, "version", "0.0.1-SNAPSHOT");
    }

    @GetMapping("/api/books")
    public List<Map<String, Object>> livres() {
        return List.of(
            Map.of("id", 1, "titre", "Le Petit Prince", "disponible", true),
            Map.of("id", 2, "titre", "L Etranger", "disponible", false),
            Map.of("id", 3, "titre", "Les Miserables", "disponible", true)
        );
    }
}
