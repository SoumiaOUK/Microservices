@Entity
public class Voiture {
    @Id
    @GeneratedValue
    private long id;
    private String matricule;
    private String marque;
    private String modele;
}
