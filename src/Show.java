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
        ArrayList<Integer> matchedIndexes = new ArrayList<>();

        for (int i = 0; i < actors.size(); i++) {
            Actor actor = actors.get(i);
            if (actor.surname.equals(actorToChange.surname)) {
                matchedIndexes.add(i);
            }
        }

        if (matchedIndexes.isEmpty()) {
            System.out.println("Такого актера не найдено!");
            return;
        }

        if (matchedIndexes.size() > 1) {
            System.out.println("В спектакле участвует несколько актеров с фамилией "
                    + actorToChange.surname + ". Замена не производилась.");
            return;
        }

        int idx = matchedIndexes.get(0);
        Actor oldActor = actors.get(idx);
        actors.set(idx, newActor);
        System.out.println("Актер " + oldActor.name + " " + oldActor.surname + " заменен на "
                + newActor.name + " " + newActor.surname);
                return;
            }
        }
        System.out.println("Такого актера не найдено!");
    }
}