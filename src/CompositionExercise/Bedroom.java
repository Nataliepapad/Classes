package CompositionExercise;

public class Bedroom {
    private String name;
    private CompositionExercise.Wall wall1;
    private CompositionExercise.Wall wall2;
    private CompositionExercise.Wall wall3;
    private CompositionExercise.Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Lamp getLamp(){
        return lamp;
    }

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public void makeBed(){
        bed.make();
    }
}
