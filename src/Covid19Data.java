public class Covid19Data {
    private String region;
    private String aldersGruppe;
    private int bekræftedeTilfælde;
    private int dødeIAlt;
    private int indlagtePåIntensivAfdeling;
    private int indlagte;
    private String dato;

    public Covid19Data(String region, String aldersGruppe, int bekræftedeTilfælde, int dødeIAlt,
                       int indlagtePåIntensivAfdeling, int indlagte, String dato){
        this.region = region;
        this.aldersGruppe = aldersGruppe;
        this.bekræftedeTilfælde = bekræftedeTilfælde;
        this.dødeIAlt = dødeIAlt;
        this.indlagtePåIntensivAfdeling = indlagtePåIntensivAfdeling;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Covid19Data{" +
                "region=" + region +
                ", aldersGruppe='" + aldersGruppe + '\'' +
                ", bekræftedeTilfælde='" + bekræftedeTilfælde + '\'' +
                ", dødeIAlt='" + dødeIAlt + '\'' +
                ", indlagtePåIntensivAfdeling='" + indlagtePåIntensivAfdeling + '\'' +
                ", indlagte='" + indlagte + '\'' +
                ", dato='" + dato + '\'' +
                '}';
    }
}
