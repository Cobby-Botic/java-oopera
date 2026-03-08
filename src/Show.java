import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    Director director;
    ArrayList<Actor> actors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void printDirectorsInfo() {
        System.out.println(director.name + director.surname);
    }

    public void printAllOfActors() {
        for (Actor actor : actors) {
            System.out.println(actor.name + " " + actor.surname + " (" + actor.height + ")" );
        }
    }

    public void addNewActor(Actor newActor) {
        for (Actor actor : actors) {
            if (actor.equals(newActor)) {
                System.out.println("Актер уже добавлен в список!");
                return;
            }
        }
        actors.add(newActor);
        System.out.println("Актер: " + newActor.name + " " + newActor.surname + " добавлен в состав!");
    }

    public void changeActor(Actor actorToChange, Actor newActor) {
        for (Actor actor : actors) {
            if(actor.equals(actorToChange)) {
                actors.remove(actor);
                actors.add(newActor);
                System.out.println("Актер " + actorToChange.name + " " + actorToChange.surname + " заменен на "
                + newActor.name + " " + newActor.surname);
                return;
            }
        }
        System.out.println("Такого актера не найдено!");
    }
}